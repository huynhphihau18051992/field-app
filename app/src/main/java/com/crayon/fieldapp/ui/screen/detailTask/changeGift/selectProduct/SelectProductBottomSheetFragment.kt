package com.crayon.fieldapp.ui.screen.detailTask.changeGift.selectProduct

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.SelectProductRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder.dialog.EditPriceProductDialog

class SelectProductBottomSheetFragment() : DialogFragment() {
    lateinit var rvProudct: RecyclerView
    lateinit var btnConfirm: Button

    lateinit var mProductAdapter: SelectProductRVAdapter
    lateinit var mLayoutManager: RecyclerView.LayoutManager


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_select_product, container, false).apply {
            rvProudct = findViewById(R.id.rv_product)
            btnConfirm = findViewById(R.id.btn_update)

            btnConfirm.setOnClickListener {
                this@SelectProductBottomSheetFragment.dismiss()
            }

            this@SelectProductBottomSheetFragment.activity?.let { activity ->
                mProductAdapter =
                    SelectProductRVAdapter(arrayListOf(
                        "Dầu gội Clear 350ml",
                        "Lăn khử mùi",
                        "Bình giữ nhiệt kháng khuẩn",
                        "Khăn tắm cao cấp",
                        "Lốc sữa tiệt trùng",
                        "Bánh gạo",
                        "Dầu ăn Tường An",
                        "Sữa chua Vinamilk",
                        "Dầu xả Sunsilk"
                    ), activity, {
                        // Edit
                        var dialog = EditPriceProductDialog()
                        dialog.show(activity.supportFragmentManager, dialog.tag)
                    }, {

                    })
                mLayoutManager = LinearLayoutManager(activity)
                rvProudct.setLayoutManager(mLayoutManager)
                rvProudct.adapter = mProductAdapter
            }
        }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true)
            val window = dialog.window
            val wlp = window!!.attributes
            wlp.gravity = Gravity.BOTTOM
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }
    }

}