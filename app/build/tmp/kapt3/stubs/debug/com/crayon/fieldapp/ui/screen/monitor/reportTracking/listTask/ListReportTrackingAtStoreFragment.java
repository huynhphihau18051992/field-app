package com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u0002022\u0006\u0010)\u001a\u00020\u0017H\u0002J\u0012\u00104\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u0002022\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u00108\u001a\u0002022\u0006\u00109\u001a\u00020:2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020\u0006H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001c\u0010&\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\b\"\u0004\b(\u0010\nR\u000e\u0010)\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\u000e\u00100\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/reportTracking/listTask/ListReportTrackingAtStoreFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentListReportTrackingAtStoreBinding;", "Lcom/crayon/fieldapp/ui/screen/monitor/reportTracking/listTask/ListReportTrackingAtStoreViewModel;", "()V", "agencyId", "", "getAgencyId", "()Ljava/lang/String;", "setAgencyId", "(Ljava/lang/String;)V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "dateSetListener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "filterStoreIds", "Ljava/util/ArrayList;", "getFilterStoreIds", "()Ljava/util/ArrayList;", "setFilterStoreIds", "(Ljava/util/ArrayList;)V", "layoutId", "", "getLayoutId", "()I", "mAdapter", "Lcom/crayon/fieldapp/ui/screen/monitor/reportTracking/listTask/adapter/ManageReportTrackingRVAdapter;", "mIsLoading", "", "mTasks", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "getMTasks", "setMTasks", "pastVisiblesItems", "projectId", "getProjectId", "setProjectId", "projectName", "getProjectName", "setProjectName", "skip", "totalItemCount", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/monitor/reportTracking/listTask/ListReportTrackingAtStoreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "visibleItemCount", "formatTime", "", "loadMoreItem", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onViewCreated", "view", "Landroid/view/View;", "toTaskDetail", "task", "app_debug"})
public final class ListReportTrackingAtStoreFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentListReportTrackingAtStoreBinding, com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask.ListReportTrackingAtStoreViewModel> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String agencyId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String projectId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String projectName;
    private java.util.Calendar calendar;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> filterStoreIds;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse> mTasks;
    private com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask.adapter.ManageReportTrackingRVAdapter mAdapter;
    private boolean mIsLoading = false;
    private int pastVisiblesItems = 0;
    private int visibleItemCount = 0;
    private int totalItemCount = 0;
    private int skip = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final android.app.DatePickerDialog.OnDateSetListener dateSetListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAgencyId() {
        return null;
    }
    
    public final void setAgencyId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProjectId() {
        return null;
    }
    
    public final void setProjectId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProjectName() {
        return null;
    }
    
    public final void setProjectName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getFilterStoreIds() {
        return null;
    }
    
    public final void setFilterStoreIds(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse> getMTasks() {
        return null;
    }
    
    public final void setMTasks(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask.ListReportTrackingAtStoreViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toTaskDetail(java.lang.String task) {
    }
    
    private final void formatTime() {
    }
    
    private final void loadMoreItem(int skip) {
    }
    
    public ListReportTrackingAtStoreFragment() {
        super();
    }
}