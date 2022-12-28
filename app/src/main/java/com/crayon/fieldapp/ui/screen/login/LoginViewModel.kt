package com.crayon.fieldapp.ui.screen.login

import android.text.TextUtils
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel(private val userRepository: UserRepository) : BaseViewModel() {

    val phone = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val isVerifySuccess = MutableLiveData<Boolean>()

    private fun validateForm(email: String?, password: String?): Boolean =
        validateEmail(email) && validatePassword(password)

    private fun validateEmail(email: String?): Boolean = email != null
            && !TextUtils.isEmpty(email.trim())

    private fun validatePassword(password: String?): Boolean = password != null
            && !TextUtils.isEmpty(password.trim())

    fun clickLogin(mPhone: String, mPassword: String) {
        if (!validateEmail(mPhone)) {
            phone.value = "Vui lòng nhập số điện thoại"
            return
        }

        if (!validatePassword(mPassword)) {
            phone.value = "Vui lòng nhập mật khẩu"
            return
        }
        viewModelScope.launch {
            try {
                val res = userRepository.login(mPhone, mPassword)
                withContext(Dispatchers.Main) {
                    isVerifySuccess.value = true
                }
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }
}