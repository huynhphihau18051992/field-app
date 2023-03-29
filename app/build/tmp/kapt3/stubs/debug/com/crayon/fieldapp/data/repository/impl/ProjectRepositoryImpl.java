package com.crayon.fieldapp.data.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J5\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J5\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0012\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ3\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ+\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\t0\b2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ+\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ+\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\t0\b2\u0006\u0010#\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ#\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001c0\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J-\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001b\u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ)\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\'\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ7\u00100\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`30\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ7\u00104\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020501j\b\u0012\u0004\u0012\u000205`30\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ7\u00106\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020701j\b\u0012\u0004\u0012\u000207`30\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ+\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001c0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ=\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001c0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010:\u001a\u00020+H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J3\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u001c0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010>\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010>\u001a\u00020\u00132\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@J5\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J5\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J5\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J=\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u001c0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010E\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJ\u0019\u0010G\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006H"}, d2 = {"Lcom/crayon/fieldapp/data/repository/impl/ProjectRepositoryImpl;", "Lcom/crayon/fieldapp/data/repository/ProjectRepository;", "apiService", "Lcom/crayon/fieldapp/data/remote/ApiService;", "projectDao", "Lcom/crayon/fieldapp/data/local/dao/ProjectDao;", "(Lcom/crayon/fieldapp/data/remote/ApiService;Lcom/crayon/fieldapp/data/local/dao/ProjectDao;)V", "addMemberToProject", "Landroidx/lifecycle/LiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "agencyId", "", "projectId", "bodyRequest", "Lcom/crayon/fieldapp/data/remote/request/ListIdRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/request/ListIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addStoreToProject", "deleteAllLocal", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProjectLocal", "project", "Lcom/crayon/fieldapp/data/model/Project;", "(Lcom/crayon/fieldapp/data/model/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMemberOfProject", "", "Lcom/crayon/fieldapp/data/remote/response/MemberResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPicMemberOfProject", "getPicProjectByAgency", "Lcom/crayon/fieldapp/data/remote/response/PicProjectResponse;", "getPicProjectByStatus", "status", "getPicProjects", "getProject", "Lcom/crayon/fieldapp/data/remote/response/ProjectResponse;", "getProjectListLocal", "getProjectLocal", "getProjectPageLocal", "pageSize", "", "pageIndex", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectSummary", "Lcom/crayon/fieldapp/data/remote/response/ProjectSummaryResponse;", "getProjectSummaryCustomer", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/CustomerResponse;", "Lkotlin/collections/ArrayList;", "getProjectSummaryGift", "Lcom/crayon/fieldapp/data/remote/response/SummaryGiftResponse;", "getProjectSummaryPromotion", "Lcom/crayon/fieldapp/data/remote/response/SummaryPromotionResponse;", "getProjects", "getProjectsByStatus", "type", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStoreOfProject", "Lcom/crayon/fieldapp/data/remote/response/StoreOfProjectResponse;", "insertLocal", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeMemberToProject", "removeStoreToProject", "removeUserToProject", "searchProjectsByName", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocal", "app_debug"})
public final class ProjectRepositoryImpl implements com.crayon.fieldapp.data.repository.ProjectRepository {
    private final com.crayon.fieldapp.data.remote.ApiService apiService = null;
    private final com.crayon.fieldapp.data.local.dao.ProjectDao projectDao = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProjects(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.ProjectResponse>>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProjectsByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.Nullable()
    java.lang.String status, int type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.ProjectResponse>>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchProjectsByName(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.ProjectResponse>>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicProjectByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicProjectByAgency(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicMemberOfProject(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>>>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPicProjects(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.PicProjectResponse>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.ProjectResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getMemberOfProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getStoreOfProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.StoreOfProjectResponse>>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addStoreToProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.ListIdRequest bodyRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addMemberToProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.ListIdRequest bodyRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeMemberToProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.ListIdRequest bodyRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeUserToProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.ListIdRequest bodyRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeStoreToProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.request.ListIdRequest bodyRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProjectSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.ProjectSummaryResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProjectSummaryCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.ArrayList<com.crayon.fieldapp.data.remote.response.CustomerResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProjectSummaryPromotion(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.ArrayList<com.crayon.fieldapp.data.remote.response.SummaryPromotionResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProjectSummaryGift(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.ArrayList<com.crayon.fieldapp.data.remote.response.SummaryGiftResponse>>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProjectListLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.Project>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getProjectLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.data.model.Project> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Project project, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crayon.fieldapp.data.model.Project> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Project project, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteProjectLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Project project, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteProjectLocal(@org.jetbrains.annotations.NotNull()
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
    public java.lang.Object getProjectPageLocal(int pageSize, int pageIndex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.Project>> p2) {
        return null;
    }
    
    public ProjectRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.dao.ProjectDao projectDao) {
        super();
    }
}