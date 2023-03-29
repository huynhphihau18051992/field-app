package com.example.moviedb.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0005\u001a\u000e\u0010\n\u001a\u00020\u000b*\u00060\fj\u0002`\r\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0005\u00a8\u0006\u000f"}, d2 = {"getQueryTextChangeStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/appcompat/widget/SearchView;", "getString", "Landroid/view/View;", "stringResId", "", "hideKeyboard", "", "safeLog", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "showKeyboard", "app_release"})
public final class ExtensionsKt {
    
    public static final void safeLog(@org.jetbrains.annotations.NotNull()
    java.lang.Exception $this$safeLog) {
    }
    
    /**
     * Extension method to provide simpler access to {@link View#getResources()#getString(int)}.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    android.view.View $this$getString, int stringResId) {
        return null;
    }
    
    /**
     * Extension method to show a keyboard for View.
     */
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard) {
    }
    
    /**
     * Try to hide the keyboard and returns whether it worked
     * https://stackoverflow.com/questions/1109022/close-hide-the-android-soft-keyboard
     */
    public static final boolean hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlinx.coroutines.flow.StateFlow<java.lang.String> getQueryTextChangeStateFlow(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.SearchView $this$getQueryTextChangeStateFlow) {
        return null;
    }
}