package com.crayon.fieldapp.ui.screen.monitor.listProject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/listProject/ListProjectFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentListProjectBinding;", "Lcom/crayon/fieldapp/ui/screen/monitor/listProject/ListProjectViewModel;", "mode", "", "(Ljava/lang/Integer;)V", "agencyId", "", "getAgencyId", "()Ljava/lang/String;", "setAgencyId", "(Ljava/lang/String;)V", "layoutId", "getLayoutId", "()I", "Ljava/lang/Integer;", "status", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/monitor/listProject/ListProjectViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "setUpSearchStateFlow", "toProjectDetail", "project", "Lcom/crayon/fieldapp/data/remote/response/ProjectResponse;", "Companion", "app_debug"})
public final class ListProjectFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentListProjectBinding, com.crayon.fieldapp.ui.screen.monitor.listProject.ListProjectViewModel> {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String agencyId;
    private java.lang.String status;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.Integer mode;
    public static final int FROM_ATTENDANCE_MODE = 1;
    public static final int FROM_UPDATE_STATUS_MODE = 2;
    public static final int FROM_REPORT_COMPETITOR_MODE = 3;
    public static final int FROM_REPORT_SALES_MODE = 4;
    public static final int FROM_REPORT_TRACKING_MODE = 5;
    public static final int FROM_REPORT_CHANGE_GIFT_MODE = 6;
    public static final int FROM_PROJECT_MODE = 0;
    public static final com.crayon.fieldapp.ui.screen.monitor.listProject.ListProjectFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAgencyId() {
        return null;
    }
    
    public final void setAgencyId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.monitor.listProject.ListProjectViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toProjectDetail(com.crayon.fieldapp.data.remote.response.ProjectResponse project) {
    }
    
    private final void setUpSearchStateFlow() {
    }
    
    public ListProjectFragment(@org.jetbrains.annotations.Nullable()
    java.lang.Integer mode) {
        super();
    }
    
    public ListProjectFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/listProject/ListProjectFragment$Companion;", "", "()V", "FROM_ATTENDANCE_MODE", "", "FROM_PROJECT_MODE", "FROM_REPORT_CHANGE_GIFT_MODE", "FROM_REPORT_COMPETITOR_MODE", "FROM_REPORT_SALES_MODE", "FROM_REPORT_TRACKING_MODE", "FROM_UPDATE_STATUS_MODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}