package com.crayon.fieldapp.ui.screen.bank;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010\'\u001a\u00020$R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/crayon/fieldapp/ui/screen/bank/BankViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "userRepository", "Lcom/crayon/fieldapp/data/repository/UserRepository;", "context", "Landroid/content/Context;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/UserRepository;Landroid/content/Context;Lcom/crayon/fieldapp/AppDispatchers;)V", "bank", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "Lcom/crayon/fieldapp/data/remote/response/GetMessageResponse;", "bankSource", "Landroidx/lifecycle/LiveData;", "banks", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/model/SimpleModel;", "getBanks", "()Landroidx/lifecycle/MutableLiveData;", "setBanks", "(Landroidx/lifecycle/MutableLiveData;)V", "updateBank", "getUpdateBank", "()Landroidx/lifecycle/LiveData;", "user", "Lcom/crayon/fieldapp/data/remote/response/UserResponse;", "getUser", "setUser", "getBankInfo", "", "getListBank", "updateBankInfo", "Lkotlinx/coroutines/Job;", "tax", "", "bankNumber", "bankName", "bankBrand", "app_release"})
public final class BankViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> user;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.crayon.fieldapp.data.model.SimpleModel>> banks;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> bank = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> bankSource;
    private final com.crayon.fieldapp.data.repository.UserRepository userRepository = null;
    private final android.content.Context context = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.crayon.fieldapp.data.model.SimpleModel>> getBanks() {
        return null;
    }
    
    public final void setBanks(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.crayon.fieldapp.data.model.SimpleModel>> p0) {
    }
    
    public final void getBankInfo() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.GetMessageResponse>> getUpdateBank() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateBankInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String tax, @org.jetbrains.annotations.NotNull()
    java.lang.String bankNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String bankName, @org.jetbrains.annotations.NotNull()
    java.lang.String bankBrand) {
        return null;
    }
    
    public final void getListBank() {
    }
    
    public BankViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}