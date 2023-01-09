package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentReportCompetitorBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_change_gift.*
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import org.koin.androidx.viewmodel.ext.android.viewModel

class ReportCompetitorFragment :
    BaseFragment<FragmentReportCompetitorBinding, ReportCompetitorViewModel>() {

    override val layoutId: Int = R.layout.fragment_report_competitor
    override val viewModel: ReportCompetitorViewModel by viewModel()
    private lateinit var mCompetitorAdapter: ReportCompetitorRVAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rl_empty.visibility = View.GONE
        rv_customer.visibility = View.VISIBLE

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_add_customer?.setSingleClick {
            findNavController().navigate(
                R.id.action_reportCompetitorFragment_to_addReportCompetitorFragment
            )
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mCompetitorAdapter =
            ReportCompetitorRVAdapter(arrayListOf("1", "2", "3"), requireContext(), {
                // Item
            })

        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mCompetitorAdapter
        }
    }
}