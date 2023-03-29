package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006#"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step4/SelectPromotionFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentSelectPromotionBinding;", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step4/SelectPromotionViewModel;", "onNextClick", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "_billId", "", "_products", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/ProductResponse;", "Lkotlin/collections/ArrayList;", "_projectId", "layoutId", "", "getLayoutId", "()I", "mDetailRVAdapter", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step4/adapter/SelectPromotionRVAdapter;", "getOnNextClick", "()Lkotlin/jvm/functions/Function0;", "taskId", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step4/SelectPromotionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "setBillId", "mBillId", "app_release"})
public final class SelectPromotionFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentSelectPromotionBinding, com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.SelectPromotionViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_select_promotion;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String taskId;
    private java.lang.String _projectId;
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> _products;
    private java.lang.String _billId;
    private com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.adapter.SelectPromotionRVAdapter mDetailRVAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.SelectPromotionViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setBillId(@org.jetbrains.annotations.NotNull()
    java.lang.String mBillId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNextClick() {
        return null;
    }
    
    public SelectPromotionFragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNextClick) {
        super();
    }
    
    public SelectPromotionFragment() {
        super();
    }
}