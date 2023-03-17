package com.crayon.fieldapp.data.remote

import com.crayon.fieldapp.data.remote.request.*
import com.crayon.fieldapp.data.remote.response.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*


interface ApiService {

    @POST("/v1/auth/login")
    suspend fun login(@Body loginRequest: LoginRequest): GetMessageResponse

    @POST("/v1/auth/login-qrcode")
    suspend fun loginByQrCode(@Body loginRequest: LoginQrCodeRequest): GetMessageResponse

    @POST("/v1/auth/forget-password")
    suspend fun forgotPassword(@Body loginRequest: ForgotPasswordRequest): GetMessageResponse

    @POST("/v1/auth/reset-password")
    suspend fun resetPassword(@Body loginRequest: ResetPasswordRequest): GetVerifyOtpResponse

    @POST("/v1/auth/verify-reset-pass-otp")
    suspend fun verifyOtpResetPassword(@Body loginRequest: VerifyOtpResetPasswordRequest)

    @Multipart
    @POST("/v1/auth/register")
    suspend fun register(
        @Part("first_name") firstName: RequestBody,
        @Part("last_name") lastName: RequestBody,
        @Part("mobile_number") mobileNumber: RequestBody,
        @Part("email_address") emailAddress: RequestBody,
        @Part("identification_number") identificationNumber: RequestBody,
        @Part("password") password: RequestBody,
        @Part("confirm_password") confirmPassword: RequestBody,
        @Part("bank_branch") bankBranch: RequestBody,
        @Part("bank_name") bankName: RequestBody,
        @Part("bank_number") bankNumber: RequestBody,
        @Part("birth_date") birthDate: RequestBody,
        @Part("address") address: RequestBody,
        @Part("temporary_address") temporary_address: RequestBody,
        @Part("province_code") province_code: RequestBody,
        @Part("temporary_province_code") temporary_province_code: RequestBody,
        @Part("district_code") district_code: RequestBody,
        @Part("temporary_district_code") temporary_district_code: RequestBody,
        @Part("gender") gender: RequestBody,
        @Part("height") height: RequestBody,
        @Part("weight") weight: RequestBody,
        @Part("tax") tax: RequestBody,
        @Part avatar: MultipartBody.Part,
        @Part identificationImageFront: MultipartBody.Part,
        @Part identificationImageBack: MultipartBody.Part,
        @Part fullBodyImage: MultipartBody.Part
    ): GetMessageResponse

    @Multipart
    @PUT("/v1/auth/update")
    suspend fun updateUser(
        @Part("first_name") firstName: RequestBody? = null,
        @Part("last_name") lastName: RequestBody? = null,
        @Part("mobile_number") mobileNumber: RequestBody? = null,
        @Part("email_address") emailAddress: RequestBody? = null,
        @Part("identification_number") identificationNumber: RequestBody? = null,
        @Part("password") password: RequestBody? = null,
        @Part("confirm_password") confirmPassword: RequestBody? = null,
        @Part("bank_branch") bankBranch: RequestBody? = null,
        @Part("bank_name") bankName: RequestBody? = null,
        @Part("bank_number") bankNumber: RequestBody? = null,
        @Part("birth_date") birthDate: RequestBody? = null,
        @Part("address") address: RequestBody? = null,
        @Part("temporary_address") temporary_address: RequestBody? = null,
        @Part("province_code") province_code: RequestBody? = null,
        @Part("temporary_province_code") temporary_province_code: RequestBody? = null,
        @Part("district_code") district_code: RequestBody? = null,
        @Part("temporary_district_code") temporary_district_code: RequestBody? = null,
        @Part("gender") gender: RequestBody? = null,
        @Part("height") height: RequestBody? = null,
        @Part("weight") weight: RequestBody? = null,
        @Part("tax") tax: RequestBody? = null,
        @Part avatar: MultipartBody.Part? = null,
        @Part identificationImageFront: MultipartBody.Part? = null,
        @Part identificationImageBack: MultipartBody.Part? = null,
        @Part fullBodyImage: MultipartBody.Part? = null
    ): GetMessageResponse


