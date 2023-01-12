package com.crayon.fieldapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J0\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 J \u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007J/\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010$\u001a\u00020\u0007\u00a2\u0006\u0002\u0010%J\u0018\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000bJ\u0018\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000bJ\u0016\u0010,\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u001aJ\u000e\u0010-\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0011H\u0002J\u0010\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0002\u00a8\u00063"}, d2 = {"Lcom/crayon/fieldapp/utils/BitmapUtils;", "", "()V", "addStampToImage", "Landroid/graphics/Bitmap;", "originalBitmap", "time", "", "address", "venue", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "calculateTextSize", "", "width", "callBroadCast", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "createImageFileToUpload", "Ljava/io/File;", "originPath", "mTask", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "quality", "isTag", "", "type", "createImageFromBitmap", "bitmap", "name", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/Integer;Ljava/lang/String;)Ljava/io/File;", "decodeFile", "photoFilePath", "maxSize", "decodeFileSize", "file", "sampleSize", "deleteFileFromMediaStore", "deleteImageTemp", "determineMaxTextSize", "str", "maxWidth", "getMax128SubString", "strValue", "app_debug"})
public final class BitmapUtils {
    public static final com.crayon.fieldapp.utils.BitmapUtils INSTANCE = null;
    
    /**
     * decode file to image with sample size
     *
     * @param file
     * @param sampleSize
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap decodeFileSize(@org.jetbrains.annotations.NotNull()
    java.io.File file, int sampleSize) {
        return null;
    }
    
    /**
     * decode file to bitmap with max size
     *
     * @param photoFilePath
     * @param maxSize
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap decodeFile(@org.jetbrains.annotations.NotNull()
    java.lang.String photoFilePath, int maxSize) {
        return null;
    }
    
    /**
     * calculate sample size
     *
     * @param options
     * @param reqWidth
     * @param reqHeight
     * @return
     */
    public final int calculateInSampleSize(@org.jetbrains.annotations.NotNull()
    android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
        return 0;
    }
    
    /**
     * create temp file from bitmap
     *
     * @param context
     * @param bitmap
     * @param quality
     * @param name
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.io.File createImageFromBitmap(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.Nullable()
    java.lang.Integer quality, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    /**
     * delete temp file
     *
     * @param context
     */
    public final void deleteImageTemp(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * callBroadCast => not working with android 4.0
     *
     * @param context
     * @param uri
     */
    public final void callBroadCast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
    }
    
    /**
     * delete file from media store
     *
     * @param context
     * @param file
     */
    public final void deleteFileFromMediaStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File createImageFileToUpload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String originPath, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File createImageFileToUpload(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String originPath, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.remote.response.TaskResponse mTask, int quality, boolean isTag) {
        return null;
    }
    
    private final android.graphics.Bitmap addStampToImage(android.graphics.Bitmap originalBitmap, java.lang.String time, java.lang.String address, java.lang.String venue) {
        return null;
    }
    
    private final java.lang.String getMax128SubString(java.lang.String strValue) {
        return null;
    }
    
    public final float calculateTextSize(int width) {
        return 0.0F;
    }
    
    private final int determineMaxTextSize(java.lang.String str, float maxWidth) {
        return 0;
    }
    
    private BitmapUtils() {
        super();
    }
}