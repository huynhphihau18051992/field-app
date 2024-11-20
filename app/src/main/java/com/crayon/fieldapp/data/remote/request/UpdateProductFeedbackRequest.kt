package com.crayon.fieldapp.data.remote.request

import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.google.gson.annotations.SerializedName

class UpdateProductFeedbackRequest(
    @field:SerializedName("products") var products: List<TaskResponse.Product>? = null,
    @field:SerializedName("customer_feedback") var feedback: ArrayList<TaskResponse.Feedback>? = null
)