    @POST("/v1/auth/otp")
    suspend fun verifyOtp(@Body verifyOtpRequest: VerifyOtpRequest): GetVerifyOtpResponse

    @GET("/v1/auth/token/refresh")
    suspend fun refreshToken(@Query("refresh_token") token: String): GetVerifyOtpResponse

    @GET("/v1/auth/logout")
    suspend fun logout()

    @GET("/v1/agencies")
    suspend fun getRoles(
    ): List<RoleResponse>

    @GET("/v1/agencies/{id}")
    suspend fun getRole(@Path("id") jobId: String): RoleResponse

    @GET("/v1/settings")
    suspend fun getVersionApp(): List<VersionApp>

    /************************** Application **************************/
    @GET("/pic/v1/applications")
    suspend fun getPicApplications(
        @Query("agency") agencyId: Int? = null,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("status") status: String? = null,
        @Query("project") project: Int? = null
    ): GetApplicationListResponse

    @GET("/pic/v1/applications/{id}")
    suspend fun getPicApplication(
        @Path("id") id: String
    ): ApplicationResponse

    @POST("/pic/v1/applications")
    suspend fun createPicApplication(
        @Body request: CreateApplicationRequest
    ): GetMessageResponse

    @DELETE("/pic/v1/applications/{id}")
    suspend fun deletePicApplication(
        @Path("id") id: String
    ): GetMessageResponse

    @GET("/management/v1/applications")
    suspend fun getManagementApplications(
        @Header("mts-agency-id") agencyId: String,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("status") status: String? = null,
        @Query("project") project: Int? = null
    ): GetApplicationListResponse

    @GET("/management/v1/applications/{id}")
    suspend fun getManagementApplication(@Path("id") id: String): ApplicationResponse

    @GET("/management/v1/applications/{id}/accept")
    suspend fun acceptApplication(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") id: String
    ): GetMessageResponse

    @GET("/management/v1/applications/{id}/reject")
    suspend fun rejectApplication(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") id: String
    ): GetMessageResponse

    /************************** User PIC **************************/
    @GET("/v1/auth/status")
    suspend fun getUser(): UserResponse

    /************************** Job **************************/
    @GET("/pic/v1/jobs")
    suspend fun getPicJobs(
        @Query("agency") agencyId: Int? = null,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("status") status: String? = null,
        @Query("project") project: Int? = null,
        @Query("store") store: Int? = null
    ): GetJobListResponse

    @GET("/management/v1/jobs")
    suspend fun getManagementJobs(
        @Header("mts-agency-id") agencyId: String,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("status") status: String? = null,
        @Query("project") project: Int? = null,
        @Query("store") store: Int? = null
    ): GetJobListResponse

    @POST("/management/v1/jobs")
    suspend fun createManagementJob(
        @Header("mts-agency-id") agencyId: String,
        @Query("project") projectId: String,
        @Body request: CreateJobRequest
    ): GetMessageResponse

    @GET("/pic/v1/jobs/{id}")
    suspend fun getPicJob(
        @Path("id") jobId: String
    ): JobResponse

    @GET("/management/v1/jobs/{id}")
    suspend fun getManagementJob(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") jobId: String
    ): JobResponse

    @DELETE("/management/v1/jobs/{id}")
    suspend fun removeManagementJob(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") jobId: String
    ): GetMessageResponse

    /************************** Job Request **************************/
    @GET("/pic/v1/job-requests")
    suspend fun getPicJobRequests(
        @Query("status") status: String? = null
    ): GetJobListResponse

    @POST("/pic/v1/job-requests/accept")
    suspend fun acceptJobRequest(
        @Body ids: ListIdRequest
    ): GetMessageResponse

    @POST("/pic/v1/job-requests/reject")
    suspend fun rejectJobRequest(
        @Body ids: ListIdRequest
    ): GetMessageResponse


    /************************** Switch Shift **************************/
    @GET("/pic/v1/switch-shift")
    suspend fun getSwitchShifts(
        @Query("agency") agencyId: Int? = null,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("status") status: String? = null
    ): GetApplicationListResponse

    @POST("/pic/v1/switch-shift/accept")
    suspend fun acceptSwitchShiftRequest(
        @Body ids: ListIdRequest
    ): GetMessageResponse

