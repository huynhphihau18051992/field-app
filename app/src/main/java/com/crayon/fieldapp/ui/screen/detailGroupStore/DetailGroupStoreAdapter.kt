package com.crayon.fieldapp.ui.screen.detailGroupStore

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.GroupStore
import com.crayon.fieldapp.data.remote.response.GroupStoreResponse
import com.crayon.fieldapp.databinding.ItemGroupStoreBinding
import com.crayon.fieldapp.databinding.ItemStoreGroupStoreBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class DetailGroupStoreAdapter(
    val itemClickListener: (GroupStoreResponse) -> Unit = {}
) : BaseRecyclerAdapter<GroupStoreResponse, ItemStoreGroupStoreBinding>(object :
    DiffUtil.ItemCallback<GroupStoreResponse>() {
    override fun areItemsTheSame(oldItem: GroupStoreResponse, newItem: GroupStoreResponse): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: GroupStoreResponse, newItem: GroupStoreResponse): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_store_group_store
    }

    override fun bindFirstTime(binding: ItemStoreGroupStoreBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }

}