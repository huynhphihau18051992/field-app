package com.crayon.fieldapp.ui.screen.detailTask.reportSales

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentReportSalesBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.OrderRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_change_gift.*
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import org.koin.androidx.viewmodel.ext.android.viewModel

class ReportSalesFragment :
    BaseFragment<FragmentReportSalesBinding, ReportSalesViewModel>() {

    override val layoutId: Int = R.layout.fragment_report_sales
    override val viewModel: ReportSalesViewModel by viewModel()
    private lateinit var mOrderAdatper: OrderRVAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rl_empty.visibility = View.GONE
        rv_customer.visibility = View.VISIBLE

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_add_customer?.setSingleClick {
            findNavController().navigate(
                R.id.action_reportSalesFragment_to_addOrderFragment
            )
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mOrderAdatper = OrderRVAdapter(arrayListOf("1", "2", "3"), requireContext(), {
            findNavController().navigate(
                R.id.action_reportSalesFragment_to_detailOrderFragment
            )
        })

        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mOrderAdatper
        }
    }
}