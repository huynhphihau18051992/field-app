package com.crayon.fieldapp.ui.screen.login

import android.text.TextUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class LoginViewModel(private val userRepository: UserRepository) : BaseViewModel() {

    val phone = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _isVerifySuccess = MediatorLiveData<Event<Resource<Boolean>>>()
    val isVerifySuccess: LiveData<Event<Resource<Boolean>>> get() = _isVerifySuccess


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
                _isVerifySuccess.postValue(Event(Resource.loading(null)))
                val res = userRepository.login(mPhone, mPassword)
                withContext(Dispatchers.Main) {
                    _isVerifySuccess.postValue(Event(Resource.success(true)))
                }
            } catch (e: Exception) {
                _isVerifySuccess.postValue(Event(Resource.error(Throwable(), true)))
                onLoadFail(e)
            }
        }
    }
}