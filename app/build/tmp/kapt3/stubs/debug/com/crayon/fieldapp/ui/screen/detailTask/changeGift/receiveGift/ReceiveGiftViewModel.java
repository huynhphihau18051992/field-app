package com.crayon.fieldapp.ui.screen.detailTask.changeGift.receiveGift;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fJ&\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\n0\u001aj\b\u0012\u0004\u0012\u00020\n`\u001bR&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/receiveGift/ReceiveGiftViewModel;", "Lcom/crayon/fieldapp/ui/base/BaseViewModel;", "taskRepository", "Lcom/crayon/fieldapp/data/repository/TaskRepository;", "(Lcom/crayon/fieldapp/data/repository/TaskRepository;)V", "_gifts", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/crayon/fieldapp/utils/Event;", "Lcom/crayon/fieldapp/utils/Resource;", "", "Lcom/crayon/fieldapp/data/remote/response/GiftResponse;", "_updateGift", "", "gifts", "Landroidx/lifecycle/LiveData;", "getGifts", "()Landroidx/lifecycle/LiveData;", "getTaskRepository", "()Lcom/crayon/fieldapp/data/repository/TaskRepository;", "updateGift", "getUpdateGift", "fetchGifts", "", "taskId", "receiveGift", "gift", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class ReceiveGiftViewModel extends com.crayon.fieldapp.ui.base.BaseViewModel {
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.GiftResponse>>>> _gifts = null;
    private final androidx.lifecycle.MediatorLiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.String>>> _updateGift = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.data.repository.TaskRepository taskRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.util.List<com.crayon.fieldapp.data.remote.response.GiftResponse>>>> getGifts() {
        return null;
    }
    
    public final void fetchGifts(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Event<com.crayon.fieldapp.utils.Resource<java.lang.String>>> getUpdateGift() {
        return null;
    }
    
    public final void receiveGift(@org.jetbrains.annotations.NotNull()
    java.lang.String taskId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse> gift) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.repository.TaskRepository getTaskRepository() {
        return null;
    }
    
    public ReceiveGiftViewModel(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.repository.TaskRepository taskRepository) {
        super();
    }
}