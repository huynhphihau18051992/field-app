package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class MemberResponse(
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