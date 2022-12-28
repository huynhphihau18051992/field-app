package com.crayon.fieldapp.ui.screen.report.time

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentReportTimeBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.report.adapter.SimpleRVAdapter
import com.crayon.fieldapp.ui.screen.report.adapter.TodayShiftRVAdapter
import com.crayon.fieldapp.ui.widgets.CalendarView
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.toTimeString
import kotlinx.android.synthetic.main.fragment_report_time.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import studio.phillip.yolo.utils.TimeFormatUtils
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class ReportByTimeFragment :
    BaseFragment<FragmentReportTimeBinding, ReportTimeViewModel>() {
    private lateinit var selectShift: HashMap<Date, ArrayList<TaskResponse>>

    override val layoutId: Int = R.layout.fragment_report_time

    override val viewModel: ReportTimeViewModel by viewModel()

    var calendar = Calendar.getInstance()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var projectAdapter = SimpleRVAdapter(arrayListOf(), requireContext())
        var summaryShiftAdapter = SimpleRVAdapter(arrayListOf(), requireContext())
        var todayShiftadapter = TodayShiftRVAdapter(arrayListOf(), true, requireContext())

        rv_today_shift.setLayoutManager(LinearLayoutManager(requireContext()))
        rv_today_shift.adapter = todayShiftadapter

        rv_project.setLayoutManager(LinearLayoutManager(requireContext()))
        rv_project.adapter = projectAdapter

        rv_summary_shift.setLayoutManager(LinearLayoutManager(requireContext()))
        rv_summary_shift.adapter = summaryShiftAdapter


        calendar_view?.setEventHandler(object : CalendarView.EventHandler {
            override fun onMonthPress(cal: Calendar) {
                calendar = cal
                viewModel.getReportByTime(cal)
            }

            override fun onDayShortPress(date: Date) {
                try {
                    if (selectShift != null) {
                        val selectDate = TimeFormatUtils.getResetDate(date)
                        val arrTask = selectShift.get(selectDate)
                        if (arrTask != null) {
                            var temp = ArrayList<TaskResponse>()
                            temp.addAll(arrTask)
                            todayShiftadapter.addAll(temp)

                            txt_select_date.visibility = View.VISIBLE
                            txt_select_date.text = resources.getString(
                                R.string.txt_timekeeping_date,
                                date.toTimeString("dd/MM/yyyy"), arrTask?.size ?: 0
                            )
                        } else {
                            txt_select_date.visibility = View.GONE
                            todayShiftadapter.clear()
                        }
                    }
                } catch (e: Exception) {

                }
            }

            override fun onDayLongPress(date: Date) {
                val df = SimpleDateFormat.getDateInstance()
                Toast.makeText(
                    requireContext(),
                    df.format(date),
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        viewModel.apply {
            getReportByTime(calendar)
            listTask.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let { tasks ->
                            // Get summary
                            val numberOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
                            val start_date = TimeFormatUtils.getDate(
                                calendar.get(Calendar.YEAR),
                                calendar.get(Calendar.MONTH),
                                1,
                                0,
                                0
                            )!!.toTimeString("dd/MM/yyyy")
                            val end_date = TimeFormatUtils.getDate(
                                calendar.get(Calendar.YEAR),
                                calendar.get(Calendar.MONTH),
                                numberOfMonth,
                                23,
                                59
                            )!!.toTimeString("dd/MM/yyyy")
                            txt_summary_date.text =
                                "Thông kê từ ngày " + start_date + " đến ngày " + end_date


                            // Get invalid shift
                            val invalidShift =
                                viewModel.calculateTotalInvalidShift(tasks as ArrayList<TaskResponse>)
                            txt_summary_invalid_shift.text =
                                getString(R.string.txt_summary_invalid_shift, invalidShift)

                            // Get project
                            val projects = viewModel.getProjectOfReport(tasks)
                            txt_summary_project.text = "Số dự án: " + projects.size
                            projectAdapter.addAll(projects)

                            // Get total man Hour
                            val manHour = viewModel.calculateTotalManHour(tasks)
                            txt_summary_hour.text = getString(
                                R.string.txt_summary_hour,
                                TimeFormatUtils.convertSecondToHour(manHour)
                            )

                            // Get map of month
                            val map = viewModel.calculateMapOfMonth(tasks)
                            calendar_view.updateCalendar(map)
                            selectShift = map

                            // Get summary shift
                            val summaryShift = viewModel.calculateShift(tasks)
                            summaryShiftAdapter.addAll(summaryShift)
                            txt_summary_shift.text = "Tổng số ca làm: " + tasks.size

                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            })
        }
    }
}