package com.crayon.fieldapp.ui.screen.monitor.reportCompetitor.detailTask

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentDetailReportCompetitorAtStoreBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor.adapter.ReportCompetitorRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_detail_attendance_at_store.imb_ic_back
import kotlinx.android.synthetic.main.fragment_detail_report_competitor_at_store.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailReportCompetitorAtStoreFragment() :
    BaseFragment<FragmentDetailReportCompetitorAtStoreBinding, DetailReportCompetitorAtStoreViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_detail_report_competitor_at_store

    private var task: String? = null
    private var taskResponse: TaskResponse? = null

    override val viewModel: DetailReportCompetitorAtStoreViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        task = requireArguments().get("task").toString()
        // TODO
//        taskResponse = Gson().fromJson(task, TaskResponse::class.java)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        imb_ic_back.setSingleClick {
            findNavController().popBackStack()
        }

//        taskResponse?.let {
//            it.attachments?.let {
//                tv_num_image.text = it.size.toString()
//                if (it.size > 0) {
//                    if (it.size == 1) {
//                        it.get(0).createdAt?.toDate("yyyy-MM-dd'T'HH:mm")?.let {
//                            txt_start_date.text = TimeFormatUtils.formatHour(it)
//                            txt_end_time.text = TimeFormatUtils.formatHour(it)
//                        }
//                    } else {
//                        it.get(0).createdAt?.toDate("yyyy-MM-dd'T'HH:mm")?.let {
//                            txt_start_date.text = TimeFormatUtils.formatHour(it)
//                        }
//                        it.last().createdAt?.toDate("yyyy-MM-dd'T'HH:mm")?.let {
//                            txt_end_time.text = TimeFormatUtils.formatHour(it)
//                        }
//                    }
//                }
//            }
//
//            txt_project_name.text = it.project!!.name
//            it.pic?.let {
//                txt_pic_name.text = it.lastName + " " + it.firstName
//            }
//            txt_shift.text =
//                formatHour(it.job!!.startTime.toString()) + "-" + formatHour(it.job!!.endTime.toString())
//            txt_status.text = it.status
//            tv_title.text = it.store!!.name
//
//            var listUrl = ArrayList<MediaData>()
//            it.attachments?.forEach {
//                if (it.type!!.contains("video")) {
//                    listUrl.add(
//                        MediaData(
//                            it.id,
//                            it.thumbnailUrl.toString(),
//                            it.imageUrl.toString(),
//                            MediaAdapter.MEDIA_VIDEO,
//                            it.note,
//                            false
//                        )
//                    )
//                } else {
//                    listUrl.add(
//                        MediaData(
//                            it.id,
//                            it.thumbnailUrl.toString(),
//                            it.imageUrl.toString(),
//                            MediaAdapter.MEDIA_IMAGE,
//                            it.note,
//                            false
//                        )
//                    )
//                }
//            }
//        }

        val mCompetitorAdapter =
            ReportCompetitorRVAdapter(arrayListOf("1", "2", "3"), requireContext(), {
                // Item
            })

        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mCompetitorAdapter
        }

    }

//    private fun toProjectDetail(id: String) {
//        val bundel = bundleOf("projectId" to id, "agencyId" to agencyId)
//        findNavController().navigate(R.id.to_detail_project, bundel)
//    }

}