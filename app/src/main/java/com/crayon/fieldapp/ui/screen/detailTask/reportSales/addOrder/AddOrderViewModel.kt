package com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.remote.request.AddProductToOrderRequest
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class AddOrderViewModel(val taskRepository: TaskRepository) : BaseViewModel() {

    private val _addOrder =
        MediatorLiveData<Event<Resource<OrderResponse>>>()
    val addOrder: LiveData<Event<Resource<OrderResponse>>> get() = _addOrder
    fun addOrder(taskId: String, request: AddProductToOrderRequest) {
        viewModelScope.launch {
            _addOrder.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.createOrder(taskId, request = request)
                _addOrder.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _addOrder.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    private val _updateOrder =
        MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val updateOrder: LiveData<Event<Resource<GetMessageResponse>>> get() = _updateOrder
    fun updateOrder(taskId: String, orderId: String, request: AddProductToOrderRequest) {
        viewModelScope.launch {
            _updateOrder.postValue(Event(Resource.loading(null)))
            try {
                val result =
                    taskRepository.updateOrder(taskId, orderId = orderId, request = request)
                _updateOrder.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _updateOrder.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    private val _products =
        MediatorLiveData<Event<Resource<List<ProductResponse>>>>()
    val products: LiveData<Event<Resource<List<ProductResponse>>>> get() = _products
    fun fetchProducts(projectId: String) {
        viewModelScope.launch {
            _products.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getProductList(projectId = projectId)
                _products.postValue(Event(Resource.success(result.data!!.data)))
            } catch (e: Exception) {
                _products.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

}