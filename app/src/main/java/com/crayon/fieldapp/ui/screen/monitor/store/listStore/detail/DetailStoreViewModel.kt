package com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.model.Store
import com.crayon.fieldapp.data.remote.response.StoreResponse
import com.crayon.fieldapp.data.repository.StoreRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DetailStoreViewModel(
    private val storeRepository: StoreRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    private val _store = MediatorLiveData<Resource<StoreResponse>>()
    val store: LiveData<Resource<StoreResponse>> get() = _store
    private var usersSource: LiveData<Resource<StoreResponse>> = MutableLiveData()

    fun fetchDetailStore(agencyId: String, storeId: String) =
        viewModelScope.launch(dispatchers.main) {
            _store.removeSource(usersSource)
            withContext(dispatchers.io) { usersSource = storeRepository.getStore(agencyId, storeId) }
            _store.addSource(usersSource) {
                _store.value = it
            }
        }
}