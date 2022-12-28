package com.crayon.fieldapp.ui.base.dialog.filterStore

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
import com.example.moviedb.utils.getQueryTextChangeStateFlow
import kotlinx.android.synthetic.main.dialog_filter_store.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import studio.phillip.yolo.presentation.add.selectProject.adapter.FilterStoreRVAdapter

class FilterStoreDialog(
    val onFilterStoreDialogListener: (ArrayList<String>) -> Unit = {},
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
    private var listStore: ArrayList<ItemStore>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_filter_store, container, false).apply {
            rvAgency = findViewById(R.id.rv_store)
            btnChoose = findViewById(R.id.btn_choose)
            btnCancel = findViewById(R.id.btn_cancel)
            btnClearAll = findViewById(R.id.btn_clear_all)
            cbSelectAll = findViewById(R.id.cb_select_all)

            btnChoose.setOnClickListener {
                val stores = adapter.getSelectedItem()
                stores?.let {
                    onFilterStoreDialogListener(it as ArrayList<String>)
                }
                this@FilterStoreDialog.dismiss()
            }

            btnCancel.setOnClickListener {
                this@FilterStoreDialog.dismiss()
            }

            btnClearAll.setOnClickListener {
                onClearFilter.invoke()
                this@FilterStoreDialog.dismiss()
            }

            cbSelectAll.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    adapter?.selectAll()
                } else {
                    adapter?.clearAll()
                }
            }

            this@FilterStoreDialog.arguments?.let {
                listStore = it.getSerializable("store") as ArrayList<ItemStore>
                this@FilterStoreDialog.activity?.let {
                    listStore?.let { mList ->
                        adapter = FilterStoreRVAdapter(mList, it, {
                            if (it.isSelect) {
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

        }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        sv_store?.queryHint = "Tìm kiếm theo cửa hàng"
        sv_store?.setOnCloseListener {
            listStore?.let {
                adapter?.addAll(it)
            }
            true
        }
        setUpSearchStateFlow()
    }

    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true)
            val window = dialog.window
            val wlp = window!!.attributes
            wlp.gravity = Gravity.CENTER
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }
    }

    private fun setUpSearchStateFlow() {
        GlobalScope.launch {
            sv_store?.let {
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
                        sv_store?.clearFocus()
                        adapter.filter.filter(result.toString())
                    }
                }
            }
        }
    }
}