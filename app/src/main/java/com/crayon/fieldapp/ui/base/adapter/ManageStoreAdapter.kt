package com.crayon.fieldapp.ui.base.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Store
import com.crayon.fieldapp.data.remote.response.StoreOfProjectResponse
import com.crayon.fieldapp.utils.showConfirmDialog

class ManageStoreAdapter constructor(
    val items: ArrayList<StoreOfProjectResponse>,
    val context: Context,
    val itemClickListener: (StoreOfProjectResponse) -> Unit = {},
    val removeItemClickListener: (StoreOfProjectResponse) -> Unit = {}
) : RecyclerView.Adapter<ManageStoreAdapter.StoreViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_manage_store, parent, false)
        val holder = StoreViewHolder(view)
        holder.adapterPosition
        return holder
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        val data = items[position]

        data.address?.let {
            holder.txtAddress.text = data.address
        }

        data.name?.let {
            holder.txtName.text = data.name
        }


        holder.itemView.setOnClickListener {
            itemClickListener(data)
        }

        holder.imgRemove.setOnClickListener {
            context.showConfirmDialog(
                title = "Bạn có muốn xoá cửa hàng này không?",
                textPositive = "Có",
                textNegative = "Không",
                positiveListener = {
                    removeItemClickListener(data)
                }
            )
        }
    }

    inner class StoreViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var txtName: TextView
        var txtAddress: TextView
        var imgRemove: ImageView

        init {
            txtName = itemView.findViewById(R.id.txt_name)
            txtAddress = itemView.findViewById(R.id.txt_address)
            imgRemove = itemView.findViewById(R.id.imb_delete)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }


    fun removeStores(ids: ArrayList<String>) {
        ids.forEach { storeId ->
            items.indexOfFirst {
                it.id == storeId
            }.let { index ->
                if (index != -1) {
                    items.removeAt(index)
                    notifyItemRemoved(index)
                }
            }
        }

    }

    fun addStore(stores: ArrayList<StoreOfProjectResponse>) {
        items.clear()
        items.addAll(stores)
        notifyDataSetChanged()
    }

    fun getIds(): ArrayList<String> {
        var ids = ArrayList<String>()
        ids = items.map { it.id } as ArrayList<String>
        return ids
    }

}