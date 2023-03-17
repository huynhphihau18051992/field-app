package com.crayon.fieldapp.ui.screen.monitor.changeGift.listPromotion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.PromotionResponse
import com.crayon.fieldapp.data.repository.ProjectRepository
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*

class ListPromotionViewModel(
    private val projectRepository: ProjectRepository,
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

    private val _summary = MediatorLiveData<Event<Resource<List<PromotionResponse>>>>()
    val summary: LiveData<Event<Resource<List<PromotionResponse>>>> get() = _summary
    fun getProjectSummary(agencyId: String, projectId: String) =
        viewModelScope.launch(dispatchers.main) {
            _summary.postValue(Event(Resource.loading(null)))
            withContext(dispatchers.io) {
                try {
                    val promotionResult = taskRepository.getPromotionsList(projectId = projectId).data?.data
                    val result = projectRepository.getProjectSummaryPromotion(
                        agencyId = agencyId,
                        projectId = projectId
                    ).data
                    val promotions = ArrayList<PromotionResponse>()
                    promotionResult?.let {
                        promotions.addAll(it)
                    }
                    promotions.forEach { mGift ->
                        var total = 0
                        result?.let { mSummaryList ->
                            total = mSummaryList.filter { it.promotion?.id.equals(mGift.id) }
                                .sumBy { it.quantity }
                        }
                        mGift.quantity = total
                    }

                    _summary.postValue(Event(Resource.success(promotions)))
                } catch (e: Exception) {
                    _summary.postValue(Event(Resource.error(Throwable(), null)))
                    onLoadFail(e)
                }
            }
        }
}