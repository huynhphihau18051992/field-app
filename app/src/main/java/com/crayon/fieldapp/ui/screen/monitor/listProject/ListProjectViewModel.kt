package com.crayon.fieldapp.ui.screen.monitor.listProject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.ProjectResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListProjectViewModel(
    private val projectRepository: ProjectRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    val query = MutableLiveData<String>()

    fun sendQuery(text: String) {
        query.value = text
    }

    // FOR DATA
    private val _projects = MediatorLiveData<Resource<List<ProjectResponse>>>()
    val projects: LiveData<Resource<List<ProjectResponse>>> get() = _projects
    private var projectsSource: LiveData<Resource<List<ProjectResponse>>> = MutableLiveData()

    fun getProjects(agencyId: String, status: String? = null) =
        viewModelScope.launch(dispatchers.main) {
            _projects.removeSource(projectsSource)
            withContext(dispatchers.io) {
                projectsSource = projectRepository.getProjectsByStatus(agencyId, status)
            }
            _projects.addSource(projectsSource) {
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

    fun searchProjects(agencyId: String, name: String, status: String? = null) =
        viewModelScope.launch(dispatchers.main) {
            _projects.removeSource(projectsSource)
            withContext(dispatchers.io) {
                projectsSource = projectRepository.searchProjectsByName(
                    agencyId = agencyId,
                    name = name,
                    status = status
                )
            }
            _projects.addSource(projectsSource) {
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