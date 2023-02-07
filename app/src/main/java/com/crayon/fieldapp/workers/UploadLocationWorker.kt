package com.crayon.fieldapp.workers

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.crayon.fieldapp.data.repository.TrackingRepository
import io.nlopez.smartlocation.SmartLocation
import io.nlopez.smartlocation.location.config.LocationAccuracy
import io.nlopez.smartlocation.location.config.LocationParams
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.koin.java.KoinJavaComponent.inject


class UploadLocationWorker(val appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {
    val trackingRepository by inject(TrackingRepository::class.java)

    companion object {
        private const val TAG = "DownloadWorker"
    }

    override fun doWork(): Result {
        // Call api upload location
        Log.d("AAAHAU", "doWork")
        GlobalScope.launch {

            /*
            * Không work khi app ở background quá 30p
            * */

//            val mLocTrackingInterval = (1000 * 60 * 15).toLong() // 15p sec
//            val trackingDistance = 0f
//            val trackingAccuracy = LocationAccuracy.HIGH
//            val builder = LocationParams.Builder()
//                .setAccuracy(trackingAccuracy)
//                .setDistance(trackingDistance)
//                .setInterval(mLocTrackingInterval)
//            SmartLocation.with(appContext)
//                .location()
//                .oneFix()
//                .config(builder.build())
//                .start { mLocation ->
//                    runBlocking {
//                        Log.d(
//                            "AAAHAU",
//                            "location: " + mLocation.latitude.toString() + "/" + mLocation.latitude
//                        )
//                        try {
//                            trackingRepository.uploadLocation(
//                                mLocation.latitude.toString(),
//                                mLocation.longitude.toString()
//                            )
//                        } catch (e: java.lang.Exception) {
//                            Log.d("AAAHAU", e.message.toString())
//                        }
//
//                    }
//                }


        }

        Log.d(TAG, "WorkerResult.SUCCESS")
        return Result.success()
    }

}