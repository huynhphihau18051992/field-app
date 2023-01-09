package com.crayon.fieldapp.ui.screen.detailTask.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 .2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003./0B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0006\u0010\u0013\u001a\u00020\u0011J\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0004j\b\u0012\u0004\u0012\u00020\u0015`\u0006J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0015J\u001c\u0010\u0019\u001a\u00020\u00112\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001c\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000fJ\u000e\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u0017J\u0016\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020%R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaAdapter$GroupViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaData;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getItems", "()Ljava/util/ArrayList;", "mListener", "Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaAdapter$MediaListener;", "addImages", "", "listImage", "clearData", "getData", "", "getItemCount", "", "getNotes", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeImage", "setMediaListener", "listener", "showProgress", "isShow", "", "updateImage", "image", "updateNote", "note", "index", "updateUploadImageStatus", "mUri", "isCompleted", "Companion", "GroupViewHolder", "MediaListener", "app_debug"})
public final class MediaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter.GroupViewHolder> {
    private com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter.MediaListener mListener;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData> items = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    public static final int MEDIA_IMAGE = 0;
    public static final int MEDIA_VIDEO = 1;
    public static final com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter.GroupViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter.GroupViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateUploadImageStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String mUri, boolean isCompleted) {
    }
    
    public final void addImages(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData> listImage) {
    }
    
    public final void updateImage(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData image) {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull()
    java.lang.String note, int index) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void removeImage(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getData() {
        return null;
    }
    
    public final void showProgress(boolean isShow) {
    }
    
    public final void clearData() {
    }
    
    public final void setMediaListener(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter.MediaListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public MediaAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaAdapter;Landroid/view/View;)V", "imgClose", "Landroid/widget/ImageView;", "getImgClose", "()Landroid/widget/ImageView;", "setImgClose", "(Landroid/widget/ImageView;)V", "imgMediaType", "getImgMediaType", "setImgMediaType", "imgUpload", "getImgUpload", "setImgUpload", "pbUploading", "Landroid/widget/ProgressBar;", "getPbUploading", "()Landroid/widget/ProgressBar;", "setPbUploading", "(Landroid/widget/ProgressBar;)V", "app_debug"})
    public final class GroupViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgUpload;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgClose;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgMediaType;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ProgressBar pbUploading;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgUpload() {
            return null;
        }
        
        public final void setImgUpload(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgClose() {
            return null;
        }
        
        public final void setImgClose(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgMediaType() {
            return null;
        }
        
        public final void setImgMediaType(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ProgressBar getPbUploading() {
            return null;
        }
        
        public final void setPbUploading(@org.jetbrains.annotations.NotNull()
        android.widget.ProgressBar p0) {
        }
        
        public GroupViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaAdapter$MediaListener;", "", "onItemClicked", "", "item", "Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaData;", "index", "", "onItemRemoveClicked", "app_debug"})
    public static abstract interface MediaListener {
        
        public abstract void onItemRemoveClicked(@org.jetbrains.annotations.NotNull()
        com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData item, int index);
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData item, int index);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaAdapter$Companion;", "", "()V", "MEDIA_IMAGE", "", "MEDIA_VIDEO", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}