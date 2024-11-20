package com.crayon.fieldapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.crayon.fieldapp.data.model.GroupUser

@Dao
interface GroupUserDao {
    @Query("SELECT * FROM groupUser")
    suspend fun getGroups(): List<GroupUser>?

    @Query("SELECT * FROM groupUser WHERE groupUser.id = :id")
    suspend fun getGroup(id: String): GroupUser?

    @Insert(onConflict = IGNORE)
    suspend fun insert(group: GroupUser)

    @Insert(onConflict = IGNORE)
    suspend fun insert(list: List<GroupUser>)

    @Insert(onConflict = REPLACE)
    suspend fun update(group: GroupUser)

    @Delete
    suspend fun deleteGroup(group: GroupUser)

    @Query("DELETE FROM groupUser WHERE id = :id")
    suspend fun deleteGroup(id: String)

    @Query("DELETE FROM groupUser")
    suspend fun deleteAll()

    @Query("SELECT * FROM groupUser LIMIT :pageSize OFFSET :pageIndex")
    suspend fun getGroupPage(pageSize: Int, pageIndex: Int): List<GroupUser>?

}