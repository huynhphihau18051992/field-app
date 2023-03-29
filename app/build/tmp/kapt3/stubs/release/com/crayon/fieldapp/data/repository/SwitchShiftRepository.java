package com.crayon.fieldapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\u0006\u0010\r\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/crayon/fieldapp/data/repository/SwitchShiftRepository;", "", "acceptSwitchShift", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "requestIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSwitchShift", "", "Lcom/crayon/fieldapp/data/remote/response/ApplicationResponse;", "status", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectSwitchShift", "app_release"})
public abstract interface SwitchShiftRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getSwitchShift(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<? extends java.util.List<com.crayon.fieldapp.data.remote.response.ApplicationResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object acceptSwitchShift(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> requestIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object rejectSwitchShift(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> requestIds, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> p1);
}