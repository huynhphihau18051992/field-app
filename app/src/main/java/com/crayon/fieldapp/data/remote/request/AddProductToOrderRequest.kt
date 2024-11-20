package com.crayon.fieldapp.data.remote.request

import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.google.gson.annotations.SerializedName

class AddProductToOrderRequest(
    @field:SerializedName("products") var products: ArrayList<ProjectProductRequest>
)

