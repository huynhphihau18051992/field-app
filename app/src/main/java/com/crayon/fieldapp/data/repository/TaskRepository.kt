package com.crayon.fieldapp.data.repository

import androidx.lifecycle.LiveData
import com.crayon.fieldapp.data.remote.request.*
import com.crayon.fieldapp.data.remote.response.*
import com.crayon.fieldapp.utils.Resource
import okhttp3.MultipartBody


interface TaskRepository {

    suspend fun getPicTasks(
        jobId: String
    ): LiveData<Resource<List<TaskResponse>>>

    suspend fun getTodayPicAttendances(
    ): LiveData<Resource<List<TaskResponse>>>


    suspend fun getPicReportByProject(
        projectId: List<String>,
        startTime: String,
        endTime: String
    ): LiveData<Resource<List<TaskResponse>>>

    suspend fun getPicReportByTime(
        startTime: String,
        endTime: String
    ): LiveData<Resource<List<TaskResponse>>>


    suspend fun uploadImage(
        taskId: String,
        notes: String? = null,
        file1: MultipartBody.Part,
        file2: MultipartBody.Part,
        file3: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun uploadImage(
        taskId: String,
        notes: String? = null,
        file1: MultipartBody.Part,
        file2: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun uploadImage(
        taskId: String,
        notes: String? = null,
        file1: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun getManagementTasks(
        agencyId: String,
        jobId: String
    ): LiveData<Resource<List<TaskResponse>>>

    suspend fun getManagementTasksByFilter(
        agencyId: String,
        projectId: String? = null,
        storeId: String? = null,
        type: Int? = 0,
        startTime: String? = null,
        endTime: String? = null,
        skip: Int,
        take: Int
    ): Resource<List<TaskResponse>>

    suspend fun getPicTask(
        taskId: String
    ): Resource<TaskResponse>

    suspend fun removeTask(
        agencyId: String,
        taskId: String
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun getManagementTask(
        taskId: String
    ): LiveData<Resource<TaskResponse>>


    suspend fun checkIn(
        taskId: String,
        file: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun checkOut(
        taskId: String,
        file: MultipartBody.Part
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun deleteAttachment(
        taskId: String,
        ids: ArrayList<String>
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun createManagementTask(form: CreateTaskForm): LiveData<Resource<GetMessageResponse>>

    suspend fun updateProduct(
        taskId: String,
        productId: String,
        updateProduct: UpdateProductRequest
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun updateCustomerFeedBack(
        taskId: String,
        customerFeedId: String,
        updateCustomerFeedbackRequest: UpdateCustomerFeedbackRequest
    ): LiveData<Resource<GetMessageResponse>>


    suspend fun updateProductFeedBack(
        taskId: String,
        updateProductFeedbackRequest: UpdateProductFeedbackRequest
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun getProductList(
        projectId: String
    ): Resource<GetProductListResponse>

    suspend fun getPromotionsList(
        projectId: String
    ): Resource<GetPromotionListResponse>

    suspend fun updatePriceOfProduct(
        projectId: String,
        productId: String,
        price: Long
    ): LiveData<Resource<GetMessageResponse>>

    suspend fun getCustomerBillById(
        taskId: String
    ): LiveData<Resource<GetCustomerBillListResponse>>

    suspend fun createCustomerBill(
        taskId: String,
        customerId: String,
        code_bill: String,
        file1: MultipartBody.Part
    ): Resource<GetMessageResponse>

    suspend fun createCustomerBill(
        taskId: String,
        customerId: String,
        code_bill: String,
        file1: MultipartBody.Part,
        file2: MultipartBody.Part
    ): Resource<GetMessageResponse>

    suspend fun createCustomerBill(
        taskId: String,
        customerId: String,
        code_bill: String,
        file1: MultipartBody.Part,
        file2: MultipartBody.Part,
        file3: MultipartBody.Part
    ): Resource<GetMessageResponse>

    suspend fun addProductToBill(
        taskId: String,
        billId: String,
        promotionId: String,
        customerBillId: String,
        products: ArrayList<ProjectProductRequest>
    ): Resource<GetMessageResponse>

    suspend fun registerCustomer(
        taskId: String,
        name: String,
        mobile_number: String
    ): Resource<GetMessageResponse>

    suspend fun verifyCustomerOtp(
        taskId: String,
        mobile_number: String,
        otp_number: String
    ): Resource<GetMessageResponse>


    suspend fun resendCustomerOtp(
        taskId: String,
        mobile_number: String
    ): Resource<GetMessageResponse>
}