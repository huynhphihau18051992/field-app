package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.addReport

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentContactBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.SelectProductRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_contact.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddReportFragment : BaseFragment<FragmentContactBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_add_report
    override val viewModel: ChangeGiftViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

}