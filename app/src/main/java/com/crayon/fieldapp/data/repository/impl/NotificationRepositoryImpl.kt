package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.JobDao
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.NotificationResponse
import com.crayon.fieldapp.data.repository.NotificationRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.Resource

class NotificationRepositoryImpl(
    private val apiService: ApiService,
    private val jobDao: JobDao
) : NotificationRepository {
    override suspend fun getPicNotifications(): Resource<List<NotificationResponse>> {
        val result = apiService.getPicNotifications().data!!
        return Resource.success(result)
    }

    override suspend fun getPicNotification(id: String): Resource<NotificationResponse> {
        val result = apiService.getPicNotification(id)
        return Resource.success(result)
    }

    override suspend fun markRead(id: String): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.markRead(id)
            }

        }.build().asLiveData()
    }

    override suspend fun markResolved(id: String): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.markResolved(id)
            }

        }.build().asLiveData()
    }


}