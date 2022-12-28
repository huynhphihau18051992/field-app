package com.crayon.fieldapp.utils

import android.content.Context
import android.graphics.*
import android.media.ExifInterface
import android.media.MediaScannerConnection
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import android.text.TextPaint
import android.text.TextUtils
import android.util.Log
import com.crayon.fieldapp.data.remote.response.TaskResponse
import studio.phillip.yolo.utils.TimeFormatUtils
import java.io.*
import java.text.SimpleDateFormat
import java.util.*


object BitmapUtils {
    /**
     * decode file to image with sample size
     *
     * @param file
     * @param sampleSize
     * @return
     */
    fun decodeFileSize(file: File, sampleSize: Int): Bitmap? {
        var fis: FileInputStream? = null
        try {
            // Decode with inSampleSize
            val o2 = BitmapFactory.Options()
            o2.inSampleSize = sampleSize
            o2.inPreferredConfig = Bitmap.Config.RGB_565

            fis = FileInputStream(file)
            return BitmapFactory.decodeStream(fis, null, o2)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            if (fis != null) {
                try {
                    fis.close()
                } catch (e: IOException) {
                    e.printStackTrace()
                }

            }
        }
        return null
    }

    /**
     * decode file to bitmap with max size
     *
     * @param photoFilePath
     * @param maxSize
     * @return
     */
    fun decodeFile(photoFilePath: String, maxSize: Int): Bitmap? {
        try {
            val file = File(photoFilePath)
            if (!file.exists()) {
            }
            val options = BitmapFactory.Options()
            if (maxSize != 0) {
                options.inJustDecodeBounds = true
                BitmapFactory.decodeFile(photoFilePath, options)

                // Calculate inSampleSize
                options.inSampleSize = calculateInSampleSize(options, maxSize, maxSize)
                // remove true
                options.inJustDecodeBounds = false
            }


            // get bitmap
            val bm = BitmapFactory.decodeFile(photoFilePath, options)

            // Read EXIF Data
            val exif = ExifInterface(photoFilePath)
            val orientString = exif.getAttribute(ExifInterface.TAG_ORIENTATION)
            val orientation =
                if (orientString != null) Integer.parseInt(orientString) else ExifInterface.ORIENTATION_NORMAL
            var rotationAngle = 0
            if (orientation == ExifInterface.ORIENTATION_ROTATE_90) rotationAngle = 90
            if (orientation == ExifInterface.ORIENTATION_ROTATE_180) rotationAngle = 180
            if (orientation == ExifInterface.ORIENTATION_ROTATE_270) rotationAngle = 270
            // Rotate Bitmap
            val matrix = Matrix()
            matrix.setRotate(
                rotationAngle.toFloat(),
                bm.width.toFloat() / 2,
                bm.height.toFloat() / 2
            )

            // return bitmap with rotate
            return Bitmap.createBitmap(bm, 0, 0, options.outWidth, options.outHeight, matrix, true)

        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return null
    }

    /**
     * calculate sample size
     *
     * @param options
     * @param reqWidth
     * @param reqHeight
     * @return
     */
    fun calculateInSampleSize(options: BitmapFactory.Options, reqWidth: Int, reqHeight: Int): Int {
        // Raw height and width of image
        val height = options.outHeight
        val width = options.outWidth
        var inSampleSize = 1

        if (height > reqHeight || width > reqWidth) {

            val halfHeight = height / 2
            val halfWidth = width / 2

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while (halfHeight / inSampleSize > reqHeight && halfWidth / inSampleSize > reqWidth) {
                inSampleSize *= 2
            }
        }

        return inSampleSize
    }

    /**
     * create temp file from bitmap
     *
     * @param context
     * @param bitmap
     * @param quality
     * @param name
     * @return
     */
    fun createImageFromBitmap(
        context: Context,
        bitmap: Bitmap,
        quality: Int? = null,
        name: String
    ): File {
        val bytes = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, quality ?: 100, bytes)

        val f = File(
            context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
                .toString() + File.separator + name + System.currentTimeMillis() + ".png"
        )
        var fo: BufferedOutputStream? = null
        try {
            f.createNewFile()
            // write the bytes in file
            fo = BufferedOutputStream(FileOutputStream(f))
            fo.write(bytes.toByteArray())

        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            if (fo != null) {
                try {
                    fo.close()
                } catch (e: IOException) {
                    e.printStackTrace()
                }

            }
        }
        return f
    }

    /**
     * delete temp file
     *
     * @param context
     */
    fun deleteImageTemp(context: Context) {
        val f = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        for (path in f!!.list()) {
            try {
                val file = File(
                    context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
                        .toString() + File.separator + path
                )
                val uri = Uri.fromFile(file)
                if (file.delete()) {
                    callBroadCast(context, uri)
                    deleteFileFromMediaStore(context, File(uri.path))
                }
            } catch (ex: Exception) {
            }

        }
    }

    /**
     * callBroadCast => not working with android 4.0
     *
     * @param context
     * @param uri
     */
    fun callBroadCast(context: Context, uri: Uri) {
        MediaScannerConnection.scanFile(
            context,
            arrayOf(uri.path),
            null
        ) { path, uri -> Log.e("AAA", "Scanned $path:") }
    }

