package com.crayon.fieldapp.data.local.db;

import java.lang.System;

@androidx.room.Database(entities = {com.crayon.fieldapp.data.model.Job.class, com.crayon.fieldapp.data.model.ProductEntity.class, com.crayon.fieldapp.data.model.Store.class, com.crayon.fieldapp.data.model.Project.class, com.crayon.fieldapp.data.model.User.class, com.crayon.fieldapp.data.model.GroupUser.class, com.crayon.fieldapp.data.model.GroupStore.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/crayon/fieldapp/data/local/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "groupStoreDao", "Lcom/crayon/fieldapp/data/local/dao/GroupStoreDao;", "groupUserDao", "Lcom/crayon/fieldapp/data/local/dao/GroupUserDao;", "jobDao", "Lcom/crayon/fieldapp/data/local/dao/JobDao;", "productDao", "Lcom/crayon/fieldapp/data/local/dao/ProductDao;", "projectDao", "Lcom/crayon/fieldapp/data/local/dao/ProjectDao;", "storeDao", "Lcom/crayon/fieldapp/data/local/dao/StoreDao;", "userDao", "Lcom/crayon/fieldapp/data/local/dao/UserDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crayon.fieldapp.data.local.dao.JobDao jobDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crayon.fieldapp.data.local.dao.ProductDao productDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crayon.fieldapp.data.local.dao.StoreDao storeDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crayon.fieldapp.data.local.dao.ProjectDao projectDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crayon.fieldapp.data.local.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crayon.fieldapp.data.local.dao.GroupStoreDao groupStoreDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.crayon.fieldapp.data.local.dao.GroupUserDao groupUserDao();
    
    public AppDatabase() {
        super();
    }
}