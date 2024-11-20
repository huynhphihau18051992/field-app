package com.crayon.fieldapp.ui.screen.detailProject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.ListIdRequest
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.data.remote.response.ProjectResponse
import com.crayon.fieldapp.data.remote.response.StoreOfProjectResponse
import com.crayon.fieldapp.data.remote.response.StoreResponse
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.StoreRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class DetailProjectViewModel(
    private val projectRepository: ProjectRepository,
    private val jobRepository: JobRepository,
    private val storeRepository: StoreRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    private val _project = MediatorLiveData<Resource<ProjectResponse>>()
    val project: LiveData<Resource<ProjectResponse>> get() = _project
    private var projectSource: LiveData<Resource<ProjectResponse>> = MutableLiveData()

    var numMember = MutableLiveData<Int>()

    fun getProject(agencyId: String, projectId: String) = viewModelScope.launch(dispatchers.main) {
        _project.removeSource(projectSource)
        withContext(dispatchers.io) {
            projectSource = projectRepository.getProject(agencyId, projectId)
        }
        _project.addSource(projectSource) {
            _project.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

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
                it.data?.let {
                    numMember.value = it.size
                }
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

    private val _stores = MediatorLiveData<Resource<List<StoreOfProjectResponse>>>()
    val stores: LiveData<Resource<List<StoreOfProjectResponse>>> get() = _stores
    private var storeSource: LiveData<Resource<List<StoreOfProjectResponse>>> = MutableLiveData()
    fun getStoreProject(agencyId: String, projectId: String) =
        viewModelScope.launch(dispatchers.main) {
            _stores.removeSource(projectSource)
            withContext(dispatchers.io) {
                storeSource = projectRepository.getStoreOfProject(agencyId, projectId)
            }
            _stores.addSource(storeSource) {
                _stores.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }


    private val _myStores = MediatorLiveData<Resource<List<StoreResponse>>>()
    val myStores: LiveData<Resource<List<StoreResponse>>> get() = _myStores
    private var myStoresSource: LiveData<Resource<List<StoreResponse>>> = MutableLiveData()

    fun getStore(agencyId: String) = viewModelScope.launch(dispatchers.main) {
        _myStores.removeSource(myStoresSource)
        withContext(dispatchers.io) { myStoresSource = storeRepository.getStores(agencyId) }
        _myStores.addSource(myStoresSource) {
            _myStores.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }

        }
    }

    val isRemoveStoreSuccess = MutableLiveData<ArrayList<String>>()
    fun removeStoreToProject(agencyId: String, projectId: String, ids: ArrayList<String>) {
        val request = ListIdRequest(ids)
        viewModelScope.launch {
            try {
                projectRepository.removeStoreToProject(agencyId, projectId, request)
                isRemoveStoreSuccess.value = ids
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }

}