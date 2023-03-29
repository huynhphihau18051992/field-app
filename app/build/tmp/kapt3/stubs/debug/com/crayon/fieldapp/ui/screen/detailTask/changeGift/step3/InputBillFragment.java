package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001(B\u001b\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\"\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0007H\u0002J\b\u0010#\u001a\u00020\u0007H\u0002J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\nJ\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\nH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006)"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step3/InputBillFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentInputNameBinding;", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step3/InputBillViewModel;", "onNextClick", "Lkotlin/Function1;", "Lcom/crayon/fieldapp/data/remote/response/CreateCustomerBillResponse;", "", "(Lkotlin/jvm/functions/Function1;)V", "_customerId", "", "layoutId", "", "getLayoutId", "()I", "getOnNextClick", "()Lkotlin/jvm/functions/Function1;", "taskId", "updateImageAdapter", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step3/adapter/UploadMediaAdapter;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step3/InputBillViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "openCamera", "openGallery", "setCustomerId", "mCustomerId", "showImage", "url", "Companion", "app_debug"})
public final class InputBillFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentInputNameBinding, com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3.InputBillViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_input_bill;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String taskId;
    private java.lang.String _customerId;
    private com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3.adapter.UploadMediaAdapter updateImageAdapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse, kotlin.Unit> onNextClick = null;
    public static final int CODE_REQUEST_GALLERY = 1;
    public static final com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3.InputBillFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3.InputBillViewModel getViewModel() {
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
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void openCamera() {
    }
    
    private final void openGallery() {
    }
    
    private final void showImage(java.lang.String url) {
    }
    
    public final void setCustomerId(@org.jetbrains.annotations.NotNull()
    java.lang.String mCustomerId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse, kotlin.Unit> getOnNextClick() {
        return null;
    }
    
    public InputBillFragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.CreateCustomerBillResponse, kotlin.Unit> onNextClick) {
        super();
    }
    
    public InputBillFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/step3/InputBillFragment$Companion;", "", "()V", "CODE_REQUEST_GALLERY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}