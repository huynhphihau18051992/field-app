package com.crayon.fieldapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.crayon.fieldapp.data.model.GroupStore

@Dao
interface GroupStoreDao {
    @Query("SELECT * FROM groupStore")
    suspend fun getGroups(): List<GroupStore>?

    @Query("SELECT * FROM groupStore WHERE groupStore.id = :id")
    suspend fun getGroup(id: String): GroupStore?

    @Insert(onConflict = IGNORE)
    suspend fun insert(group: GroupStore)

    @Insert(onConflict = IGNORE)
    suspend fun insert(list: List<GroupStore>)

    @Insert(onConflict = REPLACE)
    suspend fun update(group: GroupStore)

    @Delete
    suspend fun deleteGroup(group: GroupStore)

    @Query("DELETE FROM groupStore WHERE id = :id")
    suspend fun deleteGroup(id: String)

    @Query("DELETE FROM groupStore")
    suspend fun deleteAll()

    @Query("SELECT * FROM groupStore LIMIT :pageSize OFFSET :pageIndex")
    suspend fun getGroupPage(pageSize: Int, pageIndex: Int): List<GroupStore>?

}