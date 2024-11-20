package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class StoreResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("code") val code: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("address") val address: String? = null,
    @SerializedName("lat") val lat: Double,
    @SerializedName("lng") val lng: Double,
    @SerializedName("agency") val agency: String,
    @SerializedName("store_group") val storeFroup: StoreFiledResponse? = null,
    @SerializedName("store_region") val storeRegion: StoreFiledResponse,
    @SerializedName("store_type") val storeType: StoreFiledResponse,
    @SerializedName("store_province") val storeChain: StoreFiledResponse,
    @SerializedName("store_channel") val storeMarketGroup: StoreFiledResponse
) : BaseResponse()

data class StoreFiledResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("code") val code: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("agency") val agency: String? = null
) : BaseResponse()