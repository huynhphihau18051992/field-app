package com.crayon.fieldapp.ui.screen.monitor.employee.listGroupMember

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.model.GroupUser
import com.crayon.fieldapp.data.repository.GroupUserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListGroupEmployeeViewModel(
    private val groupUserRepository: GroupUserRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _users = MediatorLiveData<Resource<List<GroupUser>>>()
    val users: LiveData<Resource<List<GroupUser>>> get() = _users
    private var usersSource: LiveData<Resource<List<GroupUser>>> = MutableLiveData()


    fun getMembers(agencyId: String) = viewModelScope.launch(dispatchers.main) {
        _users.removeSource(usersSource)
        withContext(dispatchers.io) { usersSource = groupUserRepository.getGroups(agencyId) }
        _users.addSource(usersSource) {
            _users.value = it
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