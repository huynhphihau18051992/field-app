package com.crayon.fieldapp.ui.screen.monitor.reportTracking.history.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R

class HistoryTrackingRVAdapter constructor(
    val items: ArrayList<String>,
    val context: Context,
    val itemClickListener: (String) -> Unit = {}
) : RecyclerView.Adapter<HistoryTrackingRVAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_history, parent, false)
        val holder = JobViewHolder(view)
        holder.itemView.setOnClickListener {
            itemClickListener(items.get(holder.absoluteAdapterPosition))
        }
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        holder.txtTime.text = data
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtTime: TextView

        init {
            txtTime = itemView.findViewById(R.id.txt_time)
        }

    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun addAll(jobs: List<String>) {
        items.addAll(jobs)
        notifyDataSetChanged()
    }

    fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

}