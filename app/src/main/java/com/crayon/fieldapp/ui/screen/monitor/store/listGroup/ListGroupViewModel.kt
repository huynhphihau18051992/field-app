package com.crayon.fieldapp.ui.screen.monitor.store.listGroup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.model.GroupStore
import com.crayon.fieldapp.data.remote.response.GroupStoreResponse
import com.crayon.fieldapp.data.repository.GroupStoreRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListGroupViewModel(
    private val groupRepository: GroupStoreRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _groups = MediatorLiveData<Resource<List<GroupStoreResponse>>>()
    val groups: LiveData<Resource<List<GroupStoreResponse>>> get() = _groups
    private var groupsSource: LiveData<Resource<List<GroupStoreResponse>>> = MutableLiveData()

    fun getGroups(agencyId: String) = viewModelScope.launch(dispatchers.main) {
        _groups.removeSource(groupsSource)
        withContext(dispatchers.io) { groupsSource = groupRepository.getGroups(agencyId) }
        _groups.addSource(groupsSource) {
            _groups.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    fun removeGroup(agencyId: String, groupId: String) = viewModelScope.launch(dispatchers.main) {
        _groups.removeSource(groupsSource)
        withContext(dispatchers.io) {
            groupsSource = groupRepository.removeGroup(agencyId, groupId)
        }
        _groups.addSource(groupsSource) {
            _groups.value = it
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