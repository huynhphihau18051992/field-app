package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.User
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.databinding.ItemSelectUserBinding
import com.crayon.fieldapp.databinding.ItemUserBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class SelectUserAdapter(
    val itemClickListener: (MemberResponse) -> Unit = {}
) : BaseRecyclerAdapter<MemberResponse, ItemSelectUserBinding>(object : DiffUtil.ItemCallback<MemberResponse>() {
    override fun areItemsTheSame(oldItem: MemberResponse, newItem: MemberResponse): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MemberResponse, newItem: MemberResponse): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_select_user
    }

    override fun bindFirstTime(binding: ItemSelectUserBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }

}