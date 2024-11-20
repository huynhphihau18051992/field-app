package com.crayon.fieldapp.ui.screen.monitor.application.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.repository.ApplicationRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListManagementApplicationViewModel(
    private val applicationRepository: ApplicationRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _applications = MediatorLiveData<Resource<List<ApplicationResponse>>>()
    val applications: LiveData<Resource<List<ApplicationResponse>>> get() = _applications
    private var applicationsSource: LiveData<Resource<List<ApplicationResponse>>> =
        MutableLiveData()


    fun getManagementApplications(agencyId: String, status: String) =
        viewModelScope.launch(dispatchers.main) {
            _applications.removeSource(applicationsSource)
            withContext(dispatchers.io) {
                if (status.equals("wait")) {
                    applicationsSource =
                        applicationRepository.getManagementWaitApplications(agencyId)
                } else {
                    applicationsSource =
                        applicationRepository.getManagementApprovedApplications(agencyId)
                }
            };
            _applications.addSource(applicationsSource) {
                _applications.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }

    // FOR DATA
    private val _isAcceptSuccess = MediatorLiveData<Resource<GetMessageResponse>>()
    val isAcceptSuccess: LiveData<Resource<GetMessageResponse>> get() = _isAcceptSuccess
    private var isAcceptSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun acceptApplicationRequest(agencyId: String, id: String) =
        viewModelScope.launch(dispatchers.main) {
            _isAcceptSuccess.removeSource(isAcceptSource)
            withContext(dispatchers.io) {
                isAcceptSource = applicationRepository.acceptApplication(agencyId, id)
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

    // FOR DATA
    private val _isRejectSuccess = MediatorLiveData<Resource<GetMessageResponse>>()
    val isRejectSuccess: LiveData<Resource<GetMessageResponse>> get() = _isRejectSuccess
    private var isRejectSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun rejectApplicationRequest(agencyId: String, id: String) =
        viewModelScope.launch(dispatchers.main) {
            _isRejectSuccess.removeSource(isRejectSource)
            withContext(dispatchers.io) {
                isRejectSource = applicationRepository.rejectApplication(agencyId, id)
            }
            _isRejectSuccess.addSource(isRejectSource) {
                _isRejectSuccess.value = it
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