package com.crayon.fieldapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.crayon.fieldapp.data.model.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    suspend fun getUsers(): List<User>?

    @Query("SELECT * FROM user WHERE user.id = :id")
    suspend fun getUser(id: String): User?

    @Insert(onConflict = IGNORE)
    suspend fun insert(job: User)

    @Insert(onConflict = IGNORE)
    suspend fun insert(list: List<User>)

    @Insert(onConflict = REPLACE)
    suspend fun update(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("DELETE FROM user WHERE id = :id")
    suspend fun deleteUser(id: String)

    @Query("DELETE FROM user")
    suspend fun deleteAll()

    @Query("SELECT * FROM user LIMIT :pageSize OFFSET :pageIndex")
    suspend fun getUserPage(pageSize: Int, pageIndex: Int): List<User>?
}