package com.crayon.fieldapp.data.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J5\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ)\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J-\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0\b2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)JK\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001e0\t0\b2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J%\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0\b2\u0006\u0010(\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ%\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001e0\t2\u0006\u00102\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ7\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001e0\t0\b2\b\u0010+\u001a\u0004\u0018\u00010\r2\b\u00102\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J+\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001e0\t0\b2\u0006\u0010+\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u001c\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&07062\u0006\u00102\u001a\u00020\rH\u0016J5\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001e0\t2\u0006\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r2\u0006\u00109\u001a\u00020\"H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J\u0019\u0010;\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010;\u001a\u00020\u00152\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J5\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010@\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lcom/crayon/fieldapp/data/repository/impl/JobRepositoryImpl;", "Lcom/crayon/fieldapp/data/repository/JobRepository;", "apiService", "Lcom/crayon/fieldapp/data/remote/ApiService;", "jobDao", "Lcom/crayon/fieldapp/data/local/dao/JobDao;", "(Lcom/crayon/fieldapp/data/remote/ApiService;Lcom/crayon/fieldapp/data/local/dao/JobDao;)V", "acceptJobRequests", "Landroidx/lifecycle/LiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "ids", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createManagementJob", "form", "Lcom/crayon/fieldapp/data/remote/request/CreateJobForm;", "(Lcom/crayon/fieldapp/data/remote/request/CreateJobForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllLocal", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteJobLocal", "job", "Lcom/crayon/fieldapp/data/model/Job;", "(Lcom/crayon/fieldapp/data/model/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getJobListLocal", "", "getJobLocal", "getJobPageLocal", "pageSize", "", "pageIndex", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManagementJob", "Lcom/crayon/fieldapp/data/remote/response/JobResponse;", "agencyId", "jobId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManagementJobAtStore", "projectId", "storeId", "startTime", "endTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPicJob", "getPicJobRequestsByStatus", "status", "getPicJobs", "getPicJobsByProject", "getPicJobsByStatus", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getTodayPicJob", "skip", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocal", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectJobRequests", "removeManagementJob", "updateLocal", "app_release"})
public final class JobRepositoryImpl implements com.crayon.fieldapp.data.repository.JobRepository {
    private final com.crayon.fieldapp.data.remote.ApiService apiService = null;
    private final com.crayon.fieldapp.data.local.dao.JobDao jobDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTodayPicJob(@org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, int skip, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getManagementJobAtStore(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String storeId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>>> p5) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.crayon.fieldapp.data.remote.response.JobResponse>> getPicJobsByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicJobsByProject(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicJobs(@org.jetbrains.annotations.Nullable()
    java.lang.String projectId, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicJob(@org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getManagementJob(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createManagementJob(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.CreateJobForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicJobRequestsByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object acceptJobRequests(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> ids, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object rejectJobRequests(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> ids, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeManagementJob(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getJobListLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.Job>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getJobLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.data.model.Job> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Job job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crayon.fieldapp.data.model.Job> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Job job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteJobLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Job job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteJobLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAllLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getJobPageLocal(int pageSize, int pageIndex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.Job>> p2) {
        return null;
    }
    
    public JobRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.dao.JobDao jobDao) {
        super();
    }
}