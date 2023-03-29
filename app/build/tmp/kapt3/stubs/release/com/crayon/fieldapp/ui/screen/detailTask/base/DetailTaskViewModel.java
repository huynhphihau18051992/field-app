package com.crayon.fieldapp.ui.screen.detailTask.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 U2\u00020\u0001:\u0001UB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ(\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020#H\u0002J2\u00109\u001a\u00020:2\u0006\u0010(\u001a\u00020\u00112\u0016\u0010;\u001a\u0012\u0012\u0004\u0012\u00020#0<j\b\u0012\u0004\u0012\u00020#`=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010#J3\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020#2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJ\u0006\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020#J\u0010\u0010K\u001a\u00020#2\u0006\u0010A\u001a\u00020#H\u0002J&\u0010L\u001a\u00020:2\u0006\u0010J\u001a\u00020#2\u0016\u0010M\u001a\u0012\u0012\u0004\u0012\u00020#0<j\b\u0012\u0004\u0012\u00020#`=J2\u0010N\u001a\u00020:2\u0006\u0010(\u001a\u00020\u00112\u0016\u0010;\u001a\u0012\u0012\u0004\u0012\u00020#0<j\b\u0012\u0004\u0012\u00020#`=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010#J>\u0010O\u001a\u00020:2\u0006\u0010(\u001a\u00020\u00112\u0016\u0010P\u001a\u0012\u0012\u0004\u0012\u00020Q0<j\b\u0012\u0004\u0012\u00020Q`=2\u0016\u0010R\u001a\u0012\u0012\u0004\u0012\u00020S0<j\b\u0012\u0004\u0012\u00020S`=J\u000e\u0010T\u001a\u00020E2\u0006\u0010(\u001a\u00020\u0011R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R#\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u00100\u001c8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u001dR\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u001dR\u001a\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001c8F\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u001dR\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006V"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/base/DetailTaskViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "context", "Landroid/content/Context;", "pref", "Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "(Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/AppDispatchers;Landroid/content/Context;Lcom/crayon/fieldapp/data/local/pref/PrefHelper;)V", "_removeImage", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "_task", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "_updateCheckInOutTask", "_updateProduct", "_updateTask", "currentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getCurrentLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setCurrentLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "isRemoveTask", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "removeImageSource", "storeLocation", "getStoreLocation", "setStoreLocation", "strDistant", "", "getStrDistant", "()Ljava/lang/String;", "setStrDistant", "(Ljava/lang/String;)V", "task", "getTask", "updateCheckInOutTask", "getUpdateCheckInOutTask", "updateCheckInOutTaskSource", "updateProduct", "getUpdateProduct", "updateProductSource", "updateTask", "getUpdateTask", "updateTaskSource", "addStampToImage", "Landroid/graphics/Bitmap;", "originalBitmap", "time", "address", "venue", "checkInOut", "Lkotlinx/coroutines/Job;", "listUri", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "note", "createFile", "Ljava/io/File;", "url", "quality", "", "isHasTage", "", "(Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/response/TaskResponse;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCurrentLocation", "", "getDetailTask", "taskId", "getTypeMedia", "removeImage", "ids", "upLoadTask", "updateProductFeedback", "products", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse$Product;", "feedback", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse$Feedback;", "verifyLocation", "Companion", "app_release"})
public final class DetailTaskViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.TaskResponse>>> _task = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> _updateProduct = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> updateProductSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> _updateTask = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> updateTaskSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> _updateCheckInOutTask = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> updateCheckInOutTaskSource;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.maps.model.LatLng currentLocation;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.LatLng storeLocation;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String strDistant = "0.0 Km";
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> _removeImage = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> removeImageSource;
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    private final android.content.Context context = null;
    private final com.crayon.fieldapp.data.local.pref.PrefHelper pref = null;
    public static final double MAX_VALID_DISTANT = 300.0;
    public static final com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.TaskResponse>>> getTask() {
        return null;
    }
    
    public final void getDetailTask(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> getUpdateProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateProductFeedback(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse task, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse.Product> products, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse.Feedback> feedback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> getUpdateTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job upLoadTask(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse task, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> listUri, @org.jetbrains.annotations.Nullable()
    java.lang.String note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> getUpdateCheckInOutTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job checkInOut(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse task, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> listUri, @org.jetbrains.annotations.Nullable()
    java.lang.String note) {
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
    
    private final android.graphics.Bitmap addStampToImage(android.graphics.Bitmap originalBitmap, java.lang.String time, java.lang.String address, java.lang.String venue) {
        return null;
    }
    
    private final java.lang.String getTypeMedia(java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createFile(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse task, int quality, boolean isHasTage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.io.File> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> isRemoveTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job removeImage(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> ids) {
        return null;
    }
    
    public DetailTaskViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.pref.PrefHelper pref) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/base/DetailTaskViewModel$Companion;", "", "()V", "MAX_VALID_DISTANT", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}