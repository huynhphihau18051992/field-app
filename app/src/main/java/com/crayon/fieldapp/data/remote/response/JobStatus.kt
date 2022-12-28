package com.crayon.fieldapp.data.remote.response

enum class JobStatus(val value: String) {
    PENDING("Pending"),
    PROCESSING("Processing"),
    CLOSED("Closed"),
    COMPLETED("Completed"),
    INCOMPLETE("Incomplete")
}
