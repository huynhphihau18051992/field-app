package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.GetReportOpponentListResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.BitmapUtils
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File

class ReportCompetitorViewModel(val taskRepository: TaskRepository) : BaseViewModel() {

    private val _createActivity = MediatorLiveData<Event<Resource<GetMessageResponse>>>()
    val createActivity: LiveData<Event<Resource<GetMessageResponse>>> get() = _createActivity
    fun createActivity(
        taskId: String,
        brandName: String,
        mReportType: String,
        note: String,
        listUri: ArrayList<String>
    ) = viewModelScope.launch {
        _createActivity.postValue(Event(Resource.loading(null)))
        try {
            when (listUri.size) {
                1 -> {
                    val type = getTypeMedia(listUri.get(0))
                    val requestBody1: RequestBody =
                        File(listUri.get(0)).asRequestBody(type.toMediaTypeOrNull())

                    val fileToUpload1: MultipartBody.Part =
                        MultipartBody.Part.createFormData(
                            "files",
                            File(listUri.get(0)).getName(),
                            requestBody1
                        )

                    val result = taskRepository.uploadReportOpponents(
                        taskId = taskId,
                        brandName = brandName,
                        type = mReportType,
                        note = note,
                        file1 = fileToUpload1
                    )
                    _createActivity.postValue(Event(Resource.success(result.data)))
                }
                2 -> {
                    val type1 = getTypeMedia(listUri.get(0))
                    val requestBody1: RequestBody =
                        File(listUri.get(0)).asRequestBody(type1.toMediaTypeOrNull())

                    val type2 = getTypeMedia(listUri.get(1))
                    val requestBody2: RequestBody =
                        File(listUri.get(1)).asRequestBody(type2.toMediaTypeOrNull())

                    val fileToUpload1: MultipartBody.Part =
                        MultipartBody.Part.createFormData(
                            "files",
                            File(listUri.get(0)).getName(),
                            requestBody1
                        )
                    val fileToUpload2: MultipartBody.Part =
                        MultipartBody.Part.createFormData(
                            "files",
                            File(listUri.get(1)).getName(),
                            requestBody2
                        )

                    val result = taskRepository.uploadReportOpponents(
                        taskId = taskId,
                        brandName = brandName,
                        type = mReportType,
                        note = note,
                        file1 = fileToUpload1,
                        file2 = fileToUpload2
                    )
                    _createActivity.postValue(Event(Resource.success(result.data)))
                }
                else -> {
                    val type1 = getTypeMedia(listUri.get(0))
                    val requestBody1: RequestBody =
                        File(listUri.get(0)).asRequestBody(type1.toMediaTypeOrNull())

                    val type2 = getTypeMedia(listUri.get(1))
                    val requestBody2: RequestBody =
                        File(listUri.get(1)).asRequestBody(type2.toMediaTypeOrNull())

                    val type3 = getTypeMedia(listUri.get(2))
                    val requestBody3: RequestBody =
                        File(listUri.get(2)).asRequestBody(type3.toMediaTypeOrNull())

                    val fileToUpload1: MultipartBody.Part =
                        MultipartBody.Part.createFormData(
                            "files",
                            File(listUri.get(0)).getName(),
                            requestBody1
                        )
                    val fileToUpload2: MultipartBody.Part =
                        MultipartBody.Part.createFormData(
                            "files",
                            File(listUri.get(1)).getName(),
                            requestBody2
                        )
                    val fileToUpload3: MultipartBody.Part =
                        MultipartBody.Part.createFormData(
                            "files",
                            File(listUri.get(2)).getName(),
                            requestBody3
                        )
                    val result = taskRepository.uploadReportOpponents(
                        taskId = taskId,
                        brandName = brandName,
                        type = mReportType,
                        note = note,
                        file1 = fileToUpload1,
                        file2 = fileToUpload2,
                        file3 = fileToUpload3
                    )
                    _createActivity.postValue(Event(Resource.success(result.data)))
                }
            }
        } catch (e: Exception) {
            _createActivity.postValue(Event(Resource.error(Throwable(), null)))
            onLoadFail(e)
        }
    }

    suspend fun createFile(
        context: Context,
        url: String,
        task: TaskResponse,
        quality: Int,
        isHasTage: Boolean
    ): File? {
        if (!url.contains("mp4")) {
            return BitmapUtils.createImageFileToUpload(
                context,
                url,
                task,
                quality,
                isHasTage
            )
        } else {
            return File(url)
        }
    }

    private fun getTypeMedia(url: String): String {
        if (url.contains("mp4")) {
            return "video/mp4"
        } else {
            return "image/jpeg"
        }
    }

    private val _reportOpponents =
        MediatorLiveData<Event<Resource<GetReportOpponentListResponse>>>()
    val reportOpponents: LiveData<Event<Resource<GetReportOpponentListResponse>>> get() = _reportOpponents
    fun getReportOpponents(taskId: String) {
        viewModelScope.launch {
            _reportOpponents.postValue(Event(Resource.loading(null)))
            try {
                val result = taskRepository.getPicReportOpponents(taskId)
                _reportOpponents.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                _reportOpponents.postValue(Event(Resource.error(Throwable(), null)))
                onLoadFail(e)
            }
        }
    }
}