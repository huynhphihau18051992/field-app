package com.crayon.fieldapp.ui.screen.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0018R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/profile/ProfileViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "userRepository", "Lcom/crayon/fieldapp/data/repository/UserRepository;", "(Lcom/crayon/fieldapp/data/repository/UserRepository;)V", "_loginByQrCode", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "isLogoutSuccess", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "loginByQrCode", "Landroidx/lifecycle/LiveData;", "getLoginByQrCode", "()Landroidx/lifecycle/LiveData;", "user", "Lcom/crayon/fieldapp/data/remote/response/UserResponse;", "getUser", "setUser", "(Landroidx/lifecycle/MutableLiveData;)V", "getUserInfo", "", "token", "", "logout", "app_debug"})
public final class ProfileViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLogoutSuccess = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> _loginByQrCode = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> user;
    private final com.crayon.fieldapp.data.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLogoutSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>>> getLoginByQrCode() {
        return null;
    }
    
    public final void logout() {
    }
    
    public final void loginByQrCode(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> p0) {
    }
    
    public final void getUserInfo() {
    }
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.UserRepository userRepository) {
        super();
    }
}