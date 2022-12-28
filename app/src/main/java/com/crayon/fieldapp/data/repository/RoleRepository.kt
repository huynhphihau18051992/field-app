package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.remote.response.RoleResponse
import com.crayon.fieldapp.utils.Resource


interface RoleRepository {

    suspend fun getListRole(): LiveData<Resource<List<RoleResponse>>>

    suspend fun getRole(roleId: String): RoleResponse
}