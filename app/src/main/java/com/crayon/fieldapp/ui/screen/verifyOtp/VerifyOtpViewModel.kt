package com.crayon.fieldapp.ui.screen.verifyOtp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class VerifyOtpViewModel(
    private val userRepository: UserRepository,
    private val dispatchers: AppDispatchers,
    private val appPref: PrefHelper
) : BaseViewModel() {
    val otp = MutableLiveData<String>()
    private val _isVerifySuccess = MediatorLiveData<Event<Resource<Boolean>>>()
    val isVerifySuccess: LiveData<Event<Resource<Boolean>>> get() = _isVerifySuccess

    fun clickVerifyOtp(phone: String, otp: String, device_id: String, fcm_token: String) {
        if (otp.isNullOrEmpty()) {
            this.otp.value = "Vui lòng nhập mã OTP"
            return
        }

        viewModelScope.launch {
            try {
                _isVerifySuccess.postValue(Event(Resource.loading(null)))
                val res = userRepository.verifyOtp(phone, otp, device_id, fcm_token)
                appPref.setToken("Bearer " + res.token.toString())
                appPref.setRefreshToken(res.refresh_token.toString())
                withContext(Dispatchers.Main) {
                    _isVerifySuccess.postValue(Event(Resource.success(true)))
                }
            } catch (e: Exception) {
                _isVerifySuccess.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    fun clickVerifyOtpPassword(phone: String, otp: String) {
        viewModelScope.launch {
            try {
                _isVerifySuccess.postValue(Event(Resource.loading(null)))
                userRepository.verifyOtpResetPassword(phone = phone, otp = otp)
                withContext(Dispatchers.Main) {
                    _isVerifySuccess.postValue(Event(Resource.success(true)))
                }
            } catch (e: Exception) {
                _isVerifySuccess.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }


    private val _isResendOtpOfLoginSuccess = MutableLiveData<Event<Resource<Boolean>>>()
    val isReSendOtpLoginSuccess: LiveData<Event<Resource<Boolean>>> get() = _isResendOtpOfLoginSuccess
    fun resendOtp(phone: String, pass: String) = viewModelScope.launch(dispatchers.main) {
        viewModelScope.launch {
            _isResendOtpOfLoginSuccess.postValue(Event(Resource.loading(null)))
            try {
                val result = userRepository.login(phone, pass)
                _isResendOtpOfLoginSuccess.postValue(Event(Resource.success(true)))
            } catch (e: Exception) {
                _isResendOtpOfLoginSuccess.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    private val _isResendOtpOfForgotPasswordSuccess = MutableLiveData<Event<Resource<Boolean>>>()
    val isResendOtpOfForgotPasswordSuccess: LiveData<Event<Resource<Boolean>>> get() = _isResendOtpOfForgotPasswordSuccess
    fun resendOtpPassword(phone: String) = viewModelScope.launch(dispatchers.main) {
        viewModelScope.launch {
            _isResendOtpOfForgotPasswordSuccess.postValue(Event(Resource.loading(null)))
            try {
                val result = userRepository.forgotPassword(phone)
                _isResendOtpOfForgotPasswordSuccess.postValue(Event(Resource.success(true)))
            } catch (e: Exception) {
                _isResendOtpOfForgotPasswordSuccess.postValue(
                    Event(
                        Resource.error(
                            Throwable(),
                            null
                        )
                    )
                )
                onLoadFail(e)
            }
        }
    }
}