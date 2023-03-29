package com.crayon.fieldapp.ui.screen.avatar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/avatar/AvatarFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentAvatarBinding;", "Lcom/crayon/fieldapp/ui/screen/avatar/AvatarViewModel;", "Lcom/crayon/fieldapp/ui/base/dialog/getPhoto/GetPhotoDialogFragment$GetPhotoDialogListener;", "()V", "avatarRef", "Landroid/net/Uri;", "bodyRef", "layoutId", "", "getLayoutId", "()I", "tyeImage", "", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/avatar/AvatarViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onViewCreated", "view", "Landroid/view/View;", "openCamera", "openGallery", "selectFromCamera", "selectFromGallery", "Companion", "app_debug"})
public final class AvatarFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentAvatarBinding, com.crayon.fieldapp.ui.screen.avatar.AvatarViewModel> implements com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment.GetPhotoDialogListener {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_avatar;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String tyeImage = "";
    private android.net.Uri avatarRef;
    private android.net.Uri bodyRef;
    public static final int CODE_REQUEST_GALLERY = 1;
    public static final com.crayon.fieldapp.ui.screen.avatar.AvatarFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.avatar.AvatarViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
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
    
    private final void openGallery() {
    }
    
    private final void openCamera() {
    }
    
    @java.lang.Override()
    public void selectFromGallery() {
    }
    
    @java.lang.Override()
    public void selectFromCamera() {
    }
    
    public AvatarFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/avatar/AvatarFragment$Companion;", "", "()V", "CODE_REQUEST_GALLERY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}