package com.crayon.fieldapp.ui.screen.splash

import android.Manifest
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentSplashBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.utils.*
import kotlinx.coroutines.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashFragment : BaseFragment<FragmentSplashBinding, SplashViewModel>() {

    override val layoutId: Int = R.layout.fragment_splash

    override val viewModel: SplashViewModel by viewModel()

    private val activityScope = CoroutineScope(Dispatchers.Main)

    companion object {
        private val multiplePermissions = arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.ACCESS_FINE_LOCATION
        )

        const val CODE_REQUEST_PERMISSION_APP = 111
    }

    override fun onStart() {
        super.onStart()
        activityScope.launch {
            delay(1000)
            requestMultiplePermissionWithListener()
        }
    }

    override fun onStop() {
        activityScope.cancel()
        super.onStop()
    }

    private fun requestMultiplePermissionWithListener() {
        requestPermissions(
            multiplePermissions,
            CODE_REQUEST_PERMISSION_APP,
            object : RequestPermissionListener {
                override fun onPermissionRationaleShouldBeShown(requestPermission: () -> Unit) {
                    requireContext().showDialog(
                        "Yêu cầu quyền truy cập",
                        "Vui lòng cho phép tất cả các quyền truy cập để sử dụng Field App",
                        "Ok",
                        positiveListener = {
                            requireContext().openAppDetailSettings()
                        },
                        textNegative = "Cancel"
                    )
                }

                override fun onPermissionPermanentlyDenied(openAppSetting: () -> Unit) {
                    requireContext().showDialog(
                        "Yêu cầu quyền truy cập",
                        message = "Vui lòng chấp nhận tất cả các quyền truy cập để sử dụng Field App",
                        textPositive = "OK",
                        positiveListener = {
                            requireContext().openAppDetailSettings()
                        },
                        textNegative = "Cancel"
                    )
                }

                override fun onPermissionGranted() {
                    checkLogin()
                }
            }
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        handleOnRequestPermissionResult(
            CODE_REQUEST_PERMISSION_APP,
            requestCode,
            permissions,
            grantResults,
            object : PermissionResultListener {
                override fun onPermissionRationaleShouldBeShown() {
                    Toast.makeText(requireContext(), "Yêu cầu quyền truy cập", Toast.LENGTH_SHORT)
                        .show()
                }

                override fun onPermissionPermanentlyDenied() {
                    Toast.makeText(
                        requireContext(),
                        "Yêu cầu quyền truy cập",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onPermissionGranted() {
                    checkLogin()
                }
            }
        )
    }

    private fun checkLogin() {
        viewModel.checkLogin()
        viewModel.apply {
            isLogin.observe(viewLifecycleOwner, Observer {
                if (it) {
                    findNavController().navigate(R.id.to_main)
                } else {
                    findNavController().navigate(R.id.to_require)
                }
            })
        }
    }
}