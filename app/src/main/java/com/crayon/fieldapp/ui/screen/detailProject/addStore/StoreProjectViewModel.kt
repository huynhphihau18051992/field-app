package com.crayon.fieldapp.ui.screen.detailProject.addStore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.model.Store
import com.crayon.fieldapp.data.remote.request.ListIdRequest
import com.crayon.fieldapp.data.remote.response.StoreResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.StoreRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class StoreProjectViewModel(
    private val storeRepository: StoreRepository,
    private val projectRepository: ProjectRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

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

    val isAddStoreSuccess = MutableLiveData<Boolean>()
    fun addStoreToProject(agencyId: String, projectId: String, ids: ArrayList<String>) {
        val request = ListIdRequest(ids)
        viewModelScope.launch {
            try {
                projectRepository.addStoreToProject(agencyId, projectId, request)
                isAddStoreSuccess.value = true
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }

}