package com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001>B\u00e4\u0001\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b\u00128\b\u0002\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000e\u0012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f0\u000b\u0012#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f0\u000b\u0012#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010%\u001a\u00020\f2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u0006\u0010\'\u001a\u00020\fJ\u0016\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u001c\u0010-\u001a\u00020\f2\n\u0010.\u001a\u00060\u0002R\u00020\u00002\u0006\u0010/\u001a\u00020,H\u0016J\u001c\u00100\u001a\u00060\u0002R\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020,H\u0016J\u0006\u00104\u001a\u00020\fJ\u0006\u00105\u001a\u00020\fJ\u000e\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0006J\u0006\u00108\u001a\u00020\fJ\u000e\u00109\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0006J\u0016\u0010:\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010;\u001a\u00020,J\u0016\u0010<\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010=\u001a\u00020,R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR,\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR,\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dRA\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u001e\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/adapter/SelectProductRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/adapter/SelectProductRVAdapter$GroupViewHolder;", "Landroid/widget/Filterable;", "items", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/ProductResponse;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "onPriceClick", "Lkotlin/Function1;", "", "onItemSelectClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "", "isChecked", "onItemAddClick", "onItemMinusClick", "onItemQuantityClick", "(Ljava/util/ArrayList;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "getItems", "()Ljava/util/ArrayList;", "getOnItemAddClick", "()Lkotlin/jvm/functions/Function1;", "getOnItemMinusClick", "getOnItemQuantityClick", "getOnItemSelectClick", "()Lkotlin/jvm/functions/Function2;", "getOnPriceClick", "productListFiltered", "proudctList", "addAll", "mProducts", "clearData", "getAllItemSelected", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refresh", "selectAll", "selectItem", "data", "unSelectAll", "unSelectItem", "updatePrice", "price", "updateQuantity", "quantity", "GroupViewHolder", "app_release"})
public final class SelectProductRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.SelectProductRVAdapter.GroupViewHolder> implements android.widget.Filterable {
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> proudctList = null;
    private java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> productListFiltered;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> items = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> onPriceClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.crayon.fieldapp.data.remote.response.ProductResponse, java.lang.Boolean, kotlin.Unit> onItemSelectClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> onItemAddClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> onItemMinusClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> onItemQuantityClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.SelectProductRVAdapter.GroupViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.SelectProductRVAdapter.GroupViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updatePrice(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.ProductResponse item, int price) {
    }
    
    public final void updateQuantity(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.ProductResponse item, int quantity) {
    }
    
    public final void selectItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.ProductResponse data) {
    }
    
    public final void unSelectItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.ProductResponse data) {
    }
    
    public final void selectAll() {
    }
    
    public final void unSelectAll() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> getAllItemSelected() {
        return null;
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> mProducts) {
    }
    
    public final void clearData() {
    }
    
    public final void refresh() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> getOnPriceClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.crayon.fieldapp.data.remote.response.ProductResponse, java.lang.Boolean, kotlin.Unit> getOnItemSelectClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> getOnItemAddClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> getOnItemMinusClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> getOnItemQuantityClick() {
        return null;
    }
    
    public SelectProductRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> onPriceClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.crayon.fieldapp.data.remote.response.ProductResponse, ? super java.lang.Boolean, kotlin.Unit> onItemSelectClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> onItemAddClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> onItemMinusClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.ProductResponse, kotlin.Unit> onItemQuantityClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c\u00a8\u0006#"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/adapter/SelectProductRVAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/reportSales/adapter/SelectProductRVAdapter;Landroid/view/View;)V", "cbProduct", "Landroid/widget/CheckBox;", "getCbProduct", "()Landroid/widget/CheckBox;", "setCbProduct", "(Landroid/widget/CheckBox;)V", "icEdit", "Landroid/widget/ImageView;", "getIcEdit", "()Landroid/widget/ImageView;", "setIcEdit", "(Landroid/widget/ImageView;)V", "imgMinus", "getImgMinus", "setImgMinus", "imgPlus", "getImgPlus", "setImgPlus", "txtNumber", "Landroid/widget/TextView;", "getTxtNumber", "()Landroid/widget/TextView;", "setTxtNumber", "(Landroid/widget/TextView;)V", "txtProductName", "getTxtProductName", "setTxtProductName", "txtProductPrice", "getTxtProductPrice", "setTxtProductPrice", "app_release"})
    public final class GroupViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox cbProduct;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtProductName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtProductPrice;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgPlus;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgMinus;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtNumber;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView icEdit;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getCbProduct() {
            return null;
        }
        
        public final void setCbProduct(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtProductName() {
            return null;
        }
        
        public final void setTxtProductName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtProductPrice() {
            return null;
        }
        
        public final void setTxtProductPrice(@org.jetbrains.annotations.NotNull()
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
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtNumber() {
            return null;
        }
        
        public final void setTxtNumber(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIcEdit() {
            return null;
        }
        
        public final void setIcEdit(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public GroupViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}