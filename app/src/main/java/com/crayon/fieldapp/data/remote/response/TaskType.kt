package com.crayon.fieldapp.data.remote.response


enum class TaskType(var value: Int, var text: String) {
    CHECK_LIST(1, "Xác nhận nhận hàng"),
    SET_UP(2, "Lắp đặt"),
    REPORT_CUSTOMER(3, "Báo cáo khách hàng"),
    UPDATE_STATUS(4, "Báo cáo cập nhật tình hình"),
    REPORT_COMPITETOR(5, "Báo cáo đối thủ"),
    VISIT_STORE(6, "Kiểm tra cửa hàng"),
    REPORT_DAMAGED(7, "Báo cáo hư hỏng"),
    CLEAN_UP(8, "Kết thúc dự án và tháo gỡ"),
    REPORT_VIOLATION(9, "Báo cáo vi phạm của đối tác"),
    REPORT_END_SHIFT(10, "Báo cáo cuối ca"),
    COUNT(11, "Kiểm đếm"),
    UPDATE_PRICE(12, "Cập nhật giá"),
    TIME_KEEPING(13, "Chấm công"),
    COMPLETE_FIX(14, "Báo cáo hoàn thành sửa chửa"),
    CHECK_RECEIVE_GIFT(15, "Kiểm tra nhập quà"),
    CHANGE_GIFT(16, "Chơi game đổi quà"),
    REPORT_SALES(17, "Báo cáo bán hàng")
}