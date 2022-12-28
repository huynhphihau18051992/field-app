package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "application")
data class Application(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val type: String? = null,
    val project: String? = null,
    val reason: String? = null,
    val name: String? = null,
    val createDate: String? = null,
    val status: String? = null
) : Parcelable {}