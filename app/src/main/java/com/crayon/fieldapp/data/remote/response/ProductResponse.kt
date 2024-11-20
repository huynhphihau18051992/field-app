package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class ProductResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("price") var price: Int = 0,
    @SerializedName("product_code") val product_code: String? = null,
    @SerializedName("product_sku") val product_sku: String? = null,
    @SerializedName("project") val project: String? = null,
    @SerializedName("quantity") var quantity: Int = 0,
    @SerializedName("isSelect") var isSelect: Boolean = false,
    @SerializedName("isEdit") var isEdit: Boolean = false
) : BaseResponse()