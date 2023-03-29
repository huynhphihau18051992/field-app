package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fJ\u001e\u0010\u001a\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019\u00a8\u0006 "}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step2/VerifyOtpStep2ViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/TaskRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_resendOtpCustomer", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "_verifyCustomerOtp", "name", "Landroidx/lifecycle/MutableLiveData;", "", "getName", "()Landroidx/lifecycle/MutableLiveData;", "otp", "getOtp", "phone", "getPhone", "resendOtpCustomer", "Landroidx/lifecycle/LiveData;", "getResendOtpCustomer", "()Landroidx/lifecycle/LiveData;", "verifyCustomerOtp", "getVerifyCustomerOtp", "Lkotlinx/coroutines/Job;", "taskId", "mobile_number", "otp_number", "app_debug"})
public final class VerifyOtpStep2ViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> name = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> phone = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> otp = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> _verifyCustomerOtp = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> _resendOtpCustomer = null;
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOtp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> getVerifyCustomerOtp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job verifyCustomerOtp(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile_number, @org.jetbrains.annotations.NotNull()
    java.lang.String otp_number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> getResendOtpCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job resendOtpCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return null;
    }
    
    public VerifyOtpStep2ViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}