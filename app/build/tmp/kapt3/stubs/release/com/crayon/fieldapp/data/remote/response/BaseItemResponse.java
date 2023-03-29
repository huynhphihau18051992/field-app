package com.crayon.fieldapp.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/crayon/fieldapp/data/remote/response/BaseItemResponse;", "Item", "Lcom/crayon/fieldapp/data/remote/response/BaseResponse;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_release"})
public final class BaseItemResponse<Item extends java.lang.Object> extends com.crayon.fieldapp.data.remote.response.BaseResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "data")
    private final Item data = null;
    
    @org.jetbrains.annotations.Nullable()
    public final Item getData() {
        return null;
    }
    
    public BaseItemResponse(@org.jetbrains.annotations.Nullable()
    Item data) {
        super();
    }
    
    public BaseItemResponse() {
        super();
    }
}