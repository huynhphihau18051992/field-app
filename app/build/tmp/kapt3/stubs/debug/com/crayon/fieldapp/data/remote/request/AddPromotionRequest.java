package com.crayon.fieldapp.data.remote.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\u0002\u0010\nR.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/crayon/fieldapp/data/remote/request/AddPromotionRequest;", "", "promotionId", "", "quantity", "", "products", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/request/ProjectProductRequest;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;ILjava/util/ArrayList;)V", "getProducts", "()Ljava/util/ArrayList;", "setProducts", "(Ljava/util/ArrayList;)V", "getPromotionId", "()Ljava/lang/String;", "setPromotionId", "(Ljava/lang/String;)V", "getQuantity", "()I", "setQuantity", "(I)V", "app_debug"})
public final class AddPromotionRequest {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "promotion_package_id")
    private java.lang.String promotionId;
    @com.google.gson.annotations.SerializedName(value = "quantity")
    private int quantity;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "products")
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.request.ProjectProductRequest> products;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPromotionId() {
        return null;
    }
    
    public final void setPromotionId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final void setQuantity(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.request.ProjectProductRequest> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.request.ProjectProductRequest> p0) {
    }
    
    public AddPromotionRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String promotionId, int quantity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.request.ProjectProductRequest> products) {
        super();
    }
}