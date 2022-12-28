package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "group")
data class Attendance(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val store: String? = null,
    val num: String? = null,
    val startTime: String? = null,
    val endTime: String? = null,
    val status: String? = null
) : Parcelable {}