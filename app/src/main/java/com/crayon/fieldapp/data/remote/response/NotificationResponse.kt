package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class NotificationResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("title") val title: String? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("sender") val sender: Pic? = null,
    @SerializedName("message_published") val messagePublished: Boolean? = false,
    @SerializedName("message_delivered") val messageDelivered: Boolean? = false,
    @SerializedName("message_read") val messageRead: Boolean? = false,
    @SerializedName("message_deleted") val messageDeleted: Boolean? = false,
    @SerializedName("message_resolved") val messageResolved: Boolean? = false
) : BaseResponse()