package com.crayon.fieldapp.ui.screen.detailTask.changeGift.receiveGift

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

class ReceiveGiftViewModel(
    val taskRepository: TaskRepository
) : BaseViewModel() {

    private val _gifts = MediatorLiveData<Event<Resource<List<GiftResponse>>>>()
    val gifts: LiveData<Event<Resource<List<GiftResponse>>>> get() = _gifts
    fun fetchGifts(taskId: String) {
        viewModelScope.launch {
            _gifts.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getStoreGifts(taskId).data
                _gifts.postValue(Event(Resource.success(result)))
            } catch (e: Exception) {
                _gifts.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }


    private val _updateGift = MediatorLiveData<Event<Resource<String>>>()
    val updateGift: LiveData<Event<Resource<String>>> get() = _updateGift
    fun receiveGift(taskId: String, gift: ArrayList<GiftResponse>) {
        viewModelScope.launch {
            _updateGift.postValue(Event(Resource.loading(null)))
            try {
                val request = ReceiveGiftRequest(gifts = gift.map { mItem ->
                    ImportStoreGiftsRequest(
                        quantityIn = mItem.quantityIn,
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