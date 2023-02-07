package com.crayon.fieldapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.crayon.fieldapp.data.model.ProductEntity

@Dao
interface ProductDao {
    @Query("SELECT * FROM product WHERE product.projectId = :projectId")
    suspend fun getProducts(projectId: String): List<ProductEntity>

    @Query("SELECT * FROM product WHERE product.id = :id")
    suspend fun getProduct(id: String): ProductEntity

    @Insert(onConflict = IGNORE)
    suspend fun insert(product: ProductEntity)

    @Insert(onConflict = IGNORE)
    suspend fun insert(list: List<ProductEntity>)

    @Insert(onConflict = REPLACE)
    suspend fun update(product: ProductEntity)

    @Query("UPDATE product SET price = :price, isEdit = :isEdit WHERE id = :id")
    suspend fun updatePrice(id: String, price: Long, isEdit: Boolean = true)

    @Delete
    suspend fun deleteJob(product: ProductEntity)

    @Query("DELETE FROM product WHERE id = :id")
    suspend fun deleteProduct(id: String)

    @Query("DELETE FROM product WHERE endDate <= :currentDate ")
    suspend fun deleteProduct(currentDate: Long)

    @Query("DELETE FROM product")
    suspend fun deleteAll()
}