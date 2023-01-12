package com.crayon.fieldapp.ui.base.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/crayon/fieldapp/ui/base/adapter/SwitchShiftRequestAdapter;", "Lcom/crayon/fieldapp/ui/base/BaseRecyclerAdapter;", "Lcom/crayon/fieldapp/data/remote/response/ApplicationResponse;", "Lcom/crayon/fieldapp/databinding/ItemSwitchShiftRequestBinding;", "acceptClickListener", "Lkotlin/Function1;", "", "rejectClickListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAcceptClickListener", "()Lkotlin/jvm/functions/Function1;", "getRejectClickListener", "bindFirstTime", "binding", "getLayoutRes", "", "viewType", "app_debug"})
public final class SwitchShiftRequestAdapter extends com.crayon.fieldapp.ui.base.BaseRecyclerAdapter<com.crayon.fieldapp.data.remote.response.ApplicationResponse, com.crayon.fieldapp.databinding.ItemSwitchShiftRequestBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ApplicationResponse, kotlin.Unit> acceptClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ApplicationResponse, kotlin.Unit> rejectClickListener = null;
    
    @java.lang.Override()
    protected int getLayoutRes(int viewType) {
        return 0;
    }
    
    @java.lang.Override()
    protected void bindFirstTime(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.databinding.ItemSwitchShiftRequestBinding binding) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ApplicationResponse, kotlin.Unit> getAcceptClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ApplicationResponse, kotlin.Unit> getRejectClickListener() {
        return null;
    }
    
    public SwitchShiftRequestAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.ApplicationResponse, kotlin.Unit> acceptClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.ApplicationResponse, kotlin.Unit> rejectClickListener) {
        super(null);
    }
    
    public SwitchShiftRequestAdapter() {
        super(null);
    }
}