package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class VerifyOtpResetPasswordRequest(
    @field:SerializedName("mobile_number") var mobile_number: String,
    @field:SerializedName("otp_number") var otp_number: String
)