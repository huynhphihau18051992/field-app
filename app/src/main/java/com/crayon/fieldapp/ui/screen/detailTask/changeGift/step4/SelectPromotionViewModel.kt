package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.local.dao.ProductDao
import com.crayon.fieldapp.data.model.ProductEntity
import com.crayon.fieldapp.data.remote.request.AddPromotionGiftRequest
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.data.remote.response.PromotionResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.ArrayList

class SelectPromotionViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers,
    private val productDao: ProductDao
) : BaseViewModel() {

    private val _addProductToBill = MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val addProductToBill: LiveData<Event<Resource<GetMessageResponse>>> get() = _addProductToBill
    fun addProductToBill(
        taskId: String,
        billId: String,
        request: AddPromotionGiftRequest
    ) =
        viewModelScope.launch {
            _addProductToBill.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.addProductToBill(
                    taskId = taskId,
                    billId = billId,
                    request = request
                )
                _addProductToBill.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _addProductToBill.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }

    private val _productAndPromotion =
        MediatorLiveData<Event<Resource<Triple<List<PromotionResponse>, List<ProductResponse>, List<GiftResponse>>>>>()
    val productAndPromotion: LiveData<Event<Resource<Triple<List<PromotionResponse>, List<ProductResponse>, List<GiftResponse>>>>> get() = _productAndPromotion
    fun getListProductAndPromotions(
        projectId: String
    ) =
        viewModelScope.launch {
            _productAndPromotion.postValue(Event(Resource.loading(null)))
            try {
                val products = productDao.getProducts(projectId = projectId)
                val listProduct = ArrayList<ProductResponse>()
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
                    listProduct.addAll(result.data.data!!)
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
                    listProduct.addAll(localProducts)
                }
                val promotion = taskRepository.getPromotionsList(projectId)
                val gift = taskRepository.getGiftList(projectId)
                _productAndPromotion.postValue(
                    Event(
                        Resource.success(
                            Triple(
                                promotion.data!!.data as ArrayList,
                                listProduct as ArrayList,
                                gift.data!!.data as ArrayList
                            )
                        )
                    )
                )
            } catch (e: Exception) {
                _productAndPromotion.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
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

}