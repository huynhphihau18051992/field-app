package com.crayon.fieldapp.ui.screen.monitor.reportCompetitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b0\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b0\u000f0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R \u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u000b0\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/reportCompetitor/ManageReportCompetitorViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "attendanceRepository", "Lcom/crayon/fieldapp/data/repository/AttendanceRepository;", "projectRepository", "Lcom/crayon/fieldapp/data/repository/ProjectRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/AttendanceRepository;Lcom/crayon/fieldapp/data/repository/ProjectRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_attendances", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "", "Lcom/crayon/fieldapp/data/remote/response/AttendanceResponse;", "_projects", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/data/remote/response/ProjectResponse;", "attendances", "Landroidx/lifecycle/LiveData;", "getAttendances", "()Landroidx/lifecycle/LiveData;", "attendancesSource", "projects", "getProjects", "projectsSource", "getManagementAttendances", "Lkotlinx/coroutines/Job;", "agencyId", "", "projectId", "getManagementProject", "taskType", "", "app_debug"})
public final class ManageReportCompetitorViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.AttendanceResponse>>> _attendances = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.AttendanceResponse>>> attendancesSource;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.ProjectResponse>>>> _projects = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.ProjectResponse>>> projectsSource;
    private final com.crayon.fieldapp.data.repository.AttendanceRepository attendanceRepository = null;
    private final com.crayon.fieldapp.data.repository.ProjectRepository projectRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.AttendanceResponse>>> getAttendances() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getManagementAttendances(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.ProjectResponse>>>> getProjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getManagementProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, int taskType) {
        return null;
    }
    
    public ManageReportCompetitorViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.AttendanceRepository attendanceRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.ProjectRepository projectRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}