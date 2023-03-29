package com.crayon.fieldapp.ui.screen.detailTask;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\'\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\rH\u0002J\u0010\u0010.\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0010\u0010/\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00061"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/DetailTaskFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentDetailTaskBinding;", "Lcom/crayon/fieldapp/ui/screen/detailTask/base/DetailTaskViewModel;", "Lcom/crayon/fieldapp/ui/base/dialog/getPhoto/GetPhotoDialogFragment$GetPhotoDialogListener;", "()V", "layoutId", "", "getLayoutId", "()I", "mediaAdapter", "Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaAdapter;", "taskId", "", "taskResponse", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "typeRecord", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/detailTask/base/DetailTaskViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "isTakeImageOnlyFromCamera", "", "taskType", "isVerifyLocation", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "onViewCreated", "view", "Landroid/view/View;", "openCamera", "openGallery", "openVideoCamera", "selectFromCamera", "selectFromGallery", "showImage", "url", "showRecordMediaType", "showSubTitle", "Companion", "app_release"})
public final class DetailTaskFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentDetailTaskBinding, com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel> implements com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment.GetPhotoDialogListener {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_detail_task;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String taskId;
    private java.lang.String typeRecord;
    private com.crayon.fieldapp.data.remote.response.TaskResponse taskResponse;
    private com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter mediaAdapter;
    public static final int CODE_REQUEST_GALLERY = 1;
    public static final com.crayon.fieldapp.ui.screen.detailTask.DetailTaskFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel getViewModel() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void showRecordMediaType(int taskType) {
    }
    
    private final boolean isTakeImageOnlyFromCamera(int taskType) {
        return false;
    }
    
    private final boolean isVerifyLocation(int taskType) {
        return false;
    }
    
    private final void showSubTitle(int taskType) {
    }
    
    @java.lang.Override()
    public void selectFromGallery() {
    }
    
    @java.lang.Override()
    public void selectFromCamera() {
    }
    
    private final void openCamera() {
    }
    
    private final void openVideoCamera() {
    }
    
    private final void openGallery() {
    }
    
    private final void showImage(java.lang.String url) {
    }
    
    public DetailTaskFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/DetailTaskFragment$Companion;", "", "()V", "CODE_REQUEST_GALLERY", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}