package com.crayon.fieldapp.ui.base.dialog.selectRole;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB-\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter$SelectMembersViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/RoleResponse;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "mListener", "Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter$SelectRoleListener;", "(Ljava/util/ArrayList;Landroid/content/Context;Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter$SelectRoleListener;)V", "getItemCount", "", "getSelectedRole", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateSelectedPlayer", "agencyId", "", "SelectMembersViewHolder", "SelectRoleListener", "app_debug"})
public final class SelectAgencyRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter.SelectMembersViewHolder> {
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.RoleResponse> items = null;
    private final android.content.Context context = null;
    private final com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter.SelectRoleListener mListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter.SelectMembersViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter.SelectMembersViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.crayon.fieldapp.data.remote.response.RoleResponse getSelectedRole() {
        return null;
    }
    
    public final void updateSelectedPlayer(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId) {
    }
    
    public SelectAgencyRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.RoleResponse> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter.SelectRoleListener mListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter$SelectMembersViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter;Landroid/view/View;)V", "imgChecked", "Landroid/widget/ImageView;", "getImgChecked", "()Landroid/widget/ImageView;", "setImgChecked", "(Landroid/widget/ImageView;)V", "tvName", "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "setTvName", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class SelectMembersViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgChecked;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        public final void setTvName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgChecked() {
            return null;
        }
        
        public final void setImgChecked(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public SelectMembersViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter$SelectRoleListener;", "", "onRoleItemClicked", "", "agencyId", "", "app_debug"})
    public static abstract interface SelectRoleListener {
        
        public abstract void onRoleItemClicked(@org.jetbrains.annotations.NotNull()
        java.lang.String agencyId);
    }
}