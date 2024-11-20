package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class ForgotPasswordRequest(
    @field:SerializedName("mobile_number") var phone: String
)