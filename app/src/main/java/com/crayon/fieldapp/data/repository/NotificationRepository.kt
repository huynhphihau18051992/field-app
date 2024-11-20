package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.NotificationResponse
import com.crayon.fieldapp.utils.Resource

interface NotificationRepository {

    suspend fun getPicNotifications(): Resource<List<NotificationResponse>>

    suspend fun getPicNotification(id: String): Resource<NotificationResponse>

    suspend fun markRead(id: String): LiveData<Resource<GetMessageResponse>>

    suspend fun markResolved(id: String): LiveData<Resource<GetMessageResponse>>
}