package com.crayon.fieldapp.ui.screen.detailGroupUser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailGroupUser/DetailGroupUserViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "groupUserRepository", "Lcom/crayon/fieldapp/data/repository/GroupUserRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/GroupUserRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "members", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/crayon/fieldapp/data/remote/response/MemberResponse;", "getMembers", "()Landroidx/lifecycle/MutableLiveData;", "getMemberOfGroupUser", "", "agencyId", "", "groupUserId", "app_debug"})
public final class DetailGroupUserViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>> members = null;
    private final com.crayon.fieldapp.data.repository.GroupUserRepository groupUserRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>> getMembers() {
        return null;
    }
    
    public final void getMemberOfGroupUser(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupUserId) {
    }
    
    public DetailGroupUserViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.GroupUserRepository groupUserRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}