package com.crayon.fieldapp.ui.screen.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/splash/SplashFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentSplashBinding;", "Lcom/crayon/fieldapp/ui/screen/splash/SplashViewModel;", "()V", "activityScope", "Lkotlinx/coroutines/CoroutineScope;", "layoutId", "", "getLayoutId", "()I", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/splash/SplashViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkLogin", "", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onStart", "onStop", "requestMultiplePermissionWithListener", "Companion", "app_release"})
public final class SplashFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentSplashBinding, com.crayon.fieldapp.ui.screen.splash.SplashViewModel> {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_splash;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlinx.coroutines.CoroutineScope activityScope = null;
    private static final java.lang.String[] multiplePermissions = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_FINE_LOCATION"};
    public static final int CODE_REQUEST_PERMISSION_APP = 111;
    public static final com.crayon.fieldapp.ui.screen.splash.SplashFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.splash.SplashViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    private final void requestMultiplePermissionWithListener() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void checkLogin() {
    }
    
    public SplashFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/splash/SplashFragment$Companion;", "", "()V", "CODE_REQUEST_PERMISSION_APP", "", "multiplePermissions", "", "", "[Ljava/lang/String;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}