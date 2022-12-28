package com.crayon.fieldapp.ui.screen.detailAttachment.image

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import com.crayon.fieldapp.utils.GlideApp
import com.crayon.fieldapp.utils.setSingleClick

class ImageAdapter constructor(
    val items: ArrayList<MediaData>,
    val context: Context,
    val isIconClose: Boolean,
    val removeClickListener: (MediaData) -> Unit = {},
    val onItemClick: (MediaData) -> Unit = {}
) :
    RecyclerView.Adapter<ImageAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_media, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]

        if (isIconClose) {
            holder.imgClose.visibility = View.VISIBLE
        } else {
            holder.imgClose.visibility = View.GONE
        }

        holder.itemView.setSingleClick {
            onItemClick(items.get(position))
        }

        holder.imgClose.setSingleClick {
            removeClickListener(items.get(position))
        }


        data.uri?.let {
            val options: RequestOptions = RequestOptions()
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher_round)
                .override(300,300)
            GlideApp.with(context).load(data.thumbnail).apply(options).into(holder.imgUpload)

            if (data.type == MEDIA_IMAGE) {
                holder.imgMediaType.setImageDrawable(
                    context.resources.getDrawable(
                        R.drawable.ic_image,
                        null
                    )
                )
            } else {
                holder.imgMediaType.setImageDrawable(
                    context.resources.getDrawable(
                        R.drawable.ic_video_player,
                        null
                    )
                )
            }
        }

        if (data.isCompleted) {
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

    private fun removeImage(position: Int) {
        items.removeAt(position)
        notifyItemRemoved(position)
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

    fun deleteImage(imageId: String) {
        items.indexOfFirst {
            it.id.toString().contains(imageId)
        }.let { index ->
            if (index != -1) {
                items.removeAt(index)
                notifyDataSetChanged()
            }
        }
    }

    companion object {
        const val MEDIA_IMAGE = 0
        const val MEDIA_VIDEO = 1
    }

}