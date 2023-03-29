package com.crayon.fieldapp.ui.screen.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fJ\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u001b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000fH\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/login/LoginViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "userRepository", "Lcom/crayon/fieldapp/data/repository/UserRepository;", "(Lcom/crayon/fieldapp/data/repository/UserRepository;)V", "_isVerifySuccess", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "", "isVerifySuccess", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "password", "Landroidx/lifecycle/MutableLiveData;", "", "getPassword", "()Landroidx/lifecycle/MutableLiveData;", "phone", "getPhone", "clickLogin", "", "mPhone", "mPassword", "validateEmail", "email", "validateForm", "validatePassword", "app_debug"})
public final class LoginViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> phone = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> password = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.Boolean>>> _isVerifySuccess = null;
    private final com.crayon.fieldapp.data.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.Boolean>>> isVerifySuccess() {
        return null;
    }
    
    private final boolean validateForm(java.lang.String email, java.lang.String password) {
        return false;
    }
    
    private final boolean validateEmail(java.lang.String email) {
        return false;
    }
    
    private final boolean validatePassword(java.lang.String password) {
        return false;
    }
    
    public final void clickLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String mPhone, @org.jetbrains.annotations.NotNull()
    java.lang.String mPassword) {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.UserRepository userRepository) {
        super();
    }
}