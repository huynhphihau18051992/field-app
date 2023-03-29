package com.crayon.fieldapp.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R.\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0014\u00a8\u0006&"}, d2 = {"Lcom/crayon/fieldapp/data/remote/response/PromotionResponse;", "Lcom/crayon/fieldapp/data/remote/response/BaseResponse;", "createdAt", "", "updatedAt", "id", "name", "default_price", "package_type", "project", "products", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/ProductResponse;", "Lkotlin/collections/ArrayList;", "isSelect", "", "quantity", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZI)V", "getCreatedAt", "()Ljava/lang/String;", "getDefault_price", "getId", "()Z", "setSelect", "(Z)V", "getName", "getPackage_type", "getProducts", "()Ljava/util/ArrayList;", "setProducts", "(Ljava/util/ArrayList;)V", "getProject", "getQuantity", "()I", "setQuantity", "(I)V", "getUpdatedAt", "app_debug"})
public final class PromotionResponse extends com.crayon.fieldapp.data.remote.response.BaseResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "createdAt")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updatedAt")
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "default_price")
    private final java.lang.String default_price = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "package_type")
    private final java.lang.String package_type = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "project")
    private final java.lang.String project = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "products")
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> products;
    @com.google.gson.annotations.SerializedName(value = "isSelect")
    private boolean isSelect;
    @com.google.gson.annotations.SerializedName(value = "quantity")
    private int quantity;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefault_price() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPackage_type() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> p0) {
    }
    
    public final boolean isSelect() {
        return false;
    }
    
    public final void setSelect(boolean p0) {
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    public PromotionResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String default_price, @org.jetbrains.annotations.Nullable()
    java.lang.String package_type, @org.jetbrains.annotations.Nullable()
    java.lang.String project, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> products, boolean isSelect, int quantity) {
        super();
    }
    
    public PromotionResponse() {
        super();
    }
}