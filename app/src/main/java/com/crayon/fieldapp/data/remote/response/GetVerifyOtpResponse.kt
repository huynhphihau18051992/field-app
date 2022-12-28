package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName

data class GetVerifyOtpResponse(
    @SerializedName("token") val token: String? = null,
    @SerializedName("refresh_token") val refresh_token: String? = null,
    @SerializedName("expires_after") val expires_after: String? = null
) : BaseResponse()