package com.crayon.fieldapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00028\u0000H\u00a5@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u000e\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0003R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/crayon/fieldapp/utils/NetworkBoundNoCacheResource;", "ResultType", "", "()V", "result", "Landroidx/lifecycle/MutableLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "supervisorJob", "Lkotlinx/coroutines/CompletableJob;", "asLiveData", "Landroidx/lifecycle/LiveData;", "build", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCallAsync", "fetchFromNetwork", "", "setValue", "newValue", "app_debug"})
public abstract class NetworkBoundNoCacheResource<ResultType extends java.lang.Object> {
    private final androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.utils.Resource<ResultType>> result = null;
    private final kotlinx.coroutines.CompletableJob supervisorJob = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object build(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.NetworkBoundNoCacheResource<ResultType>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    @androidx.annotation.MainThread()
    private final void setValue(com.crayon.fieldapp.utils.Resource<? extends ResultType> newValue) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.MainThread()
    protected abstract java.lang.Object createCallAsync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ResultType> p0);
    
    public NetworkBoundNoCacheResource() {
        super();
    }
}