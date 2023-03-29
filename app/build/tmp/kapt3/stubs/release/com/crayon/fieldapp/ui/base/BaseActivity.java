package com.crayon.fieldapp.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u0014\u0010\u0007\u001a\u00020\b8eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0011\u001a\u00028\u0001X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lcom/crayon/fieldapp/ui/base/BaseActivity;", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "ViewModel", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "layoutId", "", "getLayoutId", "()I", "viewBinding", "getViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public abstract class BaseActivity<ViewBinding extends androidx.databinding.ViewDataBinding, ViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    protected ViewBinding viewBinding;
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
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseActivity() {
        super();
    }
}