package com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.crayon.fieldapp.R
import com.crayon.fieldapp.ui.widgets.MoneyTextWatcher
import kotlinx.android.synthetic.main.dialog_edit_price.view.*

class EditPriceProductDialog(val onItemClick: (String) -> Unit = {}) : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_edit_price, container, false).apply {
            btn_cancel?.setOnClickListener {
                this@EditPriceProductDialog.dismiss()
            }

            btn_update?.setOnClickListener {
                onItemClick.invoke("")
                this@EditPriceProductDialog.dismiss()
            }
            edt_price?.addTextChangedListener(object : MoneyTextWatcher(edt_price) {

            })

        }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true)
            val window = dialog.window
            val wlp = window!!.attributes
            wlp.gravity = Gravity.CENTER
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }
    }

}