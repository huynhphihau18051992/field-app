package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

data class CheckInRequest(
    @field:SerializedName("lat") var lat: String,
    @field:SerializedName("lng") var lng: String
)