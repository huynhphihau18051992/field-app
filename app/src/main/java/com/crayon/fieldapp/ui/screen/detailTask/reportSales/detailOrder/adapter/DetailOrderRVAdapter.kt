package com.crayon.fieldapp.ui.screen.detailTask.reportSales.detailOrder.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.utils.setSingleClick
import java.text.DecimalFormat

class DetailOrderRVAdapter constructor(
    val items: ArrayList<ProductResponse>,
    val context: Context,
    val onItemClick: (ProductResponse) -> Unit = {}
) :
    RecyclerView.Adapter<DetailOrderRVAdapter.GroupViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_order, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.txtOrderId.text = (position + 1).toString()
        holder.txtLoadMore.visibility = View.GONE
        holder.itemView.setSingleClick {
            onItemClick(data)
        }

        holder.txtProductName.text = data.name
        holder.txtQuality.text = data.quantity.toString()
        val total = data.price * data.quantity
        val format = DecimalFormat("#,###")
        format.maximumFractionDigits = 0
        holder.txtTotal.text = format.format(total) + "vnd"
        val price = data.price
        holder.txtPrice.text = format.format(price) + "vnd"
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtOrderId: TextView
        var txtProductName: TextView
        var txtQuality: TextView
        var txtPrice: TextView
        var txtTotal: TextView
        var txtLoadMore: TextView

        init {
            txtOrderId = itemView.findViewById(R.id.txt_order_id)
            txtProductName = itemView.findViewById(R.id.txt_name)
            txtQuality = itemView.findViewById(R.id.txt_quality)
            txtPrice = itemView.findViewById(R.id.txt_price)
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

    fun addAll(mOrders: ArrayList<ProductResponse>) {
        items.clear()
        items.addAll(mOrders)
        notifyDataSetChanged()
    }

}