package com.crayon.fieldapp.utils

object MStringUtils {
    private var MAP_NORM: HashMap<Char, Char> = HashMap<Char, Char>()

    fun removeAccents(value: String?): String? {
        if (MAP_NORM == null || MAP_NORM!!.size == 0) {
            MAP_NORM['À'] = 'A'
            MAP_NORM['Á'] = 'A'
            MAP_NORM['Ả'] = 'A'
            MAP_NORM['Ã'] = 'A'
            MAP_NORM['Ạ'] = 'A'

            MAP_NORM['Ă'] = 'A'
            MAP_NORM['Ằ'] = 'A'
            MAP_NORM['Ắ'] = 'A'
            MAP_NORM['Ẳ'] = 'A'
            MAP_NORM['Ẵ'] = 'A'
            MAP_NORM['Ặ'] = 'A'

            MAP_NORM['Â'] = 'A'
            MAP_NORM['Ầ'] = 'A'
            MAP_NORM['Ấ'] = 'A'
            MAP_NORM['Ẩ'] = 'A'
            MAP_NORM['Ẫ'] = 'A'
            MAP_NORM['Ậ'] = 'A'

            MAP_NORM['È'] = 'E'
            MAP_NORM['É'] = 'E'
            MAP_NORM['Ẻ'] = 'E'
            MAP_NORM['Ẽ'] = 'E'
            MAP_NORM['Ẹ'] = 'E'

            MAP_NORM['Ê'] = 'E'
            MAP_NORM['Ề'] = 'E'
            MAP_NORM['Ế'] = 'E'
            MAP_NORM['Ể'] = 'E'
            MAP_NORM['Ễ'] = 'E'
            MAP_NORM['Ệ'] = 'E'

            MAP_NORM['Ỳ'] = 'Y'
            MAP_NORM['Ý'] = 'Y'
            MAP_NORM['Ỷ'] = 'Y'
            MAP_NORM['Ỹ'] = 'Y'
            MAP_NORM['Ỵ'] = 'Y'

            MAP_NORM['Ì'] = 'I'
            MAP_NORM['Í'] = 'I'
            MAP_NORM['Ỉ'] = 'I'
            MAP_NORM['Ĩ'] = 'I'
            MAP_NORM['Ị'] = 'I'

            MAP_NORM['Ù'] = 'U'
            MAP_NORM['Ú'] = 'U'
            MAP_NORM['Ủ'] = 'U'
            MAP_NORM['Ũ'] = 'U'
            MAP_NORM['Ụ'] = 'U'

            MAP_NORM['Ư'] = 'U'
            MAP_NORM['Ừ'] = 'U'
            MAP_NORM['Ứ'] = 'U'
            MAP_NORM['Ử'] = 'U'
            MAP_NORM['Ữ'] = 'U'
            MAP_NORM['Ự'] = 'U'

            MAP_NORM['Ò'] = 'O'
            MAP_NORM['Ó'] = 'O'
            MAP_NORM['Ỏ'] = 'O'
            MAP_NORM['Õ'] = 'O'
            MAP_NORM['O'] = 'O'

            MAP_NORM['Ô'] = 'O'
            MAP_NORM['Ồ'] = 'O'
            MAP_NORM['Ố'] = 'O'
            MAP_NORM['Ổ'] = 'O'
            MAP_NORM['Ỗ'] = 'O'
            MAP_NORM['Ộ'] = 'O'

            MAP_NORM['Ơ'] = 'O'
            MAP_NORM['Ờ'] = 'O'
            MAP_NORM['Ớ'] = 'O'
            MAP_NORM['Ở'] = 'O'
            MAP_NORM['Ỡ'] = 'O'
            MAP_NORM['Ợ'] = 'O'


            MAP_NORM['Đ'] = 'D'
            MAP_NORM['Ä'] = 'A'
            MAP_NORM['Ë'] = 'E'
            MAP_NORM['Ï'] = 'I'
            MAP_NORM['Ü'] = 'U'
            MAP_NORM['Ö'] = 'O'
        }
        if (value == null) {
            return ""
        }
        val sb = StringBuilder(value)
        for (i in 0 until value.length) {
            val c = MAP_NORM!![sb[i]]
            if (c != null) {
                sb.setCharAt(i, c.toChar())
            }
        }
        return sb.toString()
    }
}