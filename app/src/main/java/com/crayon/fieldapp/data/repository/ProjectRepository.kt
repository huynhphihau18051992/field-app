package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.model.Project
import com.crayon.fieldapp.data.remote.request.ListIdRequest
import com.crayon.fieldapp.data.remote.response.*
import com.crayon.fieldapp.utils.Resource


interface ProjectRepository {
    suspend fun getProjects(agencyId: String): LiveData<Resource<List<ProjectResponse>>>

    suspend fun getProjectsByStatus(
        agencyId: String,
        status: String? = null,
        type: Int
    ): LiveData<Resource<List<ProjectResponse>>>

    suspend fun searchProjectsByName(
        agencyId: String,
        name: String,
        status: String? = null
    ): LiveData<Resource<List<ProjectResponse>>>

    suspend fun getPicProjectByStatus(
        status: String
    ): LiveData<Resource<List<PicProjectResponse>>>

    suspend fun getPicProjectByAgency(
        agencyId: String
    ): LiveData<Resource<List<PicProjectResponse>>>

    suspend fun getPicMemberOfProject(
        agencyId: String
    ): LiveData<Resource<List<MemberResponse>>>

    suspend fun getPicProjects(): LiveData<Resource<List<PicProjectResponse>>>

    suspend fun getProject(agencyId: String, projectId: String): LiveData<Resource<ProjectResponse>>

    suspend fun getMemberOfProject(
        agencyId: String,
        projectId: String
    ): LiveData<Resource<List<MemberResponse>>>

    suspend fun getStoreOfProject(
        agencyId: String,
        projectId: String
    ): LiveData<Resource<List<StoreOfProjectResponse>>>

    suspend fun addStoreToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun addMemberToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun removeMemberToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun removeUserToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun removeStoreToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun getProjectSummary(
        agencyId: String,
        projectId: String
    ): Resource<ProjectSummaryResponse>

    suspend fun getProjectSummaryCustomer(
        agencyId: String,
        projectId: String
    ): Resource<ArrayList<CustomerResponse>>

    suspend fun getProjectSummaryPromotion(
        agencyId: String,
        projectId: String
    ): Resource<ArrayList<SummaryPromotionResponse>>

    suspend fun getProjectSummaryGift(
        agencyId: String,
        projectId: String
    ): Resource<ArrayList<SummaryGiftResponse>>

    /**
     * local job db functions
     */
    suspend fun getProjectListLocal(): List<Project>?

    suspend fun getProjectLocal(id: String): Project?

    suspend fun insertLocal(Project: Project)

    suspend fun insertLocal(list: List<Project>)

    suspend fun updateLocal(Project: Project)

    suspend fun deleteProjectLocal(Project: Project)

    suspend fun deleteProjectLocal(id: String)

    suspend fun deleteAllLocal()

    suspend fun getProjectPageLocal(pageSize: Int, pageIndex: Int): List<Project>?
}