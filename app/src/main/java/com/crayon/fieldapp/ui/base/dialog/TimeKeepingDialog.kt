package com.crayon.fieldapp.ui.base.dialog

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.crayon.fieldapp.R

class TimeKeepingDialog : DialogFragment(),
    OnMapReadyCallback {
    lateinit var txtDistant: TextView

    lateinit var mMap: GoogleMap
    lateinit var mCurrent: LatLng
    lateinit var mStore: LatLng
    var mDistant: String = ""
    lateinit var mapFragment: SupportMapFragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_timekeeping, container, false).apply {
            txtDistant = findViewById(R.id.txt_distant)
            mapFragment =
                activity?.supportFragmentManager?.findFragmentById(R.id.mapFragment) as SupportMapFragment
            // Get arguments
            val arguments = this@TimeKeepingDialog.arguments
            arguments?.let {
                mCurrent =
                    LatLng(arguments.getDouble("current_lat"), arguments.getDouble("current_long"))
                mStore = LatLng(arguments.getDouble("store_lat"), arguments.getDouble("store_long"))
                mDistant = arguments.getString("distant").toString()

            }
            txtDistant.text =
                String.format(resources.getString(R.string.txt_invalid_distant), mDistant)

        }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mapFragment.getMapAsync(this@TimeKeepingDialog)
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
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.WHITE))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            val lp = window.attributes
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        val ft = activity?.supportFragmentManager?.beginTransaction()
        mapFragment?.let { ft?.remove(it) }
        ft?.commit()
    }

    override fun onMapReady(p0: GoogleMap?) {
        p0?.apply {
            mMap = this
            mMap.mapType = GoogleMap.MAP_TYPE_HYBRID

            var current = MarkerOptions()
            current.position(mCurrent)
            current.title("Current Position")
            current.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))

            val store = MarkerOptions()
            store.position(mStore)
            store.title("Store Position")
            store.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))

            mMap.addMarker(current)
            mMap.addMarker(store)

            val latLng = LatLng(mStore.latitude, mStore.longitude)
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 11f))
        }
    }
}