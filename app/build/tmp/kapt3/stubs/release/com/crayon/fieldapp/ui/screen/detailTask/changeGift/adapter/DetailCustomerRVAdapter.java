package com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005[\\]^_B\u00ea\u0002\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00128\b\u0002\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0012\u0012#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u0012#\b\u0002\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u0012#\b\u0002\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u0012#\b\u0002\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u0012#\b\u0002\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0016\u00a2\u0006\u0002\u0010 J&\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\b2\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020A0\u0004j\b\u0012\u0004\u0012\u00020A`\u0006JV\u0010B\u001a\u00020\u00182\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u00062\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u00062\u0006\u0010F\u001a\u00020\fJ\b\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020HH\u0016J\u0006\u0010K\u001a\u00020LJ\u0018\u0010M\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u00022\u0006\u0010J\u001a\u00020HH\u0016J\u0018\u0010O\u001a\u00020\u00022\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020HH\u0016J\u000e\u0010S\u001a\u00020\u00182\u0006\u0010T\u001a\u00020\nJ\u000e\u0010U\u001a\u00020\u00182\u0006\u0010T\u001a\u00020\bJ\u000e\u0010V\u001a\u00020\u00182\u0006\u0010T\u001a\u00020\nJ\u000e\u0010W\u001a\u00020\u00182\u0006\u0010T\u001a\u00020\bJ\u0016\u0010X\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010Y\u001a\u00020HJ\u0016\u0010Z\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010Y\u001a\u00020HR\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\"\"\u0004\b(\u0010$R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u001f\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010.R\u000e\u0010/\u001a\u000200X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082.\u00a2\u0006\u0002\n\u0000R,\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R,\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00106R,\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00106R,\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00106R,\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00180\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00106RA\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010,\u00a8\u0006`"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "images", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaData;", "Lkotlin/collections/ArrayList;", "promotions", "Lcom/crayon/fieldapp/data/remote/response/PromotionResponse;", "gifts", "Lcom/crayon/fieldapp/data/remote/response/GiftResponse;", "customerName", "", "customerPhone", "codeBill", "context", "Landroid/content/Context;", "onItemPromotionSelectClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "", "isChecked", "", "onItemPromotionAddClick", "Lkotlin/Function1;", "onItemPromotionEditClick", "onItemPromotionMinusClick", "onItemPromotionQuantityClick", "onItemImageClick", "isEdit", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "getCodeBill", "()Ljava/lang/String;", "setCodeBill", "(Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getCustomerName", "setCustomerName", "getCustomerPhone", "setCustomerPhone", "getGifts", "()Ljava/util/ArrayList;", "getImages", "()Z", "mGiftRVAdapter", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/GiftRVAdapter;", "mImageAdapter", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/BillImageRVAdapter;", "mPromotionRVAdapter", "Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/PromotionRVAdapter;", "getOnItemImageClick", "()Lkotlin/jvm/functions/Function1;", "getOnItemPromotionAddClick", "getOnItemPromotionEditClick", "getOnItemPromotionMinusClick", "getOnItemPromotionQuantityClick", "getOnItemPromotionSelectClick", "()Lkotlin/jvm/functions/Function2;", "getPromotions", "addAllProduct", "mPromotion", "mProduct", "Lcom/crayon/fieldapp/data/remote/response/ProductResponse;", "addData", "mImages", "mPromotions", "mGift", "mCodeBill", "getItemCount", "", "getItemViewType", "position", "getSelectPromotions", "Lcom/crayon/fieldapp/data/remote/request/AddPromotionGiftRequest;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "selectGiftItem", "data", "selectPromotionItem", "unSelectGiftItem", "unSelectPromotionItem", "updateGiftQuantity", "quantity", "updatePromotionQuantity", "BillItemViewHolder", "CustomerItemViewHolder", "GiftItemViewHolder", "GroupViewHolder", "PromotionItemViewHolder", "app_release"})
public final class DetailCustomerRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.BillImageRVAdapter mImageAdapter;
    private com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.PromotionRVAdapter mPromotionRVAdapter;
    private com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.GiftRVAdapter mGiftRVAdapter;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData> images = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.PromotionResponse> promotions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse> gifts = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String customerName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String customerPhone;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String codeBill;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.crayon.fieldapp.data.remote.response.PromotionResponse, java.lang.Boolean, kotlin.Unit> onItemPromotionSelectClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPromotionAddClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPromotionEditClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPromotionMinusClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPromotionQuantityClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData, kotlin.Unit> onItemImageClick = null;
    private final boolean isEdit = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void addData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData> mImages, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.PromotionResponse> mPromotions, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse> mGift, @org.jetbrains.annotations.NotNull()
    java.lang.String mCodeBill) {
    }
    
    public final void updatePromotionQuantity(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse item, int quantity) {
    }
    
    public final void updateGiftQuantity(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.GiftResponse item, int quantity) {
    }
    
    public final void selectPromotionItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse data) {
    }
    
    public final void unSelectPromotionItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse data) {
    }
    
    public final void selectGiftItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.GiftResponse data) {
    }
    
    public final void unSelectGiftItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.GiftResponse data) {
    }
    
    public final void addAllProduct(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.PromotionResponse mPromotion, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ProductResponse> mProduct) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.remote.request.AddPromotionGiftRequest getSelectPromotions() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.PromotionResponse> getPromotions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse> getGifts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    public final void setCustomerName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerPhone() {
        return null;
    }
    
    public final void setCustomerPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCodeBill() {
        return null;
    }
    
    public final void setCodeBill(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.crayon.fieldapp.data.remote.response.PromotionResponse, java.lang.Boolean, kotlin.Unit> getOnItemPromotionSelectClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemPromotionAddClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemPromotionEditClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemPromotionMinusClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> getOnItemPromotionQuantityClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData, kotlin.Unit> getOnItemImageClick() {
        return null;
    }
    
    public final boolean isEdit() {
        return false;
    }
    
    public DetailCustomerRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData> images, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.PromotionResponse> promotions, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.GiftResponse> gifts, @org.jetbrains.annotations.NotNull()
    java.lang.String customerName, @org.jetbrains.annotations.NotNull()
    java.lang.String customerPhone, @org.jetbrains.annotations.NotNull()
    java.lang.String codeBill, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, ? super java.lang.Boolean, kotlin.Unit> onItemPromotionSelectClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPromotionAddClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPromotionEditClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPromotionMinusClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.PromotionResponse, kotlin.Unit> onItemPromotionQuantityClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData, kotlin.Unit> onItemImageClick, boolean isEdit) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter;Landroid/view/View;)V", "icEdit", "Landroid/widget/ImageView;", "getIcEdit", "()Landroid/widget/ImageView;", "setIcEdit", "(Landroid/widget/ImageView;)V", "txtCustomerId", "Landroid/widget/TextView;", "getTxtCustomerId", "()Landroid/widget/TextView;", "setTxtCustomerId", "(Landroid/widget/TextView;)V", "txtDate", "getTxtDate", "setTxtDate", "txtName", "getTxtName", "setTxtName", "txtPhone", "getTxtPhone", "setTxtPhone", "app_release"})
    public final class GroupViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtCustomerId;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView icEdit;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtPhone;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtDate;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtCustomerId() {
            return null;
        }
        
        public final void setTxtCustomerId(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIcEdit() {
            return null;
        }
        
        public final void setIcEdit(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtName() {
            return null;
        }
        
        public final void setTxtName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtPhone() {
            return null;
        }
        
        public final void setTxtPhone(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtDate() {
            return null;
        }
        
        public final void setTxtDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public GroupViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter$CustomerItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter;Landroid/view/View;)V", "txtName", "Landroid/widget/TextView;", "getTxtName", "()Landroid/widget/TextView;", "setTxtName", "(Landroid/widget/TextView;)V", "txtPhone", "getTxtPhone", "setTxtPhone", "app_release"})
    public final class CustomerItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtPhone;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtName() {
            return null;
        }
        
        public final void setTxtName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtPhone() {
            return null;
        }
        
        public final void setTxtPhone(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public CustomerItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter$BillItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter;Landroid/view/View;)V", "rvImages", "Landroidx/recyclerview/widget/RecyclerView;", "getRvImages", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvImages", "(Landroidx/recyclerview/widget/RecyclerView;)V", "txtBill", "Landroid/widget/TextView;", "getTxtBill", "()Landroid/widget/TextView;", "setTxtBill", "(Landroid/widget/TextView;)V", "app_release"})
    public final class BillItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView rvImages;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtBill;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRvImages() {
            return null;
        }
        
        public final void setRvImages(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtBill() {
            return null;
        }
        
        public final void setTxtBill(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        public BillItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter$PromotionItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter;Landroid/view/View;)V", "rvPromotion", "Landroidx/recyclerview/widget/RecyclerView;", "getRvPromotion", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvPromotion", "(Landroidx/recyclerview/widget/RecyclerView;)V", "app_release"})
    public final class PromotionItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView rvPromotion;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRvPromotion() {
            return null;
        }
        
        public final void setRvPromotion(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        public PromotionItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter$GiftItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/changeGift/adapter/DetailCustomerRVAdapter;Landroid/view/View;)V", "rvGift", "Landroidx/recyclerview/widget/RecyclerView;", "getRvGift", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvGift", "(Landroidx/recyclerview/widget/RecyclerView;)V", "app_release"})
    public final class GiftItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private androidx.recyclerview.widget.RecyclerView rvGift;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.RecyclerView getRvGift() {
            return null;
        }
        
        public final void setRvGift(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView p0) {
        }
        
        public GiftItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}