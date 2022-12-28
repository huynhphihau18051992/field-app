package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class PicAttendanceResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("attendances") val attendances: ArrayList<Any>? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("agency") val agency: Agency? = null,
    @SerializedName("project") val project: Project? = null,
    @SerializedName("pic") val pic: Pic? = null
) : BaseResponse()
