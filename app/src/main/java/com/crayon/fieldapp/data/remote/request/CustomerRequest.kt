package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class CustomerRequest(
    @field:SerializedName("name") var name: String,
    @field:SerializedName("mobile_number") var mobile_number: String
)