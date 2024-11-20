package com.crayon.fieldapp.ui.screen.main

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.google.android.gms.maps.model.LatLng
import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.BuildConfig
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.data.remote.response.VersionApp
import com.crayon.fieldapp.data.repository.UserRepository
import com.crayon.fieldapp.ui.base.BaseViewModel
import com.crayon.fieldapp.utils.Event
import com.crayon.fieldapp.utils.Resource
import io.nlopez.smartlocation.SmartLocation
import kotlinx.coroutines.launch

class MainViewModel(
    private val userRepository: UserRepository,
    private val dispatchers: AppDispatchers,
    private val context: Context,
    private val pref: PrefHelper
) : BaseViewModel() {
    private val _isUpdateVersion = MediatorLiveData<Event<Resource<List<VersionApp>>>>()
    val isUpdateVersion: LiveData<Event<Resource<List<VersionApp>>>> get() = _isUpdateVersion

    fun checkVersionApp() {
        viewModelScope.launch {
            _isUpdateVersion.postValue(Event(Resource.loading(null)))
            try {
                val result = userRepository.getVersionApp()
                _isUpdateVersion.postValue(Event(Resource.success(result.data)))
            } catch (e: Exception) {
                onLoadFail(e)
            }
        }
    }


    fun fetchCurrentLocation() {
        SmartLocation.with(context).location()
            .oneFix()
            .start {
                pref.setCurrentLocation(LatLng(it.latitude, it.longitude))
            }
    }
}