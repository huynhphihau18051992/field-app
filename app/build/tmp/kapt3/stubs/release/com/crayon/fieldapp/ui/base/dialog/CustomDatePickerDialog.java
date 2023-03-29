package com.crayon.fieldapp.ui.base.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\'B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0012J\u0014\u0010%\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006("}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/CustomDatePickerDialog;", "Landroidx/fragment/app/DialogFragment;", "events", "Ljava/util/ArrayList;", "Lcom/applandeo/materialcalendarview/EventDay;", "(Ljava/util/ArrayList;)V", "btnCancel", "Landroid/widget/Button;", "getBtnCancel", "()Landroid/widget/Button;", "setBtnCancel", "(Landroid/widget/Button;)V", "btnOk", "getBtnOk", "setBtnOk", "getEvents", "()Ljava/util/ArrayList;", "mListener", "Lcom/crayon/fieldapp/ui/base/dialog/CustomDatePickerDialog$DatePickerDialogListener;", "picker", "Lcom/applandeo/materialcalendarview/CalendarView;", "getPicker", "()Lcom/applandeo/materialcalendarview/CalendarView;", "setPicker", "(Lcom/applandeo/materialcalendarview/CalendarView;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "setListener", "listener", "updateEvent", "mEvent", "DatePickerDialogListener", "app_release"})
public final class CustomDatePickerDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public com.applandeo.materialcalendarview.CalendarView picker;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button btnOk;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button btnCancel;
    private com.crayon.fieldapp.ui.base.dialog.CustomDatePickerDialog.DatePickerDialogListener mListener;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.applandeo.materialcalendarview.EventDay> events = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.applandeo.materialcalendarview.CalendarView getPicker() {
        return null;
    }
    
    public final void setPicker(@org.jetbrains.annotations.NotNull()
    com.applandeo.materialcalendarview.CalendarView p0) {
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
    com.crayon.fieldapp.ui.base.dialog.CustomDatePickerDialog.DatePickerDialogListener listener) {
    }
    
    public final void updateEvent(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.applandeo.materialcalendarview.EventDay> mEvent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.applandeo.materialcalendarview.EventDay> getEvents() {
        return null;
    }
    
    public CustomDatePickerDialog(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.applandeo.materialcalendarview.EventDay> events) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/crayon/fieldapp/ui/base/dialog/CustomDatePickerDialog$DatePickerDialogListener;", "", "getDate", "", "calendar", "Ljava/util/Calendar;", "app_release"})
    public static abstract interface DatePickerDialogListener {
        
        public abstract void getDate(@org.jetbrains.annotations.NotNull()
        java.util.Calendar calendar);
    }
}