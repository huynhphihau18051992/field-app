package com.crayon.fieldapp.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00aa\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000102H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u000f\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013\u00a8\u00066"}, d2 = {"Lcom/crayon/fieldapp/data/remote/response/Project;", "Lcom/crayon/fieldapp/data/remote/response/BaseResponse;", "createdAt", "", "updatedAt", "id", "name", "description", "brandName", "industry", "startDate", "endDate", "status", "agency", "owner", "isVerifyOtp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAgency", "()Ljava/lang/String;", "getBrandName", "getCreatedAt", "getDescription", "getEndDate", "getId", "getIndustry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getOwner", "getStartDate", "getStatus", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/crayon/fieldapp/data/remote/response/Project;", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
public final class Project extends com.crayon.fieldapp.data.remote.response.BaseResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "createdAt")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updatedAt")
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "brand_name")
    private final java.lang.String brandName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "industry")
    private final java.lang.String industry = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "start_date")
    private final java.lang.String startDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "end_date")
    private final java.lang.String endDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "agency")
    private final java.lang.String agency = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "owner")
    private final java.lang.String owner = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "isVerifyOtp")
    private final java.lang.Boolean isVerifyOtp = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrandName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIndustry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEndDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAgency() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOwner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isVerifyOtp() {
        return null;
    }
    
    public Project(@org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String brandName, @org.jetbrains.annotations.Nullable()
    java.lang.String industry, @org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String agency, @org.jetbrains.annotations.Nullable()
    java.lang.String owner, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isVerifyOtp) {
        super();
    }
    
    public Project() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.crayon.fieldapp.data.remote.response.Project copy(@org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String brandName, @org.jetbrains.annotations.Nullable()
    java.lang.String industry, @org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String agency, @org.jetbrains.annotations.Nullable()
    java.lang.String owner, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isVerifyOtp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}