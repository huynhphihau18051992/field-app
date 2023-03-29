package com.crayon.fieldapp.ui.base.dialog.selectAgency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\'H\u0016J\u000e\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006."}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/selectAgency/SelectAgencyDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter$SelectRoleListener;", "()V", "adapter", "Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter;", "getAdapter", "()Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter;", "setAdapter", "(Lcom/crayon/fieldapp/ui/base/dialog/selectRole/SelectAgencyRVAdapter;)V", "btnChoose", "Landroid/widget/Button;", "getBtnChoose", "()Landroid/widget/Button;", "setBtnChoose", "(Landroid/widget/Button;)V", "mLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getMLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setMLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "mListener", "Lcom/crayon/fieldapp/ui/base/dialog/selectAgency/SelectAgencyDialog$SelectAgencyListener;", "rvAgency", "Landroidx/recyclerview/widget/RecyclerView;", "getRvAgency", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvAgency", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRoleItemClicked", "", "agencyId", "", "onStart", "setListener", "listener", "SelectAgencyListener", "app_release"})
public final class SelectAgencyDialog extends androidx.fragment.app.DialogFragment implements com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter.SelectRoleListener {
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView rvAgency;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button btnChoose;
    private com.crayon.fieldapp.ui.base.dialog.selectAgency.SelectAgencyDialog.SelectAgencyListener mListener;
    @org.jetbrains.annotations.NotNull()
    public com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRvAgency() {
        return null;
    }
    
    public final void setRvAgency(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtnChoose() {
        return null;
    }
    
    public final void setBtnChoose(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager getMLayoutManager() {
        return null;
    }
    
    public final void setMLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager p0) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.dialog.selectAgency.SelectAgencyDialog.SelectAgencyListener listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onRoleItemClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String agencyId) {
    }
    
    public SelectAgencyDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/selectAgency/SelectAgencyDialog$SelectAgencyListener;", "", "onSelectAgencyItemClicked", "", "agencyId", "Lcom/crayon/fieldapp/data/remote/response/RoleResponse;", "app_release"})
    public static abstract interface SelectAgencyListener {
        
        public abstract void onSelectAgencyItemClicked(@org.jetbrains.annotations.NotNull()
        com.crayon.fieldapp.data.remote.response.RoleResponse agencyId);
    }
}