package com.crayon.fieldapp.data.remote.request

import com.crayon.fieldapp.utils.Duplex
import java.io.Serializable


data class CreateJobForm constructor(
    val agencyId: String?,
    val picId: String?,
    val projectId: String?,
    val role: String?,
    val shift_start: String?,
    val shift_end: String?,
    val storeId: String?
) : Serializable {


    fun validate(): Duplex<Boolean, String?> {
        agencyId?.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn Agency")
        projectId.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn dự án")
        storeId?.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn cửa hàng")
        picId.takeUnless { it.isNullOrEmpty() || picId.equals("-1") }
            ?: return Duplex(false, "Vui lòng chọn người phụ trách")
        role.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn vai trò")
        shift_end.takeUnless { it == null }
            ?: return Duplex(false, "Vui lòng chọn thời gian kết thúc")
        shift_start.takeUnless { it == null }
            ?: return Duplex(false, "Vui lòng chọn thời gian bắt đầu")
        return Duplex(true, null)
    }
}