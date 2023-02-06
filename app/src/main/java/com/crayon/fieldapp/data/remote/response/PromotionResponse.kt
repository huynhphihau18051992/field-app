package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName

class PromotionResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("default_price") val default_price: String? = null,
    @SerializedName("package_type") val package_type: String? = null,
    @SerializedName("project") val project: String? = null,
    @SerializedName("product") var products: ArrayList<ProductResponse> = arrayListOf(),
    @SerializedName("isSelect") var isSelect: Boolean = false,
    @SerializedName("quantity") var quantity: Int = 0,
    @SerializedName("project_promotion_package") var project_promotion_package: String? = null
) : BaseResponse()