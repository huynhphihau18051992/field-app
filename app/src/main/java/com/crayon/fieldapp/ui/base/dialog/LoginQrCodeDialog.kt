package com.crayon.fieldapp.ui.base.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.google.zxing.Result
import me.dm7.barcodescanner.zxing.ZXingScannerView


class LoginQrCodeDialog(val onResultQrCodeListener: (String) -> Unit = {}) : DialogFragment(),
    ZXingScannerView.ResultHandler {

    private var mScannerView: ZXingScannerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mScannerView = ZXingScannerView(getActivity())
        mScannerView?.setAspectTolerance(0.5f)
        mScannerView?.setAutoFocus(true)
        return mScannerView;
    }

    override fun onResume() {
        super.onResume()
        mScannerView!!.setResultHandler(this)
        mScannerView!!.startCamera()
    }

    override fun onPause() {
        super.onPause()
        mScannerView!!.stopCamera()
    }


    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false)
            val window = dialog.window
            val wlp = window!!.attributes
            wlp.gravity = Gravity.CENTER
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.WHITE))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }
    }

    override fun handleResult(rawResult: Result?) {
        val handler = Handler()
        handler.postDelayed(
            Runnable {
                mScannerView!!.resumeCameraPreview(this)
                rawResult?.let {
                    onResultQrCodeListener.invoke(it.text.toString())
                    dismiss()
                }
            },
            2000
        )
    }

}