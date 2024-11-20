package com.crayon.fieldapp.ui.base.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.GridMenu

class MenuRVAdapter(
    private val items: ArrayList<GridMenu>,
    private val context: Context,
    val mListener: MenuListener
) : RecyclerView.Adapter<MenuRVAdapter.MenuOptionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuOptionViewHolder =
        LayoutInflater.from(parent.context).inflate(R.layout.item_grid_menu, parent, false).let {
            MenuOptionViewHolder(it)
        }

    override fun onBindViewHolder(holder: MenuOptionViewHolder, position: Int) {
        val data = items[position]
        holder.tvContent.text = data.text
        holder.ivIcon.setImageResource(data.icon)
        holder.ivIcon.setColorFilter(context.getColor(R.color.white))
        holder.imgBg.setBackground(context.getDrawable(data.bgColor))

        holder.itemView.setOnClickListener {
            mListener.onMenuItemClicked(data.id)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MenuOptionViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var tvContent: TextView
        var ivIcon: ImageView
        var imgBg: RelativeLayout

        init {
            tvContent = itemView.findViewById(R.id.txt_content)
            ivIcon = itemView.findViewById(R.id.img_icon)
            imgBg = itemView.findViewById(R.id.img_bg)
        }

    }

    interface MenuListener {
        fun onMenuItemClicked(id: Int)
    }
}