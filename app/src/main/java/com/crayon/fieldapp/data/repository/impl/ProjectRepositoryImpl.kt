package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.ProjectDao
import com.crayon.fieldapp.data.model.Project
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.request.ListIdRequest
import com.crayon.fieldapp.data.remote.response.*
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.Resource


class ProjectRepositoryImpl(
    private val apiService: ApiService,
    private val projectDao: ProjectDao
) : ProjectRepository {

    override suspend fun getProjects(agencyId: String): LiveData<Resource<List<ProjectResponse>>> {
        return object : NetworkBoundNoCacheResource<List<ProjectResponse>>() {
            override suspend fun createCallAsync(): List<ProjectResponse> {
                return apiService.getProjects(agencyId, taskType = 0).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getProjectsByStatus(
        agencyId: String,
        status: String?,
        type: Int
    ): LiveData<Resource<List<ProjectResponse>>> {
        return object : NetworkBoundNoCacheResource<List<ProjectResponse>>() {
            override suspend fun createCallAsync(): List<ProjectResponse> {
                return apiService.getProjects(
                    agencyId = agencyId,
                    status = status,
                    taskType = type
                ).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun searchProjectsByName(
        agencyId: String,
        name: String,
        status: String?
    ): LiveData<Resource<List<ProjectResponse>>> {
        return object : NetworkBoundNoCacheResource<List<ProjectResponse>>() {
            override suspend fun createCallAsync(): List<ProjectResponse> {
                return apiService.searchProjectsByName(
                    agencyId = agencyId,
                    project = name,
                    status = status
                ).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getPicProjectByStatus(status: String): LiveData<Resource<List<PicProjectResponse>>> {
        return object : NetworkBoundNoCacheResource<List<PicProjectResponse>>() {
            override suspend fun createCallAsync(): List<PicProjectResponse> {
                return apiService.getPicProjects(status = status).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getPicProjectByAgency(agencyId: String): LiveData<Resource<List<PicProjectResponse>>> {
        return object : NetworkBoundNoCacheResource<List<PicProjectResponse>>() {
            override suspend fun createCallAsync(): List<PicProjectResponse> {
                return apiService.getPicProjects(agencyId = agencyId).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getPicMemberOfProject(projectId: String): LiveData<Resource<List<MemberResponse>>> {
        return object : NetworkBoundNoCacheResource<List<MemberResponse>>() {
            override suspend fun createCallAsync(): List<MemberResponse> {
                return apiService.getPicMemberOfProject(projectId).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getPicProjects(): LiveData<Resource<List<PicProjectResponse>>> {
        return object : NetworkBoundNoCacheResource<List<PicProjectResponse>>() {
            override suspend fun createCallAsync(): List<PicProjectResponse> {
                return apiService.getPicProjects().data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getProject(
        agencyId: String,
        projectId: String
    ): LiveData<Resource<ProjectResponse>> {
        return object : NetworkBoundNoCacheResource<ProjectResponse>() {
            override suspend fun createCallAsync(): ProjectResponse {
                return apiService.getProject(agencyId, projectId)
            }

        }.build().asLiveData()
    }

    override suspend fun getMemberOfProject(
        agencyId: String,
        projectId: String
    ): LiveData<Resource<List<MemberResponse>>> {
        return object : NetworkBoundNoCacheResource<List<MemberResponse>>() {
            override suspend fun createCallAsync(): List<MemberResponse> {
                return apiService.getMemberOfProject(agencyId, projectId).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun getStoreOfProject(
        agencyId: String,
        projectId: String
    ): LiveData<Resource<List<StoreOfProjectResponse>>> {
        return object : NetworkBoundNoCacheResource<List<StoreOfProjectResponse>>() {
            override suspend fun createCallAsync(): List<StoreOfProjectResponse> {
                return apiService.getStoreOfProject(agencyId, projectId).data!!
            }

        }.build().asLiveData()
    }

    override suspend fun addStoreToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.addStoreToProject(agencyId, projectId, bodyRequest)
            }

        }.build().asLiveData()
    }

    override suspend fun addMemberToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.addUserToProject(agencyId, projectId, bodyRequest)
            }

        }.build().asLiveData()
    }

    override suspend fun removeMemberToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.removeUserToProject(agencyId, projectId, bodyRequest)
            }

        }.build().asLiveData()
    }

    override suspend fun removeUserToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.removeUserToProject(agencyId, projectId, bodyRequest)
            }

        }.build().asLiveData()
    }

    override suspend fun removeStoreToProject(
        agencyId: String,
        projectId: String,
        bodyRequest: ListIdRequest
    ): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.removeStoreToProject(agencyId, projectId, bodyRequest)
            }

        }.build().asLiveData()
    }

    override suspend fun getProjectSummary(
        agencyId: String,
        projectId: String
    ): Resource<ProjectSummaryResponse> {
        val result = apiService.getProjectSummary(agencyId = agencyId, projectId = projectId)
        return Resource.success(result)
    }

    override suspend fun getProjectSummaryCustomer(
        agencyId: String,
        projectId: String
    ): Resource<ArrayList<CustomerResponse>> {
        val result =
            apiService.getProjectSummaryCustomer(agencyId = agencyId, projectId = projectId)
        return Resource.success(result)
    }

    override suspend fun getProjectSummaryPromotion(
        agencyId: String,
        projectId: String
    ): Resource<ArrayList<SummaryPromotionResponse>> {
        val result =
            apiService.getProjectSummaryPromotion(agencyId = agencyId, projectId = projectId)
        return Resource.success(result)
    }

    override suspend fun getProjectSummaryGift(
        agencyId: String,
        projectId: String
    ): Resource<ArrayList<SummaryGiftResponse>> {
        val result = apiService.getProjectSummaryGift(agencyId = agencyId, projectId = projectId)
        return Resource.success(result)
    }

    override suspend fun getProjectListLocal(): List<Project>? {
        return projectDao.getProjects()
    }

    override suspend fun getProjectLocal(id: String): Project? {
        return projectDao.getProject(id)
    }

    override suspend fun insertLocal(project: Project) {
        return projectDao.insert(project)
    }

    override suspend fun insertLocal(list: List<Project>) {
        return projectDao.insert(list)
    }

    override suspend fun updateLocal(project: Project) {
        return projectDao.update(project)
    }

    override suspend fun deleteProjectLocal(project: Project) {
        return projectDao.deleteProject(project)
    }

    override suspend fun deleteProjectLocal(id: String) {
        return projectDao.deleteProject(id)
    }

    override suspend fun deleteAllLocal() {
        return projectDao.deleteAll()
    }

    override suspend fun getProjectPageLocal(pageSize: Int, pageIndex: Int): List<Project>? {
        return projectDao.getProjectPage(pageSize, pageIndex)
    }

}