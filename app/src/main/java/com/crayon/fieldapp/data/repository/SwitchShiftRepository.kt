package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.remote.response.ApplicationResponse
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.MemberRequestResponse
import com.crayon.fieldapp.utils.Resource


interface SwitchShiftRepository {

    suspend fun getSwitchShift(
        status: String
    ): Resource<List<ApplicationResponse>>

    suspend fun acceptSwitchShift(
        requestIds: ArrayList<String>
    ): Resource<GetMessageResponse>

    suspend fun rejectSwitchShift(
        requestIds: ArrayList<String>
    ): Resource<GetMessageResponse>
}