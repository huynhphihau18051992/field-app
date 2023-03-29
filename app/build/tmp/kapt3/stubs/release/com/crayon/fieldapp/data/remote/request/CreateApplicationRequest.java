package com.crayon.fieldapp.data.remote.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/crayon/fieldapp/data/remote/request/CreateApplicationRequest;", "", "agency", "", "leader", "type", "", "project", "replacement", "job", "reason", "start_time", "end_time", "(IILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgency", "()I", "setAgency", "(I)V", "getEnd_time", "()Ljava/lang/String;", "setEnd_time", "(Ljava/lang/String;)V", "getJob", "()Ljava/lang/Integer;", "setJob", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLeader", "setLeader", "getProject", "setProject", "getReason", "setReason", "getReplacement", "setReplacement", "getStart_time", "setStart_time", "getType", "setType", "app_release"})
public final class CreateApplicationRequest {
    @com.google.gson.annotations.SerializedName(value = "agency")
    private int agency;
    @com.google.gson.annotations.SerializedName(value = "leader")
    private int leader;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "type")
    private java.lang.String type;
    @com.google.gson.annotations.SerializedName(value = "project")
    private int project;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "replacement")
    private java.lang.Integer replacement;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "job")
    private java.lang.Integer job;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "reason")
    private java.lang.String reason;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "start_time")
    private java.lang.String start_time;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "end_time")
    private java.lang.String end_time;
    
    public final int getAgency() {
        return 0;
    }
    
    public final void setAgency(int p0) {
    }
    
    public final int getLeader() {
        return 0;
    }
    
    public final void setLeader(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getProject() {
        return 0;
    }
    
    public final void setProject(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getReplacement() {
        return null;
    }
    
    public final void setReplacement(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReason() {
        return null;
    }
    
    public final void setReason(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStart_time() {
        return null;
    }
    
    public final void setStart_time(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnd_time() {
        return null;
    }
    
    public final void setEnd_time(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public CreateApplicationRequest(int agency, int leader, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int project, @org.jetbrains.annotations.Nullable()
    java.lang.Integer replacement, @org.jetbrains.annotations.Nullable()
    java.lang.Integer job, @org.jetbrains.annotations.Nullable()
    java.lang.String reason, @org.jetbrains.annotations.NotNull()
    java.lang.String start_time, @org.jetbrains.annotations.NotNull()
    java.lang.String end_time) {
        super();
    }
}