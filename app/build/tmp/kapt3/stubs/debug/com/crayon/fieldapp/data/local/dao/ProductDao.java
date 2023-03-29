package com.crayon.fieldapp.data.local.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ+\u0010\u0018\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/crayon/fieldapp/data/local/dao/ProductDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteJob", "product", "Lcom/crayon/fieldapp/data/model/ProductEntity;", "(Lcom/crayon/fieldapp/data/model/ProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProduct", "currentDate", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProduct", "getProducts", "", "projectId", "insert", "list", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "updatePrice", "price", "isEdit", "", "(Ljava/lang/String;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ProductDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM product WHERE product.projectId = :projectId")
    public abstract java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.crayon.fieldapp.data.model.ProductEntity>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM product WHERE product.id = :id")
    public abstract java.lang.Object getProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.crayon.fieldapp.data.model.ProductEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.ProductEntity product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.crayon.fieldapp.data.model.ProductEntity> list, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.ProductEntity product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "UPDATE product SET price = :price, isEdit = :isEdit WHERE id = :id")
    public abstract java.lang.Object updatePrice(@org.jetbrains.annotations.NotNull()
    java.lang.String id, long price, boolean isEdit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p3);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteJob(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.data.model.ProductEntity product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM product WHERE id = :id")
    public abstract java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM product WHERE endDate <= :currentDate ")
    public abstract java.lang.Object deleteProduct(long currentDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM product")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}