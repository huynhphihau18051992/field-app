package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class CreateJobRequest(
    @field:SerializedName("store") var storeId: Int,
    @field:SerializedName("pic") var picId: Int,
    @field:SerializedName("name") var name: String,
    @field:SerializedName("description") var description: String,
    @field:SerializedName("role") var role: String,
    @field:SerializedName("start_time") var start_time: String,
    @field:SerializedName("end_time") var end_time: String
)