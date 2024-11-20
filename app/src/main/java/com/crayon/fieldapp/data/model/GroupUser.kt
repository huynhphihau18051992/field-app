package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "groupUser")
data class GroupUser(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val name: String,
    val agency: String,
    val manager: String,
    val parent: String? = null
) : Parcelable {}