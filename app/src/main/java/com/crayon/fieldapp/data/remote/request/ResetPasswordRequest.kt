package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class ResetPasswordRequest(
    @field:SerializedName("password") var password: String,
    @field:SerializedName("mobile_number") var mobile_number: String,
    @field:SerializedName("otp_number") var otp_number: String,
    @field:SerializedName("device_id") var device_id: String,
    @field:SerializedName("device_fcm_token") var fcm_token: String
)