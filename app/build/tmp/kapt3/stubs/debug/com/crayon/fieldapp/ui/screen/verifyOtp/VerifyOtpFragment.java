package com.crayon.fieldapp.ui.screen.verifyOtp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\'2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J?\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0,2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020!0.R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00063"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/verifyOtp/VerifyOtpFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentVerifyOtpBinding;", "Lcom/crayon/fieldapp/ui/screen/verifyOtp/VerifyOtpViewModel;", "()V", "device_id", "", "getDevice_id", "()Ljava/lang/String;", "setDevice_id", "(Ljava/lang/String;)V", "fcm_token", "getFcm_token", "setFcm_token", "layoutId", "", "getLayoutId", "()I", "mMode", "password", "getPassword", "setPassword", "phone", "getPhone", "setPhone", "timer", "Landroid/os/CountDownTimer;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/verifyOtp/VerifyOtpViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onViewCreated", "view", "Landroid/view/View;", "startLoginTimer", "timeView", "Landroid/widget/TextView;", "onFinish", "Lkotlin/Function0;", "timeDown", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "time", "Companion", "app_debug"})
public final class VerifyOtpFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentVerifyOtpBinding, com.crayon.fieldapp.ui.screen.verifyOtp.VerifyOtpViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_verify_otp;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String phone;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String device_id;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String fcm_token;
    private int mMode = 0;
    private android.os.CountDownTimer timer;
    public static final int VERIFY_LOGIN_MODE = 0;
    public static final int VERIFY_RESET_PASSWORD_MODE = 1;
    public static final com.crayon.fieldapp.ui.screen.verifyOtp.VerifyOtpFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.verifyOtp.VerifyOtpViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDevice_id() {
        return null;
    }
    
    public final void setDevice_id(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFcm_token() {
        return null;
    }
    
    public final void setFcm_token(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.CountDownTimer startLoginTimer(@org.jetbrains.annotations.NotNull()
    android.widget.TextView timeView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinish, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> timeDown) {
        return null;
    }
    
    public VerifyOtpFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/verifyOtp/VerifyOtpFragment$Companion;", "", "()V", "VERIFY_LOGIN_MODE", "", "VERIFY_RESET_PASSWORD_MODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}