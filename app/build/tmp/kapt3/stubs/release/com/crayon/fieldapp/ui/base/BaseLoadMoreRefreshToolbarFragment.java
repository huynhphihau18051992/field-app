package com.crayon.fieldapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0004*\u0004\b\u0002\u0010\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/crayon/fieldapp/ui/base/BaseLoadMoreRefreshToolbarFragment;", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "ViewModel", "Lcom/crayon/fieldapp/ui/base/BaseLoadMoreRefreshToolbarViewModel;", "Item", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "()V", "layoutId", "", "getLayoutId", "()I", "handleLoading", "", "isLoading", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public abstract class BaseLoadMoreRefreshToolbarFragment<ViewBinding extends androidx.databinding.ViewDataBinding, ViewModel extends com.crayon.fieldapp.ui.base.BaseLoadMoreRefreshToolbarViewModel<Item>, Item extends java.lang.Object> extends com.crayon.fieldapp.ui.base.BaseFragment<ViewBinding, ViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_loadmore_refresh_toolbar;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void handleLoading(boolean isLoading) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseLoadMoreRefreshToolbarFragment() {
        super();
    }
}