package com.crayon.fieldapp.ui.base.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006!"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/DatePickerSpinnerDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "btnCancel", "Landroid/widget/Button;", "getBtnCancel", "()Landroid/widget/Button;", "setBtnCancel", "(Landroid/widget/Button;)V", "btnOk", "getBtnOk", "setBtnOk", "mListener", "Lcom/crayon/fieldapp/ui/base/dialog/DatePickerSpinnerDialog$DatePickerDialogListener;", "picker", "Landroid/widget/DatePicker;", "getPicker", "()Landroid/widget/DatePicker;", "setPicker", "(Landroid/widget/DatePicker;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "setListener", "listener", "DatePickerDialogListener", "app_debug"})
public final class DatePickerSpinnerDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public android.widget.DatePicker picker;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button btnOk;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button btnCancel;
    private com.crayon.fieldapp.ui.base.dialog.DatePickerSpinnerDialog.DatePickerDialogListener mListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.DatePicker getPicker() {
        return null;
    }
    
    public final void setPicker(@org.jetbrains.annotations.NotNull()
    android.widget.DatePicker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtnOk() {
        return null;
    }
    
    public final void setBtnOk(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtnCancel() {
        return null;
    }
    
    public final void setBtnCancel(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.dialog.DatePickerSpinnerDialog.DatePickerDialogListener listener) {
    }
    
    public DatePickerSpinnerDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/DatePickerSpinnerDialog$DatePickerDialogListener;", "", "getDate", "", "date", "", "month", "year", "app_debug"})
    public static abstract interface DatePickerDialogListener {
        
        public abstract void getDate(int date, int month, int year);
    }
}