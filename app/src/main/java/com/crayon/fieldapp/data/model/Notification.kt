package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "notification")
data class Notification(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val title: String? = null,
    val content: String? = null,
    val createDate: String? = null,
    val thumbnail: String? = null
) : Parcelable {}