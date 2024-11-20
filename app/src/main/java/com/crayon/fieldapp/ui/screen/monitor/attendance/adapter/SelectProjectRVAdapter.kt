package com.crayon.fieldapp.ui.screen.monitor.attendance.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.SelectItem

class SelectProjectRVAdapter(
    private val items: ArrayList<SelectItem>,
    private val context: Context,
    val itemClickListener: (SelectItem) -> Unit = {}
) : RecyclerView.Adapter<SelectProjectRVAdapter.SelectAgencyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectAgencyViewHolder =
        LayoutInflater.from(parent.context).inflate(R.layout.item_select, parent, false).let {
            SelectAgencyViewHolder(it)
        }

    override fun onBindViewHolder(holder: SelectAgencyViewHolder, position: Int) {
        val data = items[position]
        holder.tvName.text = data.name

        if (data.isSelected) {
            holder.imgChecked.visibility = View.VISIBLE
        } else {
            holder.imgChecked.visibility = View.INVISIBLE
        }

        holder.itemView.setOnClickListener {
            updateSelectedPlayer(data.id.toString())
            itemClickListener(data)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class SelectAgencyViewHolder(view: View) :
        androidx.recyclerview.widget.RecyclerView.ViewHolder(view) {
        var tvName: TextView
        var imgChecked: ImageView

        init {
            tvName = itemView.findViewById(R.id.txt_name)
            imgChecked = itemView.findViewById(R.id.ic_checked)
        }
    }

    fun getSelectedItem(): SelectItem? {
        items.forEach {
            if (it.isSelected) {
                return it
            }
        }
        return null
    }

    fun updateSelectedPlayer(itemId: String) {
        items.forEach {
            it.isSelected = (if (it.id.equals(itemId)) true else false)
        }
        notifyDataSetChanged()
    }
}