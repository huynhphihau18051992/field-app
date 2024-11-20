package com.crayon.fieldapp.ui.screen.calendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.data.repository.JobRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CalendarViewModel(
    private val jobRepository: JobRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {
    // FOR DATA

    private val _jobs = MediatorLiveData<Event<Resource<List<JobResponse>>>>()
    val jobs: LiveData<Event<Resource<List<JobResponse>>>> get() = _jobs
    fun getTodayJob(statusTime: String, endTime: String, skip: Int) = viewModelScope.launch(dispatchers.main) {
        viewModelScope.launch {
            _jobs.postValue(Event(Resource.loading(null)))
            try {
                val result = jobRepository.getTodayPicJob(statusTime, endTime, skip = skip)
                _jobs.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }
}