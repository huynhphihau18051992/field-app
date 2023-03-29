package com.crayon.fieldapp.ui.screen.detailTask.reportSales;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u001dJ\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+R&\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R)\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b0\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u0006,"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/ReportSalesViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "context", "Landroid/content/Context;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "pref", "Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "(Landroid/content/Context;Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/data/local/pref/PrefHelper;)V", "_orders", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "", "Lcom/crayon/fieldapp/data/remote/response/OrderResponse;", "currentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getCurrentLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setCurrentLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "orders", "Landroidx/lifecycle/LiveData;", "getOrders", "()Landroidx/lifecycle/LiveData;", "storeLocation", "getStoreLocation", "setStoreLocation", "strDistant", "", "getStrDistant", "()Ljava/lang/String;", "setStrDistant", "(Ljava/lang/String;)V", "getTaskRepository", "()Lcom/crayon/fieldapp/data/repository/TaskRepository;", "fetchCurrentLocation", "", "fetchOrders", "taskId", "verifyLocation", "", "store", "Lcom/crayon/fieldapp/data/remote/response/Store;", "app_release"})
public final class ReportSalesViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.OrderResponse>>>> _orders = null;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.maps.model.LatLng currentLocation;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng storeLocation;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strDistant = "0.0 Km";
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    private final com.crayon.fieldapp.data.local.pref.PrefHelper pref = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.OrderResponse>>>> getOrders() {
        return null;
    }
    
    public final void fetchOrders(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getCurrentLocation() {
        return null;
    }
    
    public final void setCurrentLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.LatLng getStoreLocation() {
        return null;
    }
    
    public final void setStoreLocation(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStrDistant() {
        return null;
    }
    
    public final void setStrDistant(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean verifyLocation(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.Store store) {
        return false;
    }
    
    public final void fetchCurrentLocation() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.repository.TaskRepository getTaskRepository() {
        return null;
    }
    
    public ReportSalesViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.pref.PrefHelper pref) {
        super();
    }
}