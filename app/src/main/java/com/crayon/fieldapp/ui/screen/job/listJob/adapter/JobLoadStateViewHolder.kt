package com.crayon.fieldapp.ui.screen.job.listJob.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.JobLoadStateFooterViewItemBinding

class JobLoadStateViewHolder(
    private val binding: JobLoadStateFooterViewItemBinding,
    retry: () -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    init {
        binding.retryButton.setOnClickListener { retry.invoke() }
    }

    fun bind(loadState: LoadState) {
        if (loadState is LoadState.Error) {
            binding.errorMsg.text = loadState.error.localizedMessage
        }
        binding.progressBar.isVisible = loadState is LoadState.Loading
        binding.retryButton.isVisible = loadState !is LoadState.Loading
        binding.errorMsg.isVisible = loadState !is LoadState.Loading
    }

    companion object {
        fun create(parent: ViewGroup, retry: () -> Unit): JobLoadStateViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.job_load_state_footer_view_item, parent, false)
            val binding = JobLoadStateFooterViewItemBinding.bind(view)
            return JobLoadStateViewHolder(binding, retry)
        }
    }
}
