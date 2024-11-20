package com.crayon.fieldapp.ui.base.dialog.selectJobByDay

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.applandeo.materialcalendarview.EventDay
import com.applandeo.materialcalendarview.listeners.OnDayClickListener
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.PromotionResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentAttendanceBinding
import com.crayon.fieldapp.ui.base.BaseDialogFragment
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.toCalendar
import com.crayon.fieldapp.utils.toDate
import kotlinx.android.synthetic.main.customer_select_date_picker.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*
import kotlin.collections.ArrayList


class SelectDatePickerDialog(val projectId: String, val agencyId: String, val taskType: Int, val itemClickListener: (Calendar) -> Unit = {}) :
    BaseDialogFragment<FragmentAttendanceBinding, SelectDatePickerViewModel>() {
    override val layoutId: Int = R.layout.customer_select_date_picker
    override val viewModel: SelectDatePickerViewModel by viewModel()
    var events: ArrayList<EventDay> = ArrayList()
    var calendar = Calendar.getInstance()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getTaskByProject(
            calendar,
            projectId = projectId,
            agencyId = agencyId,
            taskType = taskType
        )

        viewModel.listTask.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading?.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading?.visibility = View.GONE
                        it.data?.let { mList ->
                            setJobEvents(mList as ArrayList<TaskResponse>)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading?.visibility = View.GONE
                    }
                }
            }
        })

        btn_Ok?.setSingleClick {
            itemClickListener.invoke(calendar)
            dismiss()
        }

        btn_cancel?.setSingleClick {
            dismiss()
        }

        calendarView?.setOnDayClickListener(OnDayClickListener { eventDay ->
            calendar = eventDay.calendar
        })

        calendarView?.setOnPreviousPageChangeListener {
            calendar.add(Calendar.MONTH, -1)
            viewModel.getTaskByProject(
                calendar,
                projectId = projectId,
                agencyId = agencyId,
                taskType = taskType
            )
        }

        calendarView?.setOnForwardPageChangeListener {
            calendar.add(Calendar.MONTH, 1)
            viewModel.getTaskByProject(
                calendar,
                projectId = projectId,
                agencyId = agencyId,
                taskType = taskType
            )
        }

    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {

            // Set gravity of dialog
            dialog.setCanceledOnTouchOutside(true)
            val window = dialog.window
            val wlp = window!!.attributes
            wlp.gravity = Gravity.CENTER
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }
    }

    fun setJobEvents(jobs: ArrayList<TaskResponse>) {
        events.clear()
        jobs.forEach {
            val date =
                it.job?.startTime?.toDate("yyyy-MM-dd'T'HH:mm")?.toCalendar()
            date?.let {
                events.add(EventDay(it, R.drawable.bg_has_job))
            }
        }
        calendarView?.setEvents(events)
    }


}
