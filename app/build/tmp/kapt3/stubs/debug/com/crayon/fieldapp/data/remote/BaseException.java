package com.crayon.fieldapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u001aB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/crayon/fieldapp/data/remote/BaseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorType", "Lcom/crayon/fieldapp/data/remote/ErrorType;", "serverErrorResponse", "Lcom/crayon/fieldapp/data/remote/ServerErrorResponse;", "response", "Lretrofit2/Response;", "httpCode", "", "cause", "", "(Lcom/crayon/fieldapp/data/remote/ErrorType;Lcom/crayon/fieldapp/data/remote/ServerErrorResponse;Lretrofit2/Response;ILjava/lang/Throwable;)V", "getErrorType", "()Lcom/crayon/fieldapp/data/remote/ErrorType;", "getHttpCode", "()I", "message", "", "getMessage", "()Ljava/lang/String;", "getResponse", "()Lretrofit2/Response;", "getServerErrorResponse", "()Lcom/crayon/fieldapp/data/remote/ServerErrorResponse;", "Companion", "app_debug"})
public final class BaseException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.data.remote.ErrorType errorType = null;
    @org.jetbrains.annotations.Nullable()
    private final com.crayon.fieldapp.data.remote.ServerErrorResponse serverErrorResponse = null;
    @org.jetbrains.annotations.Nullable()
    private final retrofit2.Response<?> response = null;
    private final int httpCode = 0;
    public static final com.crayon.fieldapp.data.remote.BaseException.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.remote.ErrorType getErrorType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.crayon.fieldapp.data.remote.ServerErrorResponse getServerErrorResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Response<?> getResponse() {
        return null;
    }
    
    public final int getHttpCode() {
        return 0;
    }
    
    public BaseException(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.ErrorType errorType, @org.jetbrains.annotations.Nullable()
    com.crayon.fieldapp.data.remote.ServerErrorResponse serverErrorResponse, @org.jetbrains.annotations.Nullable()
    retrofit2.Response<?> response, int httpCode, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable cause) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/crayon/fieldapp/data/remote/BaseException$Companion;", "", "()V", "toHttpError", "Lcom/crayon/fieldapp/data/remote/BaseException;", "response", "Lretrofit2/Response;", "httpCode", "", "toNetworkError", "cause", "", "toServerError", "serverErrorResponse", "Lcom/crayon/fieldapp/data/remote/ServerErrorResponse;", "toUnexpectedError", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.crayon.fieldapp.data.remote.BaseException toHttpError(@org.jetbrains.annotations.Nullable()
        retrofit2.Response<?> response, int httpCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.crayon.fieldapp.data.remote.BaseException toNetworkError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable cause) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.crayon.fieldapp.data.remote.BaseException toServerError(@org.jetbrains.annotations.NotNull()
        com.crayon.fieldapp.data.remote.ServerErrorResponse serverErrorResponse, int httpCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.crayon.fieldapp.data.remote.BaseException toUnexpectedError(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable cause) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}