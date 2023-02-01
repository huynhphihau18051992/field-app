package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse

class GiftRVAdapter constructor(
    val items: ArrayList<GiftResponse>,
    val context: Context,
    val onEditItemClick: (String) -> Unit = {},
    val onItemClick: (String) -> Unit = {}
) :
    RecyclerView.Adapter<GiftRVAdapter.GroupViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_select_product, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
//        holder.txtCustomerId.text = "KH" + position + 1
//
//        holder.itemView.setSingleClick {
//            onItemClick(data)
//        }
//
//        holder.icEdit.setSingleClick {
//            onEditItemClick(data)
//        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var rvProduct: RecyclerView

        //        var icEdit: ImageView
//        var txtName: TextView
//        var txtPhone: TextView
//        var txtDate: TextView
//        var txtGift: TextView
//
        init {
//            rvProduct = itemView.findViewById(R.id.rv_product)
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