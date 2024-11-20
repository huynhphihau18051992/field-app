package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class ResendCustomerOtpRequest(
    @field:SerializedName("mobile_number") var mobile_number: String
)