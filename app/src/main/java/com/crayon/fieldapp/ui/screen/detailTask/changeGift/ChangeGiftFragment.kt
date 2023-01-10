package com.crayon.fieldapp.ui.screen.detailTask.changeGift

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentChangeGiftBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.CustomerRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_change_gift.*
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import org.koin.androidx.viewmodel.ext.android.viewModel

class ChangeGiftFragment : BaseFragment<FragmentChangeGiftBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_change_gift
    override val viewModel: ChangeGiftViewModel by viewModel()
    private lateinit var mCustomerAdapter: CustomerRVAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rl_empty.visibility = View.GONE
        rv_customer.visibility = View.VISIBLE

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_add_customer?.setSingleClick {
            findNavController().navigate(
                R.id.action_changeGiftFragment_to_addCustomerFragment
            )
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mCustomerAdapter = CustomerRVAdapter(arrayListOf("1", "2", "3"), requireContext(), {
            // Edit
        }, {
            // Item
            findNavController().navigate(
                R.id.action_changeGiftFragment_to_detailCustomerFragment
            )
        })

        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mCustomerAdapter
        }
    }
}