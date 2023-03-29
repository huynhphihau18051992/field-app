package com.crayon.fieldapp.ui.screen.detailPicJob;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailPicJob/DetailPicJobViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "jobRepository", "Lcom/crayon/fieldapp/data/repository/JobRepository;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/JobRepository;Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_job", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/JobResponse;", "_task", "", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "job", "Landroidx/lifecycle/LiveData;", "getJob", "()Landroidx/lifecycle/LiveData;", "jobSource", "taskSource", "tasks", "getTasks", "getDetailJob", "Lkotlinx/coroutines/Job;", "jobId", "", "getListTask", "app_release"})
public final class DetailPicJobViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>> _job = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>> jobSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> _task = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> taskSource;
    private final com.crayon.fieldapp.data.repository.JobRepository jobRepository = null;
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>> getJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDetailJob(@org.jetbrains.annotations.NotNull()
    java.lang.String jobId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getListTask(@org.jetbrains.annotations.NotNull()
    java.lang.String jobId) {
        return null;
    }
    
    public DetailPicJobViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.JobRepository jobRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}