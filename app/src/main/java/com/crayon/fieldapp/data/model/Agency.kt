package com.crayon.fieldapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Agency(
    val id: String,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val name: String? = null,
    val description: String? = null,
    val address: String? = null,
    val mobile_number: String? = null,
    val bank_number: String? = null,
    val tax: String? = null,
    val max_account: Int? = 0,
    val expire_date: String? = null,
    val logo_url: String? = null,
    val owner: String? = null
) : Parcelable {}
