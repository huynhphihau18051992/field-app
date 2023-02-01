package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.databinding.FragmentSelectPromotionBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.selectProduct.SelectProductBottomSheetFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.adapter.SelectPromotionRVAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.Utils
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_select_promotion.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SelectPromotionFragment(val onNextClick: (String) -> Unit = {}) :
    BaseFragment<FragmentSelectPromotionBinding, SelectPromotionViewModel>() {

    override val layoutId: Int = R.layout.fragment_select_promotion
    override val viewModel: SelectPromotionViewModel by viewModel()
    private var taskId: String? = null
    private var _projectId: String? = null
    private var _products: ArrayList<ProductResponse> = arrayListOf()
    private var _billId: String? = null

    private lateinit var mDetailRVAdapter: SelectPromotionRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
        _projectId = requireArguments().getString("projectId")

        _projectId?.let {
            viewModel.getListProductAndPromotions(it)
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mDetailRVAdapter = SelectPromotionRVAdapter(
            promotion = arrayListOf(),
            gifts = arrayListOf(),
            context = requireContext(),
            onShowSelectProduct = { mPromotion ->
                val dialog = SelectProductBottomSheetFragment(
                    _products,
                    onSelectProductListener = { mProducts ->
                        mDetailRVAdapter.addAllProduct(mPromotion, mProducts)
                    })
                dialog.show(requireActivity().supportFragmentManager, dialog.tag)
            },
            onItemClick = {

            })


        rv_page.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mDetailRVAdapter
        }
        btn_complete?.setSingleClick {
            Utils.hideKeyboard(requireActivity())
            onNextClick("")
        }

        viewModel.productAndPromotion.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            mDetailRVAdapter.addItems(
                                mPromotion = it.first.data!!,
                                mGift = it.third.data!!
                            )
                            _products.clear()
                            _products.addAll(it.second.data!!)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })

        rv_page?.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            this.adapter = mDetailRVAdapter
        }
    }

    fun setBillId(mBillId: String) {
        this._billId = mBillId
    }
}