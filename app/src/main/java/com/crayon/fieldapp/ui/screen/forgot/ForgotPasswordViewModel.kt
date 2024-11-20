package com.crayon.fieldapp.ui.screen.forgot

import android.text.TextUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ForgotPasswordViewModel(
    private val userRepository: UserRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _isForgotPasswordSuccess = MediatorLiveData<Resource<GetMessageResponse>>()
    val isForgotPasswordSuccess: LiveData<Resource<GetMessageResponse>> get() = _isForgotPasswordSuccess
    private var forgotPasswordSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()

    fun resetPassword(phone: String) = viewModelScope.launch(dispatchers.main) {
        _isForgotPasswordSuccess.removeSource(forgotPasswordSource)
        withContext(dispatchers.io) {
            forgotPasswordSource = userRepository.forgotPassword(phone)
        }
        _isForgotPasswordSuccess.addSource(forgotPasswordSource) {
            _isForgotPasswordSuccess.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }
}