package com.crayon.fieldapp.data.local.pref

import android.content.Context
import androidx.core.content.edit
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson

class AppPrefs(
    context: Context,
    val gson: Gson
) : PrefHelper {

    companion object {
        private const val FIRST_RUN = "FIRST_RUN"
        private const val TOKEN = "TOKEN"
        private const val REFRESH_TOKEN = "REFRESH_TOKEN"
        private const val CURRENT_LOCATION_LAT = "CURRENT_LOCATION_LAT"
        private const val CURRENT_LOCATION_LNG = "CURRENT_LOCATION_LNG"
    }

    private val sharedPreferences = context.getSharedPreferences(
        context.packageName,
        Context.MODE_PRIVATE
    )

    override fun isFirstRun(): Boolean {
        val isFirstRun = sharedPreferences.getBoolean(FIRST_RUN, true)
        if (isFirstRun) {
            sharedPreferences.edit { putBoolean(FIRST_RUN, false) }
        }
        return isFirstRun
    }

    override fun isLogin(): Boolean {
        val token = getToken()
        if (token.isNullOrEmpty()) {
            return false
        }
        return true
    }

    override fun getToken(): String? {
        return sharedPreferences.getString(TOKEN, null)
    }

    override fun getRefreshToken(): String? {
        return sharedPreferences.getString(REFRESH_TOKEN, null)
    }

    override fun setToken(mToken: String) {
        sharedPreferences.edit { putString(TOKEN, mToken) }
    }

    override fun setRefreshToken(mToken: String) {
        sharedPreferences.edit { putString(REFRESH_TOKEN, mToken) }
    }

    override fun setCurrentLocation(current: LatLng) {
        sharedPreferences.edit { putString(CURRENT_LOCATION_LAT, current.latitude.toString()) }
        sharedPreferences.edit { putString(CURRENT_LOCATION_LNG, current.longitude.toString()) }
    }

    override fun getCurrentLocation(): LatLng {
        val lat = sharedPreferences.getString(CURRENT_LOCATION_LAT, "1.0").toString().toDouble()
        val lng = sharedPreferences.getString(CURRENT_LOCATION_LNG, "1.0").toString().toDouble()
        return LatLng(lat, lng)
    }

    override fun remove(key: String) {
        sharedPreferences.edit {
            remove(key)
        }
    }

    override fun clear() {
        sharedPreferences.edit { clear() }
    }
}