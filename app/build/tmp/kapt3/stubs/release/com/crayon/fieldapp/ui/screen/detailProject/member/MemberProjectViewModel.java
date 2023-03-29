package com.crayon.fieldapp.ui.screen.detailProject.member;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J.\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001dj\b\u0012\u0004\u0012\u00020\u0018`\u001eR \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000fR \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailProject/member/MemberProjectViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "projectRepository", "Lcom/crayon/fieldapp/data/repository/ProjectRepository;", "dispatchers", "Lcom/crayon/fieldapp/AppDispatchers;", "(Lcom/crayon/fieldapp/data/repository/ProjectRepository;Lcom/crayon/fieldapp/AppDispatchers;)V", "_members", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Resource;", "", "Lcom/crayon/fieldapp/data/remote/response/MemberResponse;", "isRemoveUserSuccess", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "memberSource", "Landroidx/lifecycle/LiveData;", "members", "getMembers", "()Landroidx/lifecycle/LiveData;", "getMemberProject", "Lkotlinx/coroutines/Job;", "agencyId", "", "projectId", "removeMembersToProject", "", "ids", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_release"})
public final class MemberProjectViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>>> _members = null;
    private androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>>> memberSource;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRemoveUserSuccess = null;
    private final com.crayon.fieldapp.data.repository.ProjectRepository projectRepository = null;
    private final com.crayon.fieldapp.AppDispatchers dispatchers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.MemberResponse>>> getMembers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getMemberProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRemoveUserSuccess() {
        return null;
    }
    
    public final void removeMembersToProject(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId, @org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> ids) {
    }
    
    public MemberProjectViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.ProjectRepository projectRepository, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.AppDispatchers dispatchers) {
        super();
    }
}