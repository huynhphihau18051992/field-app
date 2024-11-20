package com.crayon.fieldapp.data.remote.request

import com.crayon.fieldapp.utils.Duplex


class CreateApplicationForm constructor(
    var agency: String? = null,
    var leader: String? = null,
    var type: String? = null,
    var project: String? = null,
    var reason: String? = null,
    var start_time: String? = null,
    var end_time: String? = null,
    var replacement: String? = null,
    var job: String? = null
) {

    fun validate(): Duplex<Boolean, String?> {
        start_time?.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn thời gian bắt đầu")
        end_time?.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn thời gian kết thúc")
        reason?.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng điền lý do")
        type?.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn loại đơn")
        agency?.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn Agency")
        leader?.takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn người quản lý")
        return Duplex(true, null)
    }
}