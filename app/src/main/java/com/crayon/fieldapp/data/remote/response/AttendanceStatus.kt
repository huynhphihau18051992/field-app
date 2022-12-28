package com.crayon.fieldapp.data.remote.response

enum class AttendanceStatus(val value: String) {
    PENDING("Pending"),
    PROCESSING("Processing"),
    CLOSED("Closed"),
    COMPLETED("Completed"),
    INCOMPLETE("Incomplete")
}