    @POST("/pic/v1/switch-shift/reject")
    suspend fun rejectSwitchShiftRequest(
        @Body ids: ListIdRequest
    ): GetMessageResponse

    /************************** Group **************************/
    @GET("/management/v1/store-groups")
    suspend fun getGroups(@Header("mts-agency-id") agencyId: String): GetGroupListResponse

    @GET("/management/v1/store-groups/{id}")
    suspend fun getGroup(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") groupId: String
    ): GroupStoreResponse

    @DELETE("/management/v1/store-groups/{id}")
    suspend fun removeGroup(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") groupId: String
    )

    /************************** Store **************************/
    @GET("/management/v1/stores")
    suspend fun getStores(@Header("mts-agency-id") agencyId: String): GetStoreListResponse

    @GET("/management/v1/stores/{id}")
    suspend fun getStore(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") storeId: String
    ): StoreResponse

    /************************** Project **************************/
    @GET("/management/v1/projects")
    suspend fun getProjects(
        @Header("mts-agency-id") agencyId: String,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("status") status: String? = null,
        @Query("type") taskType: Int
    ): GetProjectListResponse

    @GET("/management/v1/projects")
    suspend fun searchProjectsByName(
        @Header("mts-agency-id") agencyId: String,
        @Query("skip") skip: Int? = 0,
        @Query("take") take: Int? = 20,
        @Query("status") status: String? = null,
        @Query("project_name") project: String
    ): GetProjectListResponse

    @GET("/pic/v1/projects?")
    suspend fun getPicProjects(
        @Header("mts-agency-id") agencyId: String? = null,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("status") status: String? = null
    ): GetPicProjectListResponse

    @GET("/management/v1/projects/{id}")
    suspend fun getProject(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String
    ): ProjectResponse

    @GET("/management/v1/projects/{id}/members")
    suspend fun getMemberOfProject(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String
    ): GetMemberListResponse

    @GET("/pic/v1/projects/{id}/members")
    suspend fun getPicMemberOfProject(
        @Path("id") projectId: String
    ): GetMemberListResponse

    @GET("/management/v1/projects/{id}/stores")
    suspend fun getStoreOfProject(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String
    ): GetStoreOfProjectListResponse

    @POST("/management/v1/projects/{id}/add-stores")
    suspend fun addStoreToProject(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String,
        @Body request: ListIdRequest
    ): GetMessageResponse


    @POST("/management/v1/projects/{id}/remove-stores")
    suspend fun removeStoreToProject(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String,
        @Body request: ListIdRequest
    ): GetMessageResponse

    @POST("/management/v1/projects/{id}/remove-members")
    suspend fun removeUserToProject(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String,
        @Body request: ListIdRequest
    ): GetMessageResponse

    @POST("/management/v1/projects/{id}/add-members")
    suspend fun addUserToProject(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String,
        @Body request: ListIdRequest
    ): GetMessageResponse


    /************************** Manage Employee PIC **************************/
    @GET("/management/v1/users")
    suspend fun getMyMembers(
        @Header("mts-agency-id") agencyId: String,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null
    ): GetMemberListResponse

    @GET("/management/v1/users/{id}")
    suspend fun getUser(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") user: String
    ): UserResponse

    @GET(" /management/v1/user-groups")
    suspend fun getGroupUsers(
        @Header("mts-agency-id") agencyId: String,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null
    ): GetGroupEmployeeListResponse

    @GET(" /management/v1/user-groups/{id}")
    suspend fun getGroupUser(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String
    ): GroupUserResponse

    @GET(" /management/v1/user-groups/{id}/members")
    suspend fun getMemberOfGroupUser(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") projectId: String
    ): GetMemberListResponse

    /************************** Member Invite PIC **************************/
    @GET("/pic/v1/member-invitations")
    suspend fun getPicMemberInvites(
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("status") status: String? = null
    ): GetMemberInvitationsListResponse

    @GET("/pic/v1/member-invitations/{id}/accept")
    suspend fun acceptPicMemberInvites(
        @Path("id") projectId: String
    ): GetMessageResponse

