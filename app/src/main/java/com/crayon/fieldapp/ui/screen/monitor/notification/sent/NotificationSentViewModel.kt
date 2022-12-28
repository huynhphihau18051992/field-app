package com.crayon.fieldapp.ui.screen.monitor.notification.sent

import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.model.Store
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseLoadMoreRefreshViewModel
import kotlinx.coroutines.launch

class NotificationSentViewModel(
    private val userRepository: UserRepository
) : BaseLoadMoreRefreshViewModel<Store>() {
    override fun loadData(page: Int) {
        viewModelScope.launch {
            try {
//                onLoadSuccess(page, userRepository.getStores(id.value.toString()).data)
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }


}