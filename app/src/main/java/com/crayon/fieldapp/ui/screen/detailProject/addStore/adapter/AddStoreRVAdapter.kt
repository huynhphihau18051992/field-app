package com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.StoreResponse

class AddStoreRVAdapter constructor(
    val items: ArrayList<ItemSelectStore>,
    val context: Context,
    val itemClickListener: (ItemSelectStore) -> Unit = {}
) : RecyclerView.Adapter<AddStoreRVAdapter.EmployeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_add_store_to_project, parent, false)
        val holder = EmployeeViewHolder(view)
        holder.adapterPosition
        return holder
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val data = items[position]
        holder.txtName.text = data.name
        holder.txtAddress.text = data.address

        holder.cbStore.isChecked = data.isSelected

        holder.itemView.setOnClickListener {
            itemClickListener(data)
        }

        holder.cbStore.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                holder.cbStore.isChecked = true
                items.get(position).isSelected = true
            } else {
                holder.cbStore.isChecked = false
                items.get(position).isSelected = false
            }
        }
    }

    inner class EmployeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView
        var txtAddress: TextView
        var cbStore: CheckBox

        init {
            txtName = itemView.findViewById(R.id.txt_name)
            txtAddress = itemView.findViewById(R.id.txt_address)
            cbStore = itemView.findViewById(R.id.cb_user)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun removeUsers(uid: String) {
        items.indexOfFirst {
            it.id == uid
        }.let { index ->
            if (index != -1) {
                items.removeAt(index)
                notifyItemRemoved(index)
            }
        }
    }

    fun selectAllItems(isChecked: Boolean) {
        items.forEach {
            it.isSelected = isChecked
        }
        notifyDataSetChanged()
    }

    fun addStore(stores: List<StoreResponse>) {
        val list = ArrayList<ItemSelectStore>()
        stores.forEach {
            val item = ItemSelectStore(
                it.id.toString(),
                it.name,
                it.address,
                isSelected = false
            )
            list.add(item)
        }
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    fun getUserIds(): List<String> {
        return items.map { it.id.toString() }
    }

    fun getSelectedItem(): List<String> {
        return items.filter { it.isSelected == true }.map { it.id }
    }
}