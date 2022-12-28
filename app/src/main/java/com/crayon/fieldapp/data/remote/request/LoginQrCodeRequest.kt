package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class LoginQrCodeRequest(
    @field:SerializedName("qr_token") var qr_token: String
)