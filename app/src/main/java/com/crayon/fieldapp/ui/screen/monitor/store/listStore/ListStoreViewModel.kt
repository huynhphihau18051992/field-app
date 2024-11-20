package com.crayon.fieldapp.ui.screen.monitor.store.listStore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.StoreResponse
import com.crayon.fieldapp.data.repository.StoreRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListStoreViewModel(
    private val storeRepository: StoreRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA
    private val _stores = MediatorLiveData<Resource<List<StoreResponse>>>()
    val stores: LiveData<Resource<List<StoreResponse>>> get() = _stores
    private var storesSource: LiveData<Resource<List<StoreResponse>>> = MutableLiveData()

    fun getStores(agencyId: String) = viewModelScope.launch(dispatchers.main) {
        _stores.removeSource(storesSource)
        withContext(dispatchers.io) { storesSource = storeRepository.getStores(agencyId) }
        _stores.addSource(storesSource) {
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
}