package com.crayon.fieldapp.ui.screen.createApplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u001a\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020+J\u000e\u0010/\u001a\u00020+2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020+2\u0006\u00100\u001a\u000201J\u000e\u00103\u001a\u00020+2\u0006\u00104\u001a\u000201R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00120\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001dR \u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u000f0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u001dR \u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00120\u000f0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u000f0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001dR \u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00120\u000f0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00120\u000f0\u001b8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001dR \u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00120\u000f0\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/createApplication/CreateApplicationViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "roleRepository", "Lcom/crayon/fieldapp/data/repository/RoleRepository;", "projectRepository", "Lcom/crayon/fieldapp/data/repository/ProjectRepository;", "jobRepository", "Lcom/crayon/fieldapp/data/repository/JobRepository;", "applicationRepository", "Lcom/crayon/fieldapp/data/repository/ApplicationRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/RoleRepository;Lcom/crayon/fieldapp/data/repository/ProjectRepository;Lcom/crayon/fieldapp/data/repository/JobRepository;Lcom/crayon/fieldapp/data/repository/ApplicationRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_createApplication", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "_listAgency", "", "Lcom/crayon/fieldapp/data/remote/response/RoleResponse;", "_listJob", "Lcom/crayon/fieldapp/data/remote/response/JobResponse;", "_listMember", "Lcom/crayon/fieldapp/data/remote/response/MemberResponse;", "_listProject", "Lcom/crayon/fieldapp/data/remote/response/PicProjectResponse;", "createApplication", "Landroidx/lifecycle/LiveData;", "getCreateApplication", "()Landroidx/lifecycle/LiveData;", "createApplicationSource", "listAgency", "getListAgency", "listAgencySource", "listJob", "getListJob", "listJobSource", "listMember", "getListMember", "listMemberSource", "listProject", "getListProject", "listProjectSource", "Lkotlinx/coroutines/Job;", "form", "Lcom/crayon/fieldapp/data/remote/request/CreateApplicationForm;", "getListRole", "getMemberOfProject", "projectId", "", "getMyJobOfProject", "getProjectByAgency", "agencyId", "app_release"})
public final class CreateApplicationViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.RoleResponse>>> _listAgency = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.RoleResponse>>> listAgencySource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>> _listProject = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>> listProjectSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>>> _listMember = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>>> listMemberSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>> _listJob = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>> listJobSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> _createApplication = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> createApplicationSource;
    private final com.crayon.fieldapp.data.repository.RoleRepository roleRepository = null;
    private final com.crayon.fieldapp.data.repository.ProjectRepository projectRepository = null;
    private final com.crayon.fieldapp.data.repository.JobRepository jobRepository = null;
    private final com.crayon.fieldapp.data.repository.ApplicationRepository applicationRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.RoleResponse>>> getListAgency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getListRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>> getListProject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProjectByAgency(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>>> getListMember() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMemberOfProject(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>> getListJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMyJobOfProject(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> getCreateApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job createApplication(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.CreateApplicationForm form) {
        return null;
    }
    
    public CreateApplicationViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.RoleRepository roleRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.ProjectRepository projectRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.JobRepository jobRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.ApplicationRepository applicationRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}