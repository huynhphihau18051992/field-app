package com.crayon.fieldapp.data.remote.request

import com.crayon.fieldapp.utils.Duplex
import java.io.Serializable


data class CreateTaskForm constructor(
    val agency: String,
    val project: String,
    val job: String,
    val pic: String,
    val store: String,
    val name: String,
    val description: String,
    val type: String
) : Serializable {

    fun validate(): Duplex<Boolean, String?> {
        project.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn Dự án")
        job.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn Công việc")
        pic.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn người phụ trách")
        store.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn cửa hàng")
        type.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng loại nhiệm vụ")
        return Duplex(true, null)
    }
}