package com.crayon.fieldapp.ui.screen.detailTask.changeGift.export

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.remote.request.ImportStoreGiftsRequest
import com.crayon.fieldapp.data.remote.request.ReceiveGiftRequest
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch

class ExportGiftViewModel(
    val taskRepository: TaskRepository
) : BaseViewModel() {

    private val _gifts = MediatorLiveData<Event<Resource<List<GiftResponse>>>>()
    val gifts: LiveData<Event<Resource<List<GiftResponse>>>> get() = _gifts
    fun fetchGifts(taskId: String) {
        viewModelScope.launch {
            _gifts.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getStoreGifts(taskId).data
                val giftsConsume =
                    taskRepository.getConsumeGift(taskId = taskId).data ?: arrayListOf()
                val gifts = ArrayList<GiftResponse>()
                result?.let { mList ->
                    gifts.addAll(mList.map {
                        GiftResponse(
                            createdAt = it.gifts?.createdAt,
                            updatedAt = it.gifts?.updatedAt,
                            id = it.gifts?.id,
                            name = it.gifts?.name,
                            quantityIn = it.quantityIn,
                            quantityConsume = getQuantityOut(it.gifts?.id.toString(), giftsConsume),
                            quantityRemainPlan = it.quantityIn - getQuantityOut(
                                it.gifts?.id.toString(),
                                giftsConsume
                            ),
                            quantityRemainActual = it.quantityOut
                        )
                    })
                }
                _gifts.postValue(Event(Resource.success(gifts)))
            } catch (e: Exception) {
                _gifts.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

    private fun getQuantityOut(giftId: String, items: ArrayList<GiftResponse>): Int {
        var quantity = 0
        items.indexOfFirst { it.id.toString().equals(giftId) }?.let { index ->
            if (index != -1) {
                return items.get(index).quantityOut
            }
        }
        return quantity
    }

    private val _updateGift = MediatorLiveData<Event<Resource<String>>>()
    val updateGift: LiveData<Event<Resource<String>>> get() = _updateGift
    fun updateGiftOut(taskId: String, gift: ArrayList<GiftResponse>) {
        viewModelScope.launch {
            _updateGift.postValue(Event(Resource.loading(null)))
            try {
                val request = ReceiveGiftRequest(gifts = gift.map { mItem ->
                    ImportStoreGiftsRequest(
                        quantityOut = mItem.quantityRemainActual,
                        giftId = mItem.id.toString()
                    )
                } as ArrayList)
                val result = taskRepository.importGifts(taskId = taskId, request = request)
                _updateGift.postValue(Event(Resource.success("Nhập số lượng quà tặng thành công")))
            } catch (e: Exception) {
                _updateGift.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }

}