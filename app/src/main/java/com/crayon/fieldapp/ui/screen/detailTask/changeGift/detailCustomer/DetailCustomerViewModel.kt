package com.crayon.fieldapp.ui.screen.detailTask.changeGift.detailCustomer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.local.dao.ProductDao
import com.crayon.fieldapp.data.model.ProductEntity
import com.crayon.fieldapp.data.remote.request.AddPromotionGiftRequest
import com.crayon.fieldapp.data.remote.response.*
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch
import java.util.*

class DetailCustomerViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers,
    private val productDao: ProductDao
) : BaseViewModel() {

    private val _customerBill =
        MediatorLiveData<Event<Resource<Triple<DetailCustomerBillResponse, GetPromotionListResponse, GetGiftListResponse>>>>()
    val customerBill: LiveData<Event<Resource<Triple<DetailCustomerBillResponse, GetPromotionListResponse, GetGiftListResponse>>>> get() = _customerBill
    fun getCustomerBill(taskId: String, billId: String, projectId: String) {
        viewModelScope.launch {
            _customerBill.postValue(Event(Resource.loading(null)))
            try {
                val bill = taskRepository.getCustomerBill(taskId = taskId, billId = billId)
                val promotion = taskRepository.getPromotionsList(projectId = projectId)
                val gifts = taskRepository.getGiftList(projectId = projectId)
                promotion.data?.data?.let { mPromotions ->
                    mPromotions.forEach { mProjectPromotion ->
                        val selectPromotionsId =
                            bill.data?.promotions?.map { it.id.toString() }
                        selectPromotionsId?.let { mId ->
                            if (mId.contains(mProjectPromotion.id)) {
                                val selectPromotion =
                                    bill.data.promotions.firstOrNull { mSelectPromotion ->
                                        mSelectPromotion.id.equals(
                                            mProjectPromotion.id
                                        )
                                    }
                                mProjectPromotion.isSelect = true
                                mProjectPromotion.products.clear()
                                selectPromotion?.let { mSelectItem ->
                                    mSelectItem.products?.let { mListProduct ->
                                        mProjectPromotion.products.addAll(mListProduct)
                                    }
                                    mProjectPromotion.quantity = mSelectItem.quantity
                                }
                            }
                        }
                    }
                }
                gifts.data?.data?.let { mGift ->
                    mGift.forEach { mProjectGift ->
                        val selectGiftIds = bill.data?.gifts?.map { mGift ->
                            mGift.id.toString()
                        }
                        selectGiftIds?.let { mIds ->
                            if (mIds.contains(mProjectGift.id.toString())) {
                                val selectGifts = bill.data.gifts.firstOrNull { mSelectGift ->
                                    mSelectGift.id.toString().equals(mProjectGift.id.toString())
                                }
                                mProjectGift.isSelect = true
                                selectGifts?.let { mSelectItem ->
                                    mProjectGift.selectQuantity = mSelectItem.quantity
                                }
                            }
                        }
                    }
                }
                _customerBill.postValue(
                    Event(
                        Resource.success(
                            Triple(
                                bill.data!!,
                                promotion.data!!,
                                gifts.data!!
                            )
                        )
                    )
                )
            } catch (e: Exception) {
                _customerBill.postValue(Event(Resource.error(Throwable(), null)))
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

}