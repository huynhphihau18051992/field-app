package com.crayon.fieldapp.ui.screen.detailNotification

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.model.Job
import com.crayon.fieldapp.data.model.Task
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import kotlinx.coroutines.launch

class DetailNotificationViewModel(private val userRepository: UserRepository) :
    BaseViewModel() {
    var job = MutableLiveData<Job>()
    var listItem = MutableLiveData<List<Task>>()
    fun fetchDetailUser(userId: String) {
        viewModelScope.launch {
            try {
//                job.value = Job(
//                    id = "1",
//                    project = "Bánh trung thu Kinh Do",
//                    agency = "PrimeLabo",
//                    store = "Big C Quận 7",
//                    startShift = "2020-08-19T08:59:50.408Z",
//                    endShift = "2020-08-19T08:59:50.408Z",
//                    tasks = arrayListOf(Task(id = "1", name = "Chấm công"))
//                )
//                listItem.value = job.value!!.tasks
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }
}