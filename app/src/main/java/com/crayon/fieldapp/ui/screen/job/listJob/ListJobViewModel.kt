package com.crayon.fieldapp.ui.screen.job.listJob

import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import kotlinx.coroutines.flow.Flow

class ListJobViewModel(
    private val jobRepository: JobRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    private var currentSearchResult: Flow<PagingData<JobResponse>>? = null

    fun getJobByStatus(status: String): Flow<PagingData<JobResponse>> {
        val newResult: Flow<PagingData<JobResponse>> = jobRepository.getPicJobsByStatus(status)
            .cachedIn(viewModelScope)
        currentSearchResult = newResult
        return newResult
    }
}