    @GET("/pic/v1/member-invitations/{id}/reject")
    suspend fun rejectPicMemberInvites(
        @Path("id") projectId: String
    ): GetMessageResponse

    /************************** Attendances **************************/
    @GET("/management/v1/task-attendances")
    suspend fun getManagementAttendances(
        @Header("mts-agency-id") agencyId: String,
        @Query("project") project: String? = null
    ): GetAttendanceListResponse

    @GET("/pic/v1/task-attendances")
    suspend fun getPicAttendances(
        @Header("check_in_time") startTime: String,
        @Header("check_out_time") endTime: String
    ): GetPicAttendanceListResponse

    @GET("/management/v1/task-attendances/{id}")
    suspend fun getManagementAttendance(
        @Path("id") notificationId: String
    ): AttendanceResponse

    /************************** Notification **************************/
    @GET("/pic/v1/notifications")
    suspend fun getPicNotifications(): GetNotificationListResponse

    @GET("/management/v1/notifications/{id}")
    suspend fun getPicNotification(
        @Path("id") notificationId: String
    ): NotificationResponse

    @GET("/pic/v1/notifications/{id}/read")
    suspend fun markRead(
        @Path("id") notificationId: String
    ): GetMessageResponse

    @GET("/pic/v1/notifications/{id}/resolved")
    suspend fun markResolved(
        @Path("id") notificationId: String
    ): GetMessageResponse

    /************************** Task **************************/
    @GET("/pic/v1/tasks")
    suspend fun getPicTasks(
        @Query("job") job: Int? = null,
        @Query("agency") agencyId: Int? = null,
        @Query("type") type: Int? = null,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("status") status: String? = null,
        @Query("project") project: Int? = null,
        @Query("store") store: Int? = null
    ): GetTaskListResponse

    @GET("/management/v1/tasks")
    suspend fun getManagementTasks(
        @Header("mts-agency-id") agencyId: String,
        @Query("job") job: String? = null,
        @Query("project") project: String? = null,
        @Query("type") type: Int? = null,
        @Query("store") store: String? = null,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null
    ): GetTaskListResponse

    @GET("/management/v1/tasks/{id}")
    suspend fun getManagementTask(
        @Path("id") projectId: String
    ): TaskResponse

    @GET("/pic/v1/tasks/{taskId}")
    suspend fun getPicTask(
        @Path("taskId") taskId: String
    ): TaskResponse

    @DELETE("/management/v1/tasks/{id}")
    suspend fun removeTask(
        @Header("mts-agency-id") agencyId: String,
        @Path("id") taskId: String
    ): GetMessageResponse

    @POST("/management/v1/tasks")
    suspend fun createManagementTask(
        @Header("mts-agency-id") agencyId: String,
        @Body request: CreateTaskRequest
    ): GetMessageResponse

    @Multipart
    @POST("/pic/v1/tasks/{id}/check-in")
    suspend fun checkIn(
        @Path("id") taskId: String,
        @Part file: MultipartBody.Part,
        @Part("lat") lat: String? = "1.0",
        @Part("lng") lng: String? = "1.0"
    ): GetMessageResponse

    @Multipart
    @POST("/pic/v1/tasks/{id}/check-out")
    suspend fun checkOut(
        @Path("id") taskId: String,
        @Part file: MultipartBody.Part,
        @Part("lat") lat: String? = "1.0",
        @Part("lng") lng: String? = "1.0"
    ): GetMessageResponse

    @Multipart
    @POST("/pic/v1/tasks/{id}/upload-attachments")
    suspend fun uploadAttachments(
        @Path("id") taskId: String,
        @Part("file_notes") notes: String? = null,
        @Part file1: MultipartBody.Part? = null,
        @Part file2: MultipartBody.Part? = null,
        @Part file3: MultipartBody.Part? = null
    ): GetMessageResponse

    @POST("/pic/v1/tasks/{id}/delete-attachments")
    suspend fun deleteAttachments(
        @Path("id") taskId: String,
        @Body listAttachmentIds: ListIdRequest
    ): GetMessageResponse

