package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.GroupUser
import com.crayon.fieldapp.databinding.ItemGroupStoreBinding
import com.crayon.fieldapp.databinding.ItemGroupUserBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class GroupUserAdapter(
    val itemClickListener: (GroupUser) -> Unit = {},
    val itemRemoveClickListener: (GroupUser) -> Unit = {}
) : BaseRecyclerAdapter<GroupUser, ItemGroupUserBinding>(object :
    DiffUtil.ItemCallback<GroupUser>() {
    override fun areItemsTheSame(oldItem: GroupUser, newItem: GroupUser): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: GroupUser, newItem: GroupUser): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_group_user
    }

    override fun bindFirstTime(binding: ItemGroupUserBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
            imgRemove.setSingleClick {
                item?.apply {
                    itemRemoveClickListener(this)
                }
            }
        }
    }

}