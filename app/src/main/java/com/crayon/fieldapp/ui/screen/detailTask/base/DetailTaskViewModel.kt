package com.crayon.fieldapp.ui.screen.detailTask.base

import android.content.Context
import android.graphics.*
import android.text.TextPaint
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.model.Note
import com.crayon.fieldapp.data.remote.request.UpdateProductFeedbackRequest
import com.crayon.fieldapp.data.remote.response.AttendanceStatus
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.remote.response.TaskType
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.BitmapUtils
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import com.google.maps.android.SphericalUtil
import io.nlopez.smartlocation.SmartLocation
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import studio.phillip.yolo.utils.TaskUtils
import java.io.File


class DetailTaskViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers,
    private val context: Context,
    private val pref: PrefHelper
) : BaseViewModel() {

    private val _task = MediatorLiveData<Event<Resource<TaskResponse>>>()
    val task: LiveData<Event<Resource<TaskResponse>>> get() = _task

    fun getDetailTask(taskId: String) {
        viewModelScope.launch {
            _task.postValue(Event(Resource.loading(null)))
            try {
                fetchCurrentLocation()
                val result = taskRepository.getPicTask(taskId)
                _task.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }

    private val _updateProduct = MediatorLiveData<Resource<GetMessageResponse>>()
    val updateProduct: LiveData<Resource<GetMessageResponse>> get() = _updateProduct
    private var updateProductSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun updateProductFeedback(
        task: TaskResponse,
        products: ArrayList<TaskResponse.Product>,
        feedback: ArrayList<TaskResponse.Feedback>
    ) =
        viewModelScope.launch(dispatchers.main) {
            _updateProduct.removeSource(updateProductSource)
            withContext(dispatchers.io) {
                updateProductSource = taskRepository.updateProductFeedBack(
                    task.id.toString(),
                    UpdateProductFeedbackRequest(products = products, feedback = feedback)
                )
            }
            _updateProduct.addSource(updateProductSource) {
                _updateProduct.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }


    private val _updateTask = MediatorLiveData<Resource<GetMessageResponse>>()
    val updateTask: LiveData<Resource<GetMessageResponse>> get() = _updateTask
    private var updateTaskSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun upLoadTask(task: TaskResponse, listUri: ArrayList<String>, note: String? = null) =
        viewModelScope.launch(dispatchers.main) {
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
                    _updateTask.removeSource(updateTaskSource)
                    withContext(dispatchers.io) {
                        updateTaskSource = taskRepository.uploadImage(
                            taskId = task.id.toString(),
                            notes = note,
                            file1 = fileToUpload1
                        )
                    }
                    _updateTask.addSource(updateTaskSource) {
                        _updateTask.value = it
                        if (it.status == Status.ERROR) {
                            it.message?.let { error ->
                                viewModelScope?.launch {
                                    onLoadFail(error)
                                }
                            }
                        }
                    }
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
                    _updateTask.removeSource(updateTaskSource)
                    withContext(dispatchers.io) {
                        updateTaskSource = taskRepository.uploadImage(
                            taskId = task.id.toString(),
                            notes = note,
                            file1 = fileToUpload1,
                            file2 = fileToUpload2
                        )
                    }
                    _updateTask.addSource(updateTaskSource) {
                        _updateTask.value = it
                        if (it.status == Status.ERROR) {
                            it.message?.let { error ->
                                viewModelScope?.launch {
                                    onLoadFail(error)
                                }
                            }
                        }
                    }
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
                    _updateTask.removeSource(updateTaskSource)
                    withContext(dispatchers.io) {
                        updateTaskSource = taskRepository.uploadImage(
                            taskId = task.id.toString(),
                            notes = note,
                            file1 = fileToUpload1,
                            file2 = fileToUpload2,
                            file3 = fileToUpload3
                        )
                    }
                    _updateTask.addSource(updateTaskSource) {
                        _updateTask.value = it
                        if (it.status == Status.ERROR) {
                            it.message?.let { error ->
                                viewModelScope?.launch {
                                    onLoadFail(error)
                                }
                            }
                        }
                    }
                }
            }
        }

    private val _updateCheckInOutTask = MediatorLiveData<Resource<GetMessageResponse>>()
    val updateCheckInOutTask: LiveData<Resource<GetMessageResponse>> get() = _updateCheckInOutTask
    private var updateCheckInOutTaskSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun checkInOut(task: TaskResponse, listUri: ArrayList<String>, note: String? = null) =
        viewModelScope.launch(dispatchers.main) {
            val type = getTypeMedia(listUri.get(0))
            val requestBody1: RequestBody =
                File(listUri.get(0)).asRequestBody(type.toMediaTypeOrNull())

            val fileToUpload1: MultipartBody.Part =
                MultipartBody.Part.createFormData(
                    "files",
                    File(listUri.get(0)).getName(),
                    requestBody1
                )
            _updateCheckInOutTask.removeSource(updateCheckInOutTaskSource)
            withContext(dispatchers.io) {
                val attendanceStatus = TaskUtils.getStatusAttendances(task)
                when (attendanceStatus) {
                    AttendanceStatus.PENDING.value -> {
                        updateCheckInOutTaskSource = taskRepository.checkIn(
                            taskId = task.id.toString(),
                            file = fileToUpload1
                        )
                    }
                    AttendanceStatus.PROCESSING.value -> {
                        updateCheckInOutTaskSource = taskRepository.checkOut(
                            taskId = task.id.toString(),
                            file = fileToUpload1
                        )
                    }
                    AttendanceStatus.COMPLETED.value -> {
                        showError(Throwable("Bạn đã chấm công rồi"))
                        return@withContext
                    }
                }

            }
            _updateCheckInOutTask.addSource(updateCheckInOutTaskSource) {
                _updateCheckInOutTask.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }

    var currentLocation: LatLng = pref.getCurrentLocation()
    var storeLocation: LatLng? = null
    var strDistant = "0.0 Km"
    fun verifyLocation(task: TaskResponse): Boolean {
        storeLocation = LatLng(task.store!!.lat, task.store!!.lng)
        val distant = SphericalUtil.computeDistanceBetween(currentLocation, storeLocation)
        if (distant > MAX_VALID_DISTANT) {
            if (distant > 1000) {
                strDistant = Math.round(distant / 1000).toString() + "Km"
            } else {
                strDistant = Math.round(distant).toString() + "m"
            }
            return false
        } else {
            return true
        }
    }

    fun fetchCurrentLocation() {
        SmartLocation.with(context).location()
            .oneFix()
            .start {
                pref.setCurrentLocation(LatLng(it.latitude, it.longitude))
                currentLocation = LatLng(it.latitude, it.longitude)
            }
    }

    private fun addStampToImage(
        originalBitmap: Bitmap,
        time: String,
        address: String,
        venue: String
    ): Bitmap {
        val newBitmap = Bitmap.createBitmap(
            originalBitmap.width,
            originalBitmap.height, Bitmap.Config.ARGB_8888
        )

        val canvas = Canvas(newBitmap)
        canvas.drawColor(Color.TRANSPARENT)
        canvas.drawBitmap(originalBitmap, 0f, 0f, null)

        val pText = TextPaint(Paint.ANTI_ALIAS_FLAG)
        pText.color = Color.WHITE
        pText.textSize = 100f
        pText.setTextAlign(Paint.Align.RIGHT);

        val venueHeightWidth = Rect()
        pText.getTextBounds(venue, 0, venue.length, venueHeightWidth)
        val venueWidth = canvas.width - (venueHeightWidth.width() + 10)
        val venueHeight = canvas.height - (venueHeightWidth.height() + 10)
        canvas.drawText(
            venue, (venueWidth).toFloat(),
            (venueHeight).toFloat(),
            pText
        )

        val addressHeightWidth = Rect()
        pText.getTextBounds(venue, 0, venue.length, addressHeightWidth)
        val addressWidth = canvas.width - (addressHeightWidth.width() + 10)
        val addressHeight =
            canvas.height - (venueHeightWidth.height() + addressHeightWidth.height() + 10)
        canvas.drawText(
            address, (addressWidth).toFloat(),
            (addressHeight).toFloat(),
            pText
        )

        val timeHeightWidth = Rect()
        pText.getTextBounds(venue, 0, venue.length, timeHeightWidth)
        val timeWidth = canvas.width - timeHeightWidth.width() + 10
        val timeHeight =
            canvas.height - (addressHeightWidth.height() + venueHeightWidth.height() + timeHeightWidth.height() + 10)
        canvas.drawText(
            time, (timeWidth).toFloat(),
            (timeHeight).toFloat(),
            pText
        )

        return newBitmap
    }

    companion object {
        const val MAX_VALID_DISTANT = 300.0 // 300m
    }

    private fun getTypeMedia(url: String): String {
        if (url.contains("mp4")) {
            return "video/mp4"
        } else {
            return "image/jpeg"
        }
    }

    suspend fun createFile(
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

    private val _removeImage = MediatorLiveData<Resource<GetMessageResponse>>()
    val isRemoveTask: LiveData<Resource<GetMessageResponse>> get() = _removeImage
    private var removeImageSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun removeImage(taskId: String, ids: ArrayList<String>) =
        viewModelScope.launch(dispatchers.main) {
            _removeImage.removeSource(removeImageSource)
            withContext(dispatchers.io) {
                removeImageSource = taskRepository.deleteAttachment(taskId, ids)
            }
            _removeImage.addSource(removeImageSource) {
                _removeImage.value = it
                if (it.status == Status.ERROR) {
                    it.message?.let { error ->
                        viewModelScope?.launch {
                            onLoadFail(error)
                        }
                    }
                }
            }
        }
}