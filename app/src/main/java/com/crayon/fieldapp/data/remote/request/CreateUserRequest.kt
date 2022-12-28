package com.crayon.fieldapp.data.remote.request

import okhttp3.MultipartBody
import okhttp3.RequestBody

data class CreateUserRequest(
    val firstName: RequestBody? = null,
    val lastName: RequestBody? = null,
    val birthDay: RequestBody? = null,
    val email: RequestBody? = null,
    val password: RequestBody? = null,
    val confirmPassword: RequestBody? = null,
    val phone: RequestBody? = null,
    val gender: RequestBody? = null,
    val tax: RequestBody? = null,
    val bank_number: RequestBody? = null,
    val bank_name: RequestBody? = null,
    val bank_brand: RequestBody? = null,
    val heigth: RequestBody? = null,
    val weigth: RequestBody? = null,
    val id: RequestBody? = null,
    val city: RequestBody? = null,
    val temporary_city: RequestBody? = null,
    val district: RequestBody? = null,
    val temporary_district: RequestBody? = null,
    val avatar: MultipartBody.Part? = null,
    val full_body: MultipartBody.Part? = null,
    val id_front: MultipartBody.Part? = null,
    val id_back: MultipartBody.Part? = null,
    val address: RequestBody? = null,
    val temporary_address: RequestBody? = null
)