package com.crayon.fieldapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0006*\u00020\u0006\u001a\n\u0010\u000e\u001a\u00020\u0006*\u00020\u0006\u001a\n\u0010\u000f\u001a\u00020\u0006*\u00020\u0006\u001a\n\u0010\u0010\u001a\u00020\u0006*\u00020\u0006\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0006\u001a\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0006*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a#\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a8\u0006\u0019"}, d2 = {"formatDate", "", "origin", "formatHour", "formatNotification", "time", "Ljava/util/Date;", "getCurrentDateTime", "changeTimeFormat", "oldFormat", "newFormat", "locale", "Ljava/util/Locale;", "getNextDay", "getNextMonth", "getPreviousDay", "getPreviousMonth", "toCalendar", "Ljava/util/Calendar;", "toDate", "format", "toTimeLong", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/Long;", "toTimeString", "app_debug"})
public final class DateUtilsKt {
    
    /**
     * convert string to date
     * if string is blank or format is blank then return null
     * if string cannot be parsed then return null
     * else return date
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.util.Date toDate(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$toDate, @org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDate(@org.jetbrains.annotations.NotNull()
    java.lang.String origin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatHour(@org.jetbrains.annotations.NotNull()
    java.lang.String origin) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String formatNotification(@org.jetbrains.annotations.NotNull()
    java.util.Date time) {
        return null;
    }
    
    /**
     * convert string to time long milliseconds
     * use function string to date
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Long toTimeLong(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$toTimeLong, @org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    /**
     * convert time long milliseconds to string with predefined format
     * if format is blank return null
     * if format is not java date time format then catch Exception and return null
     * else return formatted string
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String toTimeString(long $this$toTimeString, @org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    /**
     * change time string format from oldFormat to newFormat
     * if string or oldFormat or newFormat is blank then return null
     * if oldFormat/newFormat is illegal then catch exception and return null
     * else return string
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String changeTimeFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$changeTimeFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String oldFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String newFormat, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    /**
     * convert date to time string
     * if format is wrong or illegal then catch exception and return null
     * else return string
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String toTimeString(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$toTimeString, @org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    /**
     * get current date time
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Date getCurrentDateTime() {
        return null;
    }
    
    /**
     * convert date to calendar
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Calendar toCalendar(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$toCalendar) {
        return null;
    }
    
    /**
     * get previous month of this date
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Date getPreviousMonth(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$getPreviousMonth) {
        return null;
    }
    
    /**
     * get next month of this date
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Date getNextMonth(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$getNextMonth) {
        return null;
    }
    
    /**
     * get previous day of this date
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Date getPreviousDay(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$getPreviousDay) {
        return null;
    }
    
    /**
     * get next day of this date
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Date getNextDay(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$getNextDay) {
        return null;
    }
}