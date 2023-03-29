package com.crayon.fieldapp.utils;

import java.lang.System;

/**
 * A generic class that can provide a resource backed by both the sqlite database and the network.
 *
 *
 * You can read more about it in the [Architecture
 * * Guide](https://developer.android.com/arch).
 * @param <ResultType>
 * @param <RequestType>
 * </RequestType></ResultType>
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u000bJ\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00028\u0001H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00028\u0000H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H%\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0003J\u0017\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u001eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/crayon/fieldapp/utils/NetworkBoundResource;", "ResultType", "RequestType", "", "()V", "result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "supervisorJob", "Lkotlinx/coroutines/CompletableJob;", "asLiveData", "Landroidx/lifecycle/LiveData;", "build", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCallAsync", "fetchFromNetwork", "", "dbResult", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFromDb", "processResponse", "response", "(Ljava/lang/Object;)Ljava/lang/Object;", "saveCallResults", "items", "setValue", "newValue", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.utils.Resource<ResultType>> result = null;
    private final kotlinx.coroutines.CompletableJob supervisorJob = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object build(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.NetworkBoundResource<ResultType, RequestType>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    @androidx.annotation.MainThread()
    private final void setValue(com.crayon.fieldapp.utils.Resource<? extends ResultType> newValue) {
    }
    
    @androidx.annotation.WorkerThread()
    protected abstract ResultType processResponse(RequestType response);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected abstract java.lang.Object saveCallResults(ResultType items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.annotation.MainThread()
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.MainThread()
    protected abstract java.lang.Object loadFromDb(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ResultType> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.MainThread()
    protected abstract java.lang.Object createCallAsync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super RequestType> p0);
    
    public NetworkBoundResource() {
        super();
    }
}