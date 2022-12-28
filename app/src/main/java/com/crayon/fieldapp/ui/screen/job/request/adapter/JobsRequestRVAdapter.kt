package com.crayon.fieldapp.ui.screen.job.request.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.utils.formatHour
import java.util.*

class JobsRequestRVAdapter(
    private val context: Context,
    private val listItemArrayList: ArrayList<JobRequest>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val inflater: LayoutInflater

    init {

        inflater = LayoutInflater.from(context)
    }

    override fun getItemCount(): Int {
        return listItemArrayList.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (listItemArrayList[position].id!!.isEmpty()) {
            LAYOUT_HEADER
        } else
            LAYOUT_CHILD
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val holder: RecyclerView.ViewHolder
        if (viewType == LAYOUT_HEADER) {
            val view = inflater.inflate(R.layout.item_group_job_request, parent, false)
            holder = MyViewHolderHeader(view)
        } else {
            val view = inflater.inflate(R.layout.item_job_request_list, parent, false)
            holder = MyViewHolderChild(view)
        }


        return holder
    }

    fun addAll(jobs: ArrayList<JobRequest>) {
        listItemArrayList.clear()
        listItemArrayList.addAll(jobs)
        notifyDataSetChanged()

    }

    fun clear() {
        listItemArrayList.clear()
        notifyDataSetChanged()
    }

    fun selectAllItems(isChecked: Boolean) {
        listItemArrayList.forEach {
            if (!it.id.isNullOrBlank()) {
                it.isSelected = isChecked
            }
        }
        notifyDataSetChanged()
    }

    fun getSelectedItem(): List<String> {
        return listItemArrayList.filter { it.isSelected == true }.map { it.id }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder.itemViewType == LAYOUT_HEADER) {
            val vaultItemHolder = holder as MyViewHolderHeader
            vaultItemHolder.tvHeader.text = listItemArrayList[position].storeName
        } else {

            val vaultItemHolder = holder as MyViewHolderChild
            val data = listItemArrayList[position]

            vaultItemHolder.tvProjectname.text = data.project
            vaultItemHolder.tvAgency.text = data.agency

            val start_date = formatHour(data.startShift.toString())
            val end_date = formatHour(data.endShift.toString())
            val shift = start_date + "-" + end_date
            vaultItemHolder.tvShift.text = shift

            vaultItemHolder.cbSelect.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    listItemArrayList.get(position).isSelected = true
                } else {
                    listItemArrayList.get(position).isSelected = false
                }
            }

            if (data.isSelected!!) {
                vaultItemHolder.cbSelect.isChecked = true
            } else {
                vaultItemHolder.cbSelect.isChecked = false
            }

        }

    }


    internal inner class MyViewHolderHeader(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvHeader: TextView

        init {
            tvHeader = itemView.findViewById(R.id.txtMenu)
        }
    }

    internal inner class MyViewHolderChild(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvProjectname: TextView
        var tvAgency: TextView
        var tvShift: TextView
        var cbSelect: CheckBox


        init {

            tvProjectname = itemView.findViewById(R.id.txt_project_name)
            tvAgency = itemView.findViewById(R.id.txt_agency_name)
            tvShift = itemView.findViewById(R.id.txt_shift)
            cbSelect = itemView.findViewById(R.id.cb_select_item)
        }

    }

    companion object {

        private val LAYOUT_HEADER = 0
        private val LAYOUT_CHILD = 1
    }


}