package com.crayon.fieldapp.ui.screen.detailTask.changeGift

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.remote.response.CustomerBillResponse
import com.crayon.fieldapp.data.remote.response.Store
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel
import com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel.Companion.MAX_VALID_DISTANT
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.SphericalUtil
import io.nlopez.smartlocation.SmartLocation
import kotlinx.coroutines.launch

class ChangeGiftViewModel(
    private val context: Context,
    val taskRepository: TaskRepository,
    private val pref: PrefHelper
) : BaseViewModel() {

    val name = MutableLiveData<String>()
    val phone = MutableLiveData<String>()
    val customerId = MutableLiveData<String>()
    val otp = MutableLiveData<String>()

    fun setName(text: String) {
        name.value = text
    }

    fun setOtp(text: String) {
        otp.value = text
    }

    fun setCustomerId(text: String) {
        customerId.value = text
    }

    fun setPhone(text: String) {
        phone.value = text
    }

    private val _customers = MediatorLiveData<Event<Resource<List<CustomerBillResponse>>>>()
    val customers: LiveData<Event<Resource<List<CustomerBillResponse>>>> get() = _customers
    fun getListCustomer(taskId: String) {
        viewModelScope.launch {
            fetchCurrentLocation()
            _customers.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getListCustomerBill(taskId)
                _customers.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _customers.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    private val _task = MediatorLiveData<Event<Resource<TaskResponse>>>()
    val task: LiveData<Event<Resource<TaskResponse>>> get() = _task
    fun getDetailTask(taskId: String) {
        viewModelScope.launch {
            _task.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getPicTask(taskId = taskId)
                _task.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _task.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    var currentLocation: LatLng = pref.getCurrentLocation()
    var storeLocation: LatLng? = null
    var strDistant = "0.0 Km"
    fun verifyLocation(store: Store): Boolean {
        storeLocation = LatLng(store.lat ?: 0.0, store.lng ?: 0.0)
        val distant = SphericalUtil.computeDistanceBetween(currentLocation, storeLocation)
        if (distant > MAX_VALID_DISTANT) {
            if (distant > 1000) {
                strDistant = Math.round(distant / 1000).toString() + "Km"
            } else {
                strDistant = Math.round(distant).toString() + "m"
            }
            return false
        } else {
            return true
        }
    }

    fun fetchCurrentLocation() {
        SmartLocation.with(context).location()
            .oneFix()
            .start {
                pref.setCurrentLocation(LatLng(it.latitude, it.longitude))
                currentLocation = LatLng(it.latitude, it.longitude)
            }
    }


}