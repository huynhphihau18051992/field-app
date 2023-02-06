package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName

class GiftResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("selectQuantity") var selectQuantity: Int = 0,
    @SerializedName("isSelect") var isSelect: Boolean = false,
    @SerializedName("quantity") var quantity: Int = 0
) : BaseResponse()