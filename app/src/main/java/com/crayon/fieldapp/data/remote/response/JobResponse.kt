package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class JobResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("role") val role: String? = null,
    @SerializedName("start_time") val startTime: String? = null,
    @SerializedName("end_time") val endTime: String? = null,
    @SerializedName("agency") val agency: Agency? = null,
    @SerializedName("project") val project: Project? = null,
    @SerializedName("store") val store: Store? = null,
    @SerializedName("pic") val pic: Pic? = null
) : BaseResponse()


data class Project(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("brand_name") val brandName: String? = null,
    @SerializedName("industry") val industry: String? = null,
    @SerializedName("start_date") val startDate: String? = null,
    @SerializedName("end_date") val endDate: String? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("agency") val agency: String? = null,
    @SerializedName("owner") val owner: String? = null,
    @SerializedName("isVerifyOtp") val isVerifyOtp: Boolean? = false
) : BaseResponse()

data class Agency(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("address") val address: String? = null,
    @SerializedName("mobile_number") val mobileNumber: String? = null,
    @SerializedName("bank_number") val bankNumber: String? = null,
    @SerializedName("tax") val tax: String? = null,
    @SerializedName("max_account") val maxAccount: String? = null,
    @SerializedName("expire_date") val expireDate: String? = null,
    @SerializedName("logo_url") val logoUrl: String? = null,
    @SerializedName("owner") val owner: String? = null
) : BaseResponse()

data class Store(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("code") val code: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("address") val address: String? = null,
    @SerializedName("lat") val lat: Double? = null,
    @SerializedName("lng") val lng: Double? = null,
    @SerializedName("agency") val agency: String? = null,
    @SerializedName("store_group") val store_group: String? = null,
    @SerializedName("store_region") val store_region: String? = null,
    @SerializedName("store_type") val store_type: String? = null,
    @SerializedName("store_province") val store_province: String? = null,
    @SerializedName("store_channel") val store_channel: String? = null
) : BaseResponse()

data class Pic(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("first_name") val firstName: String? = null,
    @SerializedName("last_name") val lastName: String? = null,
    @SerializedName("area_code") val areaCode: String? = null,
    @SerializedName("mobile_number") val mobileNumber: String? = null,
    @SerializedName("email_address") val emailAddress: String? = null,
    @SerializedName("identification_number") val identificationNumber: String? = null,
    @SerializedName("password") val password: String? = null,
    @SerializedName("device_id") val deviceId: String? = null,
    @SerializedName("device_fcm_token") val deviceFcmToken: String? = null,
    @SerializedName("otp_key") val otpKey: String? = null,
    @SerializedName("otp_number") val otpNumber: String? = null,
    @SerializedName("avatar_url") val avatarUrl: String? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("isDeleted") val isDeleted: String? = null,
    @SerializedName("profile") val profile: String? = null
) : BaseResponse()


