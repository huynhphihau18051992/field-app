package com.crayon.fieldapp

import android.app.Application
import com.crayon.fieldapp.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidContext(this@MainApplication)
            modules(appModules)
        }
    }
}