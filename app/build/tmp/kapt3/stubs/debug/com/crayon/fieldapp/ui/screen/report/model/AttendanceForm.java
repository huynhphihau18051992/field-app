package com.crayon.fieldapp.ui.screen.report.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0011\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001c\u00a8\u0006\""}, d2 = {"Lcom/crayon/fieldapp/ui/screen/report/model/AttendanceForm;", "", "start_date", "Ljava/util/Date;", "end_date", "today", "summary_man_hour", "", "today_shift", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "total_shift", "", "summaryShift", "summary_invalid_shift", "projects", "shifts", "Ljava/util/HashMap;", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/ArrayList;ILjava/util/ArrayList;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "getEnd_date", "()Ljava/util/Date;", "getProjects", "()Ljava/util/ArrayList;", "getShifts", "()Ljava/util/HashMap;", "getStart_date", "getSummaryShift", "getSummary_invalid_shift", "()I", "getSummary_man_hour", "()Ljava/lang/String;", "getToday", "getToday_shift", "getTotal_shift", "app_debug"})
public final class AttendanceForm {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date start_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date end_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date today = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String summary_man_hour = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse> today_shift = null;
    private final int total_shift = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> summaryShift = null;
    private final int summary_invalid_shift = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> projects = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.util.Date, java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse>> shifts = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getStart_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getEnd_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getToday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary_man_hour() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse> getToday_shift() {
        return null;
    }
    
    public final int getTotal_shift() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getSummaryShift() {
        return null;
    }
    
    public final int getSummary_invalid_shift() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getProjects() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.Date, java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse>> getShifts() {
        return null;
    }
    
    public AttendanceForm(@org.jetbrains.annotations.NotNull()
    java.util.Date start_date, @org.jetbrains.annotations.NotNull()
    java.util.Date end_date, @org.jetbrains.annotations.NotNull()
    java.util.Date today, @org.jetbrains.annotations.NotNull()
    java.lang.String summary_man_hour, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse> today_shift, int total_shift, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> summaryShift, int summary_invalid_shift, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> projects, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.Date, java.util.ArrayList<com.crayon.fieldapp.data.remote.response.TaskResponse>> shifts) {
        super();
    }
}