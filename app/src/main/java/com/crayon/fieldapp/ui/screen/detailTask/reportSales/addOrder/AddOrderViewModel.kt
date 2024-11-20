package com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.local.dao.ProductDao
import com.crayon.fieldapp.data.model.ProductEntity
import com.crayon.fieldapp.data.remote.request.AddProductToOrderRequest
import com.crayon.fieldapp.data.remote.request.ProjectProductRequest
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.ArrayList

class AddOrderViewModel(val taskRepository: TaskRepository, val productDao: ProductDao) :
    BaseViewModel() {

    private val _addOrder =
        MediatorLiveData<Event<Resource<OrderResponse>>>()
    val addOrder: LiveData<Event<Resource<OrderResponse>>> get() = _addOrder
    fun addOrder(taskId: String, listProducts: ArrayList<ProductResponse>) {
        viewModelScope.launch {
            _addOrder.postValue(Event(Resource.loading(null)))
            try {
                val request = AddProductToOrderRequest(products = listProducts.map { mProduct ->
                    ProjectProductRequest(
                        productId = mProduct.id.toString(),
                        price = mProduct.price,
                        quantity = mProduct.quantity
                    )
                } as ArrayList)
                val result = taskRepository.createOrder(taskId, request = request)
                val order = OrderResponse(
                    id = result.data!!.id.toString(),
                    products = listProducts
                )
                _addOrder.postValue(Event(Resource.success(order)))
            } catch (e: Exception) {
                _addOrder.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    private val _updateOrder =
        MediatorLiveData<Event<Resource<OrderResponse>>>()
    val updateOrder: LiveData<Event<Resource<OrderResponse>>> get() = _updateOrder
    fun updateOrder(taskId: String, orderId: String, listProducts: ArrayList<ProductResponse>) {
        viewModelScope.launch {
            _updateOrder.postValue(Event(Resource.loading(null)))
            try {
                val request = AddProductToOrderRequest(products = listProducts.map { mProduct ->
                    ProjectProductRequest(
                        productId = mProduct.id.toString(),
                        price = mProduct.price,
                        quantity = mProduct.quantity
                    )
                } as ArrayList)
                taskRepository.updateOrder(
                    taskId,
                    orderId = orderId,
                    request = request
                )
                val products = ArrayList<ProductResponse>()
                listProducts.forEach { mProduct ->
                    products.add(
                        ProductResponse(
                            id = mProduct.id,
                            price = mProduct.price,
                            quantity = mProduct.quantity,
                            name = mProduct.name
                        )
                    )
                }
                val order = OrderResponse(
                    id = orderId,
                    products = products
                )
                _updateOrder.postValue(Event(Resource.success(order)))
            } catch (e: Exception) {
                _updateOrder.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    private val _updatePrice =
        MediatorLiveData<Event<Resource<String>>>()
    val updatePrice: LiveData<Event<Resource<String>>> get() = _updatePrice
    fun updatePrice(product: ProductResponse, price: Long) {
        viewModelScope.launch {
            _updatePrice.postValue(Event(Resource.loading(null)))
            try {
                val result = productDao.updatePrice(id = product.id.toString(), price = price)
                _updatePrice.postValue(Event(Resource.success("Cập nhật giá của sản phẩm thành công")))
            } catch (e: Exception) {
                _updatePrice.postValue(Event(Resource.error(Throwable(), null)))
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
                val products = productDao.getProducts(projectId = projectId)
                if (products.size == 0) {
                    val result = taskRepository.getProductList(projectId = projectId)
                    val newProducts = result.data!!.data?.map {
                        ProductEntity(
                            id = it.id.toString(),
                            projectId = projectId,
                            name = it.name,
                            price = it.price.toLong(),
                            isEdit = false,
                            endDate = Date().time + 2592000000 // remove after 30 days
                        )

                    } as ArrayList
                    if (newProducts.size > 0) {
                        productDao.insert(newProducts)
                    }
                    _products.postValue(Event(Resource.success(result.data!!.data)))
                } else {
                    val localProducts = products.map { local ->
                        ProductResponse(
                            id = local.id,
                            name = local.name,
                            quantity = 0,
                            price = local.price.toInt(),
                            isEdit = local.isEdit
                        )
                    }
                    _products.postValue(Event(Resource.success(localProducts)))
                }

            } catch (e: Exception) {
                _products.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

}