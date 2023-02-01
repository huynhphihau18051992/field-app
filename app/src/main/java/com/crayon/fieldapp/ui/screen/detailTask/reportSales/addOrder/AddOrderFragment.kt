package com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentContactBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.SelectProductRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.addOrder.dialog.EditPriceProductDialog
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_add_order.*
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddOrderFragment : BaseFragment<FragmentContactBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_add_order
    override val viewModel: ChangeGiftViewModel by viewModel()
    private lateinit var mProductAdapter: SelectProductRVAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        mProductAdapter =
//            SelectProductRVAdapter(
//                arrayListOf(), requireContext(), {
//                    // Price click
//                    val dialog = EditPriceProductDialog(it)
//                    dialog.show(requireActivity().supportFragmentManager, dialog.tag)
//                }, {
//                    // Item click
//                })
//
//        rv_product.apply {
//            layoutManager = LinearLayoutManager(context)
//            this.adapter = mProductAdapter
//        }
    }

}