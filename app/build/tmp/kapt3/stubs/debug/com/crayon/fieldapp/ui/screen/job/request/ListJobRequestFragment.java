package com.crayon.fieldapp.ui.screen.job.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/job/request/ListJobRequestFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentListJobRequestBinding;", "Lcom/crayon/fieldapp/ui/screen/job/request/ListJobRequestViewModel;", "()V", "adapterJobReqeust", "Lcom/crayon/fieldapp/ui/screen/job/request/adapter/JobsRequestRVAdapter;", "layoutId", "", "getLayoutId", "()I", "mPushFilter", "Landroid/content/IntentFilter;", "mPushReceiver", "Landroid/content/BroadcastReceiver;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/job/request/ListJobRequestViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onPause", "onResume", "refreshData", "app_debug"})
public final class ListJobRequestFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentListJobRequestBinding, com.crayon.fieldapp.ui.screen.job.request.ListJobRequestViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_list_job_request;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.crayon.fieldapp.ui.screen.job.request.adapter.JobsRequestRVAdapter adapterJobReqeust;
    private final android.content.IntentFilter mPushFilter = null;
    private final android.content.BroadcastReceiver mPushReceiver = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.job.request.ListJobRequestViewModel getViewModel() {
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
    
    private final void refreshData() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    public ListJobRequestFragment() {
        super();
    }
}