package com.crayon.fieldapp.ui.screen.monitor.changeGift.listTask

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.ProjectSummaryResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.toTimeString
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import studio.phillip.yolo.utils.TimeFormatUtils
import java.util.*

class ListChangeGiftAtStoreViewModel(
    private val taskRepository: TaskRepository,
    private val projectRepository: ProjectRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _tasks = MediatorLiveData<Event<Resource<List<TaskResponse>>>>()
    val listTask: LiveData<Event<Resource<List<TaskResponse>>>> get() = _tasks
    fun getTaskByProject(
        date: Calendar,
        agencyId: String,
        projectId: String,
        taskType: Int,
        skip: Int,
        take: Int = 20
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
                    val result = taskRepository.getManagementTasksByFilter(
                        agencyId = agencyId,
                        projectId = projectId,
                        type = taskType,
                        startTime = start_date,
                        endTime = end_date,
                        skip = skip,
                        take = 20
                    )
                    _tasks.postValue(Event(Resource.success(result.data)))
                } catch (e: Exception) {
                    _tasks.postValue(Event(Resource.error(Throwable(), null)))
                    onLoadFail(e)
                }
            }
        }

    private val _summary = MediatorLiveData<Event<Resource<ProjectSummaryResponse>>>()
    val summary: LiveData<Event<Resource<ProjectSummaryResponse>>> get() = _summary
    fun getProjectSummary(agencyId: String, projectId: String) =
        viewModelScope.launch(dispatchers.main) {
            _summary.postValue(Event(Resource.loading(null)))
            withContext(dispatchers.io) {
                try {
                    val result = projectRepository.getProjectSummary(
                        agencyId = agencyId,
                        projectId = projectId
                    )
                    _summary.postValue(Event(Resource.success(result.data)))
                } catch (e: Exception) {
                    _summary.postValue(Event(Resource.error(Throwable(), null)))
                    onLoadFail(e)
                }
            }
        }
}