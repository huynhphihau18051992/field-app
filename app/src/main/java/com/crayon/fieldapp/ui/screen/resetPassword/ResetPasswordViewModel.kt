package com.crayon.fieldapp.ui.screen.resetPassword

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ResetPasswordViewModel(
    private val userRepository: UserRepository,
    private val appPref: PrefHelper
) : BaseViewModel() {
    val isVerifySuccess = MutableLiveData<Boolean>()


    fun resetPassword(
        password: String,
        otp: String,
        device_id: String,
        fcm_token: String,
        phone: String
    ) {
        viewModelScope.launch {
            try {
                val res = userRepository.resetPassword(
                    newPassword = password,
                    phone = phone,
                    fcm_token = fcm_token,
                    device_id = device_id,
                    otp = otp
                )
                withContext(Dispatchers.Main) {
                    appPref.setToken("Bearer " + res.token.toString())
                    appPref.setRefreshToken(res.refresh_token.toString())
                    isVerifySuccess.value = true
                }
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }
}