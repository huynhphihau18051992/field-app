package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "store")
data class Store(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val code: String? = null,
    val name: String? = null,
    val description: String? = null,
    val address: String? = null,
    val lat: Double? = 1.0,
    val lng: Double? = 1.0
) : Parcelable {}