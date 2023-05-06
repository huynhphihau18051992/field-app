package com.crayon.fieldapp.ui.base.dialog.selectJobByDay

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.toTimeString
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import studio.phillip.yolo.utils.TimeFormatUtils
import java.util.*

class SelectDatePickerViewModel(
    private val taskRepository: TaskRepository, private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _tasks = MediatorLiveData<Event<Resource<List<TaskResponse>>>>()
    val listTask: LiveData<Event<Resource<List<TaskResponse>>>> get() = _tasks
    fun getTaskByProject(
        date: Calendar,
        agencyId: String,
        projectId: String,
        taskType: Int
    ) =
        viewModelScope.launch(dispatchers.main) {
            _tasks.postValue(Event(Resource.loading(null)))
            withContext(dispatchers.io) {
                try {
                    val firstDay = date.getActualMinimum(Calendar.DAY_OF_MONTH)
                    val lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH)
                    val start_date = TimeFormatUtils.getDate(
                        date.get(Calendar.YEAR),
                        date.get(Calendar.MONTH),
                        firstDay,
                        0,
                        0
                    )!!.toTimeString("yyyy-MM-dd") + "T00:00:00.000Z"
                    val end_date = TimeFormatUtils.getDate(
                        date.get(Calendar.YEAR),
                        date.get(Calendar.MONTH),
                        lastDay,
                        23,
                        59
                    )!!.toTimeString("yyyy-MM-dd") + "T23:59:00.000Z"
                    val result = taskRepository.getManagementTasksByFilter(
                        agencyId = agencyId,
                        projectId = projectId,
                        type = taskType,
                        startTime = start_date,
                        endTime = end_date,
                        skip = 0,
                        take = 100
                    )
                    _tasks.postValue(Event(Resource.success(result.data)))
                } catch (e: Exception) {
                    _tasks.postValue(Event(Resource.error(Throwable(), null)))
                    onLoadFail(e)
                }
            }
        }
}