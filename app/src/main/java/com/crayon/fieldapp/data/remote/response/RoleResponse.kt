package com.crayon.fieldapp.data.remote.response

import android.os.Parcelable
import com.crayon.fieldapp.data.model.Agency
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RoleResponse(
    val id: String,
    val role: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null,
    val agency: Agency,
    var isSelected: Boolean = false
) : Parcelable {}
