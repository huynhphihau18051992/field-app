package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.ProjectProductRequest
import com.crayon.fieldapp.data.remote.response.GetGiftListResponse
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.GetProductListResponse
import com.crayon.fieldapp.data.remote.response.GetPromotionListResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class SelectPromotionViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _addProductToBill = MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val addProductToBill: LiveData<Event<Resource<GetMessageResponse>>> get() = _addProductToBill
    fun addProductToBill(
        taskId: String,
        billId: String,
        promotionId: String,
        products: ArrayList<ProjectProductRequest>
    ) =
        viewModelScope.launch {
            _addProductToBill.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.addProductToBill(
                    taskId = taskId,
                    billId = billId,
                    promotionId = promotionId,
                    products = products
                )
                _addProductToBill.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }

    private val _productAndPromotion =
        MediatorLiveData<Event<Resource<Triple<GetPromotionListResponse, GetProductListResponse, GetGiftListResponse>>>>()
    val productAndPromotion: LiveData<Event<Resource<Triple<GetPromotionListResponse, GetProductListResponse, GetGiftListResponse>>>> get() = _productAndPromotion
    fun getListProductAndPromotions(
        projectId: String
    ) =
        viewModelScope.launch {
            _productAndPromotion.postValue(Event(Resource.loading(null)))
            try {
                val product = taskRepository.getProductList(projectId)
                val promotion = taskRepository.getPromotionsList(projectId)
                val gift = taskRepository.getGiftList(projectId)
                _productAndPromotion.postValue(
                    Event(
                        Resource.success(
                            Triple(
                                promotion.data!!,
                                product.data!!,
                                gift.data!!
                            )
                        )
                    )
                )
            } catch (e: Exception) {
                _productAndPromotion.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }

}