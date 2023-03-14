package com.crayon.fieldapp.ui.screen.monitor.changeGift.listPromotion.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.CustomerResponse
import com.crayon.fieldapp.data.remote.response.PromotionResponse

class PromotionRVAdapter constructor(
    val items: ArrayList<PromotionResponse>,
    val context: Context,
    val itemClickListener: (PromotionResponse) -> Unit = {}
) : RecyclerView.Adapter<PromotionRVAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_report_promotion, parent, false)
        val holder = JobViewHolder(view)
        holder.itemView.setOnClickListener {
            itemClickListener(items.get(holder.absoluteAdapterPosition))
        }
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        data.name?.let {
            holder.txtName.text = it
        }

        data.quantity?.let {
            holder.txtNum.text = it.toString()
        }
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView
        var txtNum: TextView

        init {
            txtName = itemView.findViewById(R.id.txt_name)
            txtNum = itemView.findViewById(R.id.txt_num)
        }

    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun addAll(jobs: List<PromotionResponse>) {
        items.addAll(jobs)
        notifyDataSetChanged()
    }

    fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

}