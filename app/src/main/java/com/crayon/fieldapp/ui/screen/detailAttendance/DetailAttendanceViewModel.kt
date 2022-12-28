package com.crayon.fieldapp.ui.screen.detailAttendance

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.toDate
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailAttendanceViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) :
    BaseViewModel() {

    private val _attendances = MediatorLiveData<Resource<List<TaskResponse>>>()
    val attendances: LiveData<Resource<List<TaskResponse>>> get() = _attendances
    private var attendancesSource: LiveData<Resource<List<TaskResponse>>> =
        MutableLiveData()

    fun getManagementAttendances(
        agencyId: String,
        projectId: String,
        storeId: String,
        startTime: String,
        endTime: String
    ) =
        viewModelScope.launch(dispatchers.main) {
            _attendances.removeSource(attendancesSource)
            withContext(dispatchers.io) {
//                attendancesSource =
//                    taskRepository.getManagementTasks(
//                        agencyId = agencyId,
//                        projectId = projectId,
//                        startTime = startTime,
//                        endTime = endTime,
//                        storeId = storeId
//                    )
            }
            _attendances.addSource(attendancesSource) {
                _attendances.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }

    fun getNumDidTimeKeeping(list: ArrayList<TaskResponse>): Int {
        var num = 0
        num = list.count {
            it.attendances != null && it.attendances.size == 1 && it.attendances.get(0).checkInTime != null && it.attendances.get(
                0
            ).checkOutTime != null
        }
        return num
    }

    fun getNumLateTimeKeeping(list: ArrayList<TaskResponse>): Int {
        var num = 0
        for (i in 0..list.size - 1) {
            if (list.get(i).attendances != null) {
                if (list.get(i).attendances!!.size == 1) {
                    if (list.get(i).attendances!!.get(0).checkInTime != null) {
                        val checkInTime =
                            list.get(i).attendances!!.get(0).checkInTime!!.toDate("dd/MM/yyyy")
                        val startTime = list.get(i).job!!.startTime!!.toDate("dd/MM/yyyy")
                        if (checkInTime!!.after(startTime)) {
                            num++
                        }
                    }
                }
            }
        }
        return num
    }

    fun getNumEarlTimeKeeping(list: ArrayList<TaskResponse>): Int {
        var num = 0
        for (i in 0..list.size - 1) {
            if (list.get(i).attendances != null) {
                if (list.get(i).attendances!!.size == 1) {
                    if (list.get(i).attendances!!.get(0).checkOutTime != null) {
                        val checkOutTime =
                            list.get(i).attendances!!.get(0).checkOutTime!!.toDate("dd/MM/yyyy")
                        val endTime = list.get(i).job!!.endTime!!.toDate("dd/MM/yyyy")
                        if (checkOutTime!!.before(endTime)) {
                            num++
                        }
                    }
                }
            }
        }
        return num
    }
}