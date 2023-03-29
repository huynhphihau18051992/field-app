package com.crayon.fieldapp.ui.screen.monitor.store.listGroup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/store/listGroup/ListGroupViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "groupRepository", "Lcom/crayon/fieldapp/data/repository/GroupStoreRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/GroupStoreRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_groups", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "", "Lcom/crayon/fieldapp/data/remote/response/GroupStoreResponse;", "groups", "Landroidx/lifecycle/LiveData;", "getGroups", "()Landroidx/lifecycle/LiveData;", "groupsSource", "Lkotlinx/coroutines/Job;", "agencyId", "", "removeGroup", "groupId", "app_release"})
public final class ListGroupViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.GroupStoreResponse>>> _groups = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.GroupStoreResponse>>> groupsSource;
    private final com.crayon.fieldapp.data.repository.GroupStoreRepository groupRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.GroupStoreResponse>>> getGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getGroups(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job removeGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    public ListGroupViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.GroupStoreRepository groupRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}