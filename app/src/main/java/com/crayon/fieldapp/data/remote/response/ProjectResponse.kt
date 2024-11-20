package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class ProjectResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("brand_name") val brandName: String? = null,
    @SerializedName("industry") val industry: String? = null,
    @SerializedName("start_date") val startDate: String? = null,
    @SerializedName("end_date") val endDate: String? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("agency") val agency: AgencyResponse? = null,
    @SerializedName("owner") val owner: MemberResponse? = null,
    @SerializedName("isSelect") var isSelect: Boolean = false
) : BaseResponse()

