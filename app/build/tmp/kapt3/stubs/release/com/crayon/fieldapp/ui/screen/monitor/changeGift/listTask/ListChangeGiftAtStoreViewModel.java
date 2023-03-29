package com.crayon.fieldapp.ui.screen.monitor.changeGift.listTask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ8\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f0\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/changeGift/listTask/ListChangeGiftAtStoreViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "projectRepository", "Lcom/crayon/fieldapp/data/repository/ProjectRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/data/repository/ProjectRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_summary", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/ProjectSummaryResponse;", "_tasks", "", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "listTask", "Landroidx/lifecycle/LiveData;", "getListTask", "()Landroidx/lifecycle/LiveData;", "summary", "getSummary", "getProjectSummary", "Lkotlinx/coroutines/Job;", "agencyId", "", "projectId", "getTaskByProject", "date", "Ljava/util/Calendar;", "taskType", "", "skip", "take", "app_release"})
public final class ListChangeGiftAtStoreViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> _tasks = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.ProjectSummaryResponse>>> _summary = null;
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    private final com.crayon.fieldapp.data.repository.ProjectRepository projectRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>>>> getListTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getTaskByProject(@org.jetbrains.annotations.NotNull()
    java.util.Calendar date, @org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, int taskType, int skip, int take) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.ProjectSummaryResponse>>> getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProjectSummary(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
        return null;
    }
    
    public ListChangeGiftAtStoreViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.ProjectRepository projectRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}