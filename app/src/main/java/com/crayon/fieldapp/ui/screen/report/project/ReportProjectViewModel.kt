package com.crayon.fieldapp.ui.screen.report.project

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.PicProjectResponse
import com.crayon.fieldapp.data.remote.response.ProjectStatus
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import studio.phillip.yolo.utils.TimeFormatUtils
import java.util.*
import kotlin.collections.ArrayList

class ReportProjectViewModel(
    private val projectRepository: ProjectRepository,
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _toastLiveData = MutableLiveData<Event<String>>()

    val toastLiveData: LiveData<Event<String>>
        get() = _toastLiveData

    fun setValue() {
        _toastLiveData.value = Event("lmfao")
    }


    private val _users = MediatorLiveData<Resource<List<TaskResponse>>>()
    val listTask: LiveData<Resource<List<TaskResponse>>> get() = _users
    private var usersSource: LiveData<Resource<List<TaskResponse>>> = MutableLiveData()
    fun getReportByProject(date: Calendar) =
        viewModelScope.launch(dispatchers.main) {
            _users.removeSource(usersSource)
            withContext(dispatchers.io) {
                val numberOfMonth = date.getActualMaximum(Calendar.DAY_OF_MONTH)
                val start_date = TimeFormatUtils.getDate(
                    date.get(Calendar.YEAR),
                    date.get(Calendar.MONTH),
                    1,
                    0,
                    0
                )!!.toTimeString("yyyy-MM-dd")
                val end_date = TimeFormatUtils.getDate(
                    date.get(Calendar.YEAR),
                    date.get(Calendar.MONTH),
                    numberOfMonth,
                    23,
                    59
                )!!.toTimeString("yyyy-MM-dd")
                usersSource = taskRepository.getPicReportByTime(start_date!!, end_date!!)
            }
            _users.addSource(usersSource) {
                _users.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }

    private val _projects = MediatorLiveData<Event<Resource<List<PicProjectResponse>>>>()
    val projects: LiveData<Event<Resource<List<PicProjectResponse>>>> get() = _projects
    private var memberSource: LiveData<Resource<List<PicProjectResponse>>> = MutableLiveData()
    fun getProject() =
        viewModelScope.launch(dispatchers.main) {
            _projects.removeSource(memberSource)
            withContext(dispatchers.io) {
                memberSource =
                    projectRepository.getPicProjectByStatus(ProjectStatus.PROCESSING.value)
            }
            _projects.addSource(memberSource) {
                _projects.value = Event(it)
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }

    private fun filterTaskByDate(
        tasks: ArrayList<TaskResponse>,
        date: Date
    ): ArrayList<TaskResponse> {
        var arr = ArrayList<TaskResponse>()

        tasks.forEach {
            val start_date = formatDate(it.job!!.startTime!!)
            val filterDate = date.toTimeString("dd/MM/yyyy")
            if (filterDate.equals(start_date)) {
                arr.add(it)
            }
        }
        return arr
    }

    private fun filterTaskByShift(
        tasks: ArrayList<TaskResponse>,
        shiftCode: String
    ): ArrayList<TaskResponse> {
        var arr = ArrayList<TaskResponse>()
        tasks.forEach {
            val shiftStart = formatHour(it.job!!.startTime!!)
            val shiftEnd = formatHour(it.job!!.endTime!!)
            val shift = "Ca " + shiftStart + "-" + shiftEnd + ":"
            if (shiftCode.equals(shift)) {
                arr.add(it)
            }
        }
        return arr
    }

    fun calculateTotalInvalidShift(tasks: ArrayList<TaskResponse>): Int {
        var invalidShift = 0
        tasks.forEach { task ->
            val attendances = task.attendances
            if (attendances != null && attendances.size > 0) {
                val checkInTime =
                    attendances.get(0).checkInTime?.toTimeLong("yyyy-MM-dd'T'HH:mm")
                val checkOutTime =
                    attendances.get(0).checkOutTime?.toTimeLong("yyyy-MM-dd'T'HH:mm")
                val startTime =
                    task.job!!.startTime!!.toTimeLong("yyyy-MM-dd'T'HH:mm")!!
                val endTime = task.job!!.endTime!!.toTimeLong("yyyy-MM-dd'T'HH:mm")!!

                if (checkInTime != null && checkOutTime != null) {
                    if (checkInTime > startTime || checkOutTime < endTime) {
                        invalidShift++
                    }
                }
            } else {
                task.job!!.startTime?.let {
                    if (it.toDate("yyyy-MM-dd'T'HH:mm")!!.before(Date())) {
                        invalidShift++
                    }
                }
            }
        }

        return invalidShift
    }

    private fun calculateTodayShift(filter: ArrayList<TaskResponse>): ArrayList<TaskResponse> {
        val startToday =
            getCurrentDateTime().toTimeString("yyyy-MM-dd") + "T00:00:00.000Z"
        val endToday =
            getCurrentDateTime().toTimeString("yyyy-MM-dd") + "T23:59:00.000Z"

        var todayShift = 0
        var todayTask = ArrayList<TaskResponse>()
        filter.forEach {
            val attendances = it.attendances
            val checkInTime =
                attendances?.get(0)?.checkInTime?.toDate("yyyy-MM-dd'T'HH:mm")
            val checkOutTime =
                attendances?.get(0)?.checkOutTime?.toDate("yyyy-MM-dd'T'HH:mm")
            if (attendances != null &&
                checkInTime != null &&
                checkOutTime != null
            ) {
                if (checkInTime!!.after(startToday.toDate("yyyy-MM-dd'T'HH:mm")) && checkOutTime!!.before(
                        endToday.toDate("yyyy-MM-dd'T'HH:mm")
                    )
                ) {
                    todayShift++
                    todayTask.add(it)
                }

            }
        }
        return todayTask
    }

    fun getProjectOfReport(tasks: ArrayList<TaskResponse>): ArrayList<String> {
        var projects = ArrayList<String>()
        var lastProject = ""
        tasks.forEach { tasks ->
            if (!tasks.project!!.name!!.equals(lastProject)) {
                lastProject = tasks.project!!.name.toString()
                projects.add(lastProject)
            }
        }
        return projects
    }


    fun calculateTotalManHour(tasks: ArrayList<TaskResponse>): Long {
        var manSecond: Long = 0
        tasks!!.forEach {
            val attendances = it.attendances
            if (attendances != null && attendances.size > 0) {
                val checkInTime =
                    attendances!!.get(0).checkInTime?.toTimeLong("yyyy-MM-dd'T'HH:mm")
                val checkOutTime =
                    attendances!!.get(0).checkOutTime?.toTimeLong("yyyy-MM-dd'T'HH:mm")
                if (checkInTime != null && checkOutTime != null) {
                    manSecond = (manSecond + ((checkOutTime/1000) - (checkInTime/1000)))
                }
            }
        }
        return manSecond
    }

    fun calculateMapOfMonth(tasks: ArrayList<TaskResponse>): HashMap<Date, ArrayList<TaskResponse>> {
        // Calculate map of month
        var arrTimekeeping = HashMap<Date, ArrayList<TaskResponse>>()
        var listDate = ArrayList<Date>()

        var lastDate = "dd/mm/yyyy"
        for (i in 0..tasks.size - 1) {
            val start_date =
                TimeFormatUtils.formatDate(tasks.get(i).job!!.startTime!!.toDate("yyyy-MM-dd'T'HH:mm")!!)
            if (!start_date!!.equals(lastDate)) {
                lastDate = start_date.toString()
                val data = lastDate.toDate("dd/MM/yyyy", Locale.getDefault())
                listDate.add(TimeFormatUtils.getResetDate(data!!)!!)
            }
        }

        listDate.forEach { data ->
            arrTimekeeping[data] =
                filterTaskByDate(tasks, data)
        }
        return arrTimekeeping
    }

    fun calculateShift(tasks: ArrayList<TaskResponse>): ArrayList<String> {
        var arrShift = HashMap<String, ArrayList<TaskResponse>>()
        var shiftCode = ArrayList<String>()
        val summaryShift = ArrayList<String>()

        var lastShift = "dd/mm/yyyy"
        for (i in 0..tasks.size - 1) {
            val shiftStart = formatHour(tasks.get(i).job!!.startTime!!)
            val shiftEnd = formatHour(tasks.get(i).job!!.endTime!!)
            val shift = "Ca " + shiftStart + "-" + shiftEnd + ":"
            if (!shift.equals(lastShift) && !shiftCode.contains(shift)) {
                lastShift = shift
                shiftCode.add(lastShift)
            }
        }

        for (i in 0..shiftCode.size - 1) {
            arrShift[shiftCode.get(i)] =
                filterTaskByShift(tasks as ArrayList<TaskResponse>, shiftCode.get(i))
        }

        val keys = arrShift.keys
        keys.forEach {
            summaryShift.add(it + arrShift.get(it)!!.size + " ca")
        }
        return summaryShift
    }

    override fun onCleared() {
        super.onCleared()
    }
}