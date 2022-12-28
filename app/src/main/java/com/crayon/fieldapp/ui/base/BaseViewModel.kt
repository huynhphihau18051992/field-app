package com.crayon.fieldapp.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.local.pref.AppPrefs
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.remote.convertToBaseException
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.utils.SingleLiveEvent
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.core.KoinComponent
import org.koin.core.inject
import java.net.HttpURLConnection
import java.net.SocketTimeoutException
import java.net.UnknownHostException

abstract class BaseViewModel : ViewModel(), KoinComponent {
    // loading flag
    val isLoading = MutableLiveData<Boolean>().apply { value = false }
    val auth by inject<UserRepository>()
    val appPrefs by inject<PrefHelper>()

    // error message
    val errorMessage = SingleLiveEvent<String>()

    // optional flags
    val noInternetConnectionEvent = SingleLiveEvent<Unit>()
    val tokenExpiredEvent = SingleLiveEvent<Unit>()
    val connectTimeoutEvent = SingleLiveEvent<Unit>()
    val forceUpdateAppEvent = SingleLiveEvent<Unit>()
    val serverMaintainEvent = SingleLiveEvent<Unit>()

    // exception handler for coroutine
    private val exceptionHandler = CoroutineExceptionHandler { context, throwable ->
        viewModelScope.launch {
            onLoadFail(throwable)
        }
    }

    /**
     * handle throwable when load fail
     */
    open suspend fun onLoadFail(throwable: Throwable) {
        withContext(Dispatchers.Main) {
            when (throwable) {
                // case no internet connection
                is UnknownHostException -> {
                    noInternetConnectionEvent.call()
                }
                // case request time out
                is SocketTimeoutException -> {
                    connectTimeoutEvent.call()
                }
                else -> {
                    // convert throwable to base exception to get error information
                    val baseException = convertToBaseException(throwable)
                    when (baseException.httpCode) {
                        HttpURLConnection.HTTP_UNAUTHORIZED -> {
                            refreshToken(appPrefs.getRefreshToken().toString())
                        }
                        HttpURLConnection.HTTP_INTERNAL_ERROR -> {
                            errorMessage.value = baseException.serverErrorResponse?.message
                        }
                        else -> {
                            val invalidParam = baseException.serverErrorResponse?.validations
                            if (invalidParam != null) {
                                errorMessage.value = invalidParam.get(0).message
                            } else {
                                val errorTmpMessage = baseException.serverErrorResponse?.message
                                if (errorTmpMessage.isNullOrEmpty()) {
                                    errorMessage.value =
                                        "Chức năng này đang được bảo trì. Vui lòng liên hệ quản trị viên"
                                } else {
                                    errorMessage.value = errorTmpMessage
                                }

                            }
                        }
                    }
                }
            }
            hideLoading()
        }
    }

    fun refreshToken(refreshToken: String) {
        viewModelScope.launch {
            try {
                val res = auth.refreshToken(refreshToken)
                appPrefs.setToken("Bearer " + res.token.toString())
                appPrefs.setRefreshToken(res.refresh_token.toString())
            } catch (e: Exception) {
                tokenExpiredEvent.call()
            }
        }
    }

    open fun showError(e: Throwable) {
        errorMessage.value = e.message
    }

    fun showLoading() {
        isLoading.value = true
    }

    fun hideLoading() {
        isLoading.value = false
    }

    override fun onCleared() {
        super.onCleared()
    }
}