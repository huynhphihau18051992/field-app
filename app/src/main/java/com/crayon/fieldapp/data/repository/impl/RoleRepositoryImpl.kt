package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.response.RoleResponse
import com.crayon.fieldapp.data.repository.RoleRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.Resource

class RoleRepositoryImpl(
    private val apiService: ApiService
) : RoleRepository {

    override suspend fun getListRole(): LiveData<Resource<List<RoleResponse>>> {
        return object : NetworkBoundNoCacheResource<List<RoleResponse>>() {
            override suspend fun createCallAsync(): List<RoleResponse> {
                return apiService.getRoles()
            }

        }.build().asLiveData()
    }

    override suspend fun getRole(roleId: String): RoleResponse {
        return apiService.getRole(roleId)
    }


}