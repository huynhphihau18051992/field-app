package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.crayon.fieldapp.data.JobPagingSource
import com.crayon.fieldapp.data.local.dao.JobDao
import com.crayon.fieldapp.data.model.Job
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.ApiService.Companion.NETWORK_PAGE_SIZE
import com.crayon.fieldapp.data.remote.request.CreateJobForm
import com.crayon.fieldapp.data.remote.request.CreateJobRequest
import com.crayon.fieldapp.data.remote.request.ListIdRequest
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.flow.Flow

class JobRepositoryImpl(
    private val apiService: ApiService,
    private val jobDao: JobDao
) : JobRepository {
    override suspend fun getTodayPicJob(
        startTime: String,
        endTime: String,
        skip: Int
    ): Resource<List<JobResponse>> {
        val result = apiService.getPicJobs(startTime = startTime, endTime = endTime, skip = skip, take = 200)
        return Resource.success(result.data)
    }

    override suspend fun getManagementJobAtStore(
        agencyId: String,
        projectId: String,
        storeId: String,
        startTime: String,
        endTime: String
    ): LiveData<Resource<List<JobResponse>>> {
        return object : NetworkBoundNoCacheResource<List<JobResponse>>() {
            override suspend fun createCallAsync(): List<JobResponse> {
                return apiService.getManagementJobs(
                    agencyId = agencyId,
                    startTime = startTime,
                    endTime = endTime,
                    project = projectId.toInt(),
                    store = storeId.toInt()
                ).data!!
            }

        }.build().asLiveData()
    }

    override fun getPicJobsByStatus(status: String): Flow<PagingData<JobResponse>> {
        return Pager(
            config = PagingConfig(pageSize = NETWORK_PAGE_SIZE, enablePlaceholders = false),
            pagingSourceFactory = { JobPagingSource(apiService, status) }
        ).flow
    }

    override suspend fun getPicJobsByProject(projectId: String): LiveData<Resource<List<JobResponse>>> {
        return object : NetworkBoundNoCacheResource<List<JobResponse>>() {
            override suspend fun createCallAsync(): List<JobResponse> {
                return apiService.getPicJobs(
                    project = projectId.toInt()
                ).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getPicJobs(
        projectId: String?,
        status: String?
    ): LiveData<Resource<List<JobResponse>>> {
        return object : NetworkBoundNoCacheResource<List<JobResponse>>() {
            override suspend fun createCallAsync(): List<JobResponse> {
                return apiService.getPicJobs(
                    project = projectId?.toInt(),
                    status = status
                ).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getPicJob(jobId: String): LiveData<Resource<JobResponse>> {
        return object : NetworkBoundNoCacheResource<JobResponse>() {
            override suspend fun createCallAsync(): JobResponse {
                return apiService.getPicJob(jobId)
            }

        }.build().asLiveData()
    }

    override suspend fun getManagementJob(
        agencyId: String,
        jobId: String
    ): LiveData<Resource<JobResponse>> {
        return object : NetworkBoundNoCacheResource<JobResponse>() {
            override suspend fun createCallAsync(): JobResponse {
                return apiService.getManagementJob(agencyId, jobId)
            }

        }.build().asLiveData()
    }

    override suspend fun createManagementJob(form: CreateJobForm): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                val bodyRequest = CreateJobRequest(
                    storeId = form.storeId!!.toInt(),
                    picId = form.picId!!.toInt(),
                    name = "Job",
                    description = "description",
                    role = form.role.toString(),
                    start_time = form.shift_start.toString(),
                    end_time = form.shift_end.toString()
                )
                return apiService.createManagementJob(
                    form.agencyId.toString(),
                    form.projectId.toString(),
                    bodyRequest
                )
            }

        }.build().asLiveData()
    }

    override suspend fun getPicJobRequestsByStatus(status: String): Resource<List<JobResponse>> {
        return Resource.success(apiService.getPicJobRequests(status = status).data)
    }

    override suspend fun acceptJobRequests(ids: ArrayList<String>): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                val listIds = ListIdRequest(ids)
                return apiService.acceptJobRequest(listIds)
            }

        }.build().asLiveData()
    }

    override suspend fun rejectJobRequests(ids: ArrayList<String>): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                val listIds = ListIdRequest(ids)
                return apiService.rejectJobRequest(listIds)
            }

        }.build().asLiveData()
    }

    override suspend fun removeManagementJob(
        agencyId: String,
        jobId: String
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.removeManagementJob(agencyId, jobId)
            }

        }.build().asLiveData()
    }

    override suspend fun getJobListLocal(): List<Job>? {
        return jobDao.getJobs()
    }

    override suspend fun getJobLocal(id: String): Job? {
        return jobDao.getJob(id)
    }

    override suspend fun insertLocal(job: Job) {
        return jobDao.insert(job)
    }

    override suspend fun insertLocal(list: List<Job>) {
        return jobDao.insert(list)
    }

    override suspend fun updateLocal(job: Job) {
        return jobDao.update(job)
    }

    override suspend fun deleteJobLocal(job: Job) {
        return jobDao.deleteJob(job)
    }

    override suspend fun deleteJobLocal(id: String) {
        return jobDao.deleteJob(id)
    }

    override suspend fun deleteAllLocal() {
        return jobDao.deleteAll()
    }

    override suspend fun getJobPageLocal(pageSize: Int, pageIndex: Int): List<Job>? {
        return jobDao.getJobPage(pageSize, pageIndex)
    }

}