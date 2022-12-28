package studio.phillip.yolo.utils

import android.util.Log
import com.crayon.fieldapp.data.remote.response.AttendanceResponse
import com.crayon.fieldapp.data.remote.response.AttendanceStatus
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.remote.response.TaskType
import java.text.Normalizer
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern


object TaskUtils {

    fun getStatusAttendances(task: TaskResponse): String {
        val attendance = task.attendances
        if(attendance?.size == 0){
            return AttendanceStatus.PENDING.value
        } else if (attendance?.get(0)?.checkOutTime.isNullOrEmpty()){
            return AttendanceStatus.PROCESSING.value
        } else {
            return AttendanceStatus.COMPLETED.value
        }
    }

     fun getQualityOfImage(taskType: Int): Int {
        when (taskType) {
            TaskType.REPORT_CUSTOMER.value -> {
                return 100
            }
            TaskType.SET_UP.value,
            TaskType.CHECK_LIST.value,
            TaskType.VISIT_STORE.value,
            TaskType.TIME_KEEPING.value,
            TaskType.UPDATE_STATUS.value,
            TaskType.REPORT_COMPITETOR.value,
            TaskType.REPORT_DAMAGED.value,
            TaskType.CLEAN_UP.value,
            TaskType.REPORT_VIOLATION.value,
            TaskType.REPORT_END_SHIFT.value,
            TaskType.COUNT.value,
            TaskType.UPDATE_PRICE.value,
            TaskType.COMPLETE_FIX.value -> {
                return 50
            }
        }
        return 50
    }

     fun isHasTag(taskType: Int): Boolean {
        return false
    }

}
