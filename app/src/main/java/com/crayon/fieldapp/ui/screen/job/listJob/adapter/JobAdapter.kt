package com.crayon.fieldapp.ui.screen.job.listJob.adapter

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.crayon.fieldapp.data.model.GroupUser
import com.crayon.fieldapp.data.remote.response.JobResponse

/**
 * Adapter for the list of repositories.
 */
class JobAdapter(val itemClickListener: (String) -> Unit = {}) :
    PagingDataAdapter<JobResponse, ViewHolder>(REPO_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return JobViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val repoItem = getItem(position)
        if (repoItem != null) {
            (holder as JobViewHolder).bind(repoItem)
            holder.itemView.setOnClickListener {
                itemClickListener(repoItem.id.toString())
            }
        }
    }

    companion object {
        private val REPO_COMPARATOR = object : DiffUtil.ItemCallback<JobResponse>() {
            override fun areItemsTheSame(oldItem: JobResponse, newItem: JobResponse): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: JobResponse, newItem: JobResponse): Boolean =
                oldItem == newItem
        }
    }
}
