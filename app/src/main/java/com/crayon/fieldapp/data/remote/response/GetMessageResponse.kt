package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName

data class GetMessageResponse(
    @SerializedName("message") val message: String? = null
) : BaseResponse()