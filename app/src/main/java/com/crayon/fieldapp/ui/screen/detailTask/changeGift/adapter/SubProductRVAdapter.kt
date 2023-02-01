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

//        holder.icEdit.setSingleClick {
//            onEditItemClick(data)
//        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtCustomerId: TextView
        var tvLoadMore: TextView
//        var icEdit: ImageView
//        var txtName: TextView
//        var txtPhone: TextView
//        var txtDate: TextView
//        var txtGift: TextView

        init {
            txtCustomerId = itemView.findViewById(R.id.txt_order_id)
            tvLoadMore = itemView.findViewById(R.id.txt_load_more)
//            icEdit = itemView.findViewById(R.id.img_edit)
//            txtName = itemView.findViewById(R.id.txt_name)
//            txtPhone = itemView.findViewById(R.id.txt_phone)
//            txtDate = itemView.findViewById(R.id.txt_date)
//            txtGift = itemView.findViewById(R.id.txt_gift)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clearData() {
        items.clear()
        notifyDataSetChanged()
    }

    fun addProduct(product: ProductResponse){
        items.add(product)
        notifyDataSetChanged()
    }

    fun addAll(proudcts: ArrayList<ProductResponse>){
        items.clear()
        items.addAll(proudcts)
        notifyDataSetChanged()
    }

}