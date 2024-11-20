package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.GroupStoreDao
import com.crayon.fieldapp.data.model.GroupStore
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.response.GetGroupListResponse
import com.crayon.fieldapp.data.remote.response.GroupStoreResponse
import com.crayon.fieldapp.data.remote.response.StoreResponse
import com.crayon.fieldapp.data.repository.GroupStoreRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.NetworkBoundResource
import com.crayon.fieldapp.utils.Resource

class GroupStoreRepositoryImpl(
    private val apiService: ApiService,
    private val groupDao: GroupStoreDao
) : GroupStoreRepository {

    override suspend fun getGroups(agencyId: String): LiveData<Resource<List<GroupStoreResponse>>> {
        return object : NetworkBoundNoCacheResource<List<GroupStoreResponse>>() {
            override suspend fun createCallAsync(): List<GroupStoreResponse> {
                return apiService.getGroups(agencyId).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun removeGroup(
        agencyId: String,
        groupId: String
    ): LiveData<Resource<List<GroupStoreResponse>>> {
        return object : NetworkBoundNoCacheResource<List<GroupStoreResponse>>() {
            override suspend fun createCallAsync(): List<GroupStoreResponse> {
                return apiService.getGroups(agencyId).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getGroup(agencyId: String, groupId: String): GroupStoreResponse {
        return apiService.getGroup(agencyId, groupId)
    }

    override suspend fun getGroupListLocal(): List<GroupStore>? {
        return groupDao.getGroups()
    }

    override suspend fun getGroupLocal(id: String): GroupStore? {
        return groupDao.getGroup(id)
    }

    override suspend fun insertLocal(job: GroupStore) {
        return groupDao.insert(job)
    }

    override suspend fun insertLocal(list: List<GroupStore>) {
        return groupDao.insert(list)
    }

    override suspend fun updateLocal(job: GroupStore) {
        return groupDao.update(job)
    }

    override suspend fun deleteGroupLocal(job: GroupStore) {
        return groupDao.deleteGroup(job)
    }

    override suspend fun deleteGroupLocal(id: String) {
        return groupDao.deleteGroup(id)
    }

    override suspend fun deleteAllLocal() {
        return groupDao.deleteAll()
    }

    override suspend fun getGroupPageLocal(pageSize: Int, pageIndex: Int): List<GroupStore>? {
        return groupDao.getGroupPage(pageSize, pageIndex)
    }

}