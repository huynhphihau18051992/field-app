package com.crayon.fieldapp.ui.screen.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/application/ApplicationFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentApplicationBinding;", "Lcom/crayon/fieldapp/ui/screen/application/ApplicationViewModel;", "()V", "layoutId", "", "getLayoutId", "()I", "mAdapter", "Lcom/crayon/fieldapp/ui/base/adapter/BaseVPAdapter;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/application/ApplicationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setupViewPager", "app_release"})
public final class ApplicationFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentApplicationBinding, com.crayon.fieldapp.ui.screen.application.ApplicationViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_application;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.crayon.fieldapp.ui.base.adapter.BaseVPAdapter mAdapter;
    private androidx.viewpager.widget.ViewPager viewPager;
    private com.google.android.material.tabs.TabLayout tabLayout;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.application.ApplicationViewModel getViewModel() {
        return null;
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
    
    private final void setupViewPager() {
    }
    
    public ApplicationFragment() {
        super();
    }
}