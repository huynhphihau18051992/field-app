package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


class BaseItemResponse<Item>(
    @SerializedName("data") val data: Item? = null
) : BaseResponse()