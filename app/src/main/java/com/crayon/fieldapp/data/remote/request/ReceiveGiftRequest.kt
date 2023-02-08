package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class ReceiveGiftRequest(
    @field:SerializedName("gifts") var gifts: ArrayList<ProjectGiftRequest>,
    @field:SerializedName("note") var note: String? = null
)