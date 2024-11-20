package com.crayon.fieldapp.ui.screen.register

import android.content.Context
import android.text.TextUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.remote.request.CreateUserRequest
import com.crayon.fieldapp.data.remote.request.UpdateProfileForm
import com.crayon.fieldapp.data.remote.response.GetMessageResponse
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.BitmapUtils
import com.crayon.fieldapp.utils.Resource
import com.crayon.fieldapp.utils.Status
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class RegisterViewModel(
    private val userRepository: UserRepository,
    private val dispatchers: AppDispatchers,
    private val context: Context
) : BaseViewModel() {

    private val _register = MediatorLiveData<Resource<GetMessageResponse>>()
    val result: LiveData<Resource<GetMessageResponse>> get() = _register
    private var userSource: LiveData<Resource<GetMessageResponse>> = MutableLiveData()
    fun register(form: UpdateProfileForm) = viewModelScope.launch(dispatchers.main) {
        val avatarFile = File(form.avatar!!.path)
        val bodyFile = File(form.full_body!!.path)
        val idBack = File(form.id_back!!.path)
        val idFront = File(form.id_front!!.path)

        val requestBodyAvatar: RequestBody =
            avatarFile!!.asRequestBody("multipart/form-data".toMediaTypeOrNull())
        val avatarFileUpload: MultipartBody.Part =
            MultipartBody.Part.createFormData("avatar", avatarFile.getName(), requestBodyAvatar)

        val requestBodyFullBody: RequestBody =
            bodyFile!!.asRequestBody("multipart/form-data".toMediaTypeOrNull())
        val bodyFileUpload: MultipartBody.Part =
            MultipartBody.Part.createFormData("full_body_image", bodyFile!!.getName(), requestBodyFullBody)

        val requestBodyFront: RequestBody =
            idFront!!.asRequestBody("multipart/form-data".toMediaTypeOrNull())
        val idFrontFileUpload: MultipartBody.Part =
            MultipartBody.Part.createFormData(
                "identification_image_front",
                idFront!!.getName(),
                requestBodyFront
            )

        val requestBodyBack: RequestBody =
            idBack!!.asRequestBody("multipart/form-data".toMediaTypeOrNull())
        val idBackFileUpload: MultipartBody.Part =
            MultipartBody.Part.createFormData(
                "identification_image_back",
                idBack!!.getName(),
                requestBodyBack
            )


        val request = CreateUserRequest(
            firstName = form.firstName!!.toRequestBody(),
            lastName = form.lastName!!.toRequestBody(),
            birthDay = form.birthDay!!.toRequestBody(),
            email = form.email!!.toRequestBody(),
            phone = form.phone!!.toRequestBody(),
            gender = form.gender!!.toRequestBody(),
            tax = form.tax!!.toRequestBody(),
            bank_number = form.bank_number!!.toRequestBody(),
            bank_name = form.bank_name!!.toRequestBody(),
            bank_brand = form.bank_brand!!.toRequestBody(),
            heigth = form.heigth!!.toRequestBody(),
            weigth = form.weigth!!.toRequestBody(),
            id = form.id!!.toRequestBody(),
            city = form.city!!.toRequestBody(),
            district = form.district!!.toRequestBody(),
            address = form.address!!.toRequestBody(),
            temporary_address = form.temporary_address!!.toRequestBody(),
            temporary_district = form.temporary_district!!.toRequestBody(),
            temporary_city = form.temporary_city!!.toRequestBody(),
            password = form.password!!.toRequestBody(),
            confirmPassword = form.confirmPassword!!.toRequestBody(),
            avatar = avatarFileUpload,
            full_body = bodyFileUpload,
            id_back = idBackFileUpload,
            id_front = idFrontFileUpload
        )
        _register.removeSource(userSource)
        withContext(dispatchers.io) {
            userSource = userRepository.register(request)
        }
        _register.addSource(userSource) {
            _register.value = it
            if (it.status == Status.ERROR) {
                it.message?.let { error ->
                    viewModelScope?.launch {
                        onLoadFail(error)
                    }
                }
            }
        }
    }

    fun createImageFileToUpload(
        context: Context,
        originPath: String,
        type: String
    ): File? {
        if (TextUtils.isEmpty(originPath)) {
//            mView.showDialogMessage("Can not found Image")
            return null
        }
        // reduce image size
        var bitmap = BitmapUtils.decodeFile(originPath, 0)

        if (bitmap == null) {
//            mView.showDialogMessage("Can not found Image")
            return null
        }

        // get time
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val imageFileName = type + "_" + timeStamp

        // create the temp file to upload
        val childFile: File?
        childFile = BitmapUtils.createImageFromBitmap(context, bitmap, 50, imageFileName)
        if (childFile == null) {
//            mView.showDialogMessage("Can not found Image")
//            mView.hideProgressDialog()
            return null
        }
        // release bitmap
        bitmap = null
        return childFile
    }
}