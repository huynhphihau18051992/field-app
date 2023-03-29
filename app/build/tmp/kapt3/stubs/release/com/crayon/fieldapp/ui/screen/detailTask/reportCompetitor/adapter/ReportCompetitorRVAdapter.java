package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"BQ\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u0016\u001a\u00020\u000b2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u0006\u0010\u0018\u001a\u00020\u000bJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u000b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aH\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportCompetitor/adapter/ReportCompetitorRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crayon/fieldapp/ui/screen/detailTask/reportCompetitor/adapter/ReportCompetitorRVAdapter$GroupViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/ReportOpponentResponse;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "onItemClick", "Lkotlin/Function1;", "", "onImageClick", "Lcom/crayon/fieldapp/ui/screen/detailTask/adapter/MediaData;", "(Ljava/util/ArrayList;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "getItems", "()Ljava/util/ArrayList;", "getOnImageClick", "()Lkotlin/jvm/functions/Function1;", "getOnItemClick", "addItems", "list", "clearData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "GroupViewHolder", "app_release"})
public final class ReportCompetitorRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter.GroupViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ReportOpponentResponse> items = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ReportOpponentResponse, kotlin.Unit> onItemClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData, kotlin.Unit> onImageClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter.GroupViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter.GroupViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void clearData() {
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ReportOpponentResponse> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ReportOpponentResponse> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.data.remote.response.ReportOpponentResponse, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData, kotlin.Unit> getOnImageClick() {
        return null;
    }
    
    public ReportCompetitorRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.ReportOpponentResponse> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.data.remote.response.ReportOpponentResponse, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData, kotlin.Unit> onImageClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u001a\u0010&\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010 \"\u0004\b(\u0010\"R\u001a\u0010)\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u001a\u0010,\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"\u00a8\u0006/"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/detailTask/reportCompetitor/adapter/ReportCompetitorRVAdapter$GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crayon/fieldapp/ui/screen/detailTask/reportCompetitor/adapter/ReportCompetitorRVAdapter;Landroid/view/View;)V", "cvImage1", "Landroidx/cardview/widget/CardView;", "getCvImage1", "()Landroidx/cardview/widget/CardView;", "setCvImage1", "(Landroidx/cardview/widget/CardView;)V", "cvImage2", "getCvImage2", "setCvImage2", "cvImage3", "getCvImage3", "setCvImage3", "imgImage1", "Landroid/widget/ImageView;", "getImgImage1", "()Landroid/widget/ImageView;", "setImgImage1", "(Landroid/widget/ImageView;)V", "imgImage2", "getImgImage2", "setImgImage2", "imgImage3", "getImgImage3", "setImgImage3", "txtCustomerId", "Landroid/widget/TextView;", "getTxtCustomerId", "()Landroid/widget/TextView;", "setTxtCustomerId", "(Landroid/widget/TextView;)V", "txtDate", "getTxtDate", "setTxtDate", "txtName", "getTxtName", "setTxtName", "txtNote", "getTxtNote", "setTxtNote", "txtType", "getTxtType", "setTxtType", "app_release"})
    public final class GroupViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtCustomerId;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtType;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtDate;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtNote;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView cvImage1;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView cvImage2;
        @org.jetbrains.annotations.NotNull()
        private androidx.cardview.widget.CardView cvImage3;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgImage1;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgImage2;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgImage3;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtCustomerId() {
            return null;
        }
        
        public final void setTxtCustomerId(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtName() {
            return null;
        }
        
        public final void setTxtName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtType() {
            return null;
        }
        
        public final void setTxtType(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtDate() {
            return null;
        }
        
        public final void setTxtDate(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtNote() {
            return null;
        }
        
        public final void setTxtNote(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCvImage1() {
            return null;
        }
        
        public final void setCvImage1(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCvImage2() {
            return null;
        }
        
        public final void setCvImage2(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getCvImage3() {
            return null;
        }
        
        public final void setCvImage3(@org.jetbrains.annotations.NotNull()
        androidx.cardview.widget.CardView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgImage1() {
            return null;
        }
        
        public final void setImgImage1(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgImage2() {
            return null;
        }
        
        public final void setImgImage2(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgImage3() {
            return null;
        }
        
        public final void setImgImage3(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public GroupViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}