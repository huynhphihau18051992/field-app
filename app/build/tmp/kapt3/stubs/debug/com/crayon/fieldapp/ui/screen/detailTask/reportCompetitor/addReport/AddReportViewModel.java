package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.addReport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J>\u0010\n\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0017j\b\u0012\u0004\u0012\u00020\u0012`\u0018J;\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportCompetitor/addReport/AddReportViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "(Lcom/crayon/fieldapp/data/repository/TaskRepository;)V", "_createActivity", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "createActivity", "Landroidx/lifecycle/LiveData;", "getCreateActivity", "()Landroidx/lifecycle/LiveData;", "getTaskRepository", "()Lcom/crayon/fieldapp/data/repository/TaskRepository;", "Lkotlinx/coroutines/Job;", "taskId", "", "brandName", "mReportType", "note", "listUri", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "createFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "url", "task", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "quality", "", "isHasTage", "", "(Landroid/content/Context;Ljava/lang/String;Lcom/crayon/fieldapp/data/remote/response/TaskResponse;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTypeMedia", "app_debug"})
public final class AddReportViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> _createActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> getCreateActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job createActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String brandName, @org.jetbrains.annotations.NotNull()
    java.lang.String mReportType, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> listUri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse task, int quality, boolean isHasTage, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.io.File> p5) {
        return null;
    }
    
    private final java.lang.String getTypeMedia(java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.repository.TaskRepository getTaskRepository() {
        return null;
    }
    
    public AddReportViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository) {
        super();
    }
}