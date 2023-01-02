package com.crayon.fieldapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J>\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\bJ,\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\bJ$\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\bH\u0003J\u0006\u0010&\u001a\u00020\u0018J\u001a\u0010\'\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010)\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020 H\u0016J\u0006\u0010-\u001a\u00020\u0018J\u0012\u0010.\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u000100H\u0016J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00107\u001a\u00020\u0018H\u0016J\u0010\u00108\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ>\u00109\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\bJ,\u0010:\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\bJ.\u0010;\u001a\u00020\u00182\u0006\u0010<\u001a\u00020=2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\bH\u0007J\u0010\u0010>\u001a\u00020\u00182\b\u0010?\u001a\u0004\u0018\u00010\fJ\u0006\u0010@\u001a\u00020\u0018R\u0014\u0010\u0007\u001a\u00020\b8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0014\u001a\u00028\u0001X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006A"}, d2 = {"Lcom/crayon/fieldapp/ui/base/BaseBottomSheetDialogFragment;", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "ViewModel", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "layoutId", "", "getLayoutId", "()I", "loadingDialog", "Landroidx/appcompat/app/AlertDialog;", "messageDialog", "viewBinding", "getViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "addChildFragment", "", "parentFragment", "Landroidx/fragment/app/Fragment;", "containerViewId", "fragment", "TAG", "", "addToBackStack", "", "transit", "addFragment", "commitTransaction", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "dismissLLoadingDialog", "findChildFragment", "findFragment", "handleErrorMessage", "message", "handleLoading", "isLoading", "navigateUp", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "popChildFragment", "replaceChildFragment", "replaceFragment", "showDialogFragment", "dialogFragment", "Landroidx/fragment/app/DialogFragment;", "showDialogSafe", "dialog", "showLoadingDialog", "app_debug"})
public abstract class BaseBottomSheetDialogFragment<ViewBinding extends androidx.databinding.ViewDataBinding, ViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel> extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    protected ViewBinding viewBinding;
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
    
    public final void addFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String TAG, boolean addToBackStack, int transit) {
    }
    
    public final void replaceFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String TAG, boolean addToBackStack, int transit) {
    }
    
    public final void replaceChildFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment parentFragment, int containerViewId, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String TAG, boolean addToBackStack, int transit) {
    }
    
    public final void addChildFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment parentFragment, int containerViewId, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    java.lang.String TAG, boolean addToBackStack, int transit) {
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    public final void showDialogFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment dialogFragment, @org.jetbrains.annotations.Nullable()
    java.lang.String TAG, boolean addToBackStack, int transit) {
    }
    
    @android.annotation.SuppressLint(value = {"WrongConstant"})
    private final void commitTransaction(androidx.fragment.app.FragmentTransaction transaction, boolean addToBackStack, int transit) {
    }
    
    public final void popChildFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment parentFragment) {
    }
    
    public BaseBottomSheetDialogFragment() {
        super();
    }
}