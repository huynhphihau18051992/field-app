package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00010B\u00d8\u0001\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00128\b\u0002\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n\u0012#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u0012#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u0012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010\"\u001a\u00020\u0010J\b\u0010#\u001a\u00020$H\u0016J\u001c\u0010%\u001a\u00020\u00102\n\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\'\u001a\u00020$H\u0016J\u001c\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020$H\u0016J\u000e\u0010,\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010/\u001a\u00020$R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0019R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR,\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR,\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dRA\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00061"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/GiftRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/GiftRVAdapter$GroupViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/GiftResponse;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "onItemSelectedListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "gift", "", "isChecked", "", "onItemPlusListener", "Lkotlin/Function1;", "onItemMinusListener", "onItemQuantityListener", "isEdit", "(Ljava/util/ArrayList;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "getContext", "()Landroid/content/Context;", "()Z", "getItems", "()Ljava/util/ArrayList;", "getOnItemMinusListener", "()Lkotlin/jvm/functions/Function1;", "getOnItemPlusListener", "getOnItemQuantityListener", "getOnItemSelectedListener", "()Lkotlin/jvm/functions/Function2;", "clearData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onSelectItem", "onUnSelectItem", "onUpdateQuantity", "quantity", "GroupViewHolder", "app_release"})
public final class GiftRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.GiftRVAdapter.GroupViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse> items = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.crayon.fieldapp.data.remote.response.GiftResponse, java.lang.Boolean, kotlin.Unit> onItemSelectedListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> onItemPlusListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> onItemMinusListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> onItemQuantityListener = null;
    private final boolean isEdit = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.GiftRVAdapter.GroupViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.GiftRVAdapter.GroupViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void clearData() {
    }
    
    public final void onSelectItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.GiftResponse gift) {
    }
    
    public final void onUnSelectItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.GiftResponse gift) {
    }
    
    public final void onUpdateQuantity(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.GiftResponse gift, int quantity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.crayon.fieldapp.data.remote.response.GiftResponse, java.lang.Boolean, kotlin.Unit> getOnItemSelectedListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> getOnItemPlusListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> getOnItemMinusListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> getOnItemQuantityListener() {
        return null;
    }
    
    public final boolean isEdit() {
        return false;
    }
    
    public GiftRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.crayon.fieldapp.data.remote.response.GiftResponse, ? super java.lang.Boolean, kotlin.Unit> onItemSelectedListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> onItemPlusListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> onItemMinusListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.GiftResponse, kotlin.Unit> onItemQuantityListener, boolean isEdit) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/GiftRVAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/GiftRVAdapter;Landroid/view/View;)V", "cvGift", "Landroid/widget/CheckBox;", "getCvGift", "()Landroid/widget/CheckBox;", "setCvGift", "(Landroid/widget/CheckBox;)V", "imgMinus", "Landroid/widget/ImageView;", "getImgMinus", "()Landroid/widget/ImageView;", "setImgMinus", "(Landroid/widget/ImageView;)V", "imgPlus", "getImgPlus", "setImgPlus", "txtNumber", "Landroid/widget/TextView;", "getTxtNumber", "()Landroid/widget/TextView;", "setTxtNumber", "(Landroid/widget/TextView;)V", "app_release"})
    public final class GroupViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox cvGift;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtNumber;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgPlus;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgMinus;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getCvGift() {
            return null;
        }
        
        public final void setCvGift(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtNumber() {
            return null;
        }
        
        public final void setTxtNumber(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgPlus() {
            return null;
        }
        
        public final void setImgPlus(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgMinus() {
            return null;
        }
        
        public final void setImgMinus(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public GroupViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}