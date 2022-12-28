package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.model.Store
import com.crayon.fieldapp.data.remote.response.StoreResponse
import com.crayon.fieldapp.utils.Resource


interface StoreRepository {
    suspend fun getStores(agencyId: String): LiveData<Resource<List<StoreResponse>>>

    suspend fun getStore(agencyId: String, storeId: String): LiveData<Resource<StoreResponse>>

    /**
     * local job db functions
     */
    suspend fun getStoreListLocal(): List<Store>?

    suspend fun getStoreLocal(id: String): Store?

    suspend fun insertLocal(Store: Store)

    suspend fun insertLocal(list: List<Store>)

    suspend fun updateLocal(Store: Store)

    suspend fun deleteStoreLocal(Store: Store)

    suspend fun deleteStoreLocal(id: String)

    suspend fun deleteAllLocal()

    suspend fun getStorePageLocal(pageSize: Int, pageIndex: Int): List<Store>?
}