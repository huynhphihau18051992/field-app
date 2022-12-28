package com.crayon.fieldapp.ui.screen.job.request.adapter

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class JobRequest(
    val id: String,
    val project: String? = null,
    val agency: String? = null,
    val storeName: String? = null,
    val storeId: String? = null,
    val startShift: String? = null,
    val endShift: String? = null,
    val status: String? = null,
    var isSelected: Boolean? = false
) : Parcelable {}