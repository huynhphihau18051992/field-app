package com.crayon.fieldapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.crayon.fieldapp.data.model.Store

@Dao
interface StoreDao {
    @Query("SELECT * FROM store")
    suspend fun getStores(): List<Store>?

    @Query("SELECT * FROM store WHERE store.id = :id")
    suspend fun getStore(id: String): Store?

    @Insert(onConflict = IGNORE)
    suspend fun insert(store: Store)

    @Insert(onConflict = IGNORE)
    suspend fun insert(list: List<Store>)

    @Insert(onConflict = REPLACE)
    suspend fun update(store: Store)

    @Delete
    suspend fun deleteStore(store: Store)

    @Query("DELETE FROM store WHERE id = :id")
    suspend fun deleteStore(id: String)

    @Query("DELETE FROM store")
    suspend fun deleteAll()

    @Query("SELECT * FROM store LIMIT :pageSize OFFSET :pageIndex")
    suspend fun getStorePage(pageSize: Int, pageIndex: Int): List<Store>?

//    @Query("SELECT * FROM movie WHERE movie.isFavorite = 1 LIMIT :pageSize OFFSET ((:pageIndex-1)*:pageSize) ")
//    suspend fun getFavorite(pageSize: Int, pageIndex: Int): List<Movie>?
}