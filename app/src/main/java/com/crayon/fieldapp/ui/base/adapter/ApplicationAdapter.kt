package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.databinding.ItemPicApplicationBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class ApplicationAdapter(
    val itemClickListener: (ApplicationResponse) -> Unit = {}
) : BaseRecyclerAdapter<ApplicationResponse, ItemPicApplicationBinding>(object :
    DiffUtil.ItemCallback<ApplicationResponse>() {
    override fun areItemsTheSame(
        oldItem: ApplicationResponse,
        newItem: ApplicationResponse
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: ApplicationResponse,
        newItem: ApplicationResponse
    ): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_pic_application
    }

    override fun bindFirstTime(binding: ItemPicApplicationBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }

}