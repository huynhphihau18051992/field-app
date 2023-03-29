package com.crayon.fieldapp.utils;

import java.lang.System;

/**
 * request permission result listener
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/crayon/fieldapp/utils/PermissionResultListener;", "", "onPermissionGranted", "", "onPermissionPermanentlyDenied", "onPermissionRationaleShouldBeShown", "app_release"})
public abstract interface PermissionResultListener {
    
    /**
     * Callback on permission denied
     */
    public abstract void onPermissionRationaleShouldBeShown();
    
    /**
     * Callback on permission "Never show again" checked and denied
     */
    public abstract void onPermissionPermanentlyDenied();
    
    /**
     * Callback on permission granted
     */
    public abstract void onPermissionGranted();
}