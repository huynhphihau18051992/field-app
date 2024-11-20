package com.crayon.fieldapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class ApplicationResponse(
    @SerializedName("createdAt") val createdAt: String? = null,
    @SerializedName("updatedAt") val updatedAt: String? = null,
    @SerializedName("id") val id: String? = null,
    @SerializedName("reason") val reason: String? = null,
    @SerializedName("status") val status: String? = null,
    @SerializedName("type") val type: String? = null,
    @SerializedName("start_time") val start_time: String? = null,
    @SerializedName("end_time") val end_time: String? = null,
    @SerializedName("agency") val agency: AgencyResponse? = null,
    @SerializedName("project") val project: Project? = null,
    @SerializedName("employee") val employee: MemberResponse? = null,
    @SerializedName("leader") val leader: MemberResponse? = null,
    @SerializedName("replacement") val replacement: MemberResponse? = null
) : BaseResponse()


enum class ApplicationStatus(val value: String, val text: String) {
    PENDING("Pending", "Chờ duyệt"),
    WAIT_REPLACE("Waiting for Replacement", "Chờ người thay thế"),
    ACCEPT_REPLACE("Accepted from Replacement", "Người thay thế đã đồng ý"),
    REJECT_REPLACE("Rejected from Replacement", "Người thay thế đã từ chối"),
    ACCEPTED("Accepted", "Đã duyệt"),
    REJECTED("Rejected", "Từ chối")
}

enum class ApplicationType(val value: String, val text: String) {
    TAKE_LEAVE("Take Leave", "Đơn xin nghỉ phép"),
    WITHDRAW_FROM_PROJECT("Withdraw from Project", "Đơn xin rút khỏi dự án"),
    SWITCH_SHIFT("Switch Shift", "Đơn xin đổi ca")
}
