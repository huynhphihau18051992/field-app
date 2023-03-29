package com.crayon.fieldapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t\u001a\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t\u001a\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\t\u001a\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\t\u001a\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\t\u001a\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\t\u001a\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\t\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "repositoryModule", "Lorg/koin/core/module/Module;", "getRepositoryModule", "()Lorg/koin/core/module/Module;", "createAppDatabase", "Lcom/crayon/fieldapp/data/local/db/AppDatabase;", "dbName", "", "context", "Landroid/content/Context;", "createDatabaseName", "createGroupStoreDao", "Lcom/crayon/fieldapp/data/local/dao/GroupStoreDao;", "appDatabase", "createGroupUserDao", "Lcom/crayon/fieldapp/data/local/dao/GroupUserDao;", "createJobDao", "Lcom/crayon/fieldapp/data/local/dao/JobDao;", "createProductDao", "Lcom/crayon/fieldapp/data/local/dao/ProductDao;", "createProjectDao", "Lcom/crayon/fieldapp/data/local/dao/ProjectDao;", "createStoreDao", "Lcom/crayon/fieldapp/data/local/dao/StoreDao;", "createUserDao", "Lcom/crayon/fieldapp/data/local/dao/UserDao;", "app_release"})
public final class RepositoryModuleKt {
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module repositoryModule = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getRepositoryModule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String createDatabaseName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.room.migration.Migration getMIGRATION_1_2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.local.db.AppDatabase createAppDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String dbName, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.local.dao.JobDao createJobDao(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.local.dao.ProductDao createProductDao(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.local.dao.ProjectDao createProjectDao(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.local.dao.StoreDao createStoreDao(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.local.dao.UserDao createUserDao(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.local.dao.GroupStoreDao createGroupStoreDao(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.crayon.fieldapp.data.local.dao.GroupUserDao createGroupUserDao(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.local.db.AppDatabase appDatabase) {
        return null;
    }
}