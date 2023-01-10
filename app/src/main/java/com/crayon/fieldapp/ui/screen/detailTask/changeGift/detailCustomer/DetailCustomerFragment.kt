package com.crayon.fieldapp.ui.screen.detailTask.changeGift.detailCustomer

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentContactBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.DetailCustomerRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import kotlinx.android.synthetic.main.fragment_detail_customer.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailCustomerFragment : BaseFragment<FragmentContactBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_customer
    override val viewModel: ChangeGiftViewModel by viewModel()
    private lateinit var mDetailRVAdapter: DetailCustomerRVAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        mDetailRVAdapter = DetailCustomerRVAdapter(
            arrayListOf("1", "2", "3"),
            arrayListOf("1", "2", "3"),
            arrayListOf("1", "2", "3"),
            requireContext(),
            {
            },
            {

            })

        rv_page.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mDetailRVAdapter
        }
    }
}