package com.crayon.fieldapp.ui.screen.monitor.changeGift.detailTask

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.CustomerResponse
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentDetailChangeGiftAtStoreBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.CustomerRVAdapter
import com.crayon.fieldapp.utils.formatStartEndFullDate
import com.crayon.fieldapp.utils.setSingleClick
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_detail_change_gift_at_store.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailChangeGiftAtStoreFragment() :
    BaseFragment<FragmentDetailChangeGiftAtStoreBinding, DetailChangeGiftAtStoreViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_detail_change_gift_at_store

    private var task: String? = null
    private var taskResponse: TaskResponse? = null
    private var mCompetitorAdapter: CustomerRVAdapter? = null
    private var listCustomer: ArrayList<CustomerResponse> = arrayListOf()

    override val viewModel: DetailChangeGiftAtStoreViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        task = requireArguments().get("task").toString()
        taskResponse = Gson().fromJson(task, TaskResponse::class.java)
        taskResponse?.customerBills?.let { mCustomers ->
            listCustomer.addAll(
                mCustomers.map {
                    CustomerResponse(
                        createdAt = it.createdAt,
                        updatedAt = it.updatedAt,
                        name = it.customer?.name,
                        mobileNumber = it.customer?.mobileNumber
                    )
                }
            )
        }

        mCompetitorAdapter =
            CustomerRVAdapter(
                listCustomer, requireContext(), false,
                onItemClick = {
                    val bundle = bundleOf(
                        "isEdit" to false,
                        "taskId" to taskResponse?.id.toString(),
                        "projectId" to taskResponse?.project?.id.toString(),
                        "customerInfo" to Gson().toJson(it)
                    )
                    findNavController().navigate(
                        R.id.action_detail_changeGift_to_detail_customer,
                        bundle
                    )
                })

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().popBackStack()
        }

        taskResponse?.let {
            it.project?.let {
                txt_project_name?.text = it.name.toString()
            }
            it.store?.let {
                txt_address?.text = it.address.toString()
            }

            it.job?.let { job ->
                if (job.startTime != null && job.endTime != null) {
                    txt_time?.text = formatStartEndFullDate(job.startTime!!, job.endTime!!)
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


        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mCompetitorAdapter
        }

    }
}