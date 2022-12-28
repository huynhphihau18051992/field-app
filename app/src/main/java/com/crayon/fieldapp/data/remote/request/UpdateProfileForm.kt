package com.crayon.fieldapp.data.remote.request

import android.net.Uri
import android.util.Patterns
import com.crayon.fieldapp.utils.Duplex


class UpdateProfileForm constructor(
    val firstName: String,
    val lastName: String,
    val birthDay: String,
    val email: String,
    val password: String,
    val confirmPassword: String,
    val phone: String,
    val gender: String,
    val tax: String,
    val bank_number: String,
    val bank_name: String,
    val bank_brand: String,
    val heigth: String,
    val weigth: String,
    val id: String,
    val city: String,
    val district: String,
    val temporary_city: String,
    val temporary_district: String,
    val temporary_address: String,
    val avatar: Uri?,
    val full_body: Uri?,
    val id_front: Uri?,
    val id_back: Uri?,
    val address: String) {

    fun validate(): Duplex<Boolean, String?> {
        email.trim().takeUnless { !it.isValidEmail() }
            ?: return Duplex(false, "Email không đúng")
        phone.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập số điện thoại")
        phone.trim().takeUnless { it.startsWith("0") }
                ?: return Duplex(false, "Vui lòng bỏ số 0 đầu tiên số điện thoại")
        firstName.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập tên")
        lastName.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập họ")
        password.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng mật khẩu")
        confirmPassword.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng xác nhận mật khẩu")
        birthDay.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập ngày sinh")
        email.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập email")
        gender.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng chọn giới tính")
        tax.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập mã số thuế")
        tax.trim().takeUnless { it.length > 10 }
                ?: return Duplex(false, "Mã số thuế vượt quá 10 số")
        bank_name.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập tên ngân hàng")
        bank_number.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập tài khoản ngân hàng")
        bank_brand.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập chi nhánh ngân hàng")
        heigth.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập chiều cao")
        weigth.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập cân nặng")
        id.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập Số CMND")
        city.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng chọn Tỉnh/Thành trên CCCD")
        district.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập Quận/Huyện trên CCCD")
        temporary_city.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng chọn Tỉnh/Thành nơi cư trú hiện tại")
        temporary_district.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập Quận/Huyện nơi cư trú hiện tại")
        avatar.takeUnless { it == null }
                ?: return Duplex(false, "Vui lòng chọn ảnh đại diện")
        full_body.takeUnless { it == null }
                ?: return Duplex(false, "Vui lòng chọn ảnh toàn thân")
        id_front.takeUnless { it == null }
                ?: return Duplex(false, "Vui lòng chọn ảnh CMND mặt trước")
        id_back.takeUnless { it == null }
                ?: return Duplex(false, "Vui lòng chọn ảnh CMND mặt sau")
        address.trim().takeUnless { it.isNullOrEmpty() }
                ?: return Duplex(false, "Vui lòng nhập địa chỉ CCCD")
        temporary_address.trim().takeUnless { it.isNullOrEmpty() }
            ?: return Duplex(false, "Vui lòng nhập nơi cư trú hiện tại")
        return Duplex(true, null)
    }

    fun String?.isValidEmail() = !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}