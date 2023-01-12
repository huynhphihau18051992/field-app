package com.crayon.fieldapp.ui.screen.detailPicJob.adapter

import android.content.Context
import android.text.format.DateUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.JobStatus
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.utils.toDate

class ListTaskAdapter constructor(
    val items: ArrayList<TaskResponse>,
    val context: Context,
    val itemClickListener: (TaskResponse) -> Unit = {}
) : RecyclerView.Adapter<ListTaskAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_task, parent, false)
        return JobViewHolder(view)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]

        data.type?.name?.let {
            // TODO
            if (it.contains("Báo cáo khách hàng")) {
                holder.txtTask.text = "Đổi quà"
            } else if (it.contains("Báo cáo cuối ca")) {
                holder.txtTask.text = "Báo cáo bán hàng"
            } else {
                holder.txtTask.text = it
            }
        }

        if (data.status.equals(JobStatus.PENDING.value)
            || data.status.equals(JobStatus.CLOSED.value)
        ) {
            // TODO fix temp waiting BE
            val startTime = data.job!!.startTime!!.toDate("yyyy-MM-dd'T'HH:mm")
            startTime?.let {
                if (DateUtils.isToday(it.time)) {
                    holder.txtTask.setTextColor(
                        context.resources.getColor(
                            R.color.colorAccent,
                            null
                        )
                    )
                    holder.itemView.isEnabled = true
                    holder.icTask.setImageResource(R.drawable.ic_blue_minus)
                } else {
                    holder.txtTask.setTextColor(context.resources.getColor(R.color.colorGray, null))
                    holder.itemView.isEnabled = false
                    holder.icTask.setImageResource(R.drawable.ic_gray_minus)
                }
            }
        } else {
            holder.txtTask.setTextColor(context.resources.getColor(R.color.colorAccent, null))
            holder.itemView.isEnabled = true
            holder.icTask.setImageResource(R.drawable.ic_blue_minus)
        }

        holder.itemView.setOnClickListener {
            itemClickListener(data)
        }
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var icTask: ImageView
        var txtTask: TextView

        init {
            icTask = itemView.findViewById(R.id.cb_select)
            txtTask = itemView.findViewById(R.id.txt_task)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun addAll(jobs: ArrayList<TaskResponse>) {
        items.clear()
        items.addAll(jobs)
        notifyDataSetChanged()
    }
}