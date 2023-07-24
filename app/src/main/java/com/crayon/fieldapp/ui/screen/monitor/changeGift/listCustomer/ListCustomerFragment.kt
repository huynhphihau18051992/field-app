package com.crayon.fieldapp.ui.screen.monitor.changeGift.listCustomer

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentListCustomerBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.monitor.changeGift.listCustomer.adapter.CustomerRVAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_list_customer.*
import kotlinx.android.synthetic.main.fragment_list_customer.imb_ic_back
import kotlinx.android.synthetic.main.fragment_list_customer.pb_loading
import kotlinx.android.synthetic.main.fragment_list_customer.rv_members
import kotlinx.android.synthetic.main.fragment_list_update_status_at_store.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListCustomerFragment() :
    BaseFragment<FragmentListCustomerBinding, ListCustomerViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_list_customer

    private var mAdapter: CustomerRVAdapter? = null
    override val viewModel: ListCustomerViewModel by viewModel()
    var agencyId: String? = null
    var projectId: String? = null
    var startDate: String? = null
    var endDate: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        agencyId = requireArguments().get("agencyId").toString()
        projectId = requireArguments().get("projectId").toString()
        startDate = requireArguments().get("startDate").toString()
        endDate = requireArguments().get("endDate").toString()

        mAdapter = CustomerRVAdapter(
            arrayListOf(),
            requireContext(),
            itemClickListener = {
            }
        )
        viewModel.getProjectSummary(
            agencyId = agencyId.toString(),
            projectId = projectId.toString(),
            startDate = startDate.toString(),
            endDate = endDate.toString()
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_members.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mAdapter
        }

        imb_ic_back.setSingleClick {
            findNavController().popBackStack()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.apply {
            summary.observe(viewLifecycleOwner, Observer {
                it.getContentIfNotHandled()?.let {
                    when (it.status) {
                        Status.LOADING -> {
                            pb_loading.visibility = View.VISIBLE
                        }
                        Status.SUCCESS -> {
                            pb_loading.visibility = View.GONE
                            rv_members.visibility = View.VISIBLE
                            it.data?.let { mListTasks ->
                                mAdapter?.addAll(mListTasks)
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
}