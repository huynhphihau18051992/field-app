package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.databinding.ItemManagementApplicationBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class ManagementApplicationAdapter(
    val acceptClickListener: (ApplicationResponse) -> Unit = {},
    val rejectClickListener: (ApplicationResponse) -> Unit = {}
) : BaseRecyclerAdapter<ApplicationResponse, ItemManagementApplicationBinding>(object :
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
        return R.layout.item_management_application
    }

    override fun bindFirstTime(binding: ItemManagementApplicationBinding) {
        binding.apply {
            btnAccept.setSingleClick {
                item?.apply {
                    acceptClickListener(this)
                }
            }

            btnReject.setSingleClick {
                item?.apply {
                    rejectClickListener(this)
                }
            }
        }
    }

}