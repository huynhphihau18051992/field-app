package com.crayon.fieldapp.ui.screen.detailTask.changeGift.receiveGift

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.SearchView
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.databinding.FragmentImportGiftBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.receiveGift.adapter.ReceiveGiftAdapter
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.receiveGift.dialog.EditQuantityGiftDialog
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.Utils
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showMessageDialog
import com.example.moviedb.utils.getQueryTextChangeStateFlow
import kotlinx.android.synthetic.main.dialog_filter_store.*
import kotlinx.android.synthetic.main.fragment_add_order.*
import kotlinx.android.synthetic.main.fragment_import_gift.*
import kotlinx.android.synthetic.main.fragment_import_gift.imb_ic_back
import kotlinx.android.synthetic.main.fragment_import_gift.imb_ic_filter
import kotlinx.android.synthetic.main.fragment_import_gift.pb_loading
import kotlinx.android.synthetic.main.fragment_import_gift.rv_product
import kotlinx.android.synthetic.main.fragment_import_gift.sv_product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class ReceiveGiftFragment : BaseFragment<FragmentImportGiftBinding, ReceiveGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_import_gift
    override val viewModel: ReceiveGiftViewModel by viewModel()
    private lateinit var mGiftAdapter: ReceiveGiftAdapter
    private var _projectId: String? = null
    private var _taskId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _projectId = requireArguments()?.getString("projectId")
        _taskId = requireArguments()?.getString("taskId")

        mGiftAdapter =
            ReceiveGiftAdapter(arrayListOf(), requireContext(), onItemMinusListener = { mGift ->
                var quantity = mGift.selectQuantity - 1
                if (quantity < 0) {
                    quantity = 0
                }
                mGiftAdapter.onUpdateQuantity(mGift, quantity)
            }, onItemPlusListener = { mGift ->
                var quantity = mGift.selectQuantity + 1
                mGiftAdapter.onUpdateQuantity(mGift, quantity)
            }, onItemQuantityListener = { mGift ->
                val dialog =
                    EditQuantityGiftDialog(mGift, onUpdateQuantityClick = { mQuantity ->
                        mGiftAdapter.onUpdateQuantity(mGift, mQuantity)
                    })
                dialog.show(requireActivity().supportFragmentManager, dialog.tag)
            })
        _projectId?.let {
            viewModel.fetchGifts(projectId = it)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        imb_ic_filter?.setSingleClick {
            val gifts = mGiftAdapter.getSelectItems()
            if (gifts.size == 0) {
                requireContext().showMessageDialog(message = "Vui lòng chọn quà tặng")
                return@setSingleClick
            }
            _taskId?.let {
                viewModel.receiveGift(taskId = it, gift = gifts)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setUpSearchStateFlow()

        viewModel.updateGift.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            requireContext().showMessageDialog {
                                findNavController().navigateUp()
                            }
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })

        viewModel.gifts.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            mGiftAdapter.addAll(it as ArrayList<GiftResponse>)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })
        rv_product.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mGiftAdapter
        }
    }

    private fun setUpSearchStateFlow() {
        val iconSearchClose = sv_product?.findViewById<ImageView>(R.id.search_close_btn)
        iconSearchClose?.setSingleClick {
            val et = sv_product?.findViewById(com.crayon.fieldapp.R.id.search_src_text) as EditText
            et.setText("")
            sv_product?.setQuery("", false)
            mGiftAdapter.refresh()
            Utils.hideKeyboard(requireActivity())
        }

        sv_product?.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                mGiftAdapter.getFilter().filter(query.toString())
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })

        GlobalScope.launch {
            sv_product?.let {
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
                            mGiftAdapter.filter.filter(result.toString())
                        }
                    }
            }
        }
    }
}