package com.crayon.fieldapp.ui.screen.report.project;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001d0\u0013j\b\u0012\u0004\u0012\u00020\u001d`\u00150\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u0006\'"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/report/project/ReportByProjectFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentReportProjectBinding;", "Lcom/crayon/fieldapp/ui/screen/report/project/ReportProjectViewModel;", "()V", "calendar", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getCalendar", "()Ljava/util/Calendar;", "setCalendar", "(Ljava/util/Calendar;)V", "isFistTime", "", "layoutId", "", "getLayoutId", "()I", "listAllProject", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/model/SimpleModel;", "Lkotlin/collections/ArrayList;", "selectProjectAdapter", "Lcom/crayon/fieldapp/ui/base/adapter/SimpleSPAdapter;", "selectProjectIds", "", "selectShift", "Ljava/util/HashMap;", "Ljava/util/Date;", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/report/project/ReportProjectViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ReportByProjectFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentReportProjectBinding, com.crayon.fieldapp.ui.screen.report.project.ReportProjectViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_report_project;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.crayon.fieldapp.ui.base.adapter.SimpleSPAdapter selectProjectAdapter;
    private java.util.ArrayList<com.crayon.fieldapp.data.model.SimpleModel> listAllProject;
    private java.util.ArrayList<java.lang.String> selectProjectIds;
    private java.util.Calendar calendar;
    private java.util.HashMap<java.util.Date, java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse>> selectShift;
    private boolean isFistTime = true;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.report.project.ReportProjectViewModel getViewModel() {
        return null;
    }
    
    public final java.util.Calendar getCalendar() {
        return null;
    }
    
    public final void setCalendar(java.util.Calendar p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public ReportByProjectFragment() {
        super();
    }
}