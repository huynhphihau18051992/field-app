package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001:B\u00a2\u0002\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00128\b\u0002\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n\u0012#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u0012#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u0012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u0012#\b\u0002\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u0012#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0018J&\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020*0\u0004j\b\u0012\u0004\u0012\u00020*`\u0006J\u0006\u0010+\u001a\u00020\u0010J\b\u0010,\u001a\u00020-H\u0016J\u001c\u0010.\u001a\u00020\u00102\n\u0010/\u001a\u00060\u0002R\u00020\u00002\u0006\u00100\u001a\u00020-H\u0016J\u001c\u00101\u001a\u00060\u0002R\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020-H\u0016J\u000e\u00105\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005J\u000e\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005J\u000e\u00107\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0005J\u0016\u00108\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\u0006\u00109\u001a\u00020-R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0017\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001bR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000RA\u0010\t\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R,\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R,\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010#R,\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010#R,\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R,\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010#\u00a8\u0006;"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/PromotionRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/PromotionRVAdapter$GroupViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/PromotionResponse;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "onCheckBoxSelect", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "promotion", "", "isChecked", "", "onItemPlusListener", "Lkotlin/Function1;", "onItemMinusListener", "onItemDeleteListener", "onItemEditListener", "onItemQuantityListener", "isEdit", "(Ljava/util/ArrayList;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "getContext", "()Landroid/content/Context;", "()Z", "getItems", "()Ljava/util/ArrayList;", "mPromotionAdapter", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/SubProductRVAdapter;", "getOnCheckBoxSelect", "()Lkotlin/jvm/functions/Function2;", "getOnItemDeleteListener", "()Lkotlin/jvm/functions/Function1;", "getOnItemEditListener", "getOnItemMinusListener", "getOnItemPlusListener", "getOnItemQuantityListener", "addAll", "proudcts", "Lcom/crayon/fieldapp/data/remote/response/ProductResponse;", "clearData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDeleteAllProduct", "onSelectItem", "onUnSelectItem", "onUpdateQuantity", "quantity", "GroupViewHolder", "app_debug"})
public final class PromotionRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.PromotionRVAdapter.GroupViewHolder> {
    private com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.SubProductRVAdapter mPromotionAdapter;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.PromotionResponse> items = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.crayon.fieldapp.data.remote.response.PromotionResponse, java.lang.Boolean, kotlin.Unit> onCheckBoxSelect = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPlusListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemMinusListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemDeleteListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemEditListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemQuantityListener = null;
    private final boolean isEdit = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.PromotionRVAdapter.GroupViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.PromotionRVAdapter.GroupViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void clearData() {
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse promotion, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> proudcts) {
    }
    
    public final void onDeleteAllProduct(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse promotion) {
    }
    
    public final void onSelectItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse promotion) {
    }
    
    public final void onUnSelectItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse promotion) {
    }
    
    public final void onUpdateQuantity(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse promotion, int quantity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.PromotionResponse> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.crayon.fieldapp.data.remote.response.PromotionResponse, java.lang.Boolean, kotlin.Unit> getOnCheckBoxSelect() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemPlusListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemMinusListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemDeleteListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemEditListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemQuantityListener() {
        return null;
    }
    
    public final boolean isEdit() {
        return false;
    }
    
    public PromotionRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.PromotionResponse> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, ? super java.lang.Boolean, kotlin.Unit> onCheckBoxSelect, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPlusListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemMinusListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemDeleteListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemEditListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemQuantityListener, boolean isEdit) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101\u00a8\u00065"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/PromotionRVAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/PromotionRVAdapter;Landroid/view/View;)V", "btnDelete", "Landroid/widget/RelativeLayout;", "getBtnDelete", "()Landroid/widget/RelativeLayout;", "setBtnDelete", "(Landroid/widget/RelativeLayout;)V", "btnEdit", "getBtnEdit", "setBtnEdit", "cbProduct", "Landroid/widget/CheckBox;", "getCbProduct", "()Landroid/widget/CheckBox;", "setCbProduct", "(Landroid/widget/CheckBox;)V", "imgLine", "Landroid/widget/ImageView;", "getImgLine", "()Landroid/widget/ImageView;", "setImgLine", "(Landroid/widget/ImageView;)V", "imgMinus", "getImgMinus", "setImgMinus", "imgPlus", "getImgPlus", "setImgPlus", "llTotal", "Landroid/widget/LinearLayout;", "getLlTotal", "()Landroid/widget/LinearLayout;", "setLlTotal", "(Landroid/widget/LinearLayout;)V", "rvProduct", "Landroidx/recyclerview/widget/RecyclerView;", "getRvProduct", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvProduct", "(Landroidx/recyclerview/widget/RecyclerView;)V", "txtNumber", "Landroid/widget/TextView;", "getTxtNumber", "()Landroid/widget/TextView;", "setTxtNumber", "(Landroid/widget/TextView;)V", "txtTotal", "getTxtTotal", "setTxtTotal", "app_debug"})
    public final class GroupViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView rvProduct;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgLine;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox cbProduct;
        @org.jetbrains.annotations.NotNull()
        private android.widget.LinearLayout llTotal;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtTotal;
        @org.jetbrains.annotations.NotNull()
        private android.widget.RelativeLayout btnDelete;
        @org.jetbrains.annotations.NotNull()
        private android.widget.RelativeLayout btnEdit;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgPlus;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgMinus;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtNumber;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRvProduct() {
            return null;
        }
        
        public final void setRvProduct(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgLine() {
            return null;
        }
        
        public final void setImgLine(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getCbProduct() {
            return null;
        }
        
        public final void setCbProduct(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.LinearLayout getLlTotal() {
            return null;
        }
        
        public final void setLlTotal(@org.jetbrains.annotations.NotNull()
        android.widget.LinearLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtTotal() {
            return null;
        }
        
        public final void setTxtTotal(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getBtnDelete() {
            return null;
        }
        
        public final void setBtnDelete(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.RelativeLayout getBtnEdit() {
            return null;
        }
        
        public final void setBtnEdit(@org.jetbrains.annotations.NotNull()
        android.widget.RelativeLayout p0) {
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
        
        public GroupViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}