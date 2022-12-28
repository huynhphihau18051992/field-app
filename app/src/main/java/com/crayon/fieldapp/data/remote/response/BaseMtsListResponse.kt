package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName

open class BaseMtsListResponse<Item>(
    @SerializedName("total") val total: Int ? = 0,
    @SerializedName("data") val data: ArrayList<Item>? = null
) : BaseResponse()