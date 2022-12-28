package com.crayon.fieldapp.data.model

import com.crayon.fieldapp.data.remote.response.BaseResponse
import com.google.gson.annotations.SerializedName

data class Note(
    @SerializedName("image_name") val imageName: String,
    @SerializedName("note") val note: String
) : BaseResponse()