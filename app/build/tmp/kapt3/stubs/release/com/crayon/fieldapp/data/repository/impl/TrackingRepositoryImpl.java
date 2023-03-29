package com.crayon.fieldapp.data.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JQ\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/crayon/fieldapp/data/repository/impl/TrackingRepositoryImpl;", "Lcom/crayon/fieldapp/data/repository/TrackingRepository;", "apiService", "Lcom/crayon/fieldapp/data/remote/ApiService;", "userDao", "Lcom/crayon/fieldapp/data/local/dao/UserDao;", "(Lcom/crayon/fieldapp/data/remote/ApiService;Lcom/crayon/fieldapp/data/local/dao/UserDao;)V", "getListLocation", "Lcom/crayon/fieldapp/utils/Resource;", "", "Lcom/crayon/fieldapp/data/remote/response/TrackingResponse;", "agencyId", "", "userId", "startTime", "endTime", "skip", "", "take", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadLocation", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "lat", "lng", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class TrackingRepositoryImpl implements com.crayon.fieldapp.data.repository.TrackingRepository {
    private final com.crayon.fieldapp.data.remote.ApiService apiService = null;
    private final com.crayon.fieldapp.data.local.dao.UserDao userDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object uploadLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String lat, @org.jetbrains.annotations.NotNull()
    java.lang.String lng, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getListLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, int skip, int take, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.TrackingResponse>>> p6) {
        return null;
    }
    
    public TrackingRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.dao.UserDao userDao) {
        super();
    }
}