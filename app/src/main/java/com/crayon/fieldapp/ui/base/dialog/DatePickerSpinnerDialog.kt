package com.crayon.fieldapp.ui.base.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import com.crayon.fieldapp.R

class DatePickerSpinnerDialog  : DialogFragment() {
    lateinit var picker: DatePicker
    lateinit var btnOk: Button
    lateinit var btnCancel: Button

    private var mListener: DatePickerDialogListener? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.custom_datepicker, container, false).apply {
            picker = findViewById(R.id.datePicker1)
            btnOk = findViewById(R.id.btn_ok)
            btnCancel = findViewById(R.id.btn_cancel)

            btnCancel.setOnClickListener {
                this@DatePickerSpinnerDialog.dismiss()
            }


            btnOk.setOnClickListener {
                mListener?.getDate(picker.dayOfMonth, picker.month, picker.year)
                this@DatePickerSpinnerDialog.dismiss()
            }
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
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.attributes = wlp
            window.setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        }
    }

    fun setListener(listener: DatePickerDialogListener) {
        this.mListener = listener
    }


    interface DatePickerDialogListener {
        fun getDate(date: Int, month: Int, year: Int)
    }
}
