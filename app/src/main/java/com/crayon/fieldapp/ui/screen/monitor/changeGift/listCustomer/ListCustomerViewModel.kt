package com.crayon.fieldapp.ui.screen.monitor.changeGift.listCustomer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.CustomerResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListCustomerViewModel(
    private val projectRepository: ProjectRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _summary = MediatorLiveData<Event<Resource<List<CustomerResponse>>>>()
    val summary: LiveData<Event<Resource<List<CustomerResponse>>>> get() = _summary
    fun getProjectSummary(agencyId: String, projectId: String) =
        viewModelScope.launch(dispatchers.main) {
            _summary.postValue(Event(Resource.loading(null)))
            withContext(dispatchers.io) {
                try {
                    val result = projectRepository.getProjectSummaryCustomer(
                        agencyId = agencyId,
                        projectId = projectId
                    )
                    _summary.postValue(Event(Resource.success(result.data)))
                } catch (e: Exception) {
                    _summary.postValue(Event(Resource.error(Throwable(), null)))
                    onLoadFail(e)
                }
            }
        }
}