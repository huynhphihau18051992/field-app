package com.crayon.fieldapp.ui.screen.monitor.changeGift.listCustomer.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.CustomerResponse

class CustomerRVAdapter constructor(
    val items: ArrayList<CustomerResponse>,
    val context: Context,
    val itemClickListener: (CustomerResponse) -> Unit = {}
) : RecyclerView.Adapter<CustomerRVAdapter.JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_customer, parent, false)
        val holder = JobViewHolder(view)
        holder.itemView.setOnClickListener {
            itemClickListener(items.get(holder.absoluteAdapterPosition))
        }
        return holder
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        val data = items[position]
        data.name?.let {
            holder.txtName.text = it
        }

        data.mobileNumber?.let {
            holder.txtPhone.text = it
        }
    }

    inner class JobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView
        var txtPhone: TextView

        init {
            txtName = itemView.findViewById(R.id.txt_name)
            txtPhone = itemView.findViewById(R.id.txt_phone)
        }

    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun addAll(jobs: List<CustomerResponse>) {
        items.addAll(jobs)
        notifyDataSetChanged()
    }

    fun clearAll() {
        items.clear()
        notifyDataSetChanged()
    }

}