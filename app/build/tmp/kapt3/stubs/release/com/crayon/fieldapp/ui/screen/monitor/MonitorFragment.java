package com.crayon.fieldapp.ui.screen.monitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\fH\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/MonitorFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentMonitorBinding;", "Lcom/crayon/fieldapp/ui/screen/monitor/MonitorViewModel;", "Lcom/crayon/fieldapp/ui/base/dialog/selectAgency/SelectAgencyDialog$SelectAgencyListener;", "Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter$MenuListener;", "()V", "adapter", "Lcom/crayon/fieldapp/ui/base/adapter/MenuRVAdapter;", "agneycId", "", "layoutId", "", "getLayoutId", "()I", "mLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "mListAgency", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/RoleResponse;", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/monitor/MonitorViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "inital", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onMenuItemClicked", "id", "onSelectAgencyItemClicked", "role", "onViewCreated", "view", "Landroid/view/View;", "Companion", "app_release"})
public final class MonitorFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentMonitorBinding, com.crayon.fieldapp.ui.screen.monitor.MonitorViewModel> implements com.crayon.fieldapp.ui.base.dialog.selectAgency.SelectAgencyDialog.SelectAgencyListener, com.crayon.fieldapp.ui.base.adapter.MenuRVAdapter.MenuListener {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_monitor;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private com.crayon.fieldapp.ui.base.adapter.MenuRVAdapter adapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;
    private java.lang.String agneycId;
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.response.RoleResponse> mListAgency;
    private static final int TIME_KEEPING = 0;
    private static final int UPDATE_STATUS = 1;
    private static final int EMPLOYEE_AGENCY = 2;
    private static final int APPLICATION = 3;
    private static final int NOTIFICAITON = 4;
    private static final int STORE = 5;
    private static final int PROJECT = 6;
    private static final int REPORT_SALES = 7;
    private static final int REPORT_COMPITETOR = 8;
    private static final int TRACKING = 9;
    private static final int CHANGE_GIFT = 10;
    public static final com.crayon.fieldapp.ui.screen.monitor.MonitorFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.monitor.MonitorViewModel getViewModel() {
        return null;
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
    
    private final void inital() {
    }
    
    @java.lang.Override()
    public void onMenuItemClicked(int id) {
    }
    
    @java.lang.Override()
    public void onSelectAgencyItemClicked(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.RoleResponse role) {
    }
    
    public MonitorFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006\u00a8\u0006\u001b"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/monitor/MonitorFragment$Companion;", "", "()V", "APPLICATION", "", "getAPPLICATION", "()I", "CHANGE_GIFT", "getCHANGE_GIFT", "EMPLOYEE_AGENCY", "getEMPLOYEE_AGENCY", "NOTIFICAITON", "getNOTIFICAITON", "PROJECT", "getPROJECT", "REPORT_COMPITETOR", "getREPORT_COMPITETOR", "REPORT_SALES", "getREPORT_SALES", "STORE", "getSTORE", "TIME_KEEPING", "getTIME_KEEPING", "TRACKING", "getTRACKING", "UPDATE_STATUS", "getUPDATE_STATUS", "app_release"})
    public static final class Companion {
        
        public final int getTIME_KEEPING() {
            return 0;
        }
        
        public final int getUPDATE_STATUS() {
            return 0;
        }
        
        public final int getEMPLOYEE_AGENCY() {
            return 0;
        }
        
        public final int getAPPLICATION() {
            return 0;
        }
        
        public final int getNOTIFICAITON() {
            return 0;
        }
        
        public final int getSTORE() {
            return 0;
        }
        
        public final int getPROJECT() {
            return 0;
        }
        
        public final int getREPORT_SALES() {
            return 0;
        }
        
        public final int getREPORT_COMPITETOR() {
            return 0;
        }
        
        public final int getTRACKING() {
            return 0;
        }
        
        public final int getCHANGE_GIFT() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}