package com.crayon.fieldapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00b6\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH\u0007\u001a\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u001a\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007\u00a2\u0006\u0002\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0007\u001a\u001b\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0007\u001a\u0095\u0001\u0010\u001c\u001a\u00020\u0001*\u00020\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u00112\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010+\u001a\u0016\u0010,\u001a\u00020\u0001*\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010.H\u0007\u001a\u0016\u0010,\u001a\u00020\u0001*\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010\bH\u0007\u001a\u0016\u00100\u001a\u00020\u0001*\u0002012\b\u00102\u001a\u0004\u0018\u00010\bH\u0007\u001a\u0014\u00103\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\bH\u0007\u001a\u0014\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u00105\u001a\u00020\bH\u0007\u001a\u0014\u00106\u001a\u00020\u0001*\u00020\u00022\u0006\u00107\u001a\u000208H\u0007\u001a\u0014\u00109\u001a\u00020\u0001*\u00020\u00022\u0006\u00107\u001a\u000208H\u0007\u001a\u0016\u0010:\u001a\u00020\u0001*\u00020;2\b\u0010\r\u001a\u0004\u0018\u00010<H\u0007\u001a\u0014\u0010=\u001a\u00020\u0001*\u00020\u00022\u0006\u00107\u001a\u00020>H\u0007\u001a\u0014\u0010?\u001a\u00020\u0001*\u00020\u00022\u0006\u00107\u001a\u00020@H\u0007\u001a\u0014\u0010A\u001a\u00020\u0001*\u00020\u00022\u0006\u0010B\u001a\u00020\bH\u0007\u001a\u001d\u0010C\u001a\u00020\u0001*\u00020\u00172\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0002\u0010\u0018\u001a\u0014\u0010E\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u001b\u001a\u00020\bH\u0007\u001a$\u0010F\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\bH\u0007\u001a\u0014\u0010I\u001a\u00020\u0001*\u00020\u00022\u0006\u00107\u001a\u00020JH\u0007\u001a\u0014\u0010K\u001a\u00020\u0001*\u00020\u00022\u0006\u00107\u001a\u00020LH\u0007\u001a\u0014\u0010K\u001a\u00020\u0001*\u00020\u00022\u0006\u00107\u001a\u00020MH\u0007\u001a\u001a\u0010N\u001a\u00020\u0001*\u00020;2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00010PH\u0007\u001a\u0014\u0010Q\u001a\u00020\u0001*\u00020R2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006S"}, d2 = {"customBackgroundTint", "", "Landroid/widget/TextView;", "color", "", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "customDateFormat", "origin", "", "customFullDateFormat", "", "customRefreshListener", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "listener", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "customRefreshing", "refreshing", "", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Ljava/lang/Boolean;)V", "customScrollListener", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "customTint", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;Ljava/lang/Integer;)V", "isDisplayAcceptButton", "Landroid/widget/LinearLayout;", "status", "loadImage", "imageUrl", "thumbnailUrl", "placeHolder", "Landroid/graphics/drawable/Drawable;", "errorDrawable", "requestListener", "Lcom/bumptech/glide/request/RequestListener;", "centerCrop", "fitCenter", "circleCrop", "diskCacheStrategy", "Lcom/bumptech/glide/load/engine/DiskCacheStrategy;", "skipMemoryCache", "signatureKey", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/RequestListener;ZZZLcom/bumptech/glide/load/engine/DiskCacheStrategy;Ljava/lang/Boolean;Ljava/lang/String;)V", "loadLocalImage", "uri", "Landroid/net/Uri;", "imageName", "loadWebUrl", "Landroid/webkit/WebView;", "url", "setApplicationStatus", "setApplicationType", "type", "setAttendance", "item", "Lcom/crayon/fieldapp/data/remote/response/AttendanceResponse;", "setAttendanceStatus", "setClickSafe", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "setContentMemberRequest", "Lcom/crayon/fieldapp/data/remote/response/MemberRequestResponse;", "setContentSwitchShift", "Lcom/crayon/fieldapp/data/remote/response/ApplicationResponse;", "setDurationTime", "createDate", "setGlideSrc", "src", "setIconStatus", "setName", "firstName", "lastName", "setProjectInfo", "Lcom/crayon/fieldapp/data/remote/response/ProjectResponse;", "setShift", "Lcom/crayon/fieldapp/data/remote/response/JobResponse;", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "setSingleClick", "execution", "Lkotlin/Function0;", "toString", "Landroid/widget/EditText;", "app_release"})
public final class BindingUtilsKt {
    
