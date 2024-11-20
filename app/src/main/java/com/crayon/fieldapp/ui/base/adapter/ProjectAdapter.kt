package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Project
import com.crayon.fieldapp.data.remote.response.ProjectResponse
import com.crayon.fieldapp.databinding.ItemProjectBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class ProjectAdapter(
    val itemClickListener: (ProjectResponse) -> Unit = {}
) : BaseRecyclerAdapter<ProjectResponse, ItemProjectBinding>(object : DiffUtil.ItemCallback<ProjectResponse>() {
    override fun areItemsTheSame(oldItem: ProjectResponse, newItem: ProjectResponse): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ProjectResponse, newItem: ProjectResponse): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_project
    }

    override fun bindFirstTime(binding: ItemProjectBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }

}