package com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\'\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001b\u0010\u001e\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u0006-"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/store/listStore/detail/DetailStoreFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentDetailStoreBinding;", "Lcom/crayon/fieldapp/ui/screen/monitor/store/listStore/detail/DetailStoreViewModel;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "agencyId", "", "getAgencyId", "()Ljava/lang/String;", "setAgencyId", "(Ljava/lang/String;)V", "gmap", "Lcom/google/android/gms/maps/GoogleMap;", "layoutId", "", "getLayoutId", "()I", "location", "Lcom/google/android/gms/maps/model/LatLng;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "name", "storeId", "getStoreId", "setStoreId", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/monitor/store/listStore/detail/DetailStoreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onMapReady", "p0", "onViewCreated", "view", "Landroid/view/View;", "app_debug"})
public final class DetailStoreFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentDetailStoreBinding, com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail.DetailStoreViewModel> implements com.google.android.gms.maps.OnMapReadyCallback {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_detail_store;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String agencyId;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String storeId;
    private com.google.android.gms.maps.GoogleMap gmap;
    private com.google.android.gms.maps.model.LatLng location;
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.SupportMapFragment mapFragment;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail.DetailStoreViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAgencyId() {
        return null;
    }
    
    public final void setAgencyId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStoreId() {
        return null;
    }
    
    public final void setStoreId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.SupportMapFragment getMapFragment() {
        return null;
    }
    
    public final void setMapFragment(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.SupportMapFragment p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    public DetailStoreFragment() {
        super();
    }
}