    @androidx.databinding.BindingAdapter(value = {"onRefreshListener"})
    public static final void customRefreshListener(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout $this$customRefreshListener, @org.jetbrains.annotations.Nullable()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isRefreshing"})
    public static final void customRefreshing(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout $this$customRefreshing, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean refreshing) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onScrollListener"})
    public static final void customScrollListener(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$customScrollListener, @org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.OnScrollListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"glideSrc"})
    public static final void setGlideSrc(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setGlideSrc, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer src) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadUri"})
    public static final void loadLocalImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadLocalImage, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadImageLocal"})
    public static final void loadLocalImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadLocalImage, @org.jetbrains.annotations.Nullable()
    java.lang.String imageName) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"imageUrl", "thumbnailUrl", "placeholder", "errorDrawable", "requestListener", "centerCrop", "fitCenter", "circleCrop", "diskCacheStrategy", "skipMemoryCache", "signatureKey"})
    public static final void loadImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImage, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable placeHolder, @org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable errorDrawable, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> requestListener, boolean centerCrop, boolean fitCenter, boolean circleCrop, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.load.engine.DiskCacheStrategy diskCacheStrategy, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean skipMemoryCache, @org.jetbrains.annotations.Nullable()
    java.lang.String signatureKey) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"clickSafe"})
    public static final void setClickSafe(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setClickSafe, @org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onSingleClick"})
    public static final void setSingleClick(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setSingleClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> execution) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadUrl"})
    public static final void loadWebUrl(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView $this$loadWebUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"backgroundTint"})
    public static final void customBackgroundTint(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$customBackgroundTint, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = true, value = {"firstName", "lastName"})
    public static final void setName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setName, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadDate"})
    public static final void customDateFormat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$customDateFormat, @org.jetbrains.annotations.Nullable()
    java.lang.String origin) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadFullDate"})
    public static final void customFullDateFormat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$customFullDateFormat, @org.jetbrains.annotations.Nullable()
    java.lang.String origin) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"loadFullDate"})
    public static final void customFullDateFormat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$customFullDateFormat, long origin) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"toString"})
    public static final void toString(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$toString, int origin) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"tint"})
    public static final void customTint(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$customTint, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"projectInfo"})
    public static final void setProjectInfo(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setProjectInfo, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.ProjectResponse item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"attendanceInfo"})
    public static final void setAttendance(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setAttendance, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.AttendanceResponse item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"attendanceStatus"})
    public static final void setAttendanceStatus(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setAttendanceStatus, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.AttendanceResponse item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"shiftJob"})
    public static final void setShift(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setShift, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.JobResponse item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"shiftTask"})
    public static final void setShift(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setShift, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"durationTime"})
    public static final void setDurationTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setDurationTime, @org.jetbrains.annotations.NotNull()
    java.lang.String createDate) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"contentSwitchShift"})
    public static final void setContentSwitchShift(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setContentSwitchShift, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.ApplicationResponse item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"contentMemberRequest"})
    public static final void setContentMemberRequest(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setContentMemberRequest, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.MemberRequestResponse item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"applicationStatus"})
    public static final void setApplicationStatus(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setApplicationStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"applicationType"})
    public static final void setApplicationType(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setApplicationType, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"applicationStatus"})
    public static final void setIconStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$setIconStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"displayAcceptButton"})
    public static final void isDisplayAcceptButton(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout $this$isDisplayAcceptButton, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
}