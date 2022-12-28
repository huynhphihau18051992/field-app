package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.model.User
import com.crayon.fieldapp.data.remote.request.CreateUserRequest
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.GetVerifyOtpResponse
import com.crayon.fieldapp.data.remote.response.UserResponse
import com.crayon.fieldapp.data.remote.response.VersionApp
import com.crayon.fieldapp.utils.Resource


interface UserRepository {

    suspend fun login(phone: String, pass: String): GetMessageResponse

    suspend fun loginByQrCode(token: String): GetMessageResponse

    suspend fun resetPassword(
        newPassword: String, phone: String,
        otp: String,
        device_id: String,
        fcm_token: String
    ): GetVerifyOtpResponse

    suspend fun forgotPassword(phone: String): LiveData<Resource<GetMessageResponse>>

    suspend fun register(form: CreateUserRequest): LiveData<Resource<GetMessageResponse>>

    suspend fun updateUser(form: CreateUserRequest): LiveData<Resource<GetMessageResponse>>

    suspend fun verifyOtpResetPassword(
        phone: String,
        otp: String
    )

    suspend fun verifyOtp(
        phone: String,
        otp: String,
        device_id: String,
        fcm_token: String
    ): GetVerifyOtpResponse

    suspend fun refreshToken(refreshToken: String): GetVerifyOtpResponse

    suspend fun getMyUser(): UserResponse

    suspend fun getUser(agencyId: String, userId: String): LiveData<Resource<User>>

    suspend fun logout()

    suspend fun getVersionApp(): Resource<List<VersionApp>>

    suspend fun getMembers(
        agencyId: String,
        skip: Int? = null,
        take: Int? = null
    ): LiveData<Resource<List<User>>>
}