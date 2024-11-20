package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "job")
data class Job(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val createdAt: Long? = null,
    val updatedAt: Long? = null,
    val name: String? = null,
    val description: String? = null,
    val status: String? = null,
    val role: String? = null,
    val start_time: Long? = null,
    val end_time: Long? = null,
    val agencyName: String? = null,
    val agencyId: String? = null,
    val projectName: String? = null,
    val projectId: String? = null,
    val storeName: String? = null,
    val storeId: String? = null,
    val picId: String? = null,
    val picAvatar: String? = null,
    val picFullName: String? = null
) : Parcelable {}


enum class JobStatus {
    Pending,
    Processing,
    Closed,
    Completed,
    Incomplete
}