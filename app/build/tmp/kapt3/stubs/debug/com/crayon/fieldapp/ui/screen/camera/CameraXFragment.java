package com.crayon.fieldapp.ui.screen.camera;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 52\u00020\u0001:\u000256B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J-\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00132\u000e\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.H\u0016\u00a2\u0006\u0002\u0010/J\u001a\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010!H\u0017J\b\u00102\u001a\u00020\u001fH\u0003J\b\u00103\u001a\u00020\u001fH\u0003J\b\u00104\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/camera/CameraXFragment;", "Landroidx/fragment/app/Fragment;", "()V", "cameraControl", "Landroidx/camera/core/CameraControl;", "cameraInfo", "Landroidx/camera/core/CameraInfo;", "cameraProviderFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "imageAnalysis", "Landroidx/camera/core/ImageAnalysis;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "imagePreview", "Landroidx/camera/core/Preview;", "isTakeImage", "", "lensFacing", "", "linearZoom", "", "outputDirectory", "Ljava/io/File;", "recording", "timer", "Landroid/os/CountDownTimer;", "videoCapture", "Landroidx/camera/core/VideoCapture;", "allPermissionsGranted", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "recordVideo", "startCamera", "takePicture", "Companion", "LuminosityAnalyzer", "app_debug"})
public final class CameraXFragment extends androidx.fragment.app.Fragment {
    private com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> cameraProviderFuture;
    private androidx.camera.core.Preview imagePreview;
    private androidx.camera.core.ImageAnalysis imageAnalysis;
    private androidx.camera.core.ImageCapture imageCapture;
    private androidx.camera.core.VideoCapture videoCapture;
    private java.io.File outputDirectory;
    private androidx.camera.core.CameraControl cameraControl;
    private androidx.camera.core.CameraInfo cameraInfo;
    private float linearZoom = 0.0F;
    private int lensFacing = androidx.camera.core.CameraSelector.LENS_FACING_BACK;
    private boolean recording = false;
    private boolean isTakeImage = false;
    private android.os.CountDownTimer timer;
    private static final java.lang.String TAG = "MainActivity";
    private static final java.lang.String FILENAME = "yyyy-MM-dd-HH-mm-ss-SSS";
    private static final java.lang.String PHOTO_EXTENSION = ".jpg";
    private static final java.lang.String VIDEO_EXTENSION = ".mp4";
    private static final int REQUEST_CODE_PERMISSIONS = 10;
    private static final java.lang.String[] REQUIRED_PERMISSIONS = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    public static final com.crayon.fieldapp.ui.screen.camera.CameraXFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void recordVideo() {
    }
    
    private final void takePicture() {
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void startCamera() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    /**
     * Check if all permission specified in the manifest have been granted
     */
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    public CameraXFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/camera/CameraXFragment$LuminosityAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "()V", "lastAnalyzedTimestamp", "", "analyze", "", "image", "Landroidx/camera/core/ImageProxy;", "toByteArray", "", "Ljava/nio/ByteBuffer;", "app_debug"})
    static final class LuminosityAnalyzer implements androidx.camera.core.ImageAnalysis.Analyzer {
        private long lastAnalyzedTimestamp = 0L;
        
        /**
         * Helper extension function used to extract a byte array from an
         * image plane buffer
         */
        private final byte[] toByteArray(@org.jetbrains.annotations.NotNull()
        java.nio.ByteBuffer $this$toByteArray) {
            return null;
        }
        
        @java.lang.Override()
        public void analyze(@org.jetbrains.annotations.NotNull()
        androidx.camera.core.ImageProxy image) {
        }
        
        public LuminosityAnalyzer() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/camera/CameraXFragment$Companion;", "", "()V", "FILENAME", "", "PHOTO_EXTENSION", "REQUEST_CODE_PERMISSIONS", "", "REQUIRED_PERMISSIONS", "", "[Ljava/lang/String;", "TAG", "VIDEO_EXTENSION", "createFile", "Ljava/io/File;", "baseFolder", "format", "extension", "getOutputDirectory", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getOutputDirectory(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File createFile(@org.jetbrains.annotations.NotNull()
        java.io.File baseFolder, @org.jetbrains.annotations.NotNull()
        java.lang.String format, @org.jetbrains.annotations.NotNull()
        java.lang.String extension) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}