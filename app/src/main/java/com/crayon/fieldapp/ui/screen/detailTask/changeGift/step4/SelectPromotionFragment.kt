package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentSelectPromotionBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.selectProduct.SelectProductBottomSheetFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.adapter.SelectPromotionRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import kotlinx.android.synthetic.main.fragment_detail_customer.*
import kotlinx.android.synthetic.main.fragment_detail_customer.rv_page
import kotlinx.android.synthetic.main.fragment_select_promotion.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class SelectPromotionFragment(val onNextClick: (String) -> Unit = {}) :
    BaseFragment<FragmentSelectPromotionBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_select_promotion
    override val viewModel: ChangeGiftViewModel by viewModel()
    private lateinit var mDetailRVAdapter: SelectPromotionRVAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        mDetailRVAdapter = SelectPromotionRVAdapter(
            arrayListOf("1", "2", "3"),
            arrayListOf("1", "2", "3"),
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
            onNextClick("")
        }
    }
}