package com.crayon.fieldapp.data.local.pref

import com.google.android.gms.maps.model.LatLng

interface PrefHelper {

    fun isFirstRun(): Boolean

    fun isLogin(): Boolean

    fun getToken(): String?

    fun getRefreshToken(): String?

    fun setToken(mToken: String)

    fun setRefreshToken(mToken: String)

    fun setCurrentLocation(current: LatLng)

    fun getCurrentLocation() : LatLng

    fun remove(key: String)

    fun clear()

}