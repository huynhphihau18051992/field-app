package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.model.GroupUser
import com.crayon.fieldapp.data.model.User
import com.crayon.fieldapp.data.remote.response.GetMemberListResponse
import com.crayon.fieldapp.data.remote.response.MemberResponse
import com.crayon.fieldapp.data.remote.response.UserResponse
import com.crayon.fieldapp.utils.Resource


interface GroupUserRepository {

    suspend fun getGroups(agencyId: String): LiveData<Resource<List<GroupUser>>>

    suspend fun removeGroup(agencyId: String, groupId: String): LiveData<Resource<List<GroupUser>>>

    suspend fun getGroup(agencyId: String, groupId: String): LiveData<Resource<GroupUser>>

    suspend fun getMemberOfGroup(agencyId: String, groupId: String): GetMemberListResponse

    /**
     * local job db functions
     */
    suspend fun getGroupListLocal(): List<GroupUser>?

    suspend fun getGroupLocal(id: String): GroupUser?

    suspend fun insertLocal(group: GroupUser)

    suspend fun insertLocal(list: List<GroupUser>)

    suspend fun updateLocal(group: GroupUser)

    suspend fun deleteGroupLocal(group: GroupUser)

    suspend fun deleteGroupLocal(id: String)

    suspend fun deleteAllLocal()

    suspend fun getGroupPageLocal(pageSize: Int, pageIndex: Int): List<GroupUser>?
}