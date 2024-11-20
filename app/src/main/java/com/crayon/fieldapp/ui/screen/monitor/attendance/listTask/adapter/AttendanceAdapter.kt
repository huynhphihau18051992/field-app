package com.crayon.fieldapp.ui.screen.monitor.attendance.listTask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.utils.formatHour
import com.crayon.fieldapp.utils.toTimeLong
import com.crayon.fieldapp.utils.toTimeString
import kotlinx.android.synthetic.main.item_job.view.*
import java.util.*

class AttendanceAdapter constructor(
    val items: ArrayList<TaskResponse>,
    val context: Context,
    val itemClickListener: (TaskResponse) -> Unit = {}
) : RecyclerView.Adapter<AttendanceAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_job_monitor_attendance, parent, false)
        val holder = JobViewHolder(view)
        holder.itemView.setOnClickListener {
            itemClickListener(items.get(holder.absoluteAdapterPosition))
        }
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        holder.txtStore.text = ""
        holder.txtTime.text = ""
        holder.txtCheckOutValue.text = ""
        holder.txtCheckInValue.text = ""
        holder.txtPic.text = ""
        var checkIn = 0L
        var checkOut = 0L
        val currentTime = Calendar.getInstance().timeInMillis
        val startTime = data.job!!.startTime.toString().toTimeLong("yyyy-MM-dd'T'HH:mm") ?: 0
        val endTime = data.job!!.endTime.toString().toTimeLong("yyyy-MM-dd'T'HH:mm") ?: 0
        data.attendances?.let { attendances ->
            if (attendances.size == 1) {
                holder.txtCheckInValue.text = formatHour(attendances.get(0).checkInTime.toString())
                holder.txtCheckOutValue.text =
                    formatHour(attendances.get(0).checkOutTime.toString())
                checkIn =
                    attendances.get(0).checkInTime.toString().toTimeLong("yyyy-MM-dd'T'HH:mm") ?: 0
                checkOut =
                    attendances.get(0).checkOutTime.toString().toTimeLong("yyyy-MM-dd'T'HH:mm") ?: 0
            }
        }

        if (checkIn > startTime) {
            holder.txtCheckInValue.setTextColor(context.resources.getColor(R.color.colorRed, null))
        } else {
            if (checkIn == 0L) {
                holder.txtCheckInValue.setTextColor(
                    context.resources.getColor(
                        R.color.colorRed,
                        null
                    )
                )
                holder.txtCheckInValue.text = "InComplete"
            } else {
                holder.txtCheckInValue.setTextColor(context.resources.getColor(R.color.colorGray, null))
            }
        }

        if (checkOut < endTime) {
            holder.txtCheckOutValue.setTextColor(context.resources.getColor(R.color.colorRed, null))
            if (checkOut == 0L) {
                holder.txtCheckOutValue.text = "InComplete"
            }
        } else {
            holder.txtCheckOutValue.setTextColor(
                context.resources.getColor(
                    R.color.colorGray,
                    null
                )
            )
        }

        data.store?.name.let {
            holder.txtStore.text = it
        }
        data.pic?.let {
            holder.txtPic.text = it.lastName + " " + it.firstName
        }

        val start_date = formatHour(data.job!!.startTime.toString())
        val end_date = formatHour(data.job!!.endTime.toString())
        var timeAM = "Sáng"
        if (startTime.toTimeString("yyyy-MM-dd aa")!!.contains("AM")) {
            timeAM = "Sáng"
        } else {
            timeAM = "Chiều"
        }

        val shift = start_date.toString() + "-" + end_date
        holder.txtTime.text = shift.toString()
        holder.itemView.txt_am.text = "(" + timeAM + ")"
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtStore: TextView
        var txtTime: TextView
        var txtPic: TextView
        var txtCheckInValue: TextView
        var txtCheckOutValue: TextView
        var txt_am: TextView

        init {
            txtStore = itemView.findViewById(R.id.txt_store_name)
            txtTime = itemView.findViewById(R.id.txt_shift)
            txtPic = itemView.findViewById(R.id.txt_pic)
            txtCheckInValue = itemView.findViewById(R.id.txt_check_in_value)
            txtCheckOutValue = itemView.findViewById(R.id.txt_check_out_value)
            txt_am = itemView.findViewById(R.id.txt_am)
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