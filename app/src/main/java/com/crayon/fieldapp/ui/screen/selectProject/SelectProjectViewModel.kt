package com.crayon.fieldapp.ui.screen.selectProject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.data.remote.response.PicProjectResponse
import com.crayon.fieldapp.data.remote.response.ProjectResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SelectProjectViewModel(private val projectRepository: ProjectRepository,
                             private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _projects = MediatorLiveData<Resource<List<PicProjectResponse>>>()
    val projects: LiveData<Resource<List<PicProjectResponse>>> get() = _projects
    private var memberSource: LiveData<Resource<List<PicProjectResponse>>> = MutableLiveData()
    fun getProject() =
        viewModelScope.launch(dispatchers.main) {
            _projects.removeSource(memberSource)
            withContext(dispatchers.io) {
                memberSource = projectRepository.getPicProjects()
            }
            _projects.addSource(memberSource) {
                _projects.value = it
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