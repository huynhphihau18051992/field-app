package com.crayon.fieldapp.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t\u00a2\u0006\u0002\u0010\nR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR*\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/crayon/fieldapp/data/remote/response/BaseListResponse;", "Item", "Lcom/crayon/fieldapp/data/remote/response/BaseResponse;", "page", "", "totalResults", "totalPages", "results", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResults", "()Ljava/util/ArrayList;", "getTotalPages", "getTotalResults", "app_debug"})
public class BaseListResponse<Item extends java.lang.Object> extends com.crayon.fieldapp.data.remote.response.BaseResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "page")
    private final java.lang.Integer page = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private final java.lang.Integer totalResults = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private final java.lang.Integer totalPages = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "results")
    private final java.util.ArrayList<Item> results = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalPages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<Item> getResults() {
        return null;
    }
    
    public BaseListResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer page, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalResults, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalPages, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<Item> results) {
        super();
    }
    
    public BaseListResponse() {
        super();
    }
}