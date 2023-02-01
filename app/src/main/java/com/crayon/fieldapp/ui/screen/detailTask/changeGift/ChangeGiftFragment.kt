package com.crayon.fieldapp.ui.screen.detailTask.changeGift

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.CustomerResponse
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.CustomerRVAdapter
import com.crayon.fieldapp.utils.PopupMenu
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.formatStartEndFullDate
import com.crayon.fieldapp.utils.setSingleClick
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_change_gift.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ChangeGiftFragment :
    BaseFragment<com.crayon.fieldapp.databinding.FragmentChangeGiftBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_change_gift
    override val viewModel: ChangeGiftViewModel by viewModel()
    private lateinit var mCustomerAdapter: CustomerRVAdapter
    private var taskId: String? = null
    private var jobJson: String? = null
    private var jobResponse: JobResponse? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
        jobJson = requireArguments().getString("job").toString()
        jobJson?.let {
            jobResponse = Gson().fromJson(it, JobResponse::class.java)
        }
        taskId?.let {
            viewModel.getListCustomer(it)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rl_empty.visibility = View.GONE
        rv_customer.visibility = View.VISIBLE

        jobResponse?.let {
            it.project?.let {
                txt_project_name?.text = it.name.toString()
            }
            it.store?.let {
                txt_address?.text = it.address.toString()
            }

            if (it.startTime != null && it.endTime != null) {
                txt_time?.text = formatStartEndFullDate(it.startTime!!, it.endTime!!)
            }
            it.status?.let {
                if (it.equals("Processing")) {
                    txt_staus?.text = "Đang chạy"
                    txt_staus?.setTextColor(
                        requireContext().resources.getColor(
                            R.color.colorAccent,
                            null
                        )
                    )
                    ic_status?.setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.colorAccent
                        ), android.graphics.PorterDuff.Mode.MULTIPLY
                    )
                } else {
                    txt_staus?.text = "Đã đóng"
                    txt_staus?.setTextColor(
                        requireContext().resources.getColor(
                            R.color.colorGray,
                            null
                        )
                    )
                    ic_status?.setColorFilter(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.colorAccent
                        ), android.graphics.PorterDuff.Mode.MULTIPLY
                    )
                }
            }
        }

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_add_customer?.setSingleClick {
            val isVerifyOtp = jobResponse?.project?.isVerifyOtp ?: false
            val projectId = jobResponse?.project?.id.toString()
            findNavController().navigate(
                R.id.action_changeGiftFragment_to_addCustomerFragment,
                bundleOf(
                    "taskId" to taskId, "isVerifyOtp" to isVerifyOtp,
                    "projectId" to projectId
                )
            )
        }

        imb_ic_filter?.setSingleClick {
            PopupMenu.showPopupMenuDashboard(requireView(), object : MenuCallback {
                override fun onImport() {
                    findNavController().navigate(
                        R.id.action_changeGiftFragment_to_importGiftFragment
                    )
                }

                override fun onExport() {
                    findNavController().navigate(
                        R.id.action_changeGiftFragment_to_exportGiftFragment
                    )
                }

            })
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mCustomerAdapter = CustomerRVAdapter(
            arrayListOf(), requireContext(),
            true, {

            }, {
                // Item
                val bundle = bundleOf("isEdit" to true)
                findNavController().navigate(
                    R.id.action_changeGiftFragment_to_detailCustomerFragment,
                    bundle
                )
            })

        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mCustomerAdapter
        }

        viewModel.customers.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            if (it.size == 0) {
                                txt_num_customer?.text = "0 khách hàng"
                                rl_empty.visibility = View.VISIBLE
                                rv_customer.visibility = View.GONE
                            } else {
                                txt_num_customer?.text = it.size.toString() + " khách hàng"
                                rl_empty.visibility = View.GONE
                                rv_customer.visibility = View.VISIBLE
                                mCustomerAdapter.addAll(it as ArrayList<CustomerResponse>)
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