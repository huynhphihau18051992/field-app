package com.crayon.fieldapp.ui.screen.detailTask.changeGift.selectProduct

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.SearchView
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.SelectProductRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder.dialog.EditPriceProductDialog
import com.crayon.fieldapp.utils.Utils
import com.crayon.fieldapp.utils.setSingleClick
import com.example.moviedb.utils.getQueryTextChangeStateFlow
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.dialog_select_product.*
import kotlinx.android.synthetic.main.dialog_select_product.cb_select_all
import kotlinx.android.synthetic.main.dialog_select_product.sv_product
import kotlinx.android.synthetic.main.fragment_add_order.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


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
                            if (newQuantity <= 0) {
                                newQuantity = 1
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

            dialog.cb_select_all?.setOnClickListener {
                val isChecked = dialog.cb_select_all.isChecked
                if (isChecked) {
                    mProductAdapter.selectAll()
                } else {
                    mProductAdapter.unSelectAll()
                }
            }
            dialog.btn_cancel?.setOnClickListener {
                dialog.dismiss()
            }

            val iconSearchClose = dialog.sv_product?.findViewById<ImageView>(R.id.search_close_btn)
            iconSearchClose?.setSingleClick {
                val et =
                    dialog.sv_product?.findViewById(com.crayon.fieldapp.R.id.search_src_text) as EditText
                et.setText("")
                dialog.sv_product?.setQuery("", false)
                mProductAdapter.refresh()
                Utils.hideKeyboard(requireActivity())
            }

            dialog.sv_product?.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
                androidx.appcompat.widget.SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    mProductAdapter.getFilter().filter(query.toString())
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    return true
                }

            })

            GlobalScope.launch {
                dialog.sv_product?.let {
                    it.getQueryTextChangeStateFlow()
                        .debounce(1000)
                        .filter { query ->
                            if (query.isEmpty()) {
                                return@filter false
                            } else {
                                return@filter true
                            }
                        }
                        .distinctUntilChanged()
                        .collect { result ->
                            withContext(Dispatchers.Main) {
//                            sv_product?.clearFocus()
                                mProductAdapter.getFilter().filter(result)
                            }
                        }
                }
            }

        }
    }

}