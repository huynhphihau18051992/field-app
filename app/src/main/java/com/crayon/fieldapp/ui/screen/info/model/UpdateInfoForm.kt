package com.crayon.fieldapp.ui.screen.info.model

import com.crayon.fieldapp.utils.Duplex


class UpdateInfoForm constructor(
    val firstName: String,
    val lastName: String,
    val birthDay: String,
    val email: String,
    val phone: String,
    val gender: String,
    val heigth: String,
    val weigth: String,
    val id: String,
    val city: String,
    val district: String,
    val address: String,
    val current_address: String,
    val current_district: String,
    val current_city: String
) {

    fun validate(): Duplex<Boolean, String?> {
        firstName.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập tên")
        lastName.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập họ")
        birthDay.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập ngày sinh")
        email.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập email")
        phone.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập số điện thoại")
        gender.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn giới tính")
        heigth.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập chiều cao")
        weigth.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập cân nặng")
        id.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập Số CMND")
        city.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn Tỉnh/Thành")
        current_city.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn Tỉnh/Thành nơi cư trú hiện tại")
        district.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập Quận/Huyện")
        current_district.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập Quận/Huyện nơi cư trú hiện tại")
        address.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập địa chỉ")
        current_address.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập địa chỉ nơi cư trú hiện tại")
        return Duplex(true, null)
    }
}