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
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.ui.widgets.MoneyTextWatcher
import com.crayon.fieldapp.ui.widgets.NumericKeyBoardTransformationMethod
import com.crayon.fieldapp.utils.Utils
import kotlinx.android.synthetic.main.dialog_edit_price.view.*
import kotlinx.android.synthetic.main.dialog_edit_quantity.*

class EditQuantityProductDialog(
    val gift: ProductResponse,
    val onUpdateQuantityClick: (Int) -> Unit = {}
) : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_edit_quantity, container, false).apply {
            btn_cancel?.setOnClickListener {
                this@EditQuantityProductDialog.dismiss()
            }

            btn_update?.setOnClickListener {
                val newPrice = edt_price?.text.toString()
                onUpdateQuantityClick.invoke(newPrice.replace(",", "").toInt())
                this@EditQuantityProductDialog.dismiss()
            }
            edt_price?.addTextChangedListener(object : MoneyTextWatcher(edt_price) {

            })

            txt_product_name?.text = gift.name
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
            dialog.edt_price?.transformationMethod = NumericKeyBoardTransformationMethod()
            btn_cancel?.setOnClickListener {
                this@EditQuantityProductDialog.dismiss()
            }

            btn_update?.setOnClickListener {
                val newPrice = edt_price?.text.toString()
                onUpdateQuantityClick.invoke(newPrice.replace(",", "").toInt())
                this@EditQuantityProductDialog.dismiss()
            }
        }
    }

    override fun onStop() {
        super.onStop()
        Utils.hideKeyboard(requireActivity())
    }

}