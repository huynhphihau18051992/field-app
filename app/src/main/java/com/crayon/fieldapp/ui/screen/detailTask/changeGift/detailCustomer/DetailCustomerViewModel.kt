package com.crayon.fieldapp.ui.screen.detailTask.changeGift.detailCustomer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.CustomerResponse
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class DetailCustomerViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    private val _createCustomer = MediatorLiveData<Event<Resource<CustomerResponse>>>()
    val createCustomer: LiveData<Event<Resource<CustomerResponse>>> get() = _createCustomer
    fun registerCustomer(
        taskId: String,
        name: String,
        phone: String
    ) =
        viewModelScope.launch {
            _createCustomer.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.registerCustomer(
                    taskId = taskId,
                    name = name,
                    mobile_number = phone
                )
                _createCustomer.postValue(Event(Resource.success(result.data!!)))
            } catch (e: Exception) {
                _createCustomer.postValue(Event(Resource.error(Throwable(), null)))
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
                _resendOtpCustomer.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
}