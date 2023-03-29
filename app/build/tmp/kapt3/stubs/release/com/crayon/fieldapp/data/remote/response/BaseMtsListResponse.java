package com.crayon.fieldapp.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007\u00a2\u0006\u0002\u0010\bR*\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/crayon/fieldapp/data/remote/response/BaseMtsListResponse;", "Item", "Lcom/crayon/fieldapp/data/remote/response/BaseResponse;", "total", "", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_release"})
public class BaseMtsListResponse<Item extends java.lang.Object> extends com.crayon.fieldapp.data.remote.response.BaseResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total")
    private final java.lang.Integer total = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final java.util.ArrayList<Item> data = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<Item> getData() {
        return null;
    }
    
    public BaseMtsListResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer total, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<Item> data) {
        super();
    }
    
    public BaseMtsListResponse() {
        super();
    }
}