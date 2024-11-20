package com.crayon.fieldapp.ui.screen.detailProject.createJob

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.CreateJobForm
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class CreateJobViewModel(
    private val projectRepository: ProjectRepository,
    private val jobRepository: JobRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {


    private val _members = MediatorLiveData<Resource<List<MemberResponse>>>()
    val members: LiveData<Resource<List<MemberResponse>>> get() = _members
    private var membersSource: LiveData<Resource<List<MemberResponse>>> = MutableLiveData()
    fun getMemberProject(agencyId: String, projectId: String) =
        viewModelScope.launch(dispatchers.main) {
            _members.removeSource(membersSource)
            withContext(dispatchers.io) {
                membersSource = projectRepository.getMemberOfProject(agencyId, projectId)
            }
            _members.addSource(membersSource) {
                _members.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }

    private val _createJob = MediatorLiveData<Resource<GetMessageResponse>>()
    val createJob: LiveData<Resource<GetMessageResponse>> get() = _createJob
    private var createJobSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun createJob(form: CreateJobForm) =
        viewModelScope.launch(dispatchers.main) {
            _createJob.removeSource(createJobSource)
            withContext(dispatchers.io) {
                createJobSource = jobRepository.createManagementJob(form)
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