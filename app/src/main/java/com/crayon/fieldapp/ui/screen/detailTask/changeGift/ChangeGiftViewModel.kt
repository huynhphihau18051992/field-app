package com.crayon.fieldapp.ui.screen.detailTask.changeGift

import androidx.lifecycle.MutableLiveData
import com.crayon.fieldapp.ui.base.BaseViewModel

class ChangeGiftViewModel() : BaseViewModel() {

    val name = MutableLiveData<String>()
    val phone = MutableLiveData<String>()

    fun setName(text: String) {
        name.value = text
    }

    fun setPhone(text: String) {
        phone.value = text
    }

}