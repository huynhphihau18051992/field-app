package com.crayon.fieldapp.ui.screen.videoDialog

import android.Manifest
import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.media.MediaPlayer.OnPreparedListener
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.view.*
import android.widget.MediaController
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.DialogFragment
import com.crayon.fieldapp.R
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.dialog_image.toolbar
import kotlinx.android.synthetic.main.dialog_image.tvNote
import kotlinx.android.synthetic.main.dialog_video.*


class VideoDialog(private var title: String, private val imageUrl: String) :
    DialogFragment() {

    private var downloadManager: DownloadManager? = null
    private var downloadImageId: Long = -1
    private var trackingStatusThread: Thread? = null

    @Volatile
    private var isDownloadCompleted = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_video, container, false).apply {
            activity?.let {
                downloadManager = it.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                it.registerReceiver(
                    onCompleted,
                    IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE)
                )
                it.registerReceiver(
                    onNotificationClicked,
                    IntentFilter(DownloadManager.ACTION_NOTIFICATION_CLICKED)
                )
            }
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        downloadManager =
            requireContext().getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

        pb_loading.visibility = View.VISIBLE
        toolbar.setNavigationIcon(resources.getDrawable(R.drawable.ic_left_arrow, null))
        toolbar.setNavigationOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                dismiss()
            }
        })
        tvNote.text = title
        val uri: Uri = Uri.parse(imageUrl)
        val mediaController = MediaController(requireContext())
        video_view.setVideoURI(uri)
        mediaController.show()
        video_view.setMediaController(mediaController)
        video_view.start()

        video_view.setOnPreparedListener(OnPreparedListener {
            pb_loading.visibility = View.GONE
        })

        video_view.setOnCompletionListener(OnCompletionListener {
            Toast.makeText(
                requireContext(),
                "Thank You...!!!",
                Toast.LENGTH_LONG
            ).show() // display a toast when an video is completed
            pb_loading.visibility = View.GONE
        })
        video_view.setOnErrorListener(MediaPlayer.OnErrorListener { mp, what, extra ->
            Toast.makeText(
                requireContext(),
                "Oops An Error Occur While Playing Video...!!!",
                Toast.LENGTH_LONG
            ).show()
            // display a toast when an error is occured while playing an video
            pb_loading.visibility = View.GONE
            false
        })

        imgSave?.setSingleClick {
            if (!verifyPermissions()) {
                return@setSingleClick
            }
            val fileName: String = imageUrl.substring(imageUrl.lastIndexOf('/') + 1)
            startDownload(Uri.parse(imageUrl), fileName)
        }
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {

            // Set gravity of dialog
            dialog.setCanceledOnTouchOutside(true)
            val window = dialog.window
            val wlp = window!!.attributes
            wlp.gravity = Gravity.CENTER
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            val lp = window.attributes

            // Set Over touch screen is transparent
            lp.dimAmount = 0.2f
            lp.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND
            dialog.window?.attributes = lp
        }
    }

    override fun onPause() {
        super.onPause()
        video_view?.stopPlayback()
    }

    override fun onDestroy() {
        super.onDestroy()
        activity?.let {
            it.unregisterReceiver(onCompleted)
            it.unregisterReceiver(onNotificationClicked)
            trackingStatusThread?.interrupt()
        }
    }

    private var onCompleted: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            isDownloadCompleted = true
            imgSave.isEnabled = true
            Toast.makeText(context, "Tải video thành công", Toast.LENGTH_LONG).show()
        }
    }

    private var onNotificationClicked: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
