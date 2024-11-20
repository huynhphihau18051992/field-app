package com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.utils.GlideApp


class ManageJobRVAdapter constructor(
    val items: ArrayList<JobResponse>,
    val context: Context,
    val itemClickListener: (JobResponse) -> Unit = {},
    val removeClickListener: (JobResponse) -> Unit = {}
) : RecyclerView.Adapter<ManageJobRVAdapter.EmployeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_manage_job, parent, false)
        val holder = EmployeeViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val data = items[position]
        data.pic?.let { pic ->
            holder.txtName.text = pic.lastName + " " + pic.firstName
        }
        holder.tvRole.text = data.role

        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .circleCrop()
            .placeholder(R.mipmap.ic_launcher_round)
            .error(R.mipmap.ic_launcher_round)

        data.pic?.let { pic ->
            GlideApp.with(context).load(pic.avatarUrl).apply(options).into(holder.avatar)
        }

        holder.itemView.setOnClickListener {
            itemClickListener(data)
        }

        holder.icRemove.setOnClickListener {
            removeClickListener(data)
        }
    }

    inner class EmployeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView
        var avatar: ImageView
        var tvRole: TextView
        var icRemove: ImageView

        init {
            txtName = itemView.findViewById(R.id.txt_name)
            avatar = itemView.findViewById(R.id.img_avatar)
            icRemove = itemView.findViewById(R.id.img_remove)
            tvRole = itemView.findViewById(R.id.txt_role)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun addAll(listJobs: ArrayList<JobResponse>) {
        items.clear()
        items.addAll(listJobs)
        notifyDataSetChanged()
    }

    fun removeJob(jobId: String) {
        items.indexOfFirst {
            it.id == jobId
        }.let { index ->
            if (index != -1) {
                items.removeAt(index)
                notifyItemRemoved(index)
            }
        }
    }

}