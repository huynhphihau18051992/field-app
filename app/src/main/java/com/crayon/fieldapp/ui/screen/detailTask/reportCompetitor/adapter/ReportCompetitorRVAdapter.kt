package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ReportOpponentResponse
import com.crayon.fieldapp.utils.GlideApp
import com.crayon.fieldapp.utils.formatHourAndDate
import com.crayon.fieldapp.utils.setSingleClick

class ReportCompetitorRVAdapter constructor(
    val items: ArrayList<ReportOpponentResponse>,
    val context: Context,
    val onItemClick: (ReportOpponentResponse) -> Unit = {},
    val onImageClick: (ReportOpponentResponse) -> Unit = {}
) :
    RecyclerView.Adapter<ReportCompetitorRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_competitor, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.txtCustomerId.text = "Hoạt động " + (position + 1)

        data.brandName?.let {
            holder.txtName.text = it
        }

        data.type?.let {
            holder.txtType.text = it
        }

        data.createdAt?.let {
            holder.txtDate.text = formatHourAndDate(it)
        }

        data.medias?.let {
            val options: RequestOptions = RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.ic_photo)
                .error(R.drawable.ic_photo)
                .override(300, 300)
            holder.cvImage1.visibility = View.GONE
            holder.cvImage2.visibility = View.GONE
            holder.cvImage3.visibility = View.GONE
            when (it.size) {
                1 -> {
                    GlideApp.with(context).load(it.get(0)).apply(options).into(holder.cvImage1)
                    holder.cvImage1.visibility = View.VISIBLE
                }
                2 -> {
                    GlideApp.with(context).load(it.get(0).thumbnailUrl).apply(options).into(holder.cvImage1)
                    GlideApp.with(context).load(it.get(1).thumbnailUrl).apply(options).into(holder.cvImage2)
                    holder.cvImage1.visibility = View.VISIBLE
                    holder.cvImage2.visibility = View.VISIBLE
                }
                3 -> {
                    GlideApp.with(context).load(it.get(0).thumbnailUrl).apply(options).into(holder.cvImage1)
                    GlideApp.with(context).load(it.get(1).thumbnailUrl).apply(options).into(holder.cvImage2)
                    GlideApp.with(context).load(it.get(3).thumbnailUrl).apply(options).into(holder.cvImage3)
                    holder.cvImage1.visibility = View.VISIBLE
                    holder.cvImage2.visibility = View.VISIBLE
                    holder.cvImage3.visibility = View.VISIBLE
                }
                else -> {
                    holder.cvImage1.visibility = View.GONE
                    holder.cvImage2.visibility = View.GONE
                    holder.cvImage3.visibility = View.GONE
                }
            }
        }

        holder.itemView.setSingleClick {
            onItemClick(data)
        }

        holder.cvImage1?.setSingleClick {
            onImageClick(data)
        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtCustomerId: TextView
        var txtName: TextView
        var txtType: TextView
        var txtDate: TextView
        var txtGift: TextView
        var cvImage1: ImageView
        var cvImage2: ImageView
        var cvImage3: ImageView

        init {
            txtCustomerId = itemView.findViewById(R.id.txt_customer_num)
            txtName = itemView.findViewById(R.id.txt_name)
            txtType = itemView.findViewById(R.id.txt_type)
            txtDate = itemView.findViewById(R.id.txt_date)
            txtGift = itemView.findViewById(R.id.txt_note)
            cvImage1 = itemView.findViewById(R.id.img_1)
            cvImage2 = itemView.findViewById(R.id.img_2)
            cvImage3 = itemView.findViewById(R.id.img_3)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

    fun addItems(list: ArrayList<ReportOpponentResponse>) {
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

}