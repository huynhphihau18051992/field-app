package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "product")
data class ProductEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val projectId: String,
    val name: String? = null,
    val price: Long = 0,
    val isEdit: Boolean = false,
    val endDate: Long = 0
) : Parcelable {}