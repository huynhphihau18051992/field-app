package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName
import com.crayon.fieldapp.data.model.Store


data class GroupStoreResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("code") val code: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("agency") val agency: String? = null,
    @SerializedName("stores") val stores: List<StoreResponse>? = null
) : BaseResponse()
