package com.crayon.fieldapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010!\u001a\u00020\"J\u0010\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010\"J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(H\u0016J\u0006\u0010)\u001a\u00020\u001eJ\u0012\u0010*\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00103\u001a\u00020\u001eH\u0016J\u0010\u00104\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u0005J\u0010\u00105\u001a\u00020\u001e2\b\u00106\u001a\u0004\u0018\u00010\u0012J\u0006\u00107\u001a\u00020\u001eR\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0012\u0010\u001a\u001a\u00028\u0001X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00068"}, d2 = {"Lcom/crayon/fieldapp/ui/base/BaseFragment;", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "ViewModel", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "appPrefs", "Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "getAppPrefs", "()Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "appPrefs$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "loadingDialog", "Landroidx/appcompat/app/AlertDialog;", "messageDialog", "viewBinding", "getViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "dismissLLoadingDialog", "", "findChildFragment", "parentFragment", "TAG", "", "findFragment", "handleErrorMessage", "message", "handleLoading", "isLoading", "", "navigateUp", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "popChildFragment", "showDialogSafe", "dialog", "showLoadingDialog", "app_debug"})
public abstract class BaseFragment<ViewBinding extends androidx.databinding.ViewDataBinding, ViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    protected ViewBinding viewBinding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appPrefs$delegate = null;
    private androidx.appcompat.app.AlertDialog loadingDialog;
    private androidx.appcompat.app.AlertDialog messageDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final ViewBinding getViewBinding() {
        return null;
    }
    
    protected final void setViewBinding(@org.jetbrains.annotations.NotNull()
    ViewBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract ViewModel getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.local.pref.PrefHelper getAppPrefs() {
        return null;
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutId();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * override this if not use loading dialog (example progress bar)
     */
    public void handleLoading(boolean isLoading) {
    }
    
    public final void showLoadingDialog() {
    }
    
    public final void dismissLLoadingDialog() {
    }
    
    public final void handleErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    /**
     * show dialog and dismiss safety when fragment destroy
     */
    public final void showDialogSafe(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog dialog) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public final void navigateUp() {
    }
    
    /**
     * fragment transaction
     */
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment findFragment(@org.jetbrains.annotations.NotNull()
    java.lang.String TAG) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment findChildFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment parentFragment, @org.jetbrains.annotations.NotNull()
    java.lang.String TAG) {
        return null;
    }
    
    public final void popChildFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment parentFragment) {
    }
    
    public BaseFragment() {
        super();
    }
}