package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.model.GroupStore
import com.crayon.fieldapp.data.remote.response.GroupStoreResponse
import com.crayon.fieldapp.utils.Resource


interface GroupStoreRepository {

    suspend fun getGroups(agencyId: String): LiveData<Resource<List<GroupStoreResponse>>>

    suspend fun removeGroup(agencyId: String, groupId: String) :LiveData<Resource<List<GroupStoreResponse>>>

    suspend fun getGroup(agencyId: String, groupId: String): GroupStoreResponse

    /**
     * local job db functions
     */
    suspend fun getGroupListLocal(): List<GroupStore>?

    suspend fun getGroupLocal(id: String): GroupStore?

    suspend fun insertLocal(group: GroupStore)

    suspend fun insertLocal(list: List<GroupStore>)

    suspend fun updateLocal(group: GroupStore)

    suspend fun deleteGroupLocal(group: GroupStore)

    suspend fun deleteGroupLocal(id: String)

    suspend fun deleteAllLocal()

    suspend fun getGroupPageLocal(pageSize: Int, pageIndex: Int): List<GroupStore>?
}