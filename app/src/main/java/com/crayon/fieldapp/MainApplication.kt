package com.crayon.fieldapp

import android.app.Application
import android.util.Log
import androidx.work.*
import com.crayon.fieldapp.di.appModules
import com.crayon.fieldapp.workers.UploadLocationWorker
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import java.util.concurrent.TimeUnit


class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidContext(this@MainApplication)
            modules(appModules)
        }
//        updateLocation()
    }

    fun updateLocation() {
        Log.d("AAAHAU", "updateLocation")
        val constraints: Constraints = Constraints.Builder().apply {
            setRequiredNetworkType(NetworkType.CONNECTED)
            setRequiresBatteryNotLow(true)
        }.build()

        val request: PeriodicWorkRequest = PeriodicWorkRequest.Builder(
            UploadLocationWorker::class.java,
            PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS,
            TimeUnit.MILLISECONDS,
            PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS,
            TimeUnit.MILLISECONDS
        )
            .setConstraints(constraints)
//            .setInitialDelay(2, TimeUnit.HOURS)
//            .setBackoffCriteria(BackoffPolicy.LINEAR, 1, TimeUnit.HOURS)
            .build()

        WorkManager.getInstance(applicationContext).enqueueUniquePeriodicWork(
            TAG_WORK_NAME,
            ExistingPeriodicWorkPolicy.REPLACE,
            request
        )
    }

    companion object {
        const val TAG_WORK_NAME = "Upload loation"
    }
}