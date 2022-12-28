package com.crayon.fieldapp.ui.screen.monitor.updateStatus.detailTask

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
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailUpdateStatusAtStoreViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    // FOR DATA
    private val _task = MediatorLiveData<Resource<TaskResponse>>()
    val task: LiveData<Resource<TaskResponse>> get() = _task
    private var projectsSource: LiveData<Resource<TaskResponse>> = MutableLiveData()

    fun getDetailTask(taskId: String) =
        viewModelScope.launch(dispatchers.main) {
            _task.removeSource(projectsSource)
            withContext(dispatchers.io) {
                projectsSource = taskRepository.getManagementTask(taskId)
            }
            _task.addSource(projectsSource) {
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
}