    /**
     * delete file from media store
     *
     * @param context
     * @param file
     */
    fun deleteFileFromMediaStore(context: Context, file: File) {
        val contentResolver = context.contentResolver
        var canonicalPath: String
        try {
            canonicalPath = file.canonicalPath
        } catch (e: IOException) {
            canonicalPath = file.absolutePath
        }

        val uri = MediaStore.Files.getContentUri("external")
        val result = contentResolver.delete(
            uri,
            MediaStore.Files.FileColumns.DATA + "=?", arrayOf(canonicalPath)
        )
        if (result == 0) {
            val absolutePath = file.absolutePath
            if (absolutePath != canonicalPath) {
                contentResolver.delete(
                    uri,
                    MediaStore.Files.FileColumns.DATA + "=?", arrayOf(absolutePath)
                )
            }
        }
    }

    fun createImageFileToUpload(
        context: Context,
        originPath: String,
        type: String
    ): File? {
        if (TextUtils.isEmpty(originPath)) {
            return null
        }
        // reduce image size
        var bitmap = BitmapUtils.decodeFile(originPath, 200)

        if (bitmap == null) {
            return null
        }

        // get time
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val imageFileName = type + "_" + timeStamp

        // create the temp file to upload
        val childFile: File?
        childFile = BitmapUtils.createImageFromBitmap(context, bitmap, 50, imageFileName)
        if (childFile == null) {
            return null
        }
        bitmap = null
        return childFile
    }

    fun createImageFileToUpload(
        context: Context,
        originPath: String,
        mTask: TaskResponse,
        quality: Int,
        isTag: Boolean
    ): File? {
        if (TextUtils.isEmpty(originPath)) {
            return null
        }
        // reduce image size
        var bitmap = BitmapUtils.decodeFile(originPath, 0)

        if (bitmap == null) {
            return null
        }

        // get time
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
        val imageFileName = mTask.id + "_" + timeStamp

        // Add Server time - Address to Image
        // create the temp file to upload
        val childFile: File?
        if (!isTag) {
            childFile = BitmapUtils.createImageFromBitmap(context, bitmap, quality, imageFileName)
        } else {
            val mutableBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true)
            var time = TimeFormatUtils.formatUploadImage(Date()).toString()

            var address = "-"
            mTask.store?.let {
                it.address?.let {
                    address = getMax128SubString(it)
                }
            }
            var venue = mTask.store!!.name.toString()
            var textBitmap = addStampToImage(mutableBitmap, time, address, venue)
            childFile = createImageFromBitmap(context, textBitmap, quality, imageFileName)
        }

        if (childFile == null) {
            return null
        }
        // release bitmap
        bitmap = null
        return childFile
    }

    private fun addStampToImage(
        originalBitmap: Bitmap,
        time: String,
        address: String,
        venue: String
    ): Bitmap {
        val newBitmap = Bitmap.createBitmap(
            originalBitmap.width,
            originalBitmap.height, Bitmap.Config.ARGB_8888
        )

        val canvas = Canvas(newBitmap)
        canvas.drawColor(Color.TRANSPARENT)
        canvas.drawBitmap(originalBitmap, 0f, 0f, null)

        val pText = TextPaint(Paint.ANTI_ALIAS_FLAG)
        pText.color = Color.WHITE
        val size = determineMaxTextSize(address + venue + time, originalBitmap.width.toFloat())
        Log.d("AAA", "Size:" + size.toString())
        pText.textSize = size.toFloat()
        pText.setTextAlign(Paint.Align.RIGHT)

        val venueHeightWidth = Rect()
        pText.getTextBounds(venue, 0, venue.length, venueHeightWidth)
        val venueWidth = canvas.width - (venueHeightWidth.width() + 10)
        val venueHeight = canvas.height - (venueHeightWidth.height() + 30)
        canvas.drawText(
            venue, (venueWidth).toFloat(),
            (venueHeight).toFloat(),
            pText
        )

        val addressHeightWidth = Rect()
        pText.getTextBounds(venue, 0, venue.length, addressHeightWidth)
        val addressWidth = canvas.width - (addressHeightWidth.width() + 10)
        val addressHeight =
            canvas.height - (venueHeightWidth.height() + addressHeightWidth.height() + 30)
        canvas.drawText(
            address, (addressWidth).toFloat(),
            (addressHeight).toFloat(),
            pText
        )

        val timeHeightWidth = Rect()
        pText.getTextBounds(venue, 0, venue.length, timeHeightWidth)
        val timeWidth = canvas.width - timeHeightWidth.width() + 10
        val timeHeight =
            canvas.height - (addressHeightWidth.height() + venueHeightWidth.height() + timeHeightWidth.height() + 30)
        canvas.drawText(
            time, (timeWidth).toFloat(),
            (timeHeight).toFloat(),
            pText
        )

        return newBitmap
    }

    private fun getMax128SubString(strValue: String): String {
        var subString = "";
        if (strValue.length > 60) {
            subString = strValue.substring(0, 60) + "..."
        } else {
            subString = strValue
        }
        return subString
    }

    fun calculateTextSize(width: Int): Float {
        var textSize = 100f
        if (width <= 240) {
            textSize = 6f
        } else if (width <= 360) {
            textSize = 9f
        } else if (width <= 480) {
            textSize = 12f
        } else if (width <= 720) {
            textSize = 18f
        } else if (width <= 1080) {
            textSize = 30f
        } else if (width <= 1140) {
            textSize = 30f
        } else if (width <= 2160) {
            textSize = 50f
        } else if (width <= 4000) {
            textSize = 100f
        } else if (width <= 6000) {
            textSize = 150f
        } else if (width <= 8000) {
            textSize = 250f
        } else {
            textSize = 300f
        }
        return textSize
    }

    private fun determineMaxTextSize(str: String, maxWidth: Float): Int {
        var size = 0
        val paint = Paint()
        do {
            paint.textSize = (++size).toFloat()
        } while (paint.measureText(str) < maxWidth)
        return size
    }
}