package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import com.crayon.fieldapp.data.model.Job
import com.crayon.fieldapp.data.remote.request.CreateJobForm
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.flow.Flow


interface JobRepository {

    suspend fun getTodayPicJob(
        startTime: String,
        endTime: String,
        skip: Int
    ): Resource<List<JobResponse>>

    suspend fun getManagementJobAtStore(
        agencyId: String,
        projectId: String,
        storeId: String,
        startTime: String,
        endTime: String
    ): LiveData<Resource<List<JobResponse>>>

    fun getPicJobsByStatus(status: String): Flow<PagingData<JobResponse>>

    suspend fun getPicJobsByProject(projectId: String): LiveData<Resource<List<JobResponse>>>

    suspend fun getPicJobs(
        projectId: String? = null,
        status: String? = null
    ): LiveData<Resource<List<JobResponse>>>

    suspend fun getPicJob(jobId: String): LiveData<Resource<JobResponse>>

    suspend fun getManagementJob(agencyId: String, jobId: String): LiveData<Resource<JobResponse>>

    suspend fun createManagementJob(form: CreateJobForm): LiveData<Resource<GetMessageResponse>>

    suspend fun getPicJobRequestsByStatus(status: String): Resource<List<JobResponse>>

    suspend fun acceptJobRequests(ids: ArrayList<String>): LiveData<Resource<GetMessageResponse>>

    suspend fun rejectJobRequests(ids: ArrayList<String>): LiveData<Resource<GetMessageResponse>>

    suspend fun removeManagementJob(
        agencyId: String,
        jobId: String
    ): LiveData<Resource<GetMessageResponse>>

    /**
     * local job db functions
     */
    suspend fun getJobListLocal(): List<Job>?

    suspend fun getJobLocal(id: String): Job?

    suspend fun insertLocal(Job: Job)

    suspend fun insertLocal(list: List<Job>)

    suspend fun updateLocal(Job: Job)

    suspend fun deleteJobLocal(Job: Job)

    suspend fun deleteJobLocal(id: String)

    suspend fun deleteAllLocal()

    suspend fun getJobPageLocal(pageSize: Int, pageIndex: Int): List<Job>?
}