    @PUT("/pic/v1/tasks/{id}/products/{productId}")
    suspend fun updateProduct(
        @Path("id") taskId: String,
        @Path("productId") productId: String,
        @Body updateProduct: UpdateProductRequest
    ): GetMessageResponse

    @PUT("/pic/v1/tasks/{id}/customer-feedback/{feedbackId}")
    suspend fun updateCustomerFeedback(
        @Path("id") taskId: String,
        @Path("feedbackId") productId: String,
        @Body updateCustomerFeedback: UpdateCustomerFeedbackRequest
    ): GetMessageResponse

    @PUT("/pic/v1/tasks/{id}")
    suspend fun updateTaskProductFeedback(
        @Path("id") taskId: String,
        @Body updateCustomerFeedback: UpdateProductFeedbackRequest
    ): GetMessageResponse

    /*
    * Redeem
    * */
    @POST("/pic/v1/tasks/{id}/customers")
    suspend fun registerCustomer(
        @Path("id") taskId: String,
        @Body customer: CustomerRequest
    ): CustomerResponse

    @GET("/pic/v1/tasks/{id}/customers")
    suspend fun getListCustomer(
        @Path("id") taskId: String
    ): GetCustomerListResponse

    @POST("/pic/v1/tasks/{id}/customer-otp")
    suspend fun verifyCustomerOtp(
        @Path("id") taskId: String,
        @Body otpRequest: VerifyOtpResetPasswordRequest
    ): GetMessageResponse

    @POST("/pic/v1/tasks/{id}/customer-resend-otp")
    suspend fun resendCustomerOtp(
        @Path("id") taskId: String,
        @Body otpRequest: ResendCustomerOtpRequest
    ): GetMessageResponse

    @Multipart
    @POST("/pic/v1/tasks/{taskId}/customers/{customerId}/customer-bills")
    suspend fun createCustomerBill(
        @Path("taskId") taskId: String,
        @Path("customerId") customerId: String,
        @Part("code_bill") codeBill: String,
        @Part file1: MultipartBody.Part? = null,
        @Part file2: MultipartBody.Part? = null,
        @Part file3: MultipartBody.Part? = null
    ): DetailCustomerBillResponse

    @GET("/pic/v1/tasks/{id}/customer-bills")
    suspend fun getListCustomerBill(
        @Path("id") id: String
    ): GetCustomerBillListResponse

    @GET("/pic/v1/tasks/{taskId}/customer-bills/{billId}")
    suspend fun getCustomerBill(
        @Path("taskId") taskId: String,
        @Path("billId") billId: String
    ): DetailCustomerBillResponse

    @PUT("/pic/v1/{productId}/projects/{projectId}/products")
    suspend fun updatePriceOfProduct(
        @Path("projectId") projectId: String,
        @Path("productId") productId: String,
        @Body UpdatePriceOfProductRequest: UpdatePriceOfProductRequest
    ): GetMessageResponse

    @GET("/pic/v1/projects/{projectId}/promotions")
    suspend fun getPromotions(
        @Path("projectId") projectId: String
    ): GetPromotionListResponse

    @GET("/pic/v1/projects/{projectId}/products")
    suspend fun getProducts(
        @Path("projectId") projectId: String
    ): GetProductListResponse

    @GET("/pic/v1/projects/{projectId}/gifts")
    suspend fun getGifts(
        @Path("projectId") projectId: String
    ): GetGiftListResponse


    @POST("/pic/v1/tasks/{taskId}/customer-bills/{billId}/add-product")
    suspend fun addProductToBill(
        @Path("taskId") taskId: String,
        @Path("billId") billId: String,
        @Body request: AddPromotionGiftRequest
    ): GetMessageResponse


    // Nhập số lượng nhận, và số lượng còn lại cuối ca
    @POST("/pic/v1/tasks/{taskId}/import-store-gifts")
    suspend fun importStoreGifts(
        @Path("taskId") taskId: String,
        @Body request: ReceiveGiftRequest
    ): ArrayList<SummaryGiftResponse>

    // Lấy số lượng quà đã phát
    @GET("/pic/v1/tasks/{taskId}/store-gifts-summary")
    suspend fun getConsumeGift(
        @Path("taskId") taskId: String
    ): ArrayList<GiftResponse>

