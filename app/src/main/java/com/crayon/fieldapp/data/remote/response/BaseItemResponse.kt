package com.crayon.fieldapp.data.remote.response


class BaseItemResponse<Item>(
    val item: Item? = null
) : BaseResponse()