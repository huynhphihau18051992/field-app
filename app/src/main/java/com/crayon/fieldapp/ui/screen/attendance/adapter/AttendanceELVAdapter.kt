package com.crayon.fieldapp.ui.screen.attendance.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.SimpleItem
import com.crayon.fieldapp.data.remote.response.AttendanceStatus
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.utils.formatDate
import com.crayon.fieldapp.utils.formatHour
import java.util.*

class AttendanceELVAdapter(
    private val _context: Context,
    private val _listener: OnTaskResponseItemClickListener,
    private val _listDataHeader: ArrayList<SimpleItem>,
    private val _listDataChild: HashMap<String, List<TaskResponse>>,
    internal var mExpandableListView: ExpandableListView
) : BaseExpandableListAdapter() {
    internal var mLastExpandedGroupPosition = -1

    override fun getChild(groupPosition: Int, childPosititon: Int): TaskResponse {
        return this._listDataChild[this._listDataHeader[groupPosition].title]!![childPosititon]
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getChildView(
        groupPosition: Int, childPosition: Int,
        isLastChild: Boolean, convertView: View?, parent: ViewGroup
    ): View {
        var convertView = convertView

        val timeKeeping = getChild(groupPosition, childPosition)

        if (convertView == null) {
            val infalInflater = this._context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = infalInflater.inflate(R.layout.item_my_attendance, null)
        }

        val txtProjectName = convertView!!
            .findViewById<View>(R.id.txt_project_name) as TextView

        val txtAddress = convertView
            .findViewById<View>(R.id.txt_address) as TextView

        val txtShift = convertView
            .findViewById<View>(R.id.txt_shift) as TextView

        val txtDate = convertView
            .findViewById<View>(R.id.txt_day) as TextView

        val imgCheckIn = convertView
            .findViewById<ImageView>(R.id.img_check_in)

        val imgCheckOut = convertView
            .findViewById<ImageView>(R.id.img_check_out)

        val txtCheckIn = convertView
            .findViewById<TextView>(R.id.txt_check_in)

        val txtCheckOut = convertView
            .findViewById<TextView>(R.id.txt_check_out)

        val rlCheckOut = convertView
            .findViewById<RelativeLayout>(R.id.rl_check_out)


        val rlCheckInt = convertView
            .findViewById<RelativeLayout>(R.id.rl_check_in)

        txtProjectName.text = timeKeeping.project!!.name

        var shift_start = "HH:mm"
        timeKeeping.job?.startTime.let {
            shift_start = formatHour(it.toString())
            txtDate.text = formatDate(it.toString())
        }

        txtAddress.text = timeKeeping.store!!.address

        var shift_end = "HH:mm"
        timeKeeping.job?.endTime.let {
            shift_end = formatHour(it.toString())
        }
        txtShift.text = shift_start + " - " + shift_end

        if (timeKeeping.status!!.equals(AttendanceStatus.PENDING.value)) {
            rlCheckInt.isEnabled = true
            imgCheckIn.setImageResource(R.drawable.ic_play_red)
            txtCheckIn.setTextColor(_context.resources.getColor(R.color.colorBlack, null))

            rlCheckOut.isEnabled = false
            imgCheckOut.setImageResource(R.drawable.ic_play_gray)
            txtCheckOut.setTextColor(_context.resources.getColor(R.color.colorGray, null))

        } else {
            rlCheckInt.isEnabled = false
            imgCheckIn.setImageResource(R.drawable.ic_play_gray)
            txtCheckIn.setTextColor(_context.resources.getColor(R.color.colorGray, null))

            if (timeKeeping.status!!.equals(AttendanceStatus.PROCESSING.value)) {
                rlCheckOut.isEnabled = true
                imgCheckOut.setImageResource(R.drawable.ic_play_red)
                txtCheckOut.setTextColor(_context.resources.getColor(R.color.colorBlack, null))
            } else {
                rlCheckOut.isEnabled = false
                imgCheckOut.setImageResource(R.drawable.ic_play_gray)
                txtCheckOut.setTextColor(_context.resources.getColor(R.color.colorGray, null))
            }
        }

        rlCheckInt.setOnClickListener {
            _listener.onCheckInClicked(timeKeeping)
        }

        rlCheckOut.setOnClickListener {
            _listener.onCheckOutClicked(timeKeeping)
        }
        return convertView
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this._listDataChild[this._listDataHeader[groupPosition].title]!!
            .size
    }

    override fun getGroup(groupPosition: Int): SimpleItem {
        return this._listDataHeader[groupPosition]
    }

    override fun getGroupCount(): Int {
        return this._listDataHeader.size
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getGroupView(
        groupPosition: Int, isExpanded: Boolean,
        convertView: View?, parent: ViewGroup
    ): View {
        var convertView = convertView
        val headerTitle = getGroup(groupPosition).title
        val headerIcon = getGroup(groupPosition).icon
        if (convertView == null) {
            val infalInflater = this._context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = infalInflater.inflate(R.layout.item_group_timekeeping, null)
        }

        val txtTitle = convertView!!
            .findViewById<View>(R.id.txtMenu) as TextView

        val txtCount = convertView
            .findViewById<TextView>(R.id.txt_count)

        val lblListIcon = convertView
            .findViewById<View>(R.id.imgIcon) as ImageView
        lblListIcon.setImageResource(headerIcon)

        txtTitle.text = headerTitle
        val count = getChildrenCount(groupPosition)
        txtCount.text = "($count)"
        return convertView
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    fun changeGroupIcon(isGroupExpand: Boolean, groupPosition: Int) {
        if (isGroupExpand) {
            val newItem =
                SimpleItem(_listDataHeader[groupPosition].title, R.drawable.ic_white_minus)
            this._listDataHeader[groupPosition] = newItem
        } else {
            val newItem = SimpleItem(_listDataHeader[groupPosition].title, R.drawable.ic_white_add)
            this._listDataHeader[groupPosition] = newItem
        }
        notifyDataSetChanged()
    }

    override fun onGroupExpanded(groupPosition: Int) {
        super.onGroupExpanded(groupPosition)
        if (groupPosition != mLastExpandedGroupPosition) {
            if (mLastExpandedGroupPosition != -1) {
                mExpandableListView.collapseGroup(mLastExpandedGroupPosition)
            }
        }

        mLastExpandedGroupPosition = groupPosition
    }

    interface OnTaskResponseItemClickListener {
        fun onCheckInClicked(task: TaskResponse)
        fun onCheckOutClicked(task: TaskResponse)
    }
}