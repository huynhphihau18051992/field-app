package com.crayon.fieldapp.data.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJC\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\t0\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/crayon/fieldapp/data/repository/impl/AttendanceRepositoryImpl;", "Lcom/crayon/fieldapp/data/repository/AttendanceRepository;", "apiService", "Lcom/crayon/fieldapp/data/remote/ApiService;", "jobDao", "Lcom/crayon/fieldapp/data/local/dao/JobDao;", "(Lcom/crayon/fieldapp/data/remote/ApiService;Lcom/crayon/fieldapp/data/local/dao/JobDao;)V", "getManagementAttendance", "Landroidx/lifecycle/LiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/AttendanceResponse;", "attendanceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManagementAttendances", "", "agencyId", "projectId", "startTime", "endTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class AttendanceRepositoryImpl implements com.crayon.fieldapp.data.repository.AttendanceRepository {
    private final com.crayon.fieldapp.data.remote.ApiService apiService = null;
    private final com.crayon.fieldapp.data.local.dao.JobDao jobDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getManagementAttendances(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.NotNull()
    java.lang.String endTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.AttendanceResponse>>>> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getManagementAttendance(@org.jetbrains.annotations.NotNull()
    java.lang.String attendanceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.AttendanceResponse>>> p1) {
        return null;
    }
    
    public AttendanceRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.dao.JobDao jobDao) {
        super();
    }
}