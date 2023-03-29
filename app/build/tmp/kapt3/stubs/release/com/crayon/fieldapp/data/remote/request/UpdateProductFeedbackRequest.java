package com.crayon.fieldapp.data.remote.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b\u00a2\u0006\u0002\u0010\tR2\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/crayon/fieldapp/data/remote/request/UpdateProductFeedbackRequest;", "", "products", "", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse$Product;", "feedback", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse$Feedback;", "Lkotlin/collections/ArrayList;", "(Ljava/util/List;Ljava/util/ArrayList;)V", "getFeedback", "()Ljava/util/ArrayList;", "setFeedback", "(Ljava/util/ArrayList;)V", "getProducts", "()Ljava/util/List;", "setProducts", "(Ljava/util/List;)V", "app_release"})
public final class UpdateProductFeedbackRequest {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "products")
    private java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse.Product> products;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "customer_feedback")
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse.Feedback> feedback;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse.Product> getProducts() {
        return null;
    }
    
    public final void setProducts(@org.jetbrains.annotations.Nullable()
    java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse.Product> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse.Feedback> getFeedback() {
        return null;
    }
    
    public final void setFeedback(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse.Feedback> p0) {
    }
    
    public UpdateProductFeedbackRequest(@org.jetbrains.annotations.Nullable()
    java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse.Product> products, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse.Feedback> feedback) {
        super();
    }
    
    public UpdateProductFeedbackRequest() {
        super();
    }
}