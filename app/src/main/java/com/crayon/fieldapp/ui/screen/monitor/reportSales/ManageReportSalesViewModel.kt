package com.crayon.fieldapp.ui.screen.monitor.reportSales

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.AttendanceResponse
import com.crayon.fieldapp.data.remote.response.ProjectResponse
import com.crayon.fieldapp.data.remote.response.ProjectStatus
import com.crayon.fieldapp.data.repository.AttendanceRepository
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ManageReportSalesViewModel(
    private val attendanceRepository: AttendanceRepository,
    private val projectRepository: ProjectRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _attendances = MediatorLiveData<Resource<List<AttendanceResponse>>>()
    val attendances: LiveData<Resource<List<AttendanceResponse>>> get() = _attendances
    private var attendancesSource: LiveData<Resource<List<AttendanceResponse>>> =
        MutableLiveData()

    fun getManagementAttendances(agencyId: String, projectId: String) =
        viewModelScope.launch(dispatchers.main) {
            _attendances.removeSource(attendancesSource)
            withContext(dispatchers.io) {
                attendancesSource =
                    attendanceRepository.getManagementAttendances(
                        agencyId = agencyId,
                        projectId = projectId,
                        startTime = "",
                        endTime = ""
                    )
            }
            _attendances.addSource(attendancesSource) {
                _attendances.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }

    private val _projects = MediatorLiveData<Event<Resource<List<ProjectResponse>>>>()
    val projects: LiveData<Event<Resource<List<ProjectResponse>>>> get() = _projects
    private var projectsSource: LiveData<Resource<List<ProjectResponse>>> =
        MutableLiveData()

    fun getManagementProject(agencyId: String, taskType: Int) =
        viewModelScope.launch(dispatchers.main) {
            _projects.removeSource(projectsSource)
            withContext(dispatchers.io) {
                projectsSource =
                    projectRepository.getProjectsByStatus(
                        agencyId = agencyId,
                        status = ProjectStatus.PROCESSING.value,
                        type = taskType
                    )
            }
            _projects.addSource(projectsSource) {
                _projects.value = Event(it)
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