package com.crayon.fieldapp.ui.screen.detailTask.changeGift.detailCustomer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.AddPromotionGiftRequest
import com.crayon.fieldapp.data.remote.response.*
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class DetailCustomerViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
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
                            bill.data?.promotions?.map { it.project_promotion_package.toString() }
                        selectPromotionsId?.let { mId ->
                            if (mId.contains(mProjectPromotion.id)) {
                                val selectPromotion =
                                    bill.data.promotions.firstOrNull { mSelectPromotion ->
                                        mSelectPromotion.project_promotion_package.equals(
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
                        val selectGiftIds = bill.data?.gifts?.map { it.id.toString() }
                        selectGiftIds?.let { mIds ->
                            val selectGifts = bill.data.gifts.firstOrNull { mSelectGift ->
                                mSelectGift.id.equals(mProjectGift.id)
                            }
                            mProjectGift.isSelect = true
                            selectGifts?.let { mGiftReponse ->
                                mProjectGift.selectQuantity = mGiftReponse.quantity
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

    private val _products = MediatorLiveData<Event<Resource<List<ProductResponse>>>>()
    val products: LiveData<Event<Resource<List<ProductResponse>>>> get() = _products
    fun getProducts(projectId: String) {
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