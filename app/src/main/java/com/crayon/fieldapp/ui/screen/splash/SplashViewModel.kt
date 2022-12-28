package com.crayon.fieldapp.ui.screen.splash

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.ui.base.BaseViewModel
import kotlinx.coroutines.launch

class SplashViewModel() : BaseViewModel() {

    val isLogin = MutableLiveData<Boolean>()

    fun checkLogin() {
        viewModelScope.launch {
            Log.d("AAA", appPrefs.isLogin().toString())
            isLogin.value = appPrefs.isLogin()
        }
    }

}