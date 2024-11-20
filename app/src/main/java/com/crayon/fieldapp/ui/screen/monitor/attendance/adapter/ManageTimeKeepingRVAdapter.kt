package com.crayon.fieldapp.ui.screen.monitor.attendance.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.AttendanceResponse
import com.crayon.fieldapp.utils.formatDate


class ManageTimeKeepingRVAdapter constructor(
    val items: ArrayList<AttendanceResponse>,
    val context: Context,
    val itemClickListener: (AttendanceResponse) -> Unit = {}
) :
    RecyclerView.Adapter<ManageTimeKeepingRVAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_attendance, parent, false)
        return JobViewHolder(view)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items.get(position)

        holder.txtStoreName.text = data.store!!.name
        holder.txtPeople.text = data.totalPic.toString()


        var shift_end = "-"
        data.endTime?.let {
            shift_end = formatDate(data.endTime.toString())
        }
        var shift_start = "-"
        data.startTime?.let {
            shift_start = formatDate(data.startTime.toString())
        }

        holder.txtTime.text = "Thời gian: " + shift_start + " - " + shift_end
        var totalTask = 0
        var totalCompletedTask = 0

        totalTask = data.totalCount!!.toInt()
        totalCompletedTask = data.noTaskCompleted!!.toInt()

        if (totalTask > totalCompletedTask) {
            holder.txtStatus.setTextColor(context.getColor(R.color.colorPrimary))
            holder.txtStatus.text = "Chưa chấm công"
        } else {
            holder.txtStatus.setTextColor(context.getColor(R.color.colorBlack))
            holder.txtStatus.text = "Đã chấm công"
        }
        holder.itemView.setOnClickListener {
            itemClickListener(data)
        }
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtStoreName: TextView
        var txtPeople: TextView
        var txtTime: TextView
        var txtStatus: TextView

        init {
            txtStoreName = itemView.findViewById(R.id.txt_store_name)
            txtPeople = itemView.findViewById(R.id.txt_people)
            txtTime = itemView.findViewById(R.id.txt_time)
            txtStatus = itemView.findViewById(R.id.txt_status)
        }
    }

    fun addAll(mItems: ArrayList<AttendanceResponse>) {
        items.clear()
        items.addAll(mItems)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return this.items.size
    }
}