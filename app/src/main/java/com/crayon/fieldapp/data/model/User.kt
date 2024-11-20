package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "user")
data class User(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val fullName: String? = null,
    val area_code: String? = null,
    val mobile_number: String? = null,
    val email_address: String? = null,
    val identification_number: String? = null,
    val avatar_url: String? = null,
    val birth_day: String? = null,
    val status: String? = null
) : Parcelable {}