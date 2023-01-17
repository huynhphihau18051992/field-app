package com.crayon.fieldapp.data.repository.impl

import com.crayon.fieldapp.data.local.dao.UserDao
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.TrackingResponse
import com.crayon.fieldapp.data.repository.TrackingRepository
import com.crayon.fieldapp.utils.Resource


class TrackingRepositoryImpl(
    private val apiService: ApiService,
    private val userDao: UserDao
) : TrackingRepository {

    override suspend fun uploadLocation(lat: String, lng: String): Resource<GetMessageResponse> {
        val result = apiService.uploadLocation(lat = lat, lng = lng)
        return Resource.success(result)
    }

    override suspend fun getListLocation(
        agencyId: String,
        userId: String,
        startTime: String?,
        endTime: String?,
        skip: Int,
        take: Int
    ): Resource<List<TrackingResponse>> {
        val result = apiService.getManagementTrackingOfUser(
            agencyId = agencyId,
            userId = userId,
            startTime = startTime,
            endTime = endTime,
            skip = skip,
            take = take
        )
        return Resource.success(result.data)
    }
}