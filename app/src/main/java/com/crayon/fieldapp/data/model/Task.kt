package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "task")
data class Task(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val name: String? = null,
    val address: String? = null,
    val project: String? = null,
    val store: String? = null,
    val startShift: String? = null,
    val endShift: String? = null
) : Parcelable {}