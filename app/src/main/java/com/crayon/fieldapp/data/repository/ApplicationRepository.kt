package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.remote.request.CreateApplicationRequest
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.utils.Resource


interface ApplicationRepository {

    suspend fun getPicWaitApplications(): LiveData<Resource<List<ApplicationResponse>>>

    suspend fun getPicApprovedApplications(
    ): LiveData<Resource<List<ApplicationResponse>>>

    suspend fun getPicApplication(
        id: String
    ): LiveData<Resource<ApplicationResponse>>

    suspend fun createApplication(
        form: CreateApplicationRequest
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun getManagementApprovedApplications(
        agencyId: String
    ): LiveData<Resource<List<ApplicationResponse>>>

    suspend fun getManagementWaitApplications(
        agencyId: String
    ): LiveData<Resource<List<ApplicationResponse>>>

    suspend fun getManagementApplication(
        agencyId: String,
        applicationId: String
    ): LiveData<Resource<ApplicationResponse>>

    suspend fun acceptApplication(
        agencyId: String,
        applicationId: String
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun rejectApplication(
        agencyId: String,
        applicationId: String
    ): LiveData<Resource<GetMessageResponse>>
}