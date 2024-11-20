package com.crayon.fieldapp.ui.base.adapter

import androidx.recyclerview.widget.DiffUtil
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.AttendanceResponse
import com.crayon.fieldapp.databinding.ItemAttendanceBinding
import com.crayon.fieldapp.ui.base.BaseRecyclerAdapter
import com.crayon.fieldapp.utils.setSingleClick

class AttendanceAdapter(
    val itemClickListener: (AttendanceResponse) -> Unit = {}
) : BaseRecyclerAdapter<AttendanceResponse, ItemAttendanceBinding>(object :
    DiffUtil.ItemCallback<AttendanceResponse>() {
    override fun areItemsTheSame(
        oldItem: AttendanceResponse,
        newItem: AttendanceResponse
    ): Boolean {
        return oldItem.store!!.id == newItem.store!!.id
    }

    override fun areContentsTheSame(
        oldItem: AttendanceResponse,
        newItem: AttendanceResponse
    ): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_attendance
    }

    override fun bindFirstTime(binding: ItemAttendanceBinding) {
        binding.apply {
            root.setSingleClick {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }

}