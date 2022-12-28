package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class UpdateCustomerFeedbackRequest(
    @field:SerializedName("name") var name: String,
    @field:SerializedName("description") var quantity: Int
)