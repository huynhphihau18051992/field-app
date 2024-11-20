package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class ProjectSummaryResponse(
    @SerializedName("total_customer") val totalCustomer: Int = 0,
    @SerializedName("total_promotion_package") val totalPromotion: Int = 0,
    @SerializedName("total_gift") val totalGift: Int = 0
) : BaseResponse()
