package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.JobDao
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.response.AttendanceResponse
import com.crayon.fieldapp.data.repository.AttendanceRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.Resource

class AttendanceRepositoryImpl(
    private val apiService: ApiService,
    private val jobDao: JobDao
) : AttendanceRepository {


    override suspend fun getManagementAttendances(
        agencyId: String,
        projectId: String,
        startTime: String,
        endTime: String
    ): LiveData<Resource<List<AttendanceResponse>>> {
        return object : NetworkBoundNoCacheResource<List<AttendanceResponse>>() {
            override suspend fun createCallAsync(): List<AttendanceResponse> {
                return apiService.getManagementAttendances(
                    agencyId = agencyId,
                    project = projectId
                ).data!!
            }

        }.build().asLiveData()
    }


    override suspend fun getManagementAttendance(attendanceId: String): LiveData<Resource<AttendanceResponse>> {
        return object : NetworkBoundNoCacheResource<AttendanceResponse>() {
            override suspend fun createCallAsync(): AttendanceResponse {
                return apiService.getManagementAttendance(attendanceId)
            }

        }.build().asLiveData()
    }


}