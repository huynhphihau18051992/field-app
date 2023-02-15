package com.crayon.fieldapp.ui.screen.monitor.reportSales.listTask.adapter

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
import java.text.DecimalFormat

class ManageReportSalesRVAdapter constructor(
    val items: ArrayList<TaskResponse>,
    val context: Context,
    val itemClickListener: (TaskResponse) -> Unit = {}
) : RecyclerView.Adapter<ManageReportSalesRVAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_monitor_report_sales, parent, false)
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

        data.job?.let {
            val start_date = formatHour(it.startTime.toString())
            val end_date = formatHour(it.endTime.toString())
            val startTime = it.startTime.toString().toTimeLong("yyyy-MM-dd'T'HH:mm") ?: 0
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

        data.orders?.let { mOrders ->
            holder.txtNumberOrder.text = mOrders.size.toString()
            if (mOrders.size != 0) {
                val totalPrice = mOrders.sumBy { mItem ->
                    mItem.products.sumBy { it.quantity * it.price }
                }
                val format = DecimalFormat("#,###")
                format.maximumFractionDigits = 0
                holder.txtTotal.text = format.format(totalPrice) + "vnd"
            }
        }

    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtStore: TextView
        var txtShift: TextView
        var txtAM: TextView
        var txtNumberOrder: TextView
        var txtTotal: TextView

        init {
            txtStore = itemView.findViewById(R.id.txt_order_id)
            txtShift = itemView.findViewById(R.id.txt_shift)
            txtAM = itemView.findViewById(R.id.txt_am)
            txtNumberOrder = itemView.findViewById(R.id.txt_num_order)
            txtTotal = itemView.findViewById(R.id.txt_money)
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