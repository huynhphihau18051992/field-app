package com.crayon.fieldapp.ui.screen.job.listJob;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0010H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/job/listJob/ListJobFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentListMyJobBinding;", "Lcom/crayon/fieldapp/ui/screen/job/listJob/ListJobViewModel;", "()V", "adapter", "Lcom/crayon/fieldapp/ui/screen/job/listJob/adapter/JobAdapter;", "getAdapter", "()Lcom/crayon/fieldapp/ui/screen/job/listJob/adapter/JobAdapter;", "layoutId", "", "getLayoutId", "()I", "searchJob", "Lkotlinx/coroutines/Job;", "status", "", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/job/listJob/ListJobViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initAdapter", "", "initSearch", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onViewCreated", "view", "Landroid/view/View;", "search", "toJobDetail", "id", "app_debug"})
public final class ListJobFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentListMyJobBinding, com.crayon.fieldapp.ui.screen.job.listJob.ListJobViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_list_my_job;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String status;
    private kotlinx.coroutines.Job searchJob;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.ui.screen.job.listJob.adapter.JobAdapter adapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.job.listJob.ListJobViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.ui.screen.job.listJob.adapter.JobAdapter getAdapter() {
        return null;
    }
    
    private final void search(java.lang.String status) {
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
    
    private final void initSearch() {
    }
    
    private final void initAdapter() {
    }
    
    private final void toJobDetail(java.lang.String id) {
    }
    
    public ListJobFragment() {
        super();
    }
}