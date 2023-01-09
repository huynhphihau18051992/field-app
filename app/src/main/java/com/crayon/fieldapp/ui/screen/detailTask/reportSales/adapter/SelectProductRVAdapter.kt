package com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.utils.setSingleClick

class SelectProductRVAdapter constructor(
    val items: ArrayList<String>,
    val context: Context,
    val onItemClick: (String) -> Unit = {}
) :
    RecyclerView.Adapter<SelectProductRVAdapter.GroupViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_select_product, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        holder.txtProductName.text = data
        holder.itemView.setSingleClick {
            onItemClick(data)
        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cbProduct: CheckBox
        var txtProductName: TextView
        var txtProductPrice: TextView
        var imgMinus: ImageView
        var imgPlus: ImageView
        var txtNumber: TextView

        init {
            cbProduct = itemView.findViewById(R.id.cb_product)
            txtProductName = itemView.findViewById(R.id.txt_product_name)
            txtProductPrice = itemView.findViewById(R.id.txt_price)
            txtNumber = itemView.findViewById(R.id.txt_number)
            imgMinus = itemView.findViewById(R.id.img_minus)
            imgPlus = itemView.findViewById(R.id.img_plus)
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