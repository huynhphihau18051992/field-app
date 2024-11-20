package com.crayon.fieldapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.crayon.fieldapp.data.model.Job
import com.crayon.fieldapp.data.model.Project

@Dao
interface ProjectDao {
    @Query("SELECT * FROM project")
    suspend fun getProjects(): List<Project>?

    @Query("SELECT * FROM project WHERE project.id = :id")
    suspend fun getProject(id: String): Project?

    @Insert(onConflict = IGNORE)
    suspend fun insert(project: Project)

    @Insert(onConflict = IGNORE)
    suspend fun insert(list: List<Project>)

    @Insert(onConflict = REPLACE)
    suspend fun update(project: Project)

    @Delete
    suspend fun deleteProject(project: Project)

    @Query("DELETE FROM project WHERE id = :id")
    suspend fun deleteProject(id: String)

    @Query("DELETE FROM project")
    suspend fun deleteAll()

    @Query("SELECT * FROM project LIMIT :pageSize OFFSET :pageIndex")
    suspend fun getProjectPage(pageSize: Int, pageIndex: Int): List<Project>?

    @Query("SELECT * FROM project WHERE status =:status ")
    suspend fun filterProjectByStatus(status: String): List<Project>?

//    @Query("SELECT * FROM movie WHERE movie.isFavorite = 1 LIMIT :pageSize OFFSET ((:pageIndex-1)*:pageSize) ")
//    suspend fun getFavorite(pageSize: Int, pageIndex: Int): List<Movie>?
}