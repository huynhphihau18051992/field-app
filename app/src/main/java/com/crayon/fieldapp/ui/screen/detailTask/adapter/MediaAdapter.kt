package com.crayon.fieldapp.ui.screen.detailTask.adapter

import android.content.Context
import android.media.ThumbnailUtils
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Note
import com.crayon.fieldapp.utils.GlideApp
import com.crayon.fieldapp.utils.setSingleClick
import com.google.gson.Gson

class MediaAdapter constructor(
    val items: ArrayList<MediaData>,
    val context: Context
) :
    RecyclerView.Adapter<MediaAdapter.GroupViewHolder>() {

    private var mListener: MediaListener? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_media, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.imgClose.setSingleClick {
            mListener?.onItemRemoveClicked(data, position)
        }

        holder.itemView.setSingleClick {
            mListener?.onItemClicked(data, position)
        }

        data.uri?.let {
            if (data.type == MEDIA_IMAGE) {
                val options: RequestOptions = RequestOptions()
                    .centerCrop()
                    .placeholder(R.mipmap.ic_launcher_round)
                    .error(R.mipmap.ic_launcher_round)
                    .override(300, 300)
                GlideApp.with(context).load(data.thumbnail).apply(options).into(holder.imgUpload)

                holder.imgMediaType.setImageDrawable(
                    context.resources.getDrawable(
                        R.drawable.ic_image,
                        null
                    )
                )
            } else {
                val thumb =
                    ThumbnailUtils.createVideoThumbnail(it, MediaStore.Images.Thumbnails.MINI_KIND)
                holder.imgUpload.setImageBitmap(thumb)
                holder.imgMediaType.setImageDrawable(
                    context.resources.getDrawable(
                        R.drawable.ic_video_player,
                        null
                    )
                )
            }
        }

        if (!data.isCompleted) {
            holder.pbUploading.visibility = View.VISIBLE
            holder.pbUploading.isIndeterminate = true
        } else {
            holder.pbUploading.visibility = View.GONE
        }
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUpload: ImageView
        var imgClose: ImageView
        var imgMediaType: ImageView
        var pbUploading: ProgressBar

        init {
            imgUpload = itemView.findViewById(R.id.img_upload)
            imgClose = itemView.findViewById(R.id.img_close)
            imgMediaType = itemView.findViewById(R.id.img_media_type)
            pbUploading = itemView.findViewById(R.id.pb_img_progress)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun updateUploadImageStatus(mUri: String, isCompleted: Boolean) {
        items.indexOfFirst {
            it.uri == mUri
        }.let { index ->
            if (index != -1) {
                items.get(index).isCompleted = isCompleted
                notifyDataSetChanged()
            }
        }
    }

    fun addImages(listImage: ArrayList<MediaData>) {
        items.addAll(listImage)
        notifyDataSetChanged()
    }

    fun updateImage(image: MediaData) {
        items.indexOfFirst {
            it.id.equals(image.id)
        }.let { index ->
            if (index != -1) {
                items.get(index).uri = image.uri
                items.get(index).isCompleted = true
                notifyItemChanged(index)
            }
        }
    }

    fun updateNote(note: String, index: Int) {
        items.get(index).note = note
        notifyItemChanged(index)
    }

    fun getNotes(): String {
        var notes = arrayListOf<Note>()
        items.forEach {
            notes.add(
                Note(
                    imageName = it.uri,
                    note = it.note ?: ""
                )
            )
        }
        return Gson().toJson(notes)
    }

    fun removeImage(position: Int) {
        if (position < items.size) {
            items.removeAt(position)
            notifyItemRemoved(position)
        }
    }

    fun getData(): ArrayList<String> {
        return items.map { it.uri } as ArrayList<String>
    }

    fun showProgress(isShow: Boolean) {
        items.forEach {
            it.isCompleted = isShow
        }
        notifyDataSetChanged()
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

    interface MediaListener {
        fun onItemRemoveClicked(item: MediaData, index: Int)
        fun onItemClicked(item: MediaData, index: Int)
    }

    fun setMediaListener(listener: MediaListener) {
        this.mListener = listener
    }

    companion object {
        const val MEDIA_IMAGE = 0
        const val MEDIA_VIDEO = 1
    }

}