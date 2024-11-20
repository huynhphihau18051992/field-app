package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class SummaryPromotionResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("quantity") val quantity: Int = 0,
    @SerializedName("project_promotion_package") val promotion: PromotionResponse? = null
) : BaseResponse()