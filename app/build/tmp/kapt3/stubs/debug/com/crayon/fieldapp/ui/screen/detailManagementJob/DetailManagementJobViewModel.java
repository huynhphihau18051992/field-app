package com.crayon.fieldapp.ui.screen.detailManagementJob;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailManagementJob/DetailManagementJobViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "jobRepository", "Lcom/crayon/fieldapp/data/repository/JobRepository;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/JobRepository;Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_job", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/JobResponse;", "_removeTask", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "_task", "", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "isRemoveTask", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "job", "getJob", "jobSource", "removeTaskSource", "taskSource", "tasks", "getTasks", "getDetailJob", "Lkotlinx/coroutines/Job;", "agencyId", "", "jobId", "getListTask", "removeTask", "app_debug"})
public final class DetailManagementJobViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>> _job = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>> jobSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> _task = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> taskSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> _removeTask = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> removeTaskSource;
    private final com.crayon.fieldapp.data.repository.JobRepository jobRepository = null;
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>> getJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDetailJob(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getListTask(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> isRemoveTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job removeTask(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId) {
        return null;
    }
    
    public DetailManagementJobViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.JobRepository jobRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}