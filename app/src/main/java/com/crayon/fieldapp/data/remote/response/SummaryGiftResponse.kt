package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class SummaryGiftResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("quantity") val quantity: Int = 0,
    @SerializedName("quantity_in") val quantityIn: Int = 0,
    @SerializedName("quantity_out") val quantityOut: Int = 0,
    @SerializedName("project_gift") val gifts: GiftResponse? = null
) : BaseResponse()