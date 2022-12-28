package com.crayon.fieldapp.data.repository.impl

import com.crayon.fieldapp.data.local.dao.JobDao
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.request.ListIdRequest
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.repository.SwitchShiftRepository
import com.crayon.fieldapp.utils.Resource

class SwitchShiftRepositoryImpl(
    private val apiService: ApiService,
    private val jobDao: JobDao
) : SwitchShiftRepository {


    override suspend fun getSwitchShift(status: String): Resource<List<ApplicationResponse>> {
        val result = apiService.getSwitchShifts(status = status).data!!
        return Resource.success(result)
    }

    override suspend fun acceptSwitchShift(requestIds: ArrayList<String>): Resource<GetMessageResponse> {
        val ids = ListIdRequest(ids = requestIds)
        val result = apiService.acceptSwitchShiftRequest(ids)
        return Resource.success(result)
    }

    override suspend fun rejectSwitchShift(requestIds: ArrayList<String>): Resource<GetMessageResponse> {
        val ids = ListIdRequest(ids = requestIds)
        val result = apiService.rejectSwitchShiftRequest(ids)
        return Resource.success(result)
    }
}