package com.crayon.fieldapp.ui.screen.attendance;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020 H\u0002J\u0016\u0010/\u001a\u00020,2\u0006\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020 J\u000e\u00102\u001a\u0002032\u0006\u00100\u001a\u00020\u0011R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\r0\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00198F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u001bR\u001a\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\r0\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/attendance/AttendanceViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "context", "Landroid/content/Context;", "pref", "Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "(Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/AppDispatchers;Landroid/content/Context;Lcom/crayon/fieldapp/data/local/pref/PrefHelper;)V", "_updateTask", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "_users", "", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "currentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getCurrentLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setCurrentLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "listTask", "Landroidx/lifecycle/LiveData;", "getListTask", "()Landroidx/lifecycle/LiveData;", "storeLocation", "getStoreLocation", "setStoreLocation", "strDistant", "", "getStrDistant", "()Ljava/lang/String;", "setStrDistant", "(Ljava/lang/String;)V", "updateTask", "getUpdateTask", "updateTaskSource", "usersSource", "fetchCurrentLocation", "", "getTodayPicAttendances", "Lkotlinx/coroutines/Job;", "getTypeMedia", "url", "upLoadTask", "task", "imageUrl", "verifyLocation", "", "app_release"})
public final class AttendanceViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> _users = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> usersSource;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.maps.model.LatLng currentLocation;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng storeLocation;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strDistant = "0.0 Km";
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> _updateTask = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> updateTaskSource;
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    private final android.content.Context context = null;
    private final com.crayon.fieldapp.data.local.pref.PrefHelper pref = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>> getListTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getTodayPicAttendances() {
        return null;
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
    com.crayon.fieldapp.data.remote.response.TaskResponse task) {
        return false;
    }
    
    public final void fetchCurrentLocation() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> getUpdateTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job upLoadTask(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse task, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl) {
        return null;
    }
    
    private final java.lang.String getTypeMedia(java.lang.String url) {
        return null;
    }
    
    public AttendanceViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.pref.PrefHelper pref) {
        super();
    }
}