//            Toast.makeText(context, R.string.toast_download_noti_clicked, Toast.LENGTH_LONG).show()
        }
    }

    fun verifyPermissions(): Boolean {
        val permissionExternalMemory =
            ActivityCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            )
        if (permissionExternalMemory != PackageManager.PERMISSION_GRANTED) {
            val STORAGE_PERMISSIONS = arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE)
            ActivityCompat.requestPermissions(requireActivity(), STORAGE_PERMISSIONS, 1)
            return false
        }
        return true
    }

    private fun startDownload(uri: Uri, fileName: String) {
        isDownloadCompleted = false

        val request = DownloadManager.Request(uri)

        request.setTitle(fileName)
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DCIM, fileName);

        downloadImageId = downloadManager?.enqueue(request) ?: -1
        startDownloadStatusTracking(downloadImageId)

        imgSave?.isEnabled = false
    }

    private fun startDownloadStatusTracking(downloadImageId: Long) {
        trackingStatusThread = Thread {
            while (!isDownloadCompleted) {
                activity?.let {
                    it.runOnUiThread {
                        // todo
                    }
                    Thread.sleep(TRACKING_STATUS_DELAY)
                }

            }
        }
        trackingStatusThread?.start()
    }

    private fun getStatusMessage(downloadId: Long): String {

        val query = DownloadManager.Query()
        // set the query filter to our previously Enqueued download
        query.setFilterById(downloadId)

        // Query the download manager about downloads that have been requested.
        val cursor = downloadManager?.query(query)
        if (cursor?.moveToFirst() == true) {
            return downloadStatus(cursor)
        }
        return "NO_STATUS_INFO"
    }

    private fun downloadStatus(cursor: Cursor): String {

        // column for download  status
        val columnIndex = cursor.getColumnIndex(DownloadManager.COLUMN_STATUS)
        val status = cursor.getInt(columnIndex)
        // column for reason code if the download failed or paused
        val columnReason = cursor.getColumnIndex(DownloadManager.COLUMN_REASON)
        val reason = cursor.getInt(columnReason)

        var statusText = ""
        var reasonText = ""

        when (status) {
            DownloadManager.STATUS_FAILED -> {
                statusText = "STATUS_FAILED"
                reasonText = when (reason) {
                    DownloadManager.ERROR_CANNOT_RESUME -> "ERROR_CANNOT_RESUME"
                    DownloadManager.ERROR_DEVICE_NOT_FOUND -> "ERROR_DEVICE_NOT_FOUND"
                    DownloadManager.ERROR_FILE_ALREADY_EXISTS -> "ERROR_FILE_ALREADY_EXISTS"
                    DownloadManager.ERROR_FILE_ERROR -> "ERROR_FILE_ERROR"
                    DownloadManager.ERROR_HTTP_DATA_ERROR -> "ERROR_HTTP_DATA_ERROR"
                    DownloadManager.ERROR_INSUFFICIENT_SPACE -> "ERROR_INSUFFICIENT_SPACE"
                    DownloadManager.ERROR_TOO_MANY_REDIRECTS -> "ERROR_TOO_MANY_REDIRECTS"
                    DownloadManager.ERROR_UNHANDLED_HTTP_CODE -> "ERROR_UNHANDLED_HTTP_CODE"
                    DownloadManager.ERROR_UNKNOWN -> "ERROR_UNKNOWN"
                    else -> ""
                }
            }
            DownloadManager.STATUS_PAUSED -> {
                statusText = "STATUS_PAUSED"
                reasonText = when (reason) {
                    DownloadManager.PAUSED_QUEUED_FOR_WIFI -> "PAUSED_QUEUED_FOR_WIFI"
                    DownloadManager.PAUSED_UNKNOWN -> "PAUSED_UNKNOWN"
                    DownloadManager.PAUSED_WAITING_FOR_NETWORK -> "PAUSED_WAITING_FOR_NETWORK"
                    DownloadManager.PAUSED_WAITING_TO_RETRY -> "PAUSED_WAITING_TO_RETRY"
                    else -> ""
                }
            }
            DownloadManager.STATUS_PENDING -> statusText = "STATUS_PENDING"
            DownloadManager.STATUS_RUNNING -> statusText = "STATUS_RUNNING"
            DownloadManager.STATUS_SUCCESSFUL -> statusText = "STATUS_SUCCESSFUL"
        }

        return "Status: $statusText, $reasonText"
    }

    companion object {
        private const val SWIPE_THRESHOLD = 100
        private const val SWIPE_VELOCITY_THRESHOLD = 100
        private const val TRACKING_STATUS_DELAY = 500L
    }
}