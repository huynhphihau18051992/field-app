package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.MemberRequestResponse
import com.crayon.fieldapp.databinding.ItemMemberRequestBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class MemberRequestAdapter(
    val acceptClickListener: (MemberRequestResponse) -> Unit = {},
    val rejectClickListener: (MemberRequestResponse) -> Unit = {}
) : BaseRecyclerAdapter<MemberRequestResponse, ItemMemberRequestBinding>(object :
    DiffUtil.ItemCallback<MemberRequestResponse>() {
    override fun areItemsTheSame(
        oldItem: MemberRequestResponse,
        newItem: MemberRequestResponse
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: MemberRequestResponse,
        newItem: MemberRequestResponse
    ): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_member_request
    }

    override fun bindFirstTime(binding: ItemMemberRequestBinding) {
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