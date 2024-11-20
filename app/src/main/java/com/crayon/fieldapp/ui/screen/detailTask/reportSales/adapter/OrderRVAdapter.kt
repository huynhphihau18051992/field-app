package com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.utils.setSingleClick
import java.text.DecimalFormat

class OrderRVAdapter constructor(
    val items: ArrayList<OrderResponse>,
    val context: Context,
    val onItemClickListener: (OrderResponse) -> Unit = {},
    val onItemEditListener: (OrderResponse) -> Unit = {},
    val isEdit: Boolean = false
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
            onItemClickListener(data)
        }
        holder.txtLoadMore.visibility = View.GONE
        data.products?.let { mListProduct ->
            if (mListProduct.size <= 1) {
                holder.txtLoadMore.visibility = View.GONE
            } else {
                holder.txtLoadMore.visibility = View.VISIBLE
                holder.txtLoadMore.text = "Xem thêm " + (mListProduct.size - 1) + " sản phẩm"
            }
            val total = mListProduct.sumBy { it.price * it.quantity }
            val format = DecimalFormat("#,###")

            if (mListProduct.size >= 1) {
                holder.txtProductName.text = mListProduct.get(0).name
                holder.txtQuality.text = mListProduct.get(0).quantity.toString()
                val price = mListProduct.get(0).price
                holder.txtPrice.text = format.format(price) + "vnd"
            }


            format.maximumFractionDigits = 0
            holder.txtTotal.text = format.format(total) + "vnd"
        }
        if (isEdit) {
            holder.imgEdit.visibility = View.VISIBLE
        } else {
            holder.imgEdit.visibility = View.GONE
        }
        holder.imgEdit?.setSingleClick {
            onItemEditListener(data)
        }
    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtOrderId: TextView
        var txtProductName: TextView
        var txtQuality: TextView
        var txtPrice: TextView
        var txtTotal: TextView
        var txtLoadMore: TextView
        var imgEdit: ImageView

        init {
            txtOrderId = itemView.findViewById(R.id.txt_order_id)
            txtProductName = itemView.findViewById(R.id.txt_name)
            txtQuality = itemView.findViewById(R.id.txt_quality)
            txtPrice = itemView.findViewById(R.id.txt_price)
            txtTotal = itemView.findViewById(R.id.txt_total)
            txtLoadMore = itemView.findViewById(R.id.txt_load_more)
            imgEdit = itemView.findViewById(R.id.img_edit)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

    fun addAll(mOrders: ArrayList<OrderResponse>) {
        mOrders.sortByDescending { it.createdAt }
        items.clear()
        items.addAll(mOrders)
        notifyDataSetChanged()
    }
}