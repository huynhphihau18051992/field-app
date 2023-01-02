package com.crayon.fieldapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001\u001a%\u0010\u000b\u001a\u00020\u0006*\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\n\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u000e\u001aI\u0010\u000f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0010*\u00020\u0011*\u0002H\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017\u001aI\u0010\u000f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0010*\u00020\u0018*\u0002H\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001d\u0010\u001b\u001a\u00020\u0001*\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\u0002\u0010\u001c\u001a\n\u0010\u001d\u001a\u00020\u0006*\u00020\u0007\u001a9\u0010\u001e\u001a\u00020\u0006\"\b\b\u0000\u0010\u0010*\u00020\u0011*\u0002H\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0007\u00a2\u0006\u0002\u0010\"\u001a7\u0010\u001e\u001a\u00020\u0006\"\b\b\u0000\u0010\u0010*\u00020\u0018*\u0002H\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!\u00a2\u0006\u0002\u0010#\u001a\u0012\u0010$\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u001d\u0010%\u001a\u00020\u0001*\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\u0002\u0010\u001c\u001a+\u0010&\u001a\u00020\u0001\"\b\b\u0000\u0010\u0010*\u00020\u0011*\u0002H\u00102\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\rH\u0007\u00a2\u0006\u0002\u0010\'\u001a)\u0010&\u001a\u00020\u0001\"\b\b\u0000\u0010\u0010*\u00020\u0018*\u0002H\u00102\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r\u00a2\u0006\u0002\u0010(\u00a8\u0006)"}, d2 = {"isGrantedGrantResults", "", "grantResults", "", "shouldRequestRuntimePermission", "firstTimeAskingPermission", "", "Landroid/content/Context;", "permission", "", "isFirstTime", "firstTimeAskingPermissions", "permissions", "", "(Landroid/content/Context;[Ljava/lang/String;Z)V", "handleOnRequestPermissionResult", "T", "Landroid/app/Activity;", "requestPermissionCode", "", "requestCode", "permissionResultListener", "Lcom/crayon/fieldapp/utils/PermissionResultListener;", "(Landroid/app/Activity;II[Ljava/lang/String;[ILcom/crayon/fieldapp/utils/PermissionResultListener;)V", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;II[Ljava/lang/String;[ILcom/crayon/fieldapp/utils/PermissionResultListener;)V", "isFirstTimeAskingPermission", "isFirstTimeAskingPermissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "openAppDetailSettings", "requestPermissions", "permissionRequestCode", "requestPermissionListener", "Lcom/crayon/fieldapp/utils/RequestPermissionListener;", "(Landroid/app/Activity;[Ljava/lang/String;ILcom/crayon/fieldapp/utils/RequestPermissionListener;)V", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;ILcom/crayon/fieldapp/utils/RequestPermissionListener;)V", "shouldAskPermission", "shouldAskPermissions", "shouldShowRequestPermissionsRationale", "(Landroid/app/Activity;[Ljava/lang/String;)Z", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;)Z", "app_debug"})
public final class PermissionUtilsKt {
    
    /**
     * open app details setting
     */
    public static final void openAppDetailSettings(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openAppDetailSettings) {
    }
    
    /**
     * set first time asking single permission
     */
    public static final void firstTimeAskingPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$firstTimeAskingPermission, @org.jetbrains.annotations.NotNull()
    java.lang.String permission, boolean isFirstTime) {
    }
    
    /**
     * set first time asking multiple permissions
     */
    public static final void firstTimeAskingPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$firstTimeAskingPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, boolean isFirstTime) {
    }
    
    /**
     * check if first time asking single permission
     */
    public static final boolean isFirstTimeAskingPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isFirstTimeAskingPermission, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    /**
     * check if first time asking multiple permissions
     */
    public static final boolean isFirstTimeAskingPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isFirstTimeAskingPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
    
    /**
     * Check if version is marshmallow and above. deciding to request runtime permission
     */
    public static final boolean shouldRequestRuntimePermission() {
        return false;
    }
    
    /**
     * check grandResults are granted
     */
    public static final boolean isGrantedGrantResults(@org.jetbrains.annotations.NotNull()
    int[] grantResults) {
        return false;
    }
    
    /**
     * check if single permission is granted or not
     */
    public static final boolean shouldAskPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$shouldAskPermission, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    /**
     * check if multiple permissions are granted or not
     */
    public static final boolean shouldAskPermissions(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$shouldAskPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
    
    /**
     * check if should show request permissions rationale in activity
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public static final <T extends android.app.Activity>boolean shouldShowRequestPermissionsRationale(@org.jetbrains.annotations.NotNull()
    T $this$shouldShowRequestPermissionsRationale, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
    
    /**
     * check if should show request permissions rationale in fragment
     */
    public static final <T extends androidx.fragment.app.Fragment>boolean shouldShowRequestPermissionsRationale(@org.jetbrains.annotations.NotNull()
    T $this$shouldShowRequestPermissionsRationale, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions) {
        return false;
    }
    
    /**
     * request permissions in activity
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    public static final <T extends android.app.Activity>void requestPermissions(@org.jetbrains.annotations.NotNull()
    T $this$requestPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, int permissionRequestCode, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.utils.RequestPermissionListener requestPermissionListener) {
    }
    
    /**
     * request permissions in fragment
     */
    public static final <T extends androidx.fragment.app.Fragment>void requestPermissions(@org.jetbrains.annotations.NotNull()
    T $this$requestPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, int permissionRequestCode, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.utils.RequestPermissionListener requestPermissionListener) {
    }
    
    /**
     * handle request permission result with listener in activity
     */
    public static final <T extends android.app.Activity>void handleOnRequestPermissionResult(@org.jetbrains.annotations.NotNull()
    T $this$handleOnRequestPermissionResult, int requestPermissionCode, int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.utils.PermissionResultListener permissionResultListener) {
    }
    
    /**
     * handle request permission result with listener in fragment
     */
    public static final <T extends androidx.fragment.app.Fragment>void handleOnRequestPermissionResult(@org.jetbrains.annotations.NotNull()
    T $this$handleOnRequestPermissionResult, int requestPermissionCode, int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.utils.PermissionResultListener permissionResultListener) {
    }
}