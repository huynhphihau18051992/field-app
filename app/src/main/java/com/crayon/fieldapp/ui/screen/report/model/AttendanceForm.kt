package com.crayon.fieldapp.ui.screen.report.model

import com.crayon.fieldapp.data.remote.response.TaskResponse
import java.util.*

class AttendanceForm constructor(
    val start_date: Date,
    val end_date: Date,
    val today: Date,
    val summary_man_hour: String,
    val today_shift: ArrayList<TaskResponse>,
    val total_shift: Int,
    val summaryShift: ArrayList<String>,
    val summary_invalid_shift: Int,
    val projects: ArrayList<String>,
    val shifts: HashMap<Date, ArrayList<TaskResponse>>
) {
}