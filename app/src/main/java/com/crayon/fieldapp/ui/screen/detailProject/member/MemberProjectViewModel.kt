package com.crayon.fieldapp.ui.screen.detailProject.member

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.ListIdRequest
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MemberProjectViewModel(
    private val projectRepository: ProjectRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _members = MediatorLiveData<Resource<List<MemberResponse>>>()
    val members: LiveData<Resource<List<MemberResponse>>> get() = _members
    private var memberSource: LiveData<Resource<List<MemberResponse>>> = MutableLiveData()
    fun getMemberProject(agencyId: String, projectId: String) =
        viewModelScope.launch(dispatchers.main) {
            _members.removeSource(memberSource)
            withContext(dispatchers.io) {
                memberSource = projectRepository.getMemberOfProject(agencyId, projectId)
            }
            _members.addSource(memberSource) {
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

    val isRemoveUserSuccess = MutableLiveData<Boolean>()
    fun removeMembersToProject(agencyId: String, projectId: String, ids: ArrayList<String>) {
        val request = ListIdRequest(ids)
        viewModelScope.launch {
            try {
                projectRepository.removeMemberToProject(agencyId, projectId, request)
                isRemoveUserSuccess.value = true
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }
}