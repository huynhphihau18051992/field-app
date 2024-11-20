package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.MemberRequestResponse
import com.crayon.fieldapp.utils.Resource


interface MemberInvitationRepository {

    suspend fun getPicMembers(
        status: String
    ): Resource<List<MemberRequestResponse>>

    suspend fun acceptPicMember(
        memberRequestId: String
    ): Resource<GetMessageResponse>

    suspend fun rejectPicMember(
        memberRequestId: String
    ): Resource<GetMessageResponse>
}