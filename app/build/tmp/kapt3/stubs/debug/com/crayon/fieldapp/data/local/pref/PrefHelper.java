package com.crayon.fieldapp.data.local.pref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H&\u00a8\u0006\u0013"}, d2 = {"Lcom/crayon/fieldapp/data/local/pref/PrefHelper;", "", "clear", "", "getCurrentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getRefreshToken", "", "getToken", "isFirstRun", "", "isLogin", "remove", "key", "setCurrentLocation", "current", "setRefreshToken", "mToken", "setToken", "app_debug"})
public abstract interface PrefHelper {
    
    public abstract boolean isFirstRun();
    
    public abstract boolean isLogin();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getToken();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getRefreshToken();
    
    public abstract void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String mToken);
    
    public abstract void setRefreshToken(@org.jetbrains.annotations.NotNull()
    java.lang.String mToken);
    
    public abstract void setCurrentLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng current);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.gms.maps.model.LatLng getCurrentLocation();
    
    public abstract void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract void clear();
}