package com.crayon.fieldapp.ui.screen.detailTask.reportSales

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class ReportSalesViewModel(val taskRepository: TaskRepository) : BaseViewModel() {

    private val _orders =
        MediatorLiveData<Event<Resource<List<OrderResponse>>>>()
    val orders: LiveData<Event<Resource<List<OrderResponse>>>> get() = _orders
    fun fetchOrders(taskId: String) {
        viewModelScope.launch {
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

}