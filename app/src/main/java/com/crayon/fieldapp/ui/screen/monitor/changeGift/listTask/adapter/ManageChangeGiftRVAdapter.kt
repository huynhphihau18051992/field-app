package com.crayon.fieldapp.ui.screen.monitor.changeGift.listTask.adapter

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

class ManageChangeGiftRVAdapter constructor(
    val items: ArrayList<TaskResponse>,
    val context: Context,
    val itemClickListener: (TaskResponse) -> Unit = {}
) : RecyclerView.Adapter<ManageChangeGiftRVAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_report_change_gift, parent, false)
        val holder = JobViewHolder(view)
        holder.itemView.setOnClickListener {
            itemClickListener(items.get(holder.absoluteAdapterPosition))
        }
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        data.store?.let {
            holder.txtStore.text = it.name
        }

        data.pic?.let {
            holder.txtPicName.text = it.lastName + " " + it.firstName
        }

        data.job?.let {
            val start_date = formatHour(it.startTime.toString())
            val end_date = formatHour(it.endTime.toString())
            val startTime = it.startTime.toString().toTimeLong("yyyy-MM-dd'T'HH:mm") ?: 0
            holder.txtPicRole.text = it.role.toString()
            var timeAM = "Sáng"
            if (startTime.toTimeString("yyyy-MM-dd aa")!!.contains("AM")) {
                timeAM = "Sáng"
            } else {
                timeAM = "Chiều"
            }

            val shift = start_date.toString() + "-" + end_date
            holder.txtShift.text = shift.toString()
            holder.txtAM.text = "(" + timeAM + ")"
        }

        data.customerBills?.let {
            holder.txtNumCustomer.text = it.size.toString()
        }

    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtStore: TextView
        var txtPicName: TextView
        var txtShift: TextView
        var txtAM: TextView
        var txtPicRole: TextView
        var txtNumCustomer: TextView

        init {
            txtStore = itemView.findViewById(R.id.txt_store)
            txtPicName = itemView.findViewById(R.id.txt_customer_num)
            txtShift = itemView.findViewById(R.id.txt_shift)
            txtAM = itemView.findViewById(R.id.txt_am)
            txtPicRole = itemView.findViewById(R.id.txt_type)
            txtNumCustomer = itemView.findViewById(R.id.txt_num_customer)
        }

    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun addAll(jobs: List<TaskResponse>) {
        items.addAll(jobs)
        notifyDataSetChanged()
    }

    fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

}