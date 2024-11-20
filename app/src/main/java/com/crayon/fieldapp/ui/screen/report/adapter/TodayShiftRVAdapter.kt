package com.crayon.fieldapp.ui.screen.report.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.utils.formatHour

class TodayShiftRVAdapter constructor(
    val items: ArrayList<TaskResponse>,
    val isDisplayProject: Boolean,
    val context: Context
) : RecyclerView.Adapter<TodayShiftRVAdapter.StoreViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_today_shift, parent, false)
        return StoreViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        val data = items[position]

        var shift_start = "HH:mm"
        data.job!!.startTime?.let {
            shift_start = formatHour(it)
        }

        var shift_end = "HH:mm"
        data.job!!.endTime?.let {
            shift_end = formatHour(it)
        }
        holder.txtShift.text = "Ca " + shift_start + " - " + shift_end + ":"

        var start_time = "-"
        data.attendances?.let { items ->
            if (items.size != 0) {
                items.get(0)?.checkInTime?.let {
                    start_time = formatHour(it)
                }
            }

        }

        var end_time = "-"
        data.attendances?.let { items ->
            if (items.size != 0) {
                items.get(0)?.checkOutTime?.let {
                    end_time = formatHour(it)
                }
            }
        }

        holder.txtTimekeeping.text = "Vào: " + start_time + " - " + "Ra:" + end_time
        if (isDisplayProject) {
            holder.txtProjectName.visibility = View.VISIBLE
            data.project?.let {
                holder.txtProjectName.text = it.name
            }
        } else {
            holder.txtProjectName.visibility = View.GONE
        }
    }

    inner class StoreViewHolder(itemView: View) :
        androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {
        var txtShift: TextView
        var txtTimekeeping: TextView
        var txtProjectName: TextView

        init {
            txtShift = itemView.findViewById(R.id.txt_shift)
            txtTimekeeping = itemView.findViewById(R.id.txt_timekeeping)
            txtProjectName = itemView.findViewById(R.id.txt_project_name)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun clear() {
        items.clear()
        notifyDataSetChanged()
    }

    fun addAll(listItems: ArrayList<TaskResponse>) {
        items.clear()
        items.addAll(listItems)
        notifyDataSetChanged()
    }
}