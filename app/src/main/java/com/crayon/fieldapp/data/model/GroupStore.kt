package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "groupStore")
data class GroupStore(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val code: String,
    val name: String,
    val agency: String
) : Parcelable {}