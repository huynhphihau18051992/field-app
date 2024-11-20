package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class OrderResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("total") val total: Int = 0,
    @SerializedName("products") val products: ArrayList<ProductResponse> = arrayListOf()
) : BaseResponse()
