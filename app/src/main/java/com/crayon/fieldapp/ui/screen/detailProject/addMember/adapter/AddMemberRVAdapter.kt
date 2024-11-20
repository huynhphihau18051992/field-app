package com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.User
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.utils.GlideApp


class AddMemberRVAdapter constructor(
    val items: ArrayList<ItemSelectMember>,
    val context: Context,
    val itemClickListener: (ItemSelectMember) -> Unit = {}
) : RecyclerView.Adapter<AddMemberRVAdapter.EmployeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_add_member_to_project, parent, false)
        val holder = EmployeeViewHolder(view)
        holder.adapterPosition
        return holder
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val data = items[position]
        holder.txtName.text = data.name
        holder.cbStore.isChecked = data.isSelected

        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .circleCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher_round)

        GlideApp.with(context).load(data.avatar).apply(options).into(holder.avatar)

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
        var avatar: ImageView
        var cbStore: CheckBox

        init {
            txtName = itemView.findViewById(R.id.txt_name)
            avatar = itemView.findViewById(R.id.img_avatar)
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

    fun addUser(stores: List<User>) {
        val list = ArrayList<ItemSelectMember>()
        stores.forEach {
            val item = ItemSelectMember(
                id = it.id,
                name = it.fullName,
                avatar = it.avatar_url,
                isSelected = false
            )
            list.add(item)
        }
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    fun addMember(stores: List<MemberResponse>) {
        val list = ArrayList<ItemSelectMember>()
        stores.forEach {
            val item = ItemSelectMember(
                id = it.id.toString(),
                name = it.lastName + " " + it.firstName,
                avatar = it.avatarUrl,
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