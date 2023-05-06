package com.crayon.fieldapp.ui.screen.home.adapter

import android.content.Context
import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.utils.*
import kotlinx.android.synthetic.main.item_job.view.*
import java.util.*

class TodayJobAdapter constructor(
    val items: ArrayList<JobResponse>,
    val context: Context,
    val itemClickListener: (JobResponse) -> Unit = {}
) : RecyclerView.Adapter<TodayJobAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_job, parent, false)
        val holder = JobViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        val now = Calendar.getInstance().timeInMillis
        val startTimeJob = data.startTime.toString().toTimeLong("yyyy-MM-dd'T'HH:mm") ?: 0

        if (startTimeJob.isToday()) {
            var threadhold_start = startTimeJob - 60 * 60 * 1000 // truoc 1h
            Log.d("AAAHAU",  "now:" + now + "/ threadhold_start: " + threadhold_start + "start: "+ startTimeJob)
            if (now >= threadhold_start) {
                enableJob(holder)
            } else {
                disableJob(holder = holder, isClick = false)
            }
        } else {
            if (startTimeJob.isPreviousDay()) {
                disableJob(holder = holder, isClick = false)
            } else {
                disableJob(holder = holder, isClick = true)
            }
        }
        data.store?.name?.let {
            holder.txtStore.text = it
        }

        data.project?.name?.let {
            holder.txtProjectName.text = it
        }
        val start_date = formatHour(data.startTime.toString())
        val end_date = formatHour(data.endTime.toString())
        var timeAM = "Sáng"
        if (startTimeJob.isAM()) {
            timeAM = "Sáng"
        } else {
            timeAM = "Chiều"
        }

        holder.itemView.setOnClickListener {
            itemClickListener(items.get(holder.absoluteAdapterPosition))
        }

        val shift = start_date.toString() + "-" + end_date
        holder.txtTime.text = shift.toString()
        holder.itemView.txt_am.text = "(" + timeAM + ")"
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtStore: TextView
        var txtProjectName: TextView
        var txtTime: TextView
        var txt_am: TextView

        init {
            txtStore = itemView.findViewById(R.id.txt_store_name)
            txtProjectName = itemView.findViewById(R.id.txt_project_name)
            txtTime = itemView.findViewById(R.id.txt_shift)
            txt_am = itemView.findViewById(R.id.txt_am)
        }

    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun addAll(jobs: ArrayList<JobResponse>) {
        items.addAll(jobs)
        notifyDataSetChanged()
    }

    fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

    private fun enableJob(holder: JobViewHolder) {
        holder.txtStore.setTextColor(context.resources.getColor(R.color.colorAccent, null))
        holder.txtProjectName.setTextColor(
            context.resources.getColor(
                R.color.colorAccent,
                null
            )
        )
        holder.txtTime.setTextColor(context.resources.getColor(R.color.colorAccent, null))
        holder.txt_am.setTextColor(context.resources.getColor(R.color.colorAccent, null))
        holder.txt_am.setTypeface(holder.txt_am.getTypeface(), Typeface.BOLD)
        holder.itemView.isEnabled = true
    }

    private fun disableJob(holder: JobViewHolder, isClick: Boolean) {
        holder.txtStore.setTextColor(context.resources.getColor(R.color.colorGray, null))
        holder.txtProjectName.setTextColor(
            context.resources.getColor(
                R.color.colorGray,
                null
            )
        )
        holder.txtTime.setTextColor(context.resources.getColor(R.color.colorGray, null))
        holder.txt_am.setTextColor(context.resources.getColor(R.color.colorGray, null))
        holder.txt_am.setTypeface(holder.txt_am.getTypeface(), Typeface.NORMAL)
        holder.itemView.isEnabled = isClick
    }
}