    // Lấy số số lượng in/out
    @GET("/pic/v1/tasks/{taskId}/store-gifts")
    suspend fun getStoreGiftsInOut(
        @Path("taskId") taskId: String
    ): ArrayList<SummaryGiftResponse>

    @GET("/management/v1/projects/{projectId}/summary")
    suspend fun getProjectSummary(
        @Header("mts-agency-id") agencyId: String,
        @Path("projectId") projectId: String
    ): ProjectSummaryResponse

    @GET("/management/v1/projects/{projectId}/summary/customer")
    suspend fun getProjectSummaryCustomer(
        @Header("mts-agency-id") agencyId: String,
        @Path("projectId") projectId: String
    ): ArrayList<CustomerResponse>

    @GET("/management/v1/projects/{projectId}/summary/promotion-package")
    suspend fun getProjectSummaryPromotion(
        @Header("mts-agency-id") agencyId: String,
        @Path("projectId") projectId: String
    ): ArrayList<SummaryPromotionResponse>


    @GET("/management/v1/projects/{projectId}/summary/gift")
    suspend fun getProjectSummaryGift(
        @Header("mts-agency-id") agencyId: String,
        @Path("projectId") projectId: String
    ): ArrayList<SummaryGiftResponse>

    /*
    * Tracking
    * */
    @Multipart
    @POST("/pic/v1/tracking")
    suspend fun uploadLocation(
        @Part("lat") lat: String,
        @Part("lng") lng: String
    ): GetMessageResponse

    @GET("/management/v1/projects/{projectId}/stores/{storeId}/users")
    suspend fun getMembersAtStore(
        @Header("mts-agency-id") agencyId: String,
        @Path("storeId") storeId: String,
        @Path("projectId") projectId: String
    ): GetMemberListResponse

    @GET("/management/v1/tracking")
    suspend fun getManagementTrackingOfUser(
        @Header("mts-agency-id") agencyId: String,
        @Path("user_id") userId: String,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null
    ): GetTrackingListResponse

    /*
    * Bao cao doi thu
    * */
    @Multipart
    @POST("/pic/v1/tasks/{taskId}/report-opponents")
    suspend fun uploadReportOpponents(
        @Path("taskId") taskId: String,
        @Part("brand_name") brandName: String,
        @Part("type") type: String,
        @Part("note") note: String,
        @Part file1: MultipartBody.Part? = null,
        @Part file2: MultipartBody.Part? = null,
        @Part file3: MultipartBody.Part? = null
    ): GetMessageResponse

    @GET("/pic/v1/tasks/{taskId}/report-opponents")
    suspend fun getPicReportOpponents(
        @Path("taskId") taskId: String
    ): GetReportOpponentListResponse

    @GET("/management/v1/projects/{projectId}/report-opponents")
    suspend fun getManagementReportOpponents(
        @Header("mts-agency-id") agencyId: String,
        @Path("projectId") projectId: String,
        @Query("start_time") startTime: String? = null,
        @Query("end_time") endTime: String? = null,
        @Query("skip") skip: Int? = null,
        @Query("take") take: Int? = null
    ): GetTaskListResponse


    /* sale */
    @POST("/pic/v1/tasks/{taskId}/orders")
    suspend fun createOrder(
        @Path("taskId") taskId: String,
        @Body request: AddProductToOrderRequest
    ): OrderResponse

    @POST("/pic/v1/tasks/{taskId}/orders/{orderId}")
    suspend fun viewOrder(
        @Path("taskId") taskId: String,
        @Path("orderId") orderId: String
    ): OrderResponse

    @GET("/pic/v1/tasks/{taskId}/orders")
    suspend fun getOrder(
        @Path("taskId") taskId: String
    ): GetOrderListResponse

    @PUT("/pic/v1/tasks/{taskId}/orders/{orderId}")
    suspend fun updateOrder(
        @Path("taskId") taskId: String,
        @Path("orderId") orderId: String,
        @Body request: AddProductToOrderRequest
    ): GetMessageResponse

    companion object {
        const val NETWORK_PAGE_SIZE = 20
    }
}
