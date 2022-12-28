package com.crayon.fieldapp.ui.screen.monitor.updateStatus.listTask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.utils.toDate
import studio.phillip.yolo.utils.TimeFormatUtils
import java.util.*

class UpdateStatusAdapter constructor(
    val items: ArrayList<TaskResponse>,
    val context: Context,
    val itemClickListener: (TaskResponse) -> Unit = {}
) : RecyclerView.Adapter<UpdateStatusAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_update_status, parent, false)
        val holder = JobViewHolder(view)
        holder.itemView.setOnClickListener {
            itemClickListener(items.get(holder.absoluteAdapterPosition))
        }
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        holder.txtNum.text = "0"
        holder.txtFistTime.text = ""
        holder.txtLastTime.text = ""
        data.attachments?.let {
            holder.txtNum.text = it.size.toString()
            if (it.size > 0) {
                if (it.size == 1) {
                    it.get(0).createdAt?.toDate("yyyy-MM-dd'T'HH:mm")?.let {
                        holder.txtFistTime.text = TimeFormatUtils.formatHour(it)
                        holder.txtLastTime.text = TimeFormatUtils.formatHour(it)
                    }
                } else {
                    it.get(0).createdAt?.toDate("yyyy-MM-dd'T'HH:mm")?.let {
                        holder.txtFistTime.text = TimeFormatUtils.formatHour(it)
                    }
                    it.last().createdAt?.toDate("yyyy-MM-dd'T'HH:mm")?.let {
                        holder.txtLastTime.text = TimeFormatUtils.formatHour(it)
                    }
                }
            }
        }
        data.store?.let {
            holder.txtStore.text = it.name
        }
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtStore: TextView
        var txtNum: TextView
        var txtFistTime: TextView
        var txtLastTime: TextView

        init {
            txtStore = itemView.findViewById(R.id.txt_store_name)
            txtNum = itemView.findViewById(R.id.txt_num)
            txtFistTime = itemView.findViewById(R.id.txt_fist_time)
            txtLastTime = itemView.findViewById(R.id.txt_last_time)
        }

    }

    override fun getItemCount(): Int {
        return this.items.size
    }


    fun addAll(jobs: List<TaskResponse>) {
        items.addAll(jobs)
        notifyDataSetChanged()
    }

    fun clearAll(){
        items.clear()
        notifyDataSetChanged()
    }
}