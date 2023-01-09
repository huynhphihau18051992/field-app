package com.crayon.fieldapp.ui.screen.detailTask.endShift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001e"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/endShift/ReportEndShiftFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentDetailTaskBinding;", "Lcom/crayon/fieldapp/ui/screen/detailTask/base/DetailTaskViewModel;", "()V", "layoutId", "", "getLayoutId", "()I", "mFeedbacks", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse$Feedback;", "mProducts", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse$Product;", "productAdapter", "Lcom/crayon/fieldapp/ui/screen/detailTask/endShift/adapter/ReportEndShiftAdapter;", "taskId", "", "taskResponse", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/detailTask/base/DetailTaskViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "app_debug"})
public final class ReportEndShiftFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentDetailTaskBinding, com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_report_endshift;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String taskId;
    private com.crayon.fieldapp.ui.screen.detailTask.endShift.adapter.ReportEndShiftAdapter productAdapter;
    private com.crayon.fieldapp.data.remote.response.TaskResponse taskResponse;
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse.Product> mProducts;
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse.Feedback> mFeedbacks;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel getViewModel() {
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
    
    public ReportEndShiftFragment() {
        super();
    }
}