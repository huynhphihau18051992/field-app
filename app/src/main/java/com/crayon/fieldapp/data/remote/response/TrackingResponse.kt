package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class TrackingResponse(
    @SerializedName("createdAt") val createdAt: String,
    @SerializedName("updatedAt") val updatedAt: String,
    @SerializedName("lat") val lat: String,
    @SerializedName("lng") val lng: String
) : BaseResponse()