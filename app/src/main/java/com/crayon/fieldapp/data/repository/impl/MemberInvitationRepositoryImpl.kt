package com.crayon.fieldapp.data.repository.impl

import com.crayon.fieldapp.data.local.dao.JobDao
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.MemberRequestResponse
import com.crayon.fieldapp.data.repository.MemberInvitationRepository
import com.crayon.fieldapp.utils.Resource

class MemberInvitationRepositoryImpl(
    private val apiService: ApiService,
    private val jobDao: JobDao
) : MemberInvitationRepository {

    override suspend fun getPicMembers(status: String): Resource<List<MemberRequestResponse>> {
        val result = apiService.getPicMemberInvites(status = status).data!!
        return Resource.success(result)
    }

    override suspend fun acceptPicMember(memberRequestId: String): Resource<GetMessageResponse> {
        val result = apiService.acceptPicMemberInvites(memberRequestId)
        return Resource.success(result)
    }

    override suspend fun rejectPicMember(memberRequestId: String): Resource<GetMessageResponse> {
        val result = apiService.rejectPicMemberInvites(memberRequestId)
        return Resource.success(result)
    }
}