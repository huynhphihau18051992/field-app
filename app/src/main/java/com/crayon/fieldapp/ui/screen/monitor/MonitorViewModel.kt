package com.crayon.fieldapp.ui.screen.monitor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.RoleResponse
import com.crayon.fieldapp.data.repository.RoleRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MonitorViewModel(
    private val roleRepository: RoleRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _listAgency = MediatorLiveData<Event<Resource<List<RoleResponse>>>>()
    val listAgency: LiveData<Event<Resource<List<RoleResponse>>>> get() = _listAgency
    private var listAgencySource: LiveData<Resource<List<RoleResponse>>> = MutableLiveData()
    fun getListRole() = viewModelScope.launch(dispatchers.main) {
        _listAgency.removeSource(listAgencySource)
        withContext(dispatchers.io) {
            listAgencySource = roleRepository.getListRole()
        }
        _listAgency.addSource(listAgencySource) {
            _listAgency.value = Event(it)
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