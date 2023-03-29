package com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001$B[\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u001e\u0010\u0018\u001a\u00020\u000b2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0006\u0010\u001a\u001a\u00020\u000bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0012R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/adapter/OrderRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/adapter/OrderRVAdapter$GroupViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/OrderResponse;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "onItemClickListener", "Lkotlin/Function1;", "", "onItemEditListener", "isEdit", "", "(Ljava/util/ArrayList;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "getContext", "()Landroid/content/Context;", "()Z", "getItems", "()Ljava/util/ArrayList;", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "getOnItemEditListener", "addAll", "mOrders", "clearData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "GroupViewHolder", "app_debug"})
public final class OrderRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.OrderRVAdapter.GroupViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.OrderResponse> items = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.OrderResponse, kotlin.Unit> onItemClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.OrderResponse, kotlin.Unit> onItemEditListener = null;
    private final boolean isEdit = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.OrderRVAdapter.GroupViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.OrderRVAdapter.GroupViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void clearData() {
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.OrderResponse> mOrders) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.OrderResponse> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.OrderResponse, kotlin.Unit> getOnItemClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.OrderResponse, kotlin.Unit> getOnItemEditListener() {
        return null;
    }
    
    public final boolean isEdit() {
        return false;
    }
    
    public OrderRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.OrderResponse> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.OrderResponse, kotlin.Unit> onItemClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.OrderResponse, kotlin.Unit> onItemEditListener, boolean isEdit) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/adapter/OrderRVAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/adapter/OrderRVAdapter;Landroid/view/View;)V", "imgEdit", "Landroid/widget/ImageView;", "getImgEdit", "()Landroid/widget/ImageView;", "setImgEdit", "(Landroid/widget/ImageView;)V", "txtLoadMore", "Landroid/widget/TextView;", "getTxtLoadMore", "()Landroid/widget/TextView;", "setTxtLoadMore", "(Landroid/widget/TextView;)V", "txtOrderId", "getTxtOrderId", "setTxtOrderId", "txtPrice", "getTxtPrice", "setTxtPrice", "txtProductName", "getTxtProductName", "setTxtProductName", "txtQuality", "getTxtQuality", "setTxtQuality", "txtTotal", "getTxtTotal", "setTxtTotal", "app_debug"})
    public final class GroupViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtOrderId;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtProductName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtQuality;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtPrice;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtTotal;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtLoadMore;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgEdit;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtOrderId() {
            return null;
        }
        
        public final void setTxtOrderId(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtProductName() {
            return null;
        }
        
        public final void setTxtProductName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtQuality() {
            return null;
        }
        
        public final void setTxtQuality(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtPrice() {
            return null;
        }
        
        public final void setTxtPrice(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtTotal() {
            return null;
        }
        
        public final void setTxtTotal(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtLoadMore() {
            return null;
        }
        
        public final void setTxtLoadMore(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgEdit() {
            return null;
        }
        
        public final void setImgEdit(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public GroupViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}