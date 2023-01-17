package com.crayon.fieldapp.ui.screen.monitor.reportCompetitor.listTask

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.GetReportOpponentListResponse
import com.crayon.fieldapp.data.remote.response.GetTaskListResponse
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

class ListReportCompetitorAtStoreViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _tasks = MediatorLiveData<Event<Resource<List<TaskResponse>>>>()
    val listTask: LiveData<Event<Resource<List<TaskResponse>>>> get() = _tasks
    fun getTaskByProject(
        date: Calendar,
        agencyId: String,
        projectId: String,
        skip: Int,
        take: Int
    ) =
        viewModelScope.launch(dispatchers.main) {
            _tasks.postValue(Event(Resource.loading(null)))
            withContext(dispatchers.io) {
                try {
                    val numberOfMonth = date.getActualMaximum(Calendar.DAY_OF_MONTH)
                    val start_date = TimeFormatUtils.getDate(
                        date.get(Calendar.YEAR),
                        date.get(Calendar.MONTH),
                        date.get(Calendar.DATE),
                        0,
                        0
                    )!!.toTimeString("yyyy-MM-dd") + "T00:00:00.000Z"
                    val end_date = TimeFormatUtils.getDate(
                        date.get(Calendar.YEAR),
                        date.get(Calendar.MONTH),
                        date.get(Calendar.DATE),
                        23,
                        59
                    )!!.toTimeString("yyyy-MM-dd") + "T23:59:00.000Z"
                    val result = taskRepository.getManagementReportOpponents(
                        agencyId = agencyId,
                        projectId = projectId,
                        startTime = start_date,
                        endTime = end_date,
                        skip = skip,
                        take = 20
                    )
                    _tasks.postValue(Event(Resource.success(result.data)))
                } catch (e: Exception) {
                    onLoadFail(e)
                }
            }
        }
}