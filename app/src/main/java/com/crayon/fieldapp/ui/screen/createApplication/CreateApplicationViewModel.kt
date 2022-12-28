package com.crayon.fieldapp.ui.screen.createApplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.CreateApplicationForm
import com.crayon.fieldapp.data.remote.request.CreateApplicationRequest
import com.crayon.fieldapp.data.remote.response.*
import com.crayon.fieldapp.data.repository.ApplicationRepository
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.RoleRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class CreateApplicationViewModel(
    private val roleRepository: RoleRepository,
    private val projectRepository: ProjectRepository,
    private val jobRepository: JobRepository,
    private val applicationRepository: ApplicationRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _listAgency = MediatorLiveData<Resource<List<RoleResponse>>>()
    val listAgency: LiveData<Resource<List<RoleResponse>>> get() = _listAgency
    private var listAgencySource: LiveData<Resource<List<RoleResponse>>> = MutableLiveData()
    fun getListRole() = viewModelScope.launch(dispatchers.main) {
        _listAgency.removeSource(listAgencySource)
        withContext(dispatchers.io) {
            listAgencySource = roleRepository.getListRole()
        }
        _listAgency.addSource(listAgencySource) {
            _listAgency.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    private val _listProject = MediatorLiveData<Resource<List<PicProjectResponse>>>()
    val listProject: LiveData<Resource<List<PicProjectResponse>>> get() = _listProject
    private var listProjectSource: LiveData<Resource<List<PicProjectResponse>>> = MutableLiveData()
    fun getProjectByAgency(agencyId: String) = viewModelScope.launch(dispatchers.main) {
        _listProject.removeSource(listProjectSource)
        withContext(dispatchers.io) {
            listProjectSource = projectRepository.getPicProjectByAgency(agencyId)
        }
        _listProject.addSource(listProjectSource) {
            _listProject.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    private val _listMember = MediatorLiveData<Resource<List<MemberResponse>>>()
    val listMember: LiveData<Resource<List<MemberResponse>>> get() = _listMember
    private var listMemberSource: LiveData<Resource<List<MemberResponse>>> = MutableLiveData()
    fun getMemberOfProject(projectId: String) = viewModelScope.launch(dispatchers.main) {
        _listMember.removeSource(listMemberSource)
        withContext(dispatchers.io) {
            listMemberSource = projectRepository.getPicMemberOfProject(projectId)
        }
        _listMember.addSource(listMemberSource) {
            _listMember.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    private val _listJob = MediatorLiveData<Resource<List<JobResponse>>>()
    val listJob: LiveData<Resource<List<JobResponse>>> get() = _listJob
    private var listJobSource: LiveData<Resource<List<JobResponse>>> = MutableLiveData()
    fun getMyJobOfProject(projectId: String) = viewModelScope.launch(dispatchers.main) {
        _listJob.removeSource(listJobSource)
        withContext(dispatchers.io) {
            listJobSource = jobRepository.getPicJobs(projectId = projectId, status = JobStatus.PENDING.value)
        }
        _listJob.addSource(listJobSource) {
            _listJob.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    private val _createApplication = MediatorLiveData<Resource<GetMessageResponse>>()
    val createApplication: LiveData<Resource<GetMessageResponse>> get() = _createApplication
    private var createApplicationSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun createApplication(form: CreateApplicationForm) = viewModelScope.launch(dispatchers.main) {
        _createApplication.removeSource(createApplicationSource)
        withContext(dispatchers.io) {
            val request = CreateApplicationRequest(
                agency = form.agency!!.toInt(),
                leader = form.leader!!.toInt(),
                type = form.type!!,
                project = form.project!!.toInt(),
                reason = form.reason!!,
                start_time = form.start_time!!,
                end_time = form.end_time!!,
                replacement = form.replacement?.toInt(),
                job = form.job?.toInt()
            )
            createApplicationSource = applicationRepository.createApplication(request)
        }
        _createApplication.addSource(createApplicationSource) {
            _createApplication.value = it
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