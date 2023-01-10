package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R

class PromotionRVAdapter constructor(
    val items: ArrayList<String>,
    val context: Context,
    val onCheckBoxSelect: (position: Int, isChecked: Boolean) -> Unit = { i: Int, b: Boolean -> },
    val onItemClick: (String) -> Unit = {}
) :
    RecyclerView.Adapter<PromotionRVAdapter.GroupViewHolder>() {
    private lateinit var mPromotionAdapter: SubProductRVAdapter


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_promotion, parent, false)
        val holder = GroupViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        val data = items[position]
        if (items.size - 1 == position) {
            holder.imgLine.visibility = View.GONE
        } else {
            holder.imgLine.visibility = View.VISIBLE
        }

        holder.cbProduct?.setOnCheckedChangeListener { buttonView, isChecked ->
            onCheckBoxSelect(position, isChecked)
        }

//        holder.txtCustomerId.text = "KH" + position + 1
//
//        holder.itemView.setSingleClick {
//            onItemClick(data)
//        }
//
//        holder.icEdit.setSingleClick {
//            onEditItemClick(data)
//        }
        mPromotionAdapter = SubProductRVAdapter(arrayListOf("1", "2", "3"), context, {
        }, {

        })

        holder.rvProduct.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mPromotionAdapter
        }

    }

    inner class GroupViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var rvProduct: RecyclerView
        var imgLine: ImageView
        var cbProduct: CheckBox

        //        var icEdit: ImageView
//        var txtName: TextView
//        var txtPhone: TextView
//        var txtDate: TextView
//        var txtGift: TextView
//
        init {
            rvProduct = itemView.findViewById(R.id.rv_product)
            imgLine = itemView.findViewById(R.id.img_line)
            cbProduct = itemView.findViewById(R.id.cb_product)
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