package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.utils.GlideApp

class BillImageRVAdapter constructor(
    val items: ArrayList<String>,
    val context: Context
) :
    RecyclerView.Adapter<BillImageRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_image, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .placeholder(R.drawable.ic_photo)
            .error(R.drawable.ic_photo)
            .override(300, 300)
        GlideApp.with(context).load(data).apply(options)
            .into(holder.imgBill)
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgBill: ImageView

        init {
            imgBill = itemView.findViewById(R.id.img_1)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

}