package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
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
    private lateinit var mDetailRVAdapter: SelectPromotionRVAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mDetailRVAdapter = SelectPromotionRVAdapter(
            arrayListOf(),
            arrayListOf(),
            requireContext(),
            {
                // show product
                val dialog = SelectProductBottomSheetFragment()
                dialog.show(requireActivity().supportFragmentManager, dialog.tag)
            },
            {

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
                                mProducts = it.second.data!!
                            )
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })
    }
}