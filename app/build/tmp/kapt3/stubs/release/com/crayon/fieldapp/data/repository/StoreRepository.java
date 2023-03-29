package com.crayon.fieldapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ-\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ)\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ+\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u000e0\r2\u0006\u0010\u0010\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/crayon/fieldapp/data/repository/StoreRepository;", "", "deleteAllLocal", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStoreLocal", "Store", "Lcom/crayon/fieldapp/data/model/Store;", "(Lcom/crayon/fieldapp/data/model/Store;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStore", "Landroidx/lifecycle/LiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/StoreResponse;", "agencyId", "storeId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStoreListLocal", "", "getStoreLocal", "getStorePageLocal", "pageSize", "", "pageIndex", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStores", "insertLocal", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocal", "app_release"})
public abstract interface StoreRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStores(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.StoreResponse>>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStore(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String storeId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.StoreResponse>>> p2);
    
    /**
     * local job db functions
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStoreListLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.Store>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStoreLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.data.model.Store> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Store Store, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertLocal(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crayon.fieldapp.data.model.Store> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Store Store, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteStoreLocal(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.Store Store, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteStoreLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getStorePageLocal(int pageSize, int pageIndex, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.Store>> p2);
}