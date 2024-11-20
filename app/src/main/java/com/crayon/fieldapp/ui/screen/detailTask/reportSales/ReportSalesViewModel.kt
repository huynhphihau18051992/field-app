package com.crayon.fieldapp.ui.screen.detailTask.reportSales

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.data.remote.response.Store
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.SphericalUtil
import io.nlopez.smartlocation.SmartLocation
import kotlinx.coroutines.launch

class ReportSalesViewModel(
    private val context: Context,
    val taskRepository: TaskRepository,
    private val pref: PrefHelper
) : BaseViewModel() {

    private val _orders =
        MediatorLiveData<Event<Resource<List<OrderResponse>>>>()
    val orders: LiveData<Event<Resource<List<OrderResponse>>>> get() = _orders
    fun fetchOrders(taskId: String) {
        viewModelScope.launch {
            fetchCurrentLocation()
            _orders.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getListOrder(taskId)
                _orders.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _orders.postValue(Event(Resource.error(Throwable(), null)))
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
        if (distant > DetailTaskViewModel.MAX_VALID_DISTANT) {
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