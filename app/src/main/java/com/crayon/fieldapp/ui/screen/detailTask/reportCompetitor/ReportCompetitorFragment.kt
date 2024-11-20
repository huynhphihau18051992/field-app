package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.databinding.FragmentReportCompetitorBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.dialog.TimeKeepingDialog
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter
import com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter
import com.crayon.fieldapp.ui.screen.imageDialog.ImageDialog
import com.crayon.fieldapp.ui.screen.videoDialog.VideoDialog
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.formatStartEndFullDate
import com.crayon.fieldapp.utils.setSingleClick
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_report_competitor.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ReportCompetitorFragment :
    BaseFragment<FragmentReportCompetitorBinding, ReportCompetitorViewModel>() {

    override val layoutId: Int = R.layout.fragment_report_competitor
    override val viewModel: ReportCompetitorViewModel by viewModel()
    private lateinit var mCompetitorAdapter: ReportCompetitorRVAdapter
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

        mCompetitorAdapter =
            ReportCompetitorRVAdapter(arrayListOf(), requireContext(), {
                // Item
            }, {
                // Image
                if (it.type == MediaAdapter.MEDIA_IMAGE) {
                    val imageDialog = ImageDialog(
                        title = "",
                        imageUrl = it.uri
                    )
                    imageDialog.show(childFragmentManager, imageDialog.tag)
                } else {
                    val imageDialog = VideoDialog(
                        title = "",
                        imageUrl = it.uri
                    )
                    imageDialog.show(childFragmentManager, imageDialog.tag)
                }

            })

        viewModel.getReportOpponents(taskId)
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
                } else {
                    txt_staus?.text = "Đã đóng"
                    txt_staus?.setTextColor(
                        requireContext().resources.getColor(
                            R.color.colorGray,
                            null
                        )
                    )
                }
            }
        }

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_add_customer?.setSingleClick {
            jobResponse?.store?.let { store ->
                if (viewModel.verifyLocation(store)) {
                    findNavController().navigate(
                        R.id.action_reportCompetitorFragment_to_addReportCompetitorFragment,
                        bundleOf("taskId" to taskId.toString())
                    )
                } else {
                    val dialog = TimeKeepingDialog()
                    val bundle = Bundle()
                    viewModel.currentLocation?.let {
                        bundle.putDouble("current_lat", it.latitude)
                        bundle.putDouble("current_long", it.longitude)

                    }
                    bundle.putDouble("store_lat", store.lat ?: 0.0)
                    bundle.putDouble("store_long", store.lng ?: 0.0)
                    bundle.putString("distant", viewModel.strDistant)
                    dialog.arguments = bundle
                    dialog.show(childFragmentManager, dialog.tag)
                }
            }
        }

        rv_customer.apply {
            layoutManager = LinearLayoutManager(requireContext())
            this.adapter = mCompetitorAdapter
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<Boolean>("isNew")
            ?.observe(viewLifecycleOwner, Observer { isNew ->
                if (isNew) {
                    taskId?.let {
                        viewModel.getReportOpponents(it)
                    }
                }
            })


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