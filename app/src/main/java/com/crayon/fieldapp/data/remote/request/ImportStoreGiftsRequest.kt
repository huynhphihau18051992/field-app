package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class ImportStoreGiftsRequest(
    @field:SerializedName("project_gift_id") var giftId: String,
    @field:SerializedName("quantity_in") var quantityIn: Int? = null,
    @field:SerializedName("quantity_out") var quantityOut: Int? = null
)
