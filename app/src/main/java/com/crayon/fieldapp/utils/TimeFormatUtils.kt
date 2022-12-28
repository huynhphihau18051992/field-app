package studio.phillip.yolo.utils

import android.util.Log
import java.text.Normalizer
import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern


object TimeFormatUtils {

    fun formatDate(time: Date): String? {
        return SimpleDateFormat("dd/MM/yyyy").format(time)
    }

    fun formatFullDate(time: Date): String? {
        return SimpleDateFormat("dd/MM/yyyy HH:mm").format(time)
    }

    fun formatUploadImage(time: Date): String? {
        return SimpleDateFormat("EEE, dd/MM/yyyy HH:mm").format(time)
    }

    fun formatNotification(time: Date): String? {
        var milisecond = time.time
        var now = Date().time
        var diff = now - milisecond
        if (diff < 60000) {                   // dưới 1 phút
            return "Vừa xong"
        } else if (diff < 3600000) {         // dưới 1 giờ
            return (diff / 60000).toString() + " phút trước"
        } else if (diff < 86400000) {         // dưới 1 ngày
            return "Hôm nay lúc " + SimpleDateFormat("HH:mm").format(time)
        } else {
            return SimpleDateFormat("EEE, dd/MM/yyyy HH:mm").format(time)
        }
    }

    fun getDate(time: Date): Int? {
        return SimpleDateFormat("dd").format(time).toInt()
    }

    fun getMonth(time: Date): Int? {
        return SimpleDateFormat("MM").format(time).toInt()
    }

    fun getYear(time: Date): Int? {
        return SimpleDateFormat("yyyy").format(time).toInt()
    }

    fun formatDayAndMonth(time: Date): String? {
        return SimpleDateFormat("dd/MM").format(time)
    }

    fun formatHour(time: Date): String? {
        return SimpleDateFormat("HH:mm").format(time)
    }

    fun getDate(year: Int, month: Int, day: Int, hour: Int, minute: Int): Date? {
        val cal = Calendar.getInstance()
        cal.set(Calendar.YEAR, year)
        cal.set(Calendar.MONTH, month)
        cal.set(Calendar.DAY_OF_MONTH, day)
        cal.set(Calendar.HOUR_OF_DAY, hour)
        cal.set(Calendar.MINUTE, minute)
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)
        return cal.time
    }

//    fun getStringDate(date: Timestamp): String? {
//        val cal = toCalendar(date.toDate())
//        cal.set(Calendar.HOUR_OF_DAY, 0)
//        cal.set(Calendar.MINUTE, 0)
//        cal.set(Calendar.SECOND, 0)
//        cal.set(Calendar.MILLISECOND, 0)
//        return formatDate(cal.time)
//    }
//
//    fun getDate(date: Timestamp): Date? {
//        val cal = toCalendar(date.toDate())
//        cal.set(Calendar.HOUR_OF_DAY, 0)
//        cal.set(Calendar.MINUTE, 0)
//        cal.set(Calendar.SECOND, 0)
//        cal.set(Calendar.MILLISECOND, 0)
//        return cal.time
//    }
//
//
//    fun getTimeStamp(year: Int, month: Int, day: Int, hour: Int, minute: Int): Timestamp {
//        val cal = Calendar.getInstance()
//        cal.set(Calendar.YEAR, year)
//        cal.set(Calendar.MONTH, month)
//        cal.set(Calendar.DAY_OF_MONTH, day)
//        cal.set(Calendar.HOUR_OF_DAY, hour)
//        cal.set(Calendar.MINUTE, minute)
//        cal.set(Calendar.SECOND, 0)
//        cal.set(Calendar.MILLISECOND, 0)
//        return Timestamp(cal.time)
//    }

    fun toCalendar(date: Date): Calendar {
        val cal = Calendar.getInstance()
        cal.time = date
        return cal
    }

    fun getResetDate(date: Date): Date? {
        val cal = toCalendar(date)
        cal.set(Calendar.HOUR_OF_DAY, 0)
        cal.set(Calendar.MINUTE, 0)
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)
        return cal.time
    }

    fun convertSecondToHour(second: Long): String {
        var time = ""
        var milliSec = second * 1000
        val secondsInMilli: Long = 1000
        val minutesInMilli = secondsInMilli * 60
        val hoursInMilli = minutesInMilli * 60
        val daysInMilli = hoursInMilli * 24

        val elapsedDays = milliSec / daysInMilli
        milliSec = milliSec % daysInMilli

        val elapsedHours = milliSec / hoursInMilli
        milliSec = milliSec % hoursInMilli

        val elapsedMinutes = milliSec / minutesInMilli

        if (elapsedDays != 0L) {
            time += elapsedDays.toString() + " " + "Ngày" + " "
        }

        if (elapsedHours != 0L) {
            time += elapsedHours.toString() + " " + "giờ" + " "
        }

        if (elapsedMinutes != 0L) {
            time += elapsedMinutes.toString() + " " + "phút" + " "
        }

        if (!time.isNotBlank()) {
            time = "0 giờ 0 phút"
        }

        return time
    }

    fun removeUnicode(origin: String): String {
        val nfdNormalizedString = Normalizer.normalize(origin, Normalizer.Form.NFD)
        val pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+")
        Log.d("AAA", pattern.matcher(nfdNormalizedString).replaceAll("").toLowerCase())
        return pattern.matcher(nfdNormalizedString).replaceAll("").toLowerCase()
    }
}
