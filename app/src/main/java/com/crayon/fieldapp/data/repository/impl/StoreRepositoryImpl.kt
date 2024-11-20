package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.StoreDao
import com.crayon.fieldapp.data.model.Store
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.response.StoreResponse
import com.crayon.fieldapp.data.repository.StoreRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.Resource

class StoreRepositoryImpl(
    private val apiService: ApiService,
    private val storeDao: StoreDao
) : StoreRepository {

    override suspend fun getStores(agencyId: String): LiveData<Resource<List<StoreResponse>>> {
        return object : NetworkBoundNoCacheResource<List<StoreResponse>>() {
            override suspend fun createCallAsync(): List<StoreResponse> {
                return apiService.getStores(agencyId).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getStore(
        agencyId: String,
        storeId: String
    ): LiveData<Resource<StoreResponse>> {
        return object : NetworkBoundNoCacheResource<StoreResponse>() {
            override suspend fun createCallAsync(): StoreResponse {
                return apiService.getStore(agencyId, storeId)
            }

        }.build().asLiveData()
    }


    override suspend fun getStoreListLocal(): List<Store>? {
        return storeDao.getStores()
    }

    override suspend fun getStoreLocal(id: String): Store? {
        return storeDao.getStore(id)
    }

    override suspend fun insertLocal(job: Store) {
        return storeDao.insert(job)
    }

    override suspend fun insertLocal(list: List<Store>) {
        return storeDao.insert(list)
    }

    override suspend fun updateLocal(job: Store) {
        return storeDao.update(job)
    }

    override suspend fun deleteStoreLocal(job: Store) {
        return storeDao.deleteStore(job)
    }

    override suspend fun deleteStoreLocal(id: String) {
        return storeDao.deleteStore(id)
    }

    override suspend fun deleteAllLocal() {
        return storeDao.deleteAll()
    }

    override suspend fun getStorePageLocal(pageSize: Int, pageIndex: Int): List<Store>? {
        return storeDao.getStorePage(pageSize, pageIndex)
    }

}