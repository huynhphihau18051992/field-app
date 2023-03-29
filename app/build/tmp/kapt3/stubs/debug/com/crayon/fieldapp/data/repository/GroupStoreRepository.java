package com.crayon.fieldapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ)\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J+\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u001b0\u001a2\u0006\u0010\u000e\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ3\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u001b0\u001a2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010 \u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/crayon/fieldapp/data/repository/GroupStoreRepository;", "", "deleteAllLocal", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGroupLocal", "group", "Lcom/crayon/fieldapp/data/model/GroupStore;", "(Lcom/crayon/fieldapp/data/model/GroupStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroup", "Lcom/crayon/fieldapp/data/remote/response/GroupStoreResponse;", "agencyId", "groupId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroupListLocal", "", "getGroupLocal", "getGroupPageLocal", "pageSize", "", "pageIndex", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroups", "Landroidx/lifecycle/LiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "insertLocal", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeGroup", "updateLocal", "app_debug"})
public abstract interface GroupStoreRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGroups(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.GroupStoreResponse>>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.GroupStoreResponse>>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.data.remote.response.GroupStoreResponse> p2);
    
    /**
     * local job db functions
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGroupListLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.GroupStore>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGroupLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.data.model.GroupStore> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.GroupStore group, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crayon.fieldapp.data.model.GroupStore> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.GroupStore group, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteGroupLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.GroupStore group, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteGroupLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGroupPageLocal(int pageSize, int pageIndex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.GroupStore>> p2);
}