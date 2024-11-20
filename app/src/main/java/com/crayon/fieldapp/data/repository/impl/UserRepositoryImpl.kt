package com.crayon.fieldapp.data.repository.impl

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.local.dao.UserDao
import com.crayon.fieldapp.data.model.User
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.request.*
import com.crayon.fieldapp.data.remote.response.*
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.utils.NetworkBoundNoCacheResource
import com.crayon.fieldapp.utils.NetworkBoundResource
import com.crayon.fieldapp.utils.Resource


class UserRepositoryImpl(
    private val apiService: ApiService,
    private val userDao: UserDao
) : UserRepository {
    override suspend fun login(phone: String, pass: String): GetMessageResponse {
        return apiService.login(LoginRequest(phone, pass))
    }

    override suspend fun loginByQrCode(token: String): GetMessageResponse {
        return apiService.loginByQrCode(LoginQrCodeRequest(qr_token = token))
    }

    override suspend fun resetPassword(
        newPassword: String, phone: String,
        otp: String,
        device_id: String,
        fcm_token: String
    ): GetVerifyOtpResponse {
        return apiService.resetPassword(
            ResetPasswordRequest(
                password = newPassword,
                otp_number = otp,
                device_id = device_id,
                fcm_token = fcm_token,
                mobile_number = phone
            )
        )
    }

    override suspend fun forgotPassword(phone: String): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.forgotPassword(ForgotPasswordRequest(phone))
            }
        }.build().asLiveData()
    }


    override suspend fun register(form: CreateUserRequest): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.register(
                    firstName = form.firstName!!,
                    lastName = form.lastName!!,
                    birthDate = form.birthDay!!,
                    emailAddress = form.email!!,
                    password = form.password!!,
                    confirmPassword = form.confirmPassword!!,
                    mobileNumber = form.phone!!,
                    gender = form.gender!!,
                    tax = form.tax!!,
                    bankNumber = form.bank_number!!,
                    bankName = form.bank_name!!,
                    bankBranch = form.bank_brand!!,
                    height = form.heigth!!,
                    weight = form.weigth!!,
                    identificationNumber = form.id!!,
                    province_code = form.city!!,
                    district_code = form.district!!,
                    address = form.address!!,
                    avatar = form.avatar!!,
                    fullBodyImage = form.full_body!!,
                    identificationImageBack = form.id_back!!,
                    identificationImageFront = form.id_front!!,
                    temporary_district_code = form.temporary_district!!,
                    temporary_province_code = form.temporary_city!!,
                    temporary_address = form.temporary_address!!
                )
            }
        }.build().asLiveData()
    }

    override suspend fun updateUser(form: CreateUserRequest): LiveData<Resource<GetMessageResponse>> {
        return object : NetworkBoundNoCacheResource<GetMessageResponse>() {
            override suspend fun createCallAsync(): GetMessageResponse {
                return apiService.updateUser(
                    firstName = form.firstName,
                    lastName = form.lastName,
                    birthDate = form.birthDay,
                    emailAddress = form.email,
                    password = form.password,
                    confirmPassword = form.confirmPassword,
                    mobileNumber = form.phone,
                    gender = form.gender,
                    tax = form.tax,
                    bankNumber = form.bank_number,
                    bankName = form.bank_name,
                    bankBranch = form.bank_brand,
                    height = form.heigth,
                    weight = form.weigth,
                    identificationNumber = form.id,
                    province_code = form.city,
                    district_code = form.district,
                    address = form.address,
                    avatar = form.avatar,
                    fullBodyImage = form.full_body,
                    identificationImageBack = form.id_back,
                    identificationImageFront = form.id_front,
                    temporary_province_code = form.temporary_city,
                    temporary_district_code = form.temporary_district,
                    temporary_address = form.temporary_address
                )
            }
        }.build().asLiveData()
    }

    override suspend fun verifyOtpResetPassword(phone: String, otp: String) {
        return apiService.verifyOtpResetPassword(
            VerifyOtpResetPasswordRequest(
                mobile_number = phone,
                otp_number = otp
            )
        )
    }

    override suspend fun verifyOtp(
        phone: String,
        otp: String,
        device_id: String,
        fcm_token: String
    ): GetVerifyOtpResponse {
        return apiService.verifyOtp(VerifyOtpRequest(phone, otp, device_id, fcm_token))
    }

    override suspend fun refreshToken(refreshToken: String): GetVerifyOtpResponse {
        return apiService.refreshToken(refreshToken)
    }

    override suspend fun getMyUser(): UserResponse {
        return apiService.getUser()
    }

    override suspend fun getUser(agencyId: String, userId: String): LiveData<Resource<User>> {
        return object : NetworkBoundResource<User, UserResponse>() {
            override fun processResponse(response: UserResponse): User {
                val user = User(
                    id = response.id.toString(),
                    fullName = response.lastName + " " + response.firstName,
                    area_code = response.areaCode.toString(),
                    mobile_number = response.mobileNumber.toString(),
                    email_address = response.emailAddress.toString(),
                    birth_day = response.profile?.birthDate.toString(),
                    identification_number = response.identificationNumber.toString(),
                    avatar_url = response.avatarUrl.toString(),
                    status = response.status.toString()
                )
                return user
            }

            override suspend fun saveCallResults(items: User) {
                userDao.insert(items)
            }

            override fun shouldFetch(data: User?): Boolean {
                return false
            }

            override suspend fun loadFromDb(): User {
                return userDao.getUser(userId)!!
            }

            override suspend fun createCallAsync(): UserResponse {
                return apiService.getUser(agencyId, userId)
            }


        }.build().asLiveData()
    }

    override suspend fun logout() {
        return apiService.logout()
    }

    override suspend fun getVersionApp(): Resource<List<VersionApp>> {
        return Resource.success(apiService.getVersionApp())
    }

    override suspend fun getMembers(
        agencyId: String,
        skip: Int?,
        take: Int?
    ): LiveData<Resource<List<User>>> {
        return object : NetworkBoundResource<List<User>, GetMemberListResponse>() {
            override fun processResponse(response: GetMemberListResponse): List<User> {
                val items = ArrayList<User>()
                response.data?.let { users ->
                    users.forEach {
                        val job = User(
                            id = it.id.toString(),
                            fullName = it.lastName + " " + it.firstName,
                            area_code = it.areaCode.toString(),
                            mobile_number = it.mobileNumber.toString(),
                            email_address = it.emailAddress.toString(),
                            identification_number = it.identificationNumber.toString(),
                            avatar_url = it.avatarUrl.toString(),
                            status = it.status.toString()
                        )
                        items.add(job)
                    }
                }
                return items
            }

            override suspend fun saveCallResults(items: List<User>) {
                userDao.insert(items)
            }

            override fun shouldFetch(data: List<User>?): Boolean {
                return true
            }

            override suspend fun loadFromDb(): List<User> {
                return userDao.getUsers()!!
            }

            override suspend fun createCallAsync(): GetMemberListResponse {
                return apiService.getMyMembers(agencyId)
            }
        }.build().asLiveData()
    }
}