package com.crayon.fieldapp.ui.screen.profile

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.local.pref.AppPrefs
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.MemberRequestResponse
import com.crayon.fieldapp.data.remote.response.UserResponse
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class ProfileViewModel(private val userRepository: UserRepository) :
    BaseViewModel() {
    val isLogoutSuccess = MutableLiveData<Boolean>()

    private val _loginByQrCode = MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val loginByQrCode: LiveData<Event<Resource<GetMessageResponse>>> get() = _loginByQrCode
    fun logout() {
        viewModelScope.launch {
            try {
                userRepository.logout()
                appPrefs.clear()
                isLogoutSuccess.value = true
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }

    fun loginByQrCode(token: String) {
        viewModelScope.launch {
            _loginByQrCode.postValue(Event(Resource.loading(null)))
            try {
                val result = userRepository.loginByQrCode(token)
                _loginByQrCode.postValue(Event(Resource.success(result)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }

    var user = MutableLiveData<UserResponse>()
    fun getUserInfo() {
        viewModelScope.launch {
            try {
                user.value = userRepository.getMyUser()
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }
}