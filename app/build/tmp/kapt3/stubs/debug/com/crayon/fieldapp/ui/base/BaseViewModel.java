package com.crayon.fieldapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010%\u001a\u00020\u0011J\b\u0010&\u001a\u00020\u0011H\u0014J\u0019\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0015J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020)H\u0016J\u0006\u0010.\u001a\u00020\u0011R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/KoinComponent;", "()V", "appPrefs", "Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "getAppPrefs", "()Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "appPrefs$delegate", "Lkotlin/Lazy;", "auth", "Lcom/crayon/fieldapp/data/repository/UserRepository;", "getAuth", "()Lcom/crayon/fieldapp/data/repository/UserRepository;", "auth$delegate", "connectTimeoutEvent", "Lcom/crayon/fieldapp/utils/SingleLiveEvent;", "", "getConnectTimeoutEvent", "()Lcom/crayon/fieldapp/utils/SingleLiveEvent;", "errorMessage", "", "getErrorMessage", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "forceUpdateAppEvent", "getForceUpdateAppEvent", "isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "noInternetConnectionEvent", "getNoInternetConnectionEvent", "serverMaintainEvent", "getServerMaintainEvent", "tokenExpiredEvent", "getTokenExpiredEvent", "hideLoading", "onCleared", "onLoadFail", "throwable", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "showError", "e", "showLoading", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements org.koin.core.KoinComponent {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy auth$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appPrefs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.utils.SingleLiveEvent<java.lang.String> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> noInternetConnectionEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> tokenExpiredEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> connectTimeoutEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> forceUpdateAppEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> serverMaintainEvent = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.repository.UserRepository getAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.local.pref.PrefHelper getAppPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.utils.SingleLiveEvent<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> getNoInternetConnectionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> getTokenExpiredEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> getConnectTimeoutEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> getForceUpdateAppEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.utils.SingleLiveEvent<kotlin.Unit> getServerMaintainEvent() {
        return null;
    }
    
    /**
     * handle throwable when load fail
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object onLoadFail(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void refreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String refreshToken) {
    }
    
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
}