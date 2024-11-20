package com.crayon.fieldapp.ui.screen.detailAttachment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.CreateApplicationRequest
import com.crayon.fieldapp.data.remote.response.ProjectResponse
import com.crayon.fieldapp.data.remote.response.RoleResponse
import com.crayon.fieldapp.data.repository.ApplicationRepository
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.RoleRepository
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import kotlinx.coroutines.launch


class DetailAttachmentViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {


}