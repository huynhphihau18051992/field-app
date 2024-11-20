package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.JobDao
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.request.CreateApplicationRequest
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.data.remote.response.ApplicationStatus
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.repository.ApplicationRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.Resource

class ApplicationRepositoryImpl(
    private val apiService: ApiService,
    private val jobDao: JobDao
) : ApplicationRepository {
    override suspend fun getPicWaitApplications(): LiveData<Resource<List<ApplicationResponse>>> {
        return object : NetworkBoundNoCacheResource<List<ApplicationResponse>>() {
            override suspend fun createCallAsync(): List<ApplicationResponse> {
                val pending =
                    apiService.getPicApplications(status = ApplicationStatus.PENDING.value).data!!
                val wait =
                    apiService.getPicApplications(status = ApplicationStatus.WAIT_REPLACE.value).data!!
                val accept_replace =
                    apiService.getPicApplications(status = ApplicationStatus.ACCEPT_REPLACE.value).data!!
                val reject_replace =
                    apiService.getPicApplications(status = ApplicationStatus.REJECT_REPLACE.value).data!!
                val all = ArrayList<ApplicationResponse>()
                all.addAll(pending)
                all.addAll(wait)
                all.addAll(accept_replace)
                all.addAll(reject_replace)
                return all
            }
        }.build().asLiveData()
    }

    override suspend fun getPicApprovedApplications(): LiveData<Resource<List<ApplicationResponse>>> {
        return object : NetworkBoundNoCacheResource<List<ApplicationResponse>>() {
            override suspend fun createCallAsync(): List<ApplicationResponse> {
                val accept =
                    apiService.getPicApplications(status = ApplicationStatus.ACCEPTED.value).data!!
                val reject =
                    apiService.getPicApplications(status = ApplicationStatus.REJECTED.value).data!!
                val all = ArrayList<ApplicationResponse>()
                all.addAll(accept)
                all.addAll(reject)
                return all
            }
        }.build().asLiveData()
    }

    override suspend fun getPicApplication(id: String): LiveData<Resource<ApplicationResponse>> {
        return object : NetworkBoundNoCacheResource<ApplicationResponse>() {
            override suspend fun createCallAsync(): ApplicationResponse {
                return apiService.getPicApplication(id)
            }
        }.build().asLiveData()
    }

    override suspend fun createApplication(form: CreateApplicationRequest): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.createPicApplication(form)
            }
        }.build().asLiveData()
    }


    override suspend fun getManagementApprovedApplications(agencyId: String): LiveData<Resource<List<ApplicationResponse>>> {
        return object : NetworkBoundNoCacheResource<List<ApplicationResponse>>() {
            override suspend fun createCallAsync(): List<ApplicationResponse> {
                val accept =
                    apiService.getManagementApplications(
                        agencyId = agencyId,
                        status = ApplicationStatus.ACCEPTED.value).data!!
                val reject =
                    apiService.getManagementApplications(
                        agencyId = agencyId,
                        status = ApplicationStatus.REJECTED.value).data!!
                val all = ArrayList<ApplicationResponse>()
                all.addAll(accept)
                all.addAll(reject)
                return all
            }
        }.build().asLiveData()
    }

    override suspend fun getManagementWaitApplications(agencyId: String): LiveData<Resource<List<ApplicationResponse>>> {
        return object : NetworkBoundNoCacheResource<List<ApplicationResponse>>() {
            override suspend fun createCallAsync(): List<ApplicationResponse> {
                val pending =
                    apiService.getManagementApplications(
                        status = ApplicationStatus.PENDING.value,
                        agencyId = agencyId
                    ).data!!
                val accept_replace =
                    apiService.getManagementApplications(
                        status = ApplicationStatus.ACCEPT_REPLACE.value,
                        agencyId = agencyId
                    ).data!!
                val all = ArrayList<ApplicationResponse>()
                all.addAll(pending)
                all.addAll(accept_replace)
                return all
            }
        }.build().asLiveData()
    }


    override suspend fun getManagementApplication(
        agencyId: String,
        applicationId: String
    ): LiveData<Resource<ApplicationResponse>> {
        return object : NetworkBoundNoCacheResource<ApplicationResponse>() {
            override suspend fun createCallAsync(): ApplicationResponse {
                return apiService.getManagementApplication(applicationId)
            }
        }.build().asLiveData()
    }


    override suspend fun acceptApplication(agencyId: String, applicationId: String): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.acceptApplication(agencyId,applicationId)
            }
        }.build().asLiveData()
    }

    override suspend fun rejectApplication(agencyId: String, applicationId: String): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.rejectApplication(agencyId, applicationId)
            }

        }.build().asLiveData()
    }
}