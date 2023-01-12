package com.crayon.fieldapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0006\u0010\u0011\u001a\u00020\u000e\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0019"}, d2 = {"TIMEOUT", "", "networkModule", "Lorg/koin/core/module/Module;", "getNetworkModule", "()Lorg/koin/core/module/Module;", "createApiService", "Lcom/crayon/fieldapp/data/remote/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "createAppRetrofit", "okHttpClient", "Lokhttp3/OkHttpClient;", "createHeaderInterceptor", "Lokhttp3/Interceptor;", "appPrefs", "Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "createLoggingInterceptor", "createOkHttpCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "createOkHttpClient", "logging", "header", "app_debug"})
public final class NetworkModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module networkModule = null;
    public static final int TIMEOUT = 300;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getNetworkModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Cache createOkHttpCache(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Interceptor createLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.Interceptor createHeaderInterceptor(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.pref.PrefHelper appPrefs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient createOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor logging, @org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor header) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit createAppRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.remote.ApiService createApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}