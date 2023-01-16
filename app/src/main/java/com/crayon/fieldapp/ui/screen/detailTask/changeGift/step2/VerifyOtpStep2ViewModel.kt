package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class VerifyOtpStep2ViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    val name = MutableLiveData<String>()
    val phone = MutableLiveData<String>()
    val otp = MutableLiveData<String>()


    private val _verifyCustomerOtp = MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val verifyCustomerOtp: LiveData<Event<Resource<GetMessageResponse>>> get() = _verifyCustomerOtp
    fun verifyCustomerOtp(
        taskId: String,
        mobile_number: String,
        otp_number: String
    ) =
        viewModelScope.launch {
            _verifyCustomerOtp.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.verifyCustomerOtp(
                    taskId = taskId,
                    mobile_number = mobile_number,
                    otp_number = otp_number
                )
                _verifyCustomerOtp.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }

    private val _resendOtpCustomer = MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val resendOtpCustomer: LiveData<Event<Resource<GetMessageResponse>>> get() = _resendOtpCustomer
    fun resendOtpCustomer(
        taskId: String,
        phone: String
    ) =
        viewModelScope.launch {
            _resendOtpCustomer.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.resendCustomerOtp(
                    taskId = taskId,
                    mobile_number = phone
                )
                _resendOtpCustomer.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
}