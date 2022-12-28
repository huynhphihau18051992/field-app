package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class MemberRequestResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("role") val role: String? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("agency") val agency: AgencyResponse? = null,
    @SerializedName("user") val user: MemberResponse? = null
) : BaseResponse()


