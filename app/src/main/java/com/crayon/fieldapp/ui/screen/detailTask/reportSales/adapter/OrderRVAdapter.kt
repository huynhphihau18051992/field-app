package com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.utils.setSingleClick

class OrderRVAdapter constructor(
    val items: ArrayList<String>,
    val context: Context,
    val onItemClick: (String) -> Unit = {}
) :
    RecyclerView.Adapter<OrderRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_order, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.txtOrderId.text = "Đơn hàng " + (position + 1).toString()
        holder.itemView.setSingleClick {
            onItemClick(data)
        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtOrderId: TextView
        var txtProductName: TextView
        var txtQuality: TextView
        var txtTotal: TextView
        var txtLoadMore: TextView

        init {
            txtOrderId = itemView.findViewById(R.id.txt_order_id)
            txtProductName = itemView.findViewById(R.id.txt_name)
            txtQuality = itemView.findViewById(R.id.txt_quality)
            txtTotal = itemView.findViewById(R.id.txt_total)
            txtLoadMore = itemView.findViewById(R.id.txt_load_more)
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