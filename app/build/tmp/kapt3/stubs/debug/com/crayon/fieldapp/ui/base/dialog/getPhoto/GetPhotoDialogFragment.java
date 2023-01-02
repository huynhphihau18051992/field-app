package com.crayon.fieldapp.ui.base.dialog.getPhoto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/getPhoto/GetPhotoDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "btnCamera", "Landroid/widget/TextView;", "getBtnCamera", "()Landroid/widget/TextView;", "setBtnCamera", "(Landroid/widget/TextView;)V", "btnCancel", "getBtnCancel", "setBtnCancel", "btnGallery", "getBtnGallery", "setBtnGallery", "mListener", "Lcom/crayon/fieldapp/ui/base/dialog/getPhoto/GetPhotoDialogFragment$GetPhotoDialogListener;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setListener", "", "listener", "GetPhotoDialogListener", "app_debug"})
public final class GetPhotoDialogFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView btnCancel;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView btnGallery;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView btnCamera;
    private com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment.GetPhotoDialogListener mListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBtnCancel() {
        return null;
    }
    
    public final void setBtnCancel(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBtnGallery() {
        return null;
    }
    
    public final void setBtnGallery(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getBtnCamera() {
        return null;
    }
    
    public final void setBtnCamera(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment.GetPhotoDialogListener listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public GetPhotoDialogFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/getPhoto/GetPhotoDialogFragment$GetPhotoDialogListener;", "", "selectFromCamera", "", "selectFromGallery", "app_debug"})
    public static abstract interface GetPhotoDialogListener {
        
        public abstract void selectFromGallery();
        
        public abstract void selectFromCamera();
    }
}