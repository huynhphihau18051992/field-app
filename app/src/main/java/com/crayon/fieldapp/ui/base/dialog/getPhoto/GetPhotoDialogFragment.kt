package com.crayon.fieldapp.ui.base.dialog.getPhoto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.crayon.fieldapp.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class GetPhotoDialogFragment() : BottomSheetDialogFragment() {
    lateinit var btnCancel: TextView
    lateinit var btnGallery: TextView
    lateinit var btnCamera: TextView

    private var mListener: GetPhotoDialogListener? = null
    fun setListener(listener: GetPhotoDialogListener) {
        this.mListener = listener
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_pick_photo, container, false).apply {

            btnCancel = findViewById(R.id.btn_cancel)
            btnGallery = findViewById(R.id.btn_gallery)
            btnCamera = findViewById(R.id.btn_camera)

            btnCancel.setOnClickListener {
                this@GetPhotoDialogFragment.dismiss()
            }

            btnGallery.setOnClickListener {
                mListener?.selectFromGallery();
                this@GetPhotoDialogFragment.dismiss()
            }

            btnCamera.setOnClickListener {
                mListener?.selectFromCamera();
                this@GetPhotoDialogFragment.dismiss()
            }
        }

    interface GetPhotoDialogListener {
        fun selectFromGallery()
        fun selectFromCamera()
    }
}