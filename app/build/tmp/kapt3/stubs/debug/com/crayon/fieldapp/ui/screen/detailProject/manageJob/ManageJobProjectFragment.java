package com.crayon.fieldapp.ui.screen.detailProject.manageJob;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J(\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0016J\u001a\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010%\u001a\u00020\u0018H\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailProject/manageJob/ManageJobProjectFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentJobProjectBinding;", "Lcom/crayon/fieldapp/ui/screen/detailProject/manageJob/ManageJobProjectViewModel;", "Landroid/widget/CalendarView$OnDateChangeListener;", "()V", "agencyId", "", "jobAdapter", "Lcom/crayon/fieldapp/ui/screen/detailProject/addStore/adapter/ManageJobRVAdapter;", "jobId", "layoutId", "", "getLayoutId", "()I", "projectId", "storeId", "storeName", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/detailProject/manageJob/ManageJobProjectViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onSelectedDayChange", "p0", "Landroid/widget/CalendarView;", "year", "month", "dayOfMonth", "onViewCreated", "view", "Landroid/view/View;", "toCreateJob", "toJobDetail", "id", "app_debug"})
public final class ManageJobProjectFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentJobProjectBinding, com.crayon.fieldapp.ui.screen.detailProject.manageJob.ManageJobProjectViewModel> implements android.widget.CalendarView.OnDateChangeListener {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_job_project;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String projectId;
    private java.lang.String storeId;
    private java.lang.String storeName;
    private java.lang.String agencyId;
    private com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter.ManageJobRVAdapter jobAdapter;
    private java.lang.String jobId;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.detailProject.manageJob.ManageJobProjectViewModel getViewModel() {
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
    
    private final void toJobDetail(java.lang.String id) {
    }
    
    private final void toCreateJob() {
    }
    
    @java.lang.Override()
    public void onSelectedDayChange(@org.jetbrains.annotations.NotNull()
    android.widget.CalendarView p0, int year, int month, int dayOfMonth) {
    }
    
    public ManageJobProjectFragment() {
        super();
    }
}