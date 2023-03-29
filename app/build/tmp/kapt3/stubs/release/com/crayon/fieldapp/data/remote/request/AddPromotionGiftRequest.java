package com.crayon.fieldapp.data.remote.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u00a2\u0006\u0002\u0010\bR.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/crayon/fieldapp/data/remote/request/AddPromotionGiftRequest;", "", "promotions", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/request/AddPromotionRequest;", "Lkotlin/collections/ArrayList;", "gifts", "Lcom/crayon/fieldapp/data/remote/request/ProjectGiftRequest;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getGifts", "()Ljava/util/ArrayList;", "setGifts", "(Ljava/util/ArrayList;)V", "getPromotions", "setPromotions", "app_release"})
public final class AddPromotionGiftRequest {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "promotions")
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.request.AddPromotionRequest> promotions;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "gifts")
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.request.ProjectGiftRequest> gifts;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.request.AddPromotionRequest> getPromotions() {
        return null;
    }
    
    public final void setPromotions(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.request.AddPromotionRequest> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.request.ProjectGiftRequest> getGifts() {
        return null;
    }
    
    public final void setGifts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.request.ProjectGiftRequest> p0) {
    }
    
    public AddPromotionGiftRequest(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.request.AddPromotionRequest> promotions, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.request.ProjectGiftRequest> gifts) {
        super();
    }
}