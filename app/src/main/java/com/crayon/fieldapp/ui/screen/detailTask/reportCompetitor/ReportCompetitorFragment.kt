package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentReportCompetitorBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter
import com.crayon.fieldapp.ui.screen.imageDialog.ImageDialog
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_change_gift.*
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import kotlinx.android.synthetic.main.fragment_input_bill.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ReportCompetitorFragment :
    BaseFragment<FragmentReportCompetitorBinding, ReportCompetitorViewModel>() {

    override val layoutId: Int = R.layout.fragment_report_competitor
    override val viewModel: ReportCompetitorViewModel by viewModel()
    private lateinit var mCompetitorAdapter: ReportCompetitorRVAdapter
    private lateinit var taskId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()

        mCompetitorAdapter =
            ReportCompetitorRVAdapter(arrayListOf(), requireContext(), {
                // Item
            }, {
                // Image
                val imageDialog = ImageDialog(
                    title = "",
                    imageUrl = ""
                )
                imageDialog.show(childFragmentManager, imageDialog.tag)
            })

        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mCompetitorAdapter
        }
        viewModel.getReportOpponents(taskId)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rl_empty.visibility = View.VISIBLE
        rv_customer.visibility = View.GONE

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

        viewModel.reportOpponents.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            val items = it.data
                            items?.let {
                                if (items.size > 0) {
                                    rl_empty.visibility = View.GONE
                                    rv_customer.visibility = View.VISIBLE
                                    mCompetitorAdapter.addItems(items)
                                } else {
                                    rl_empty.visibility = View.VISIBLE
                                    rv_customer.visibility = View.GONE
                                }
                            }
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