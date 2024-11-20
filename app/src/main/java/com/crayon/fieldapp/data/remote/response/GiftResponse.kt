package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName

class GiftResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("selectQuantity") var selectQuantity: Int = 0,
    @SerializedName("isSelect") var isSelect: Boolean = false,
    @SerializedName("quantity") var quantity: Int = 0,
    @SerializedName("quantity_in") var quantityIn: Int = 0,
    @SerializedName("quantity_out") var quantityOut: Int = 0,
    @SerializedName("quantity_consume") var quantityConsume: Int = 0,
    @SerializedName("quantity_remain_plan") var quantityRemainPlan: Int = 0,
    @SerializedName("quantity_remain_actual") var quantityRemainActual: Int = 0
) : BaseResponse()