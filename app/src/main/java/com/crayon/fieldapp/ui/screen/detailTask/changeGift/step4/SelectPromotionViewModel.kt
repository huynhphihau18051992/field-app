package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.ProjectProductRequest
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.GetProductListResponse
import com.crayon.fieldapp.data.remote.response.GetPromotionListResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.BitmapUtils
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File

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
        customerBillId: String,
        products: ArrayList<ProjectProductRequest>
    ) =
        viewModelScope.launch {
            _addProductToBill.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.addProductToBill(
                    taskId = taskId,
                    billId = billId,
                    promotionId = promotionId,
                    customerBillId = customerBillId,
                    products = products
                )
                _addProductToBill.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }

    private val _productAndPromotion =
        MediatorLiveData<Event<Resource<Pair<GetPromotionListResponse, GetProductListResponse>>>>()
    val productAndPromotion: LiveData<Event<Resource<Pair<GetPromotionListResponse, GetProductListResponse>>>> get() = _productAndPromotion
    fun getListProductAndPromotions(
        projectId: String
    ) =
        viewModelScope.launch {
            _productAndPromotion.postValue(Event(Resource.loading(null)))
            try {
                val product = async { taskRepository.getProductList(projectId) }.await()
                val promotion = async { taskRepository.getPromotionsList(projectId) }.await()
                _productAndPromotion.postValue(
                    Event(
                        Resource.success(
                            Pair(
                                promotion.data!!,
                                product.data!!
                            )
                        )
                    )
                )
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }

}