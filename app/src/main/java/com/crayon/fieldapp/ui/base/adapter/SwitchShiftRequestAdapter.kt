package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.data.remote.response.MemberRequestResponse
import com.crayon.fieldapp.databinding.ItemMemberRequestBinding
import com.crayon.fieldapp.databinding.ItemSwitchShiftRequestBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class SwitchShiftRequestAdapter(
    val acceptClickListener: (ApplicationResponse) -> Unit = {},
    val rejectClickListener: (ApplicationResponse) -> Unit = {}
) : BaseRecyclerAdapter<ApplicationResponse, ItemSwitchShiftRequestBinding>(object :
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
        return R.layout.item_switch_shift_request
    }

    override fun bindFirstTime(binding: ItemSwitchShiftRequestBinding) {
        binding.apply {
            btnReject.setSingleClick {
                item?.apply {
                    rejectClickListener(this)
                }

            }


            btnAccept.setSingleClick {
                item?.apply {
                    acceptClickListener(this)
                }
            }
        }
    }

}