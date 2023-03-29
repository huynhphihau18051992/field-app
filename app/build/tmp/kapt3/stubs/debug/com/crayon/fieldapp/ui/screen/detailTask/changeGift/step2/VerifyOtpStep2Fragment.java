package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001,B\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u001a\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\tJ?\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052!\u0010\'\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00060(R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006-"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step2/VerifyOtpStep2Fragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentVerifyOtpStep2Binding;", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step2/VerifyOtpStep2ViewModel;", "onNextClick", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "_phone", "", "layoutId", "", "getLayoutId", "()I", "getOnNextClick", "()Lkotlin/jvm/functions/Function0;", "taskId", "timer", "Landroid/os/CountDownTimer;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step2/VerifyOtpStep2ViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setCustomerPhone", "mPhone", "startLoginTimer", "timeView", "Landroid/widget/TextView;", "onFinish", "timeDown", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "time", "Companion", "app_debug"})
public final class VerifyOtpStep2Fragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentVerifyOtpStep2Binding, com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2.VerifyOtpStep2ViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_verify_otp_step2;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String taskId;
    private java.lang.String _phone;
    private android.os.CountDownTimer timer;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick = null;
    public static final long TIMER_RESEND_OTP = 120000L;
    public static final com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2.VerifyOtpStep2Fragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2.VerifyOtpStep2ViewModel getViewModel() {
        return null;
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.CountDownTimer startLoginTimer(@org.jetbrains.annotations.NotNull()
    android.widget.TextView timeView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinish, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> timeDown) {
        return null;
    }
    
    public final void setCustomerPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String mPhone) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNextClick() {
        return null;
    }
    
    public VerifyOtpStep2Fragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick) {
        super();
    }
    
    public VerifyOtpStep2Fragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step2/VerifyOtpStep2Fragment$Companion;", "", "()V", "TIMER_RESEND_OTP", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}