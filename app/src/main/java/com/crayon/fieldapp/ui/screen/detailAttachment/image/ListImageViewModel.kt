package com.crayon.fieldapp.ui.screen.detailAttachment.image

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.CreateApplicationRequest
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.ProjectResponse
import com.crayon.fieldapp.data.remote.response.RoleResponse
import com.crayon.fieldapp.data.repository.ApplicationRepository
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.RoleRepository
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class ListImageViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _removeImage = MediatorLiveData<Resource<GetMessageResponse>>()
    val isRemoveTask: LiveData<Resource<GetMessageResponse>> get() = _removeImage
    private var removeImageSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun removeImage(taskId: String, ids: ArrayList<String>) =
        viewModelScope.launch(dispatchers.main) {
            _removeImage.removeSource(removeImageSource)
            withContext(dispatchers.io) {
                removeImageSource = taskRepository.deleteAttachment(taskId, ids)
            }
            _removeImage.addSource(removeImageSource) {
                _removeImage.value = it
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