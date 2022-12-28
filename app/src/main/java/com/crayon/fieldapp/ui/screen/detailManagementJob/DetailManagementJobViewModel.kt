package com.crayon.fieldapp.ui.screen.detailManagementJob

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailManagementJobViewModel(
    private val jobRepository: JobRepository,
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _job = MediatorLiveData<Resource<JobResponse>>()
    val job: LiveData<Resource<JobResponse>> get() = _job
    private var jobSource: LiveData<Resource<JobResponse>> = MutableLiveData()


    fun getDetailJob(agencyId: String, jobId: String) = viewModelScope.launch(dispatchers.main) {
        _job.removeSource(jobSource)
        withContext(dispatchers.io) {
            jobSource = jobRepository.getManagementJob(agencyId, jobId)
        }
        _job.addSource(jobSource) {
            _job.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    private val _task = MediatorLiveData<Resource<List<TaskResponse>>>()
    val tasks: LiveData<Resource<List<TaskResponse>>> get() = _task
    private var taskSource: LiveData<Resource<List<TaskResponse>>> = MutableLiveData()
    fun getListTask(agencyId: String, jobId: String) = viewModelScope.launch(dispatchers.main) {
        _task.removeSource(taskSource)
        withContext(dispatchers.io) {
            taskSource = taskRepository.getManagementTasks(agencyId, jobId)
        }
        _task.addSource(taskSource) {
            _task.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    private val _removeTask = MediatorLiveData<Resource<GetMessageResponse>>()
    val isRemoveTask: LiveData<Resource<GetMessageResponse>> get() = _removeTask
    private var removeTaskSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun removeTask(agencyId: String, jobId: String) =
        viewModelScope.launch(dispatchers.main) {
            _removeTask.removeSource(removeTaskSource)
            withContext(dispatchers.io) {
                removeTaskSource = taskRepository.removeTask(agencyId, jobId)
            }
            _removeTask.addSource(removeTaskSource) {
                _removeTask.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }
}