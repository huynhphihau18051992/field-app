package com.crayon.fieldapp.ui.screen.detailProject.createTask

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.CreateTaskForm
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class CreateTaskViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _createJob = MediatorLiveData<Resource<GetMessageResponse>>()
    val createTask: LiveData<Resource<GetMessageResponse>> get() = _createJob
    private var createJobSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun createTask(form: CreateTaskForm) =
        viewModelScope.launch(dispatchers.main) {
            _createJob.removeSource(createJobSource)
            withContext(dispatchers.io) {
                createJobSource = taskRepository.createManagementTask(form)
            }
            _createJob.addSource(createJobSource) {
                _createJob.value = it
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