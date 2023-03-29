package com.crayon.fieldapp.workers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/crayon/fieldapp/workers/UploadLocationWorker;", "Landroidx/work/Worker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "getAppContext", "()Landroid/content/Context;", "trackingRepository", "Lcom/crayon/fieldapp/data/repository/TrackingRepository;", "getTrackingRepository", "()Lcom/crayon/fieldapp/data/repository/TrackingRepository;", "trackingRepository$delegate", "Lkotlin/Lazy;", "doWork", "Landroidx/work/ListenableWorker$Result;", "Companion", "app_release"})
public final class UploadLocationWorker extends androidx.work.Worker {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy trackingRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context appContext = null;
    private static final java.lang.String TAG = "DownloadWorker";
    public static final com.crayon.fieldapp.workers.UploadLocationWorker.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.repository.TrackingRepository getTrackingRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getAppContext() {
        return null;
    }
    
    public UploadLocationWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/crayon/fieldapp/workers/UploadLocationWorker$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}