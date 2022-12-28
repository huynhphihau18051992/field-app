package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class UpdateProductRequest(
    @field:SerializedName("name") var name: String? = null,
    @field:SerializedName("quantity") var quantity: Int
)