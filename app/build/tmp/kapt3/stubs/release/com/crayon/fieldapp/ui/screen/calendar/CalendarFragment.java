package com.crayon.fieldapp.ui.screen.calendar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J(\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000bH\u0016J\u001a\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\'2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0007H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/calendar/CalendarFragment;", "Lcom/crayon/fieldapp/ui/base/BaseFragment;", "Lcom/crayon/fieldapp/databinding/FragmentCalendarBinding;", "Lcom/crayon/fieldapp/ui/screen/calendar/CalendarViewModel;", "Landroid/widget/CalendarView$OnDateChangeListener;", "()V", "endDate", "", "jobAdapter", "Lcom/crayon/fieldapp/ui/screen/home/adapter/TodayJobAdapter;", "layoutId", "", "getLayoutId", "()I", "mIsLoading", "", "pastVisiblesItems", "skip", "startDate", "totalItemCount", "viewModel", "getViewModel", "()Lcom/crayon/fieldapp/ui/screen/calendar/CalendarViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "visibleItemCount", "loadMoreItem", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onSelectedDayChange", "p0", "Landroid/widget/CalendarView;", "year", "month", "dayOfMonth", "onViewCreated", "view", "Landroid/view/View;", "toJobDetail", "id", "app_release"})
public final class CalendarFragment extends com.crayon.fieldapp.ui.base.BaseFragment<com.crayon.fieldapp.databinding.FragmentCalendarBinding, com.crayon.fieldapp.ui.screen.calendar.CalendarViewModel> implements android.widget.CalendarView.OnDateChangeListener {
    private final int layoutId = com.crayon.fieldapp.R.layout.fragment_calendar;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String startDate;
    private com.crayon.fieldapp.ui.screen.home.adapter.TodayJobAdapter jobAdapter;
    private java.lang.String endDate;
    private boolean mIsLoading = false;
    private int pastVisiblesItems = 0;
    private int visibleItemCount = 0;
    private int totalItemCount = 0;
    private int skip = 0;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.crayon.fieldapp.ui.screen.calendar.CalendarViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toJobDetail(java.lang.String id) {
    }
    
    @java.lang.Override()
    public void onSelectedDayChange(@org.jetbrains.annotations.NotNull()
    android.widget.CalendarView p0, int year, int month, int dayOfMonth) {
    }
    
    private final void loadMoreItem(int skip) {
    }
    
    public CalendarFragment() {
        super();
    }
}