package com.crayon.fieldapp.data.remote.request

import com.google.gson.annotations.SerializedName

class ListIdRequest(
    @field:SerializedName("ids") var ids: ArrayList<String>
)