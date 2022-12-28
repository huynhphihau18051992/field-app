package com.crayon.fieldapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.crayon.fieldapp.data.model.Job

@Dao
interface JobDao {
    @Query("SELECT * FROM job")
    suspend fun getJobs(): List<Job>?

    @Query("SELECT * FROM job WHERE job.id = :id")
    suspend fun getJob(id: String): Job?

    @Insert(onConflict = IGNORE)
    suspend fun insert(job: Job)

    @Insert(onConflict = IGNORE)
    suspend fun insert(list: List<Job>)

    @Insert(onConflict = REPLACE)
    suspend fun update(job: Job)

    @Delete
    suspend fun deleteJob(job: Job)

    @Query("DELETE FROM job WHERE id = :id")
    suspend fun deleteJob(id: String)

    @Query("DELETE FROM job")
    suspend fun deleteAll()

    @Query("SELECT * FROM job LIMIT :pageSize OFFSET :pageIndex")
    suspend fun getJobPage(pageSize: Int, pageIndex: Int): List<Job>?

    @Query("SELECT * FROM job WHERE start_time BETWEEN :startTime AND :endTime")
    suspend fun filterJobByTime(startTime: Long, endTime: Long): List<Job>?

    @Query("SELECT * FROM job WHERE status =:status ")
    suspend fun filterJobByStatus(status: String): List<Job>?

    @Query("SELECT * FROM job WHERE projectId =:projectId AND storeId =:storeId AND start_time BETWEEN :startTime AND :endTime")
    suspend fun filterJobAtStore(projectId: String, storeId: String, startTime: Long, endTime: Long): List<Job>?

    @Query("SELECT * FROM job WHERE projectId =:projectId ")
    suspend fun filterJobByProject(projectId: String): List<Job>?

//    @Query("SELECT * FROM movie WHERE movie.isFavorite = 1 LIMIT :pageSize OFFSET ((:pageIndex-1)*:pageSize) ")
//    suspend fun getFavorite(pageSize: Int, pageIndex: Int): List<Movie>?
}