package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import com.crayon.fieldapp.utils.GlideApp
import com.crayon.fieldapp.utils.setSingleClick

class UploadMediaAdapter constructor(
    val items: ArrayList<MediaData>,
    val context: Context,
    val onItemClick: (MediaData, Int) -> Unit = { data: MediaData, position: Int -> },
    val removeClickListener: (MediaData, Int) -> Unit = { data: MediaData, position: Int -> }
) :
    RecyclerView.Adapter<UploadMediaAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_image, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]

        holder.imgClose.setSingleClick {
            removeClickListener(items.get(position), position)
        }

        holder.itemView.setSingleClick {
            onItemClick(items.get(position), position)
        }


        data.uri?.let {
            val options: RequestOptions = RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.ic_photo)
                .error(R.drawable.ic_photo)
                .override(300, 300)
            GlideApp.with(context).load(data.thumbnail).apply(options).into(holder.imgUpload)
        }
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgUpload: ImageView
        var imgClose: ImageView

        init {
            imgUpload = itemView.findViewById(R.id.img_upload)
            imgClose = itemView.findViewById(R.id.img_close)
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

    fun deleteImage(position: Int) {
        if (position != -1) {
            items.removeAt(position)
            notifyDataSetChanged()
        }
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

    companion object {
        const val MEDIA_IMAGE = 0
        const val MEDIA_VIDEO = 1
    }

}