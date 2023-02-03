package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.utils.setSingleClick
import java.text.DecimalFormat

class SubProductRVAdapter constructor(
    val items: ArrayList<ProductResponse>,
    val context: Context,
    val onEditItemClick: (ProductResponse) -> Unit = {},
    val onItemClick: (ProductResponse) -> Unit = {}
) :
    RecyclerView.Adapter<SubProductRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_order, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.txtCustomerId.text = (position + 1).toString()

        holder.tvLoadMore.visibility = View.GONE
        holder.itemView.setSingleClick {
            onItemClick(data)
        }
        holder.txtName.text = data.name.toString()
        holder.txtQuantity.text = data.quantity.toString()
        val format = DecimalFormat("#,###")
        format.maximumFractionDigits = 0
        var total = data.price.toInt() * data.quantity
        holder.txtPrice.text = format.format(total) + "vnd"

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtCustomerId: TextView
        var tvLoadMore: TextView
        var txtName: TextView
        var txtQuantity: TextView
        var txtPrice: TextView

        init {
            txtCustomerId = itemView.findViewById(R.id.txt_order_id)
            tvLoadMore = itemView.findViewById(R.id.txt_load_more)
            txtName = itemView.findViewById(R.id.txt_name)
            txtQuantity = itemView.findViewById(R.id.txt_quality)
            txtPrice = itemView.findViewById(R.id.txt_total)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

    fun addAll(proudcts: ArrayList<ProductResponse>) {
        items.clear()
        items.addAll(proudcts)
        notifyDataSetChanged()
    }

}