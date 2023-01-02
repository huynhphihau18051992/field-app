package com.crayon.fieldapp.utils;

import java.lang.System;

/**
 * Callback on various cases on checking permission
 *
 * 1.  Below M, runtime permission not needed. In that case onPermissionGranted() would be called.
 * If permission is already granted, onPermissionGranted() would be called.
 *
 * 2.  Equal and Above M, if the permission is being asked first time onNeedPermission() would be called.
 *
 * 3.  Equal and Above M, if the permission is previously asked but not granted, onPermissionPreviouslyDenied()
 * would be called.
 *
 * 4.  Equal and Above M, if the permission is disabled by device policy or the user checked "Never ask again"
 * check box on previous request permission, onPermissionDisabled() would be called.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H&\u00a8\u0006\t"}, d2 = {"Lcom/crayon/fieldapp/utils/RequestPermissionListener;", "", "onPermissionGranted", "", "onPermissionPermanentlyDenied", "openAppSetting", "Lkotlin/Function0;", "onPermissionRationaleShouldBeShown", "requestPermission", "app_debug"})
public abstract interface RequestPermissionListener {
    
    /**
     * Callback on permission previously denied
     * should show permission rationale and continue permission request
     */
    public abstract void onPermissionRationaleShouldBeShown(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> requestPermission);
    
    /**
     * Callback on permission "Never show again" checked and denied
     * should show message and open app setting
     */
    public abstract void onPermissionPermanentlyDenied(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> openAppSetting);
    
    /**
     * Callback on permission granted
     */
    public abstract void onPermissionGranted();
}