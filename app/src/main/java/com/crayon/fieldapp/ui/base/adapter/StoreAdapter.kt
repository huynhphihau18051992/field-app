package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Store
import com.crayon.fieldapp.data.remote.response.StoreResponse
import com.crayon.fieldapp.databinding.ItemStoreBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class StoreAdapter(
    val itemClickListener: (StoreResponse) -> Unit = {}
) : BaseRecyclerAdapter<StoreResponse, ItemStoreBinding>(object : DiffUtil.ItemCallback<StoreResponse>() {
    override fun areItemsTheSame(oldItem: StoreResponse, newItem: StoreResponse): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: StoreResponse, newItem: StoreResponse): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_store
    }

    override fun bindFirstTime(binding: ItemStoreBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }

}
