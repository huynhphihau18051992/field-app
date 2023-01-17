package com.crayon.fieldapp.workers

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.crayon.fieldapp.data.repository.TrackingRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.java.KoinJavaComponent.inject

class UploadLocationWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {
    val trackingRepository by inject(TrackingRepository::class.java)

    companion object {
        private const val TAG = "DownloadWorker"
    }

    override fun doWork(): Result {
        // Call api upload location
        GlobalScope.launch {
            try {
                trackingRepository.uploadLocation("1.9", "1.4")
            } catch (e: Exception) {
                // save to database
            }
        }

        Log.d(TAG, "WorkerResult.SUCCESS")
        return Result.success()
    }
}