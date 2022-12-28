package com.crayon.fieldapp.ui.screen.detailProject.manageJob

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class ManageJobProjectViewModel(
    private val jobRepository: JobRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _jobs = MediatorLiveData<Resource<List<JobResponse>>>()
    val jobs: LiveData<Resource<List<JobResponse>>> get() = _jobs
    private var jobsSource: LiveData<Resource<List<JobResponse>>> = MutableLiveData()


    fun getJobAtStore(
        agencyId: String,
        projectId: String,
        storeId: String,
        statusTime: String,
        endTime: String
    ) =
        viewModelScope.launch(dispatchers.main) {
            _jobs.removeSource(jobsSource)
            withContext(dispatchers.io) {
                jobsSource = jobRepository.getManagementJobAtStore(
                    agencyId = agencyId,
                    projectId = projectId,
                    storeId = storeId,
                    startTime = statusTime,
                    endTime = endTime
                )
            }
            _jobs.addSource(jobsSource) {
                _jobs.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }

    private val _removeJob = MediatorLiveData<Resource<GetMessageResponse>>()
    val removeJob: LiveData<Resource<GetMessageResponse>> get() = _removeJob
    private var removeJobSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun removeJob(agencyId: String, jobId: String) =
        viewModelScope.launch(dispatchers.main) {
            _removeJob.removeSource(removeJobSource)
            withContext(dispatchers.io) {
                removeJobSource = jobRepository.removeManagementJob(agencyId, jobId)
            }
            _removeJob.addSource(removeJobSource) {
                _removeJob.value = it
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