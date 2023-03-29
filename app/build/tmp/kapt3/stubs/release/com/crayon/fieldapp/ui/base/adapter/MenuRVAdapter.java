package com.crayon.fieldapp.ui.base.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter$MenuOptionViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/model/GridMenu;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "mListener", "Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter$MenuListener;", "(Ljava/util/ArrayList;Landroid/content/Context;Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter$MenuListener;)V", "getMListener", "()Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter$MenuListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MenuListener", "MenuOptionViewHolder", "app_release"})
public final class MenuRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crayon.fieldapp.ui.base.adapter.MenuRVAdapter.MenuOptionViewHolder> {
    private final java.util.ArrayList<com.crayon.fieldapp.data.model.GridMenu> items = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.crayon.fieldapp.ui.base.adapter.MenuRVAdapter.MenuListener mListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.base.adapter.MenuRVAdapter.MenuOptionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.adapter.MenuRVAdapter.MenuOptionViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.ui.base.adapter.MenuRVAdapter.MenuListener getMListener() {
        return null;
    }
    
    public MenuRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.model.GridMenu> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.adapter.MenuRVAdapter.MenuListener mListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter$MenuOptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter;Landroid/view/View;)V", "imgBg", "Landroid/widget/RelativeLayout;", "getImgBg", "()Landroid/widget/RelativeLayout;", "setImgBg", "(Landroid/widget/RelativeLayout;)V", "ivIcon", "Landroid/widget/ImageView;", "getIvIcon", "()Landroid/widget/ImageView;", "setIvIcon", "(Landroid/widget/ImageView;)V", "tvContent", "Landroid/widget/TextView;", "getTvContent", "()Landroid/widget/TextView;", "setTvContent", "(Landroid/widget/TextView;)V", "app_release"})
    public final class MenuOptionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvContent;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView ivIcon;
        @org.jetbrains.annotations.NotNull()
        private android.widget.RelativeLayout imgBg;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvContent() {
            return null;
        }
        
        public final void setTvContent(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvIcon() {
            return null;
        }
        
        public final void setIvIcon(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getImgBg() {
            return null;
        }
        
        public final void setImgBg(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout p0) {
        }
        
        public MenuOptionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter$MenuListener;", "", "onMenuItemClicked", "", "id", "", "app_release"})
    public static abstract interface MenuListener {
        
        public abstract void onMenuItemClicked(int id);
    }
}