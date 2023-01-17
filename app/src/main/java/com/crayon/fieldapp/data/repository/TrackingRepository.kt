package com.crayon.fieldapp.data.repository

import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.remote.response.TrackingResponse
import com.crayon.fieldapp.utils.Resource


interface TrackingRepository {

    suspend fun uploadLocation(lat: String, lng: String): Resource<GetMessageResponse>

    suspend fun getListLocation(
        agencyId: String,
        userId: String, startTime: String? = null,
        endTime: String? = null,
        skip: Int,
        take: Int
    ): Resource<List<TrackingResponse>>
}