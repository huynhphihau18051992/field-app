package com.crayon.fieldapp.ui.screen.detailGroupStore

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.GroupStoreResponse
import com.crayon.fieldapp.data.repository.GroupStoreRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import kotlinx.coroutines.launch

class DetailGroupStoreViewModel(
    private val groupRepository: GroupStoreRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    // FOR DATA
    var groups = MutableLiveData<GroupStoreResponse>()

    fun getDetailGroup(agencyId: String, groupId: String) =
        viewModelScope.launch {
            try {
                groups.value = groupRepository.getGroup(agencyId, groupId)
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }

}