package com.crayon.fieldapp.ui.screen.selectProject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/selectProject/SelectProjectViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "projectRepository", "Lcom/crayon/fieldapp/data/repository/ProjectRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/ProjectRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_projects", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "", "Lcom/crayon/fieldapp/data/remote/response/PicProjectResponse;", "memberSource", "Landroidx/lifecycle/LiveData;", "projects", "getProjects", "()Landroidx/lifecycle/LiveData;", "getProject", "Lkotlinx/coroutines/Job;", "app_release"})
public final class SelectProjectViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>> _projects = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>> memberSource;
    private final com.crayon.fieldapp.data.repository.ProjectRepository projectRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>> getProjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProject() {
        return null;
    }
    
    public SelectProjectViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.ProjectRepository projectRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}