package com.crayon.fieldapp.ui.base.dialog.filterRole

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore
import studio.phillip.yolo.presentation.add.selectProject.adapter.FilterStoreRVAdapter

class FilterRoleDialog(
    val onFilterRoleDialogListener: (ArrayList<String>) -> Unit = {},
    val onClearFilter: () -> Unit = {}
) :
    DialogFragment() {
    lateinit var rvAgency: RecyclerView
    lateinit var btnChoose: Button
    lateinit var btnCancel: Button
    lateinit var btnClearAll: Button
    lateinit var cbSelectAll: CheckBox
    lateinit var adapter: FilterStoreRVAdapter
    lateinit var mLayoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_filter_role, container, false).apply {
            rvAgency = findViewById(R.id.rv_store)
            btnChoose = findViewById(R.id.btn_choose)
            btnCancel = findViewById(R.id.btn_cancel)
            btnClearAll = findViewById(R.id.btn_clear_all)
            cbSelectAll = findViewById(R.id.cb_select_all)

            btnChoose.setOnClickListener {
                val stores = adapter.getSelectedItem()
                stores?.let {
                    onFilterRoleDialogListener(it as ArrayList<String>)
                }
                this@FilterRoleDialog.dismiss()
            }

            btnCancel.setOnClickListener {
                this@FilterRoleDialog.dismiss()
            }

            btnClearAll.setOnClickListener {
                onClearFilter.invoke()
                this@FilterRoleDialog.dismiss()
            }

            cbSelectAll.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    adapter?.selectAll()
                } else {
                    adapter?.clearAll()
                }
            }

            this@FilterRoleDialog.arguments?.let {
                val items = it.getSerializable("role") as ArrayList<ItemStore>
                this@FilterRoleDialog.activity?.let {
                    adapter = FilterStoreRVAdapter(items, it, {
                        if(it.isSelect){
                            adapter.unSelectItem(it)
                        } else {
                            adapter.selectItem(it)
                        }
                    })
                    mLayoutManager = androidx.recyclerview.widget.LinearLayoutManager(it)
                    rvAgency.setLayoutManager(mLayoutManager)
                    rvAgency.adapter = adapter
                }

            }
        }

    interface FilterStoreListener {
        fun onFilterStoreResult(storeId: ArrayList<String>)
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
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
        }
    }
}