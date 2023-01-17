package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class ReportOpponentResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("type") val type: String? = null,
    @SerializedName("brand_name") val brandName: String? = null,
    @SerializedName("note") val note: String? = null,
    @SerializedName("task_id") val taskId: String? = null,
    @SerializedName("project") val projectId: String? = null,
    @SerializedName("medias") val medias: ArrayList<Medias>? = null
) : BaseResponse() {

    data class Medias(
        @SerializedName("createdAt") val createdAt: String? = null,
        @SerializedName("updatedAt") val updatedAt: String? = null,
        @SerializedName("id") val id: String? = null,
        @SerializedName("file_url") val fileUrl: String? = null,
        @SerializedName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerializedName("type") val type: String? = null,
        @SerializedName("report") val report: String? = null
    )

}