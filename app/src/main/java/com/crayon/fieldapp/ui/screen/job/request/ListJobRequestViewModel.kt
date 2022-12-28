package com.crayon.fieldapp.ui.screen.job.request

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListJobRequestViewModel(
    private val jobRepository: JobRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _jobs = MediatorLiveData<Event<Resource<List<JobResponse>>>>()
    val jobs: LiveData<Event<Resource<List<JobResponse>>>> get() = _jobs
    fun getJobRequest(status: String) {
        viewModelScope.launch {
            _jobs.postValue(Event(Resource.loading(null)))
            try {
                val result = jobRepository.getPicJobRequestsByStatus(status)
                _jobs.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }

    // FOR DATA
    private val _isAcceptSuccess = MediatorLiveData<Resource<GetMessageResponse>>()
    val isAcceptSuccess: LiveData<Resource<GetMessageResponse>> get() = _isAcceptSuccess
    private var isAcceptSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun acceptMemberRequest(ids: ArrayList<String>) = viewModelScope.launch(dispatchers.main) {
        _isAcceptSuccess.removeSource(isAcceptSource)
        withContext(dispatchers.io) {
            isAcceptSource = jobRepository.acceptJobRequests(ids)
        }
        _isAcceptSuccess.addSource(isAcceptSource) {
            _isAcceptSuccess.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    private val __isRejectSuccess = MediatorLiveData<Resource<GetMessageResponse>>()
    val isRejectSuccess: LiveData<Resource<GetMessageResponse>> get() = __isRejectSuccess
    private var isRejectSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun rejectMemberRequest(ids: ArrayList<String>) = viewModelScope.launch(dispatchers.main) {
        __isRejectSuccess.removeSource(isRejectSource)
        withContext(dispatchers.io) {
            isRejectSource = jobRepository.rejectJobRequests(ids)
        }
        __isRejectSuccess.addSource(isRejectSource) {
            __isRejectSuccess.value = it
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