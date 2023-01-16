package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class CustomerResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("address") val address: String? = null,
    @SerializedName("mobile_number") val mobileNumber: String? = null,
    @SerializedName("bank_number") val bankNumber: String? = null,
    @SerializedName("tax") val tax: String? = null,
    @SerializedName("max_account") val maxAccount: String? = null,
    @SerializedName("expire_date") val expireDate: String? = null,
    @SerializedName("logo_url") val logoUrl: String? = null,
    @SerializedName("owner") val owner: String? = null
) : BaseResponse()