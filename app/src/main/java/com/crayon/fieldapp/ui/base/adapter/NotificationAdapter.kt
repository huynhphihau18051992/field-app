package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Notification
import com.crayon.fieldapp.data.remote.response.NotificationResponse
import com.crayon.fieldapp.databinding.ItemNotificationBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class NotificationAdapter(
    val itemClickListener: (NotificationResponse) -> Unit = {}
) : BaseRecyclerAdapter<NotificationResponse, ItemNotificationBinding>(object :
    DiffUtil.ItemCallback<NotificationResponse>() {
    override fun areItemsTheSame(oldItem: NotificationResponse, newItem: NotificationResponse): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: NotificationResponse, newItem: NotificationResponse): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_notification
    }

    override fun bindFirstTime(binding: ItemNotificationBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }

}