package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B*\u0012#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0014\u0010\f\u001a\u00020\rX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step1/InputNameFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentInputBillBinding;", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step1/InputNameViewModel;", "onNextClick", "Lkotlin/Function1;", "Lcom/crayon/fieldapp/data/remote/response/CustomerResponse;", "Lkotlin/ParameterName;", "name", "customer", "", "(Lkotlin/jvm/functions/Function1;)V", "layoutId", "", "getLayoutId", "()I", "getOnNextClick", "()Lkotlin/jvm/functions/Function1;", "taskId", "", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step1/InputNameViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "app_debug"})
public final class InputNameFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentInputBillBinding, com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1.InputNameViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_input_name;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String taskId;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.CustomerResponse, kotlin.Unit> onNextClick = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1.InputNameViewModel getViewModel() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.CustomerResponse, kotlin.Unit> getOnNextClick() {
        return null;
    }
    
    public InputNameFragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.CustomerResponse, kotlin.Unit> onNextClick) {
        super();
    }
    
    public InputNameFragment() {
        super();
    }
}