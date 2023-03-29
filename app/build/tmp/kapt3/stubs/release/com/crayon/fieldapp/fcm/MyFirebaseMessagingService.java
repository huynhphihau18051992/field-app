package com.crayon.fieldapp.fcm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/crayon/fieldapp/fcm/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "mPushBroadcastAnnounce", "Landroid/content/Intent;", "getMPushBroadcastAnnounce", "()Landroid/content/Intent;", "handleNow", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "", "scheduleJob", "sendNotification", "messageBody", "sendRegistrationToServer", "Companion", "app_release"})
public final class MyFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Intent mPushBroadcastAnnounce = null;
    private static final java.lang.String TAG = "MyFirebaseMsgService";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PUSH_ANNOUNCE = "com.crayon.fieldapp.PUSH_FCM";
    public static final com.crayon.fieldapp.fcm.MyFirebaseMessagingService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getMPushBroadcastAnnounce() {
        return null;
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    private final void scheduleJob() {
    }
    
    /**
     * Handle time allotted to BroadcastReceivers.
     */
    private final void handleNow() {
    }
    
    private final void sendRegistrationToServer(java.lang.String token) {
    }
    
    private final void sendNotification(java.lang.String messageBody) {
    }
    
    public MyFirebaseMessagingService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/crayon/fieldapp/fcm/MyFirebaseMessagingService$Companion;", "", "()V", "PUSH_ANNOUNCE", "", "TAG", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}