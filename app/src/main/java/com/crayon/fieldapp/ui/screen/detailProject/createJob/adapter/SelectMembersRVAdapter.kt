package com.crayon.fieldapp.ui.screen.detailProject.createJob.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter.ItemSelectMember
import com.crayon.fieldapp.utils.GlideApp

class SelectMembersRVAdapter constructor(
    private val items: ArrayList<ItemSelectMember>,
    private val context: Context,
    val itemClickListener: (ItemSelectMember) -> Unit = {}
) : RecyclerView.Adapter<SelectMembersRVAdapter.SelectMembersViewHolder>() {


    override fun onBindViewHolder(holder: SelectMembersViewHolder, position: Int) {
        val data = items[position]
        holder.tvName.text = data.name

        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .circleCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher_round)

        GlideApp.with(context).load(data.avatar).apply(options).into(holder.imgAvatar)

        if (data.isSelected) {
            holder.imgChecked.visibility = View.VISIBLE
        } else {
            holder.imgChecked.visibility = View.INVISIBLE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectMembersViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_select_member, parent, false)
        val holder = SelectMembersViewHolder(view)

        holder.itemView.setOnClickListener {
            updateSelectMembers(items.get(holder.adapterPosition).id)
        }
        return holder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class SelectMembersViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView
        var imgChecked: ImageView
        var imgAvatar: ImageView

        init {
            tvName = itemView.findViewById(R.id.txt_name)
            imgChecked = itemView.findViewById(R.id.ic_checked)
            imgAvatar = itemView.findViewById(R.id.img_avatar)
        }
    }

    fun getSelectedMembers(): String {
        items.forEach {
            if (it.isSelected) {
                return it.id
            }
        }
        return "-1"
    }

    fun updateSelectMembers(uid: String) {
        items.forEach {
            it.isSelected = (if (it.id.equals(uid)) true else false)
        }
        notifyDataSetChanged()
    }


    fun addAll(members: List<MemberResponse>) {
        val list = ArrayList<ItemSelectMember>()
        members.forEach {
            val item = ItemSelectMember(
                it.id.toString(),
                it.lastName + " " + it.firstName,
                it.avatarUrl,
                isSelected = false
            )
            list.add(item)
        }
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

}