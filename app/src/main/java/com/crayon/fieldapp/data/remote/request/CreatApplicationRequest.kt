package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class CreateApplicationRequest(
    @field:SerializedName("agency") var agency: Int,
    @field:SerializedName("leader") var leader: Int,
    @field:SerializedName("type") var type: String,
    @field:SerializedName("project") var project: Int,
    @field:SerializedName("replacement") var replacement: Int? = null,
    @field:SerializedName("job") var job: Int? = null,
    @field:SerializedName("reason") var reason: String? = null,
    @field:SerializedName("start_time") var start_time: String,
    @field:SerializedName("end_time") var end_time: String
)