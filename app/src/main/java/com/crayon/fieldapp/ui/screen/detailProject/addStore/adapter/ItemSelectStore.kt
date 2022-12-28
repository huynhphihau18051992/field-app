package com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemSelectStore(
    val id: String,
    val name: String? = null,
    val address: String? = null,
    var isSelected: Boolean = false
) : Parcelable {}