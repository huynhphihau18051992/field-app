package com.crayon.fieldapp.ui.screen.monitor.application.list

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentListManagementApplicationsBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.adapter.ManagementApplicationAdapter
import com.crayon.fieldapp.utils.Status
import kotlinx.android.synthetic.main.fragment_list_management_applications.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListManagementApplicationFragment :
    BaseFragment<FragmentListManagementApplicationsBinding, ListManagementApplicationViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_list_management_applications
    lateinit var agencyId: String
    lateinit var status: String

    override val viewModel: ListManagementApplicationViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        agencyId = requireArguments().get("agencyId").toString()
        status = requireArguments().get("status").toString()
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val adapter = ManagementApplicationAdapter(
            acceptClickListener = {
                viewModel.acceptApplicationRequest(agencyId, it.id.toString())
            },
            rejectClickListener = {
                viewModel.rejectApplicationRequest(agencyId, it.id.toString())
            }
        )

        rv_application.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapter
        }

        viewModel.apply {
            applications.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            adapter.submitList(it)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            })

            isAcceptSuccess.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        fetchData()
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })

            isRejectSuccess.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        fetchData()
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })
            fetchData()
        }
    }

    private fun fetchData() {
        viewModel.getManagementApplications(agencyId, status)
    }
}