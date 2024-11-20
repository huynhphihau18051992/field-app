package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class Profile(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("bank_branch") val bankBranch: String? = null,
    @SerializedName("bank_name") val bankName: String? = null,
    @SerializedName("bank_number") val bankNumber: String? = null,
    @SerializedName("birth_date") val birthDate: String? = null,
    @SerializedName("province_code") val provinceCode: String? = null,
    @SerializedName("temporary_district_code") val temporary_district_code: String? = null,
    @SerializedName("temporary_province_code") val temporary_province_code: String? = null,
    @SerializedName("temporary_address") val temporary_address: String? = null,
    @SerializedName("address") val address: String? = null,
    @SerializedName("province") val province: String? = null,
    @SerializedName("district_code") val districtCode: String? = null,
    @SerializedName("district") val district: String? = null,
    @SerializedName("gender") val gender: String? = null,
    @SerializedName("height") val height: Int,
    @SerializedName("weight") val weight: Int,
    @SerializedName("identification_image_front_url") val identificationImageFrontUrl: String? = null,
    @SerializedName("identification_image_back_url") val identificationImageBackUrl: String? = null,
    @SerializedName("full_body_image_url") val fullBodyImageUrl: String? = null,
    @SerializedName("tax") val tax: String? = null,
    @SerializedName("user") val user: String? = null
) : BaseResponse()