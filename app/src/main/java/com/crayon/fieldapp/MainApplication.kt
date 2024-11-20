package com.crayon.fieldapp

import android.app.Application
import android.util.Log
import com.crayon.fieldapp.di.appModules
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

    companion object {
        const val TAG_WORK_NAME = "Upload loation"
    }
}