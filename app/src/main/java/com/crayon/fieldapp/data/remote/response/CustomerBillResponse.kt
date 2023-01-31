package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class CustomerBillResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("code_bill") val code_bill: String? = null,
    @SerializedName("image_url") val image_url: String? = null,
    @SerializedName("total_price_bill") val total_price_bill: String? = null,
    @SerializedName("project_customer") val project_customer: String? = null
) : BaseResponse()