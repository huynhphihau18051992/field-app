package com.crayon.fieldapp.ui.screen.verifyOtp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017J\u0016\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017J\u000e\u0010#\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u0017R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/verifyOtp/VerifyOtpViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "userRepository", "Lcom/crayon/fieldapp/data/repository/UserRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "appPref", "Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "(Lcom/crayon/fieldapp/data/repository/UserRepository;Lcom/crayon/fieldapp/AppDispatchers;Lcom/crayon/fieldapp/data/local/pref/PrefHelper;)V", "_isResendOtpOfForgotPasswordSuccess", "Landroidx/lifecycle/MutableLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "", "_isResendOtpOfLoginSuccess", "_isVerifySuccess", "Landroidx/lifecycle/MediatorLiveData;", "isReSendOtpLoginSuccess", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "isResendOtpOfForgotPasswordSuccess", "isVerifySuccess", "otp", "", "getOtp", "()Landroidx/lifecycle/MutableLiveData;", "clickVerifyOtp", "", "phone", "device_id", "fcm_token", "clickVerifyOtpPassword", "resendOtp", "Lkotlinx/coroutines/Job;", "pass", "resendOtpPassword", "app_release"})
public final class VerifyOtpViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> otp = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.Boolean>>> _isVerifySuccess = null;
    private final androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.Boolean>>> _isResendOtpOfLoginSuccess = null;
    private final androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.Boolean>>> _isResendOtpOfForgotPasswordSuccess = null;
    private final com.crayon.fieldapp.data.repository.UserRepository userRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    private final com.crayon.fieldapp.data.local.pref.PrefHelper appPref = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOtp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.Boolean>>> isVerifySuccess() {
        return null;
    }
    
    public final void clickVerifyOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String otp, @org.jetbrains.annotations.NotNull()
    java.lang.String device_id, @org.jetbrains.annotations.NotNull()
    java.lang.String fcm_token) {
    }
    
    public final void clickVerifyOtpPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String otp) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.Boolean>>> isReSendOtpLoginSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job resendOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String pass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.Boolean>>> isResendOtpOfForgotPasswordSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job resendOtpPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return null;
    }
    
    public VerifyOtpViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.pref.PrefHelper appPref) {
        super();
    }
}