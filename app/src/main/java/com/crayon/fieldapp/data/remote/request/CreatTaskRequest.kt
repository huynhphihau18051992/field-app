package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class CreateTaskRequest(
    @field:SerializedName("project") var project: Int,
    @field:SerializedName("job") var job: Int,
    @field:SerializedName("pic") var pic: Int,
    @field:SerializedName("store") var store: Int,
    @field:SerializedName("description") var description: String,
    @field:SerializedName("name") var name: String,
    @field:SerializedName("type") var type: Int
)