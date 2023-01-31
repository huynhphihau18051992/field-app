package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class ProductResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("price") val price: String? = null,
    @SerializedName("product_code") val product_code: String? = null,
    @SerializedName("product_sku") val product_sku: String? = null,
    @SerializedName("project") val project: String? = null
) : BaseResponse()