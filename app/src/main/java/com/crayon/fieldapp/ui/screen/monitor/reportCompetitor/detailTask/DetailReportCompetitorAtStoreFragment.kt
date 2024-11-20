package com.crayon.fieldapp.ui.screen.monitor.reportCompetitor.detailTask

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentDetailReportCompetitorAtStoreBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailAttachment.image.ImageAdapter
import com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter
import com.crayon.fieldapp.ui.screen.imageDialog.ImageDialog
import com.crayon.fieldapp.ui.screen.videoDialog.VideoDialog
import com.crayon.fieldapp.utils.formatDate
import com.crayon.fieldapp.utils.formatHour
import com.crayon.fieldapp.utils.setSingleClick
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_detail_attendance_at_store.imb_ic_back
import kotlinx.android.synthetic.main.fragment_detail_report_competitor_at_store.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailReportCompetitorAtStoreFragment() :
    BaseFragment<FragmentDetailReportCompetitorAtStoreBinding, DetailReportCompetitorAtStoreViewModel>() {

    override val viewModel: DetailReportCompetitorAtStoreViewModel by viewModel()
    override val layoutId: Int
        get() = R.layout.fragment_detail_report_competitor_at_store

    private var task: String? = null
    private var taskResponse: TaskResponse? = null
    private var mCompetitorAdapter: ReportCompetitorRVAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        task = requireArguments().get("task").toString()
        taskResponse = Gson().fromJson(task, TaskResponse::class.java)
        mCompetitorAdapter = ReportCompetitorRVAdapter(arrayListOf(), requireContext(), {
            // Item
        }, onImageClick = { mMedia ->
            if (mMedia.type == ImageAdapter.MEDIA_IMAGE) {
                val imageDialog = ImageDialog(
                    title = mMedia.note ?: "",
                    imageUrl = mMedia.uri
                )
                imageDialog.show(childFragmentManager, imageDialog.tag)
            } else {
                val videoDialog = VideoDialog(
                    title = mMedia.note ?: "",
                    imageUrl = mMedia.uri
                )
                videoDialog.show(childFragmentManager, videoDialog.tag)
            }
        })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mCompetitorAdapter
        }

        imb_ic_back.setSingleClick {
            findNavController().popBackStack()
        }

        taskResponse?.let {
            it.project?.let {
                txt_project_name?.text = it.name.toString()
            }
            it.store?.let {
                tv_title?.text = it.name.toString()
                txt_address?.text = it.address.toString()
            }
            it.job?.let {
                txt_time?.text =
                    formatHour(it.startTime.toString()) + "-" + formatHour(it.endTime.toString()) + " ngày " + formatDate(
                        it.endTime.toString()
                    )
            }
            it.pic?.let {
                txt_pic?.text = it.lastName + " " + it.firstName
            }
            it.status?.let {
                txt_staus?.text = it
            }
            it.opponents?.let {
                mCompetitorAdapter?.addItems(it)
                txt_num_customer?.text = it.size.toString() + " hoạt động"
            }

        }
    }
}