package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class GroupUserResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("agency") val agency: String? = null,
    @SerializedName("manager") val manager: String? = null,
    @SerializedName("parent") val parent: String? = null
//    @SerializedName("stores") val stores: List<StoreResponse>? = null
) : BaseResponse()