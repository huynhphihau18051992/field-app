package com.crayon.fieldapp.ui.screen.detailTask.reportSales

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.data.remote.response.OrderResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.databinding.FragmentReportSalesBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.adapter.OrderRVAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.formatStartEndFullDate
import com.crayon.fieldapp.utils.setSingleClick
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_report_sales.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ReportSalesFragment :
    BaseFragment<FragmentReportSalesBinding, ReportSalesViewModel>() {

    override val layoutId: Int = R.layout.fragment_report_sales
    override val viewModel: ReportSalesViewModel by viewModel()
    private lateinit var mOrderAdatper: OrderRVAdapter
    private lateinit var taskId: String
    private var jobJson: String? = null
    private var jobResponse: JobResponse? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
        jobJson = requireArguments().getString("job").toString()
        jobJson?.let {
            jobResponse = Gson().fromJson(it, JobResponse::class.java)
        }

        mOrderAdatper = OrderRVAdapter(arrayListOf(
//            OrderResponse(
//                id = "1",
//                products = arrayListOf(
//                    ProductResponse(
//                        createdAt = "2023-02-01T17:12:14.479Z",
//                        updatedAt = "2023-02-01T17:12:14.479Z",
//                        id = "14",
//                        name = "Nước tương Tam Thái Tử",
//                        price = 12000,
//                        quantity = 3,
//                        product_code = "SP001",
//                        product_sku = "SKU001",
//                        project = "154"
//
//                    )
//                )
//            )
        ), requireContext(), onItemClickListener = {
            val order = Gson().toJson(it).toString()
            findNavController().navigate(
                R.id.action_reportSalesFragment_to_detailOrderFragment,
                bundleOf("order" to order)
            )
        }, onItemEditListener = {
            val order = Gson().toJson(it).toString()
            findNavController().navigate(
                R.id.action_reportSalesFragment_to_addOrderFragment,
                bundleOf(
                    "taskId" to taskId,
                    "projectId" to jobResponse?.project?.id.toString(),
                    "order" to order
                )
            )
        }, isEdit = true)

        viewModel.fetchOrders(taskId)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
            findNavController().navigate(
                R.id.action_reportSalesFragment_to_addOrderFragment,
                bundleOf("taskId" to taskId, "projectId" to jobResponse?.project?.id.toString())
            )
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mOrderAdatper
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
                            if (it.size == 0) {
                                rl_empty.visibility = View.VISIBLE
                                rv_customer.visibility = View.GONE
                            } else {
                                rl_empty.visibility = View.GONE
                                rv_customer.visibility = View.VISIBLE
                                mOrderAdatper.addAll(it as ArrayList<OrderResponse>)
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