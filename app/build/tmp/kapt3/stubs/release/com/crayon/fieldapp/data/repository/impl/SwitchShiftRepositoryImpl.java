package com.crayon.fieldapp.data.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\b2\u0006\u0010\u0012\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/crayon/fieldapp/data/repository/impl/SwitchShiftRepositoryImpl;", "Lcom/crayon/fieldapp/data/repository/SwitchShiftRepository;", "apiService", "Lcom/crayon/fieldapp/data/remote/ApiService;", "jobDao", "Lcom/crayon/fieldapp/data/local/dao/JobDao;", "(Lcom/crayon/fieldapp/data/remote/ApiService;Lcom/crayon/fieldapp/data/local/dao/JobDao;)V", "acceptSwitchShift", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "requestIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSwitchShift", "", "Lcom/crayon/fieldapp/data/remote/response/ApplicationResponse;", "status", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectSwitchShift", "app_release"})
public final class SwitchShiftRepositoryImpl implements com.crayon.fieldapp.data.repository.SwitchShiftRepository {
    private final com.crayon.fieldapp.data.remote.ApiService apiService = null;
    private final com.crayon.fieldapp.data.local.dao.JobDao jobDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSwitchShift(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.ApplicationResponse>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object acceptSwitchShift(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> requestIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object rejectSwitchShift(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> requestIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p1) {
        return null;
    }
    
    public SwitchShiftRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.dao.JobDao jobDao) {
        super();
    }
}