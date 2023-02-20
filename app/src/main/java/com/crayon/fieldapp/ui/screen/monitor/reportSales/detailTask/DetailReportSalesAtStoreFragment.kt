package com.crayon.fieldapp.ui.screen.monitor.reportSales.detailTask

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentDetailReportSalesAtStoreBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.monitor.reportSales.detailTask.adapter.ManageOrderRVAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.formatStartEndFullDate
import com.crayon.fieldapp.utils.setSingleClick
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_detail_report_sales_at_store.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailReportSalesAtStoreFragment() :
    BaseFragment<FragmentDetailReportSalesAtStoreBinding, DetailReportSalesAtStoreViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_detail_report_sales_at_store

    private var task: String? = null
    private var taskResponse: TaskResponse? = null
    private var mOrderAdapter: ManageOrderRVAdapter? = null
    override val viewModel: DetailReportSalesAtStoreViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        task = requireArguments().get("task").toString()
        taskResponse = Gson().fromJson(task, TaskResponse::class.java)

        mOrderAdapter =
            ManageOrderRVAdapter(arrayListOf(), requireContext(), {
                // Item
                val bundel = bundleOf("order" to Gson().toJson(it))
                findNavController().navigate(
                    R.id.action_detail_reportSales_to_detail_order,
                    bundel
                )
            })

        taskResponse?.let {
            viewModel.fetchOrders(it.id.toString())
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        imb_ic_back.setSingleClick {
            findNavController().popBackStack()
        }

        taskResponse?.let {
            it.project?.let {
                txt_project_name?.text = it.name.toString()
            }
            it.store?.let {
                txt_address?.text = it.address.toString()
                tv_title?.text = it.name.toString()
            }
            it.job?.let {
                if (it.startTime != null && it.endTime != null) {
                    txt_time?.text = formatStartEndFullDate(it.startTime!!, it.endTime!!)
                }
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
        viewModel.orders.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            txt_num_customer?.text = it.size.toString() + " đơn hàng"
                            if (it.size == 0) {
                                rl_empty.visibility = View.VISIBLE
                                rv_order.visibility = View.GONE
                            } else {

                                rl_empty.visibility = View.GONE
                                rv_order.visibility = View.VISIBLE
                                mOrderAdapter?.addAll(it as ArrayList<OrderResponse>)
                            }
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })


        rv_order.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mOrderAdapter
        }

    }
}