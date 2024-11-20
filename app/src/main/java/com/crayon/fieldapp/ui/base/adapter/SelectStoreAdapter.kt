package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Store
import com.crayon.fieldapp.data.model.User
import com.crayon.fieldapp.databinding.ItemSelectStoreBinding
import com.crayon.fieldapp.databinding.ItemSelectUserBinding
import com.crayon.fieldapp.databinding.ItemUserBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class SelectStoreAdapter(
    val itemClickListener: (Store) -> Unit = {}
) : BaseRecyclerAdapter<Store, ItemSelectStoreBinding>(object : DiffUtil.ItemCallback<Store>() {
    override fun areItemsTheSame(oldItem: Store, newItem: Store): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Store, newItem: Store): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_select_store
    }

    override fun bindFirstTime(binding: ItemSelectStoreBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }

}