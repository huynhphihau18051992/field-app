package com.crayon.fieldapp.ui.screen.detailProject.addMember

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.model.User
import com.crayon.fieldapp.data.remote.request.ListIdRequest
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class AddMemberProjectViewModel(
    private val userRepository: UserRepository,
    private val projectRepository: ProjectRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _users = MediatorLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>> get() = _users
    private var usersSource: LiveData<Resource<List<User>>> = MutableLiveData()


    fun getMembers(agencyId: String) = viewModelScope.launch(dispatchers.main) {
        _users.removeSource(usersSource)
        withContext(dispatchers.io) { usersSource = userRepository.getMembers(agencyId) }
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

    val isAddUserSuccess = MutableLiveData<Boolean>()
    fun addMembersToProject(agencyId: String, projectId: String, ids: ArrayList<String>) {
        val request = ListIdRequest(ids)
        viewModelScope.launch {
            try {
                projectRepository.addMemberToProject(agencyId, projectId, request)
                isAddUserSuccess.value = true
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }
}