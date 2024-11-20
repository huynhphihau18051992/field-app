package com.crayon.fieldapp.ui.base.dialog.selectRole

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.RoleResponse

class SelectAgencyRVAdapter(
    private val items: ArrayList<RoleResponse>,
    private val context: Context,
    private val mListener: SelectRoleListener
) : RecyclerView.Adapter<SelectAgencyRVAdapter.SelectMembersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectMembersViewHolder =
        LayoutInflater.from(parent.context).inflate(R.layout.item_select, parent, false).let {
            SelectMembersViewHolder(it)
        }

    override fun onBindViewHolder(holder: SelectMembersViewHolder, position: Int) {
        val data = items[position]
        holder.tvName.text = data.agency!!.name

        if (data.isSelected) {
            holder.imgChecked.visibility = View.VISIBLE
        } else {
            holder.imgChecked.visibility = View.INVISIBLE
        }

        holder.itemView.setOnClickListener {
            updateSelectedPlayer(data.id)
            mListener.onRoleItemClicked(data.id)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class SelectMembersViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName: TextView
        var imgChecked: ImageView

        init {
            tvName = itemView.findViewById(R.id.txt_name)
            imgChecked = itemView.findViewById(R.id.ic_checked)
        }
    }

    fun getSelectedRole(): RoleResponse? {
        items.forEach {
            if (it.isSelected) {
                return it
            }
        }
        return null
    }

    fun updateSelectedPlayer(agencyId: String) {
        items.forEach {
            it.isSelected = (if (it.id.equals(agencyId)) true else false)
        }
        notifyDataSetChanged()
    }

    interface SelectRoleListener {
        fun onRoleItemClicked(agencyId: String)
    }


}