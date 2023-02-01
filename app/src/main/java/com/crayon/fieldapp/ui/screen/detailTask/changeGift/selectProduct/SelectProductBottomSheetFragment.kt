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
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.SelectProductRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder.dialog.EditPriceProductDialog

class SelectProductBottomSheetFragment(
    val product: ArrayList<ProductResponse>,
    val onSelectProductListener: (ArrayList<ProductResponse>) -> Unit = {}
) : DialogFragment() {
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
                val allItemSelected = mProductAdapter.getAllItemSelected()
                onSelectProductListener(allItemSelected)
                this@SelectProductBottomSheetFragment.dismiss()
            }

            this@SelectProductBottomSheetFragment.activity?.let { activity ->
                mProductAdapter =
                    SelectProductRVAdapter(
                        items = product,
                        onItemSelectClick = { mProduct, isChecked ->
                            if (isChecked) {
                                mProductAdapter.selectItem(mProduct)
                            } else {
                                mProductAdapter.unSelectItem(mProduct)
                            }
                        },
                        onPriceClick = { mProduct ->
                            val dialog =
                                EditPriceProductDialog(mProduct, onUpdatePriceClick = { mPrice ->
                                    mProductAdapter.updatePrice(item = mProduct, price = mPrice)
                                })
                            dialog.show(requireActivity().supportFragmentManager, dialog.tag)
                        },
                        context = requireContext(),
                        onItemAddClick = { mProduct ->
                            var newQuantity = mProduct.quantity + 1
                            mProductAdapter.updateQuantity(mProduct, newQuantity)
                        },
                        onItemMinusClick = { mProduct ->
                            var newQuantity = mProduct.quantity - 1
                            if (newQuantity < 0) {
                                newQuantity = 0
                            }
                            mProductAdapter.updateQuantity(mProduct, newQuantity)
                        }
                    )

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