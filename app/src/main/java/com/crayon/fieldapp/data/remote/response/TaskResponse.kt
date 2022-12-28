package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class TaskResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("type") val type: Type = Type(),
    @SerializedName("store") val store: StoreInfo? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("job") val job: JobInfo? = null,
    @SerializedName("attendances") val attendances: ArrayList<Attendances>? = null,
    @SerializedName("attachments") val attachments: ArrayList<Attachments>? = null,
    @SerializedName("products") val products: ArrayList<Product> = arrayListOf(),
    @SerializedName("customer_feedback") val feedbacks: ArrayList<Feedback> = arrayListOf(),
    @SerializedName("pic") val pic: MemberResponse? = null,
    @SerializedName("project") val project: ProjectInfo? = null
) : BaseResponse() {

    data class Type(
        @SerializedName("createdAt") val createdAt: String? = null,
        @SerializedName("updatedAt") val updatedAt: String? = null,
        @SerializedName("id") val id: String? = null,
        @SerializedName("name") val name: String? = null,
        @SerializedName("identifier") val identifier: Int = 0
    )

    data class StoreInfo(
        @SerializedName("createdAt") val createdAt: String? = null,
        @SerializedName("updatedAt") val updatedAt: String? = null,
        @SerializedName("id") val id: String? = null,
        @SerializedName("code") val code: String? = null,
        @SerializedName("name") val name: String? = null,
        @SerializedName("description") val description: String? = null,
        @SerializedName("address") val address: String? = null,
        @SerializedName("lat") val lat: Double,
        @SerializedName("lng") val lng: Double
    )

    data class JobInfo(
        @SerializedName("id") val id: String? = null,
        @SerializedName("start_time") val startTime: String? = null,
        @SerializedName("end_time") val endTime: String? = null,
        @SerializedName("role") val role: String? = null
    )

    data class ProjectInfo(
        @SerializedName("id") val id: String? = null,
        @SerializedName("name") val name: String? = null
    )

    data class Attendances(
        @SerializedName("createdAt") val createdAt: String? = null,
        @SerializedName("updatedAt") val updatedAt: String? = null,
        @SerializedName("id") val id: String? = null,
        @SerializedName("check_in_time") val checkInTime: String? = null,
        @SerializedName("check_out_time") val checkOutTime: String? = null,
        @SerializedName("agency") val agency: String? = null,
        @SerializedName("store") val store: String? = null,
        @SerializedName("task") val task: String? = null,
        @SerializedName("pic") val pic: String? = null
    )

    data class Attachments(
        @SerializedName("createdAt") val createdAt: String? = null,
        @SerializedName("updatedAt") val updatedAt: String? = null,
        @SerializedName("id") val id: String? = null,
        @SerializedName("image_url") val imageUrl: String? = null,
        @SerializedName("thumbnail_url") val thumbnailUrl: String? = null,
        @SerializedName("note") val note: String? = null,
        @SerializedName("type") val type: String? = null,
        @SerializedName("task") val task: String? = null
    )

    data class Value(
        @SerializedName("product_name") val productName: String? = null,
        @SerializedName("product_code") val productCode: String? = null,
        @SerializedName("total") val total: Int? = 0
    )

    data class Product(
        @SerializedName("createdAt") val createdAt: String? = null,
        @SerializedName("updatedAt") val updatedAt: String? = null,
        @SerializedName("id") val id: String? = null,
        @SerializedName("name") val name: String? = null,
        @SerializedName("quantity") var quantity: Int = 0,
        @SerializedName("task") val task: String? = null
    )

    data class Feedback(
        @SerializedName("createdAt") val createdAt: String? = null,
        @SerializedName("updatedAt") val updatedAt: String? = null,
        @SerializedName("id") val id: String? = null,
        @SerializedName("name") val name: String? = null,
        @SerializedName("description") var description: String? = "",
        @SerializedName("task") val task: String? = null
    )
}
