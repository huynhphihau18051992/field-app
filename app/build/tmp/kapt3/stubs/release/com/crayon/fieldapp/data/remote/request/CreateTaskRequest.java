package com.crayon.fieldapp.data.remote.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/crayon/fieldapp/data/remote/request/CreateTaskRequest;", "", "project", "", "job", "pic", "store", "description", "", "name", "type", "(IIIILjava/lang/String;Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getJob", "()I", "setJob", "(I)V", "getName", "setName", "getPic", "setPic", "getProject", "setProject", "getStore", "setStore", "getType", "setType", "app_release"})
public final class CreateTaskRequest {
    @com.google.gson.annotations.SerializedName(value = "project")
    private int project;
    @com.google.gson.annotations.SerializedName(value = "job")
    private int job;
    @com.google.gson.annotations.SerializedName(value = "pic")
    private int pic;
    @com.google.gson.annotations.SerializedName(value = "store")
    private int store;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "description")
    private java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @com.google.gson.annotations.SerializedName(value = "type")
    private int type;
    
    public final int getProject() {
        return 0;
    }
    
    public final void setProject(int p0) {
    }
    
    public final int getJob() {
        return 0;
    }
    
    public final void setJob(int p0) {
    }
    
    public final int getPic() {
        return 0;
    }
    
    public final void setPic(int p0) {
    }
    
    public final int getStore() {
        return 0;
    }
    
    public final void setStore(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    public CreateTaskRequest(int project, int job, int pic, int store, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int type) {
        super();
    }
}