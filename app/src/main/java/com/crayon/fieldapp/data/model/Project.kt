package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "project")
data class Project(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val createdAt: Long? = null,
    val updatedAt: Long? = null,
    val name: String? = null,
    val description: String? = null,
    val brand_name: String? = null,
    val industry: String? = null,
    val start_date: Long? = null,
    val end_date: Long? = null,
    val status: String? = null,
    val agencyId: String? = null,
    val agencyName: String? = null
) : Parcelable {}

enum class ProjectStatus {
    Pending,
    Processing,
    Closed
}
