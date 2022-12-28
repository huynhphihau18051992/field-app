package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.GroupUserDao
import com.crayon.fieldapp.data.model.GroupUser
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.response.GetGroupEmployeeListResponse
import com.crayon.fieldapp.data.remote.response.GetMemberListResponse
import com.crayon.fieldapp.data.remote.response.GroupUserResponse
import com.crayon.fieldapp.data.repository.GroupUserRepository
import com.crayon.fieldapp.utils.NetworkBoundResource
import com.crayon.fieldapp.utils.Resource

class GroupUserRepositoryImpl(
    private val apiService: ApiService,
    private val groupDao: GroupUserDao
) : GroupUserRepository {

    override suspend fun getGroups(agencyId: String): LiveData<Resource<List<GroupUser>>> {
        return object : NetworkBoundResource<List<GroupUser>, GetGroupEmployeeListResponse>() {
            override fun processResponse(response: GetGroupEmployeeListResponse): List<GroupUser> {
                return response.data!!
            }

            override suspend fun saveCallResults(items: List<GroupUser>) {
                groupDao.insert(items)
            }

            override fun shouldFetch(data: List<GroupUser>?): Boolean {
                return true
            }

            override suspend fun loadFromDb(): List<GroupUser> {
                return groupDao.getGroups()!!
            }

            override suspend fun createCallAsync(): GetGroupEmployeeListResponse {
                return apiService.getGroupUsers(agencyId)
            }
        }.build().asLiveData()
    }

    override suspend fun removeGroup(
        agencyId: String,
        groupId: String
    ): LiveData<Resource<List<GroupUser>>> {
        return object : NetworkBoundResource<List<GroupUser>, Unit>() {
            override suspend fun saveCallResults(items: List<GroupUser>) {
                groupDao.deleteGroup(groupId)
            }

            override fun shouldFetch(data: List<GroupUser>?): Boolean {
                return true
            }

            override suspend fun loadFromDb(): List<GroupUser> {
                return groupDao.getGroups()!!
            }

            override suspend fun createCallAsync(): Unit {
                return apiService.removeGroup(agencyId, groupId)
            }

            override fun processResponse(response: Unit): List<GroupUser> {
                return arrayListOf()
            }
        }.build().asLiveData()
    }

    override suspend fun getGroup(
        agencyId: String,
        groupId: String
    ): LiveData<Resource<GroupUser>> {
        return object : NetworkBoundResource<GroupUser, GroupUserResponse>() {
            override suspend fun saveCallResults(items: GroupUser) {
                groupDao.insert(items)
            }

            override fun shouldFetch(data: GroupUser?): Boolean {
                return true
            }

            override suspend fun loadFromDb(): GroupUser {
                return groupDao.getGroup(groupId)!!
            }

            override suspend fun createCallAsync(): GroupUserResponse {
                return apiService.getGroupUser(agencyId, groupId)
            }

            override fun processResponse(response: GroupUserResponse): GroupUser {
                val groupUser = GroupUser(
                    id = response.id.toString(),
                    name = response.name.toString(),
                    agency = response.agency.toString(),
                    manager = response.manager.toString(),
                    parent = response.parent.toString()
                )
                return groupUser
            }
        }.build().asLiveData()
    }

    override suspend fun getMemberOfGroup(
        agencyId: String,
        groupId: String
    ): GetMemberListResponse {
        return apiService.getMemberOfGroupUser(agencyId, groupId)
    }

    override suspend fun getGroupListLocal(): List<GroupUser>? {
        return groupDao.getGroups()
    }

    override suspend fun getGroupLocal(id: String): GroupUser? {
        return groupDao.getGroup(id)
    }

    override suspend fun insertLocal(job: GroupUser) {
        return groupDao.insert(job)
    }

    override suspend fun insertLocal(list: List<GroupUser>) {
        return groupDao.insert(list)
    }

    override suspend fun updateLocal(job: GroupUser) {
        return groupDao.update(job)
    }

    override suspend fun deleteGroupLocal(job: GroupUser) {
        return groupDao.deleteGroup(job)
    }

    override suspend fun deleteGroupLocal(id: String) {
        return groupDao.deleteGroup(id)
    }

    override suspend fun deleteAllLocal() {
        return groupDao.deleteAll()
    }

    override suspend fun getGroupPageLocal(pageSize: Int, pageIndex: Int): List<GroupUser>? {
        return groupDao.getGroupPage(pageSize, pageIndex)
    }

}