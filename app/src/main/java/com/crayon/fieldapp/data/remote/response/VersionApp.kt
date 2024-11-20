package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class VersionApp(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("key") val key: String? = null,
    @SerializedName("value") val value: String? = null
) : BaseResponse()