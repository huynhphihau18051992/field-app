package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.remote.response.AttendanceResponse
import com.crayon.fieldapp.utils.Resource

interface AttendanceRepository {
    suspend fun getManagementAttendances(
        agencyId: String,
        projectId: String,
        startTime: String,
        endTime: String
    ): LiveData<Resource<List<AttendanceResponse>>>

    suspend fun getManagementAttendance(
        attendanceId: String
    ): LiveData<Resource<AttendanceResponse>>
}