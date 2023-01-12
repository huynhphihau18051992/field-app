package com.crayon.fieldapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J)\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ-\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u00032\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$JK\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u00040\u00032\u0006\u0010\"\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u00032\u0006\u0010#\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u00042\u0006\u0010-\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J;\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u00040\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J+\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u00040\u00032\u0006\u0010&\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001c\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!02012\u0006\u0010-\u001a\u00020\bH&J5\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u00042\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u00104\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0019\u00106\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u00106\u001a\u00020\u00102\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J5\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ-\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010;\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006<"}, d2 = {"Lcom/crayon/fieldapp/data/repository/JobRepository;", "", "acceptJobRequests", "Landroidx/lifecycle/LiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "ids", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createManagementJob", "form", "Lcom/crayon/fieldapp/data/remote/request/CreateJobForm;", "(Lcom/crayon/fieldapp/data/remote/request/CreateJobForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllLocal", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteJobLocal", "Job", "Lcom/crayon/fieldapp/data/model/Job;", "(Lcom/crayon/fieldapp/data/model/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getJobListLocal", "", "getJobLocal", "getJobPageLocal", "pageSize", "", "pageIndex", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManagementJob", "Lcom/crayon/fieldapp/data/remote/response/JobResponse;", "agencyId", "jobId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManagementJobAtStore", "projectId", "storeId", "startTime", "endTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPicJob", "getPicJobRequestsByStatus", "status", "getPicJobs", "getPicJobsByProject", "getPicJobsByStatus", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getTodayPicJob", "skip", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLocal", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectJobRequests", "removeManagementJob", "updateLocal", "app_debug"})
public abstract interface JobRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTodayPicJob(@org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, int skip, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getManagementJobAtStore(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String storeId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>>> p5);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.crayon.fieldapp.data.remote.response.JobResponse>> getPicJobsByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicJobsByProject(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicJobs(@org.jetbrains.annotations.Nullable()
    java.lang.String projectId, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicJob(@org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getManagementJob(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createManagementJob(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.CreateJobForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPicJobRequestsByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.JobResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object acceptJobRequests(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> ids, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object rejectJobRequests(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> ids, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeManagementJob(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String jobId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p2);
    
    /**
     * local job db functions
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getJobListLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.Job>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getJobLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.data.model.Job> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Job Job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crayon.fieldapp.data.model.Job> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Job Job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteJobLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Job Job, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteJobLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getJobPageLocal(int pageSize, int pageIndex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.Job>> p2);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}