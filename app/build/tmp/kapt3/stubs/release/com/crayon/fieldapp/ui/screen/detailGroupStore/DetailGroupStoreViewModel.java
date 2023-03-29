package com.crayon.fieldapp.ui.screen.detailGroupStore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailGroupStore/DetailGroupStoreViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "groupRepository", "Lcom/crayon/fieldapp/data/repository/GroupStoreRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/GroupStoreRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "groups", "Landroidx/lifecycle/MutableLiveData;", "Lcom/crayon/fieldapp/data/remote/response/GroupStoreResponse;", "getGroups", "()Landroidx/lifecycle/MutableLiveData;", "setGroups", "(Landroidx/lifecycle/MutableLiveData;)V", "getDetailGroup", "Lkotlinx/coroutines/Job;", "agencyId", "", "groupId", "app_release"})
public final class DetailGroupStoreViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.GroupStoreResponse> groups;
    private final com.crayon.fieldapp.data.repository.GroupStoreRepository groupRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.GroupStoreResponse> getGroups() {
        return null;
    }
    
    public final void setGroups(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.GroupStoreResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDetailGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    public DetailGroupStoreViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.GroupStoreRepository groupRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}