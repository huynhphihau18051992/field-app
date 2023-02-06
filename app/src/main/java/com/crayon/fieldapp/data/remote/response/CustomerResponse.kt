package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class CustomerResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("mobile_number") val mobileNumber: String? = null,
    @SerializedName("customer_bill") val customerBill: String? = null
) : BaseResponse()
