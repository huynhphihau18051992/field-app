package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class AttendanceResponse(
    @SerializedName("start_time") val startTime: String? = null,
    @SerializedName("end_time") val endTime: String? = null,
    @SerializedName("total_pic") val totalPic: String? = null,
    @SerializedName("no_task_pending") val noTaskPending: String? = null,
    @SerializedName("no_task_processing") val noTaskProcessing: String? = null,
    @SerializedName("no_task_completed") val noTaskCompleted: String? = null,
    @SerializedName("no_task_closed") val noTaskClosed: String? = null,
    @SerializedName("no_task_incomplete") val noTaskIncomplete: String? = null,
    @SerializedName("total_count") val totalCount: String? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("store") val store: StoreOfProjectResponse? = null,
    @SerializedName("project") val project: Project? = null
) : BaseResponse()