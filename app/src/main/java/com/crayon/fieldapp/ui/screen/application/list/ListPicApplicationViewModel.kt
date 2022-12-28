package com.crayon.fieldapp.ui.screen.application.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.data.repository.ApplicationRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListPicApplicationViewModel(
    private val applicationRepository: ApplicationRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _applications = MediatorLiveData<Resource<List<ApplicationResponse>>>()
    val applications: LiveData<Resource<List<ApplicationResponse>>> get() = _applications
    private var applicationsSource: LiveData<Resource<List<ApplicationResponse>>> =
        MutableLiveData()


    fun getMyApplications(status: String) = viewModelScope.launch(dispatchers.main) {
        _applications.removeSource(applicationsSource)
        withContext(dispatchers.io) {
            if (status.equals("wait")) {
                applicationsSource = applicationRepository.getPicWaitApplications()
            } else {
                applicationsSource = applicationRepository.getPicApprovedApplications()
            }
        }
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
}