package com.crayon.fieldapp.ui.screen.detailNotification;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailNotification/DetailNotificationViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "userRepository", "Lcom/crayon/fieldapp/data/repository/UserRepository;", "(Lcom/crayon/fieldapp/data/repository/UserRepository;)V", "job", "Landroidx/lifecycle/MutableLiveData;", "Lcom/crayon/fieldapp/data/model/Job;", "getJob", "()Landroidx/lifecycle/MutableLiveData;", "setJob", "(Landroidx/lifecycle/MutableLiveData;)V", "listItem", "", "Lcom/crayon/fieldapp/data/model/Task;", "getListItem", "setListItem", "fetchDetailUser", "", "userId", "", "app_release"})
public final class DetailNotificationViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.model.Job> job;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.crayon.fieldapp.data.model.Task>> listItem;
    private final com.crayon.fieldapp.data.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.model.Job> getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.model.Job> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.crayon.fieldapp.data.model.Task>> getListItem() {
        return null;
    }
    
    public final void setListItem(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.crayon.fieldapp.data.model.Task>> p0) {
    }
    
    public final void fetchDetailUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    public DetailNotificationViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.UserRepository userRepository) {
        super();
    }
}