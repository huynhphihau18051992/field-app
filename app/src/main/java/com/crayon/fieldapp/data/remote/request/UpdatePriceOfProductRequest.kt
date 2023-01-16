package com.crayon.fieldapp.data.remote.request

import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.google.gson.annotations.SerializedName

class UpdatePriceOfProductRequest(
    @field:SerializedName("price") var price: Long
)