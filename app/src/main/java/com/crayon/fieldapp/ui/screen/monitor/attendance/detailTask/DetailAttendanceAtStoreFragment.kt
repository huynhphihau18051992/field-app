package com.crayon.fieldapp.ui.screen.monitor.attendance.detailTask

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentDetailAttendanceAtStoreBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailAttachment.image.ImageAdapter
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import com.crayon.fieldapp.ui.screen.imageDialog.ImageDialog
import com.crayon.fieldapp.utils.formatHour
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.toDate
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_detail_attendance_at_store.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import studio.phillip.yolo.utils.TimeFormatUtils

class DetailAttendanceAtStoreFragment() :
    BaseFragment<FragmentDetailAttendanceAtStoreBinding, DetailAttendacneAtStoreViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_detail_attendance_at_store

    private var task: String? = null
    private var taskResponse: TaskResponse? = null

    override val viewModel: DetailAttendacneAtStoreViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        task = requireArguments().get("task").toString()
        taskResponse = Gson().fromJson(task, TaskResponse::class.java)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        imb_ic_back.setSingleClick {
            findNavController().popBackStack()
        }

        taskResponse?.let {
            it.project?.let { project ->
                txt_project_name.text = project.name
            }
            it.pic?.let { pic ->
                txt_pic_name.text = pic.lastName + " " + pic.firstName
            }
            it.job?.let { job ->
                txt_shift.text =
                    formatHour(job.startTime.toString()) + "-" + formatHour(job.endTime.toString())
            }
            txt_status.text = it.status
            it.store?.let { store ->
                tv_title.text = store.name
            }
            var listUrl = ArrayList<MediaData>()
            it.attendances?.let { attendances ->
                if (attendances.size == 1) {
                    attendances.get(0).checkInTime?.toDate("yyyy-MM-dd'T'HH:mm")?.let {
                        txt_start_date.text = TimeFormatUtils.formatFullDate(it)
                    }

                    attendances.get(0).checkOutTime?.toDate("yyyy-MM-dd'T'HH:mm")?.let {
                        txt_end_time.text = TimeFormatUtils.formatFullDate(it)
                    }
                }
            }

            it.attachments?.forEach {
                if (it.type!!.contains("video")) {
                    listUrl.add(
                        MediaData(
                            it.id,
                            it.thumbnailUrl.toString(),
                            it.imageUrl.toString(),
                            MediaAdapter.MEDIA_VIDEO,
                            "",
                            false
                        )
                    )
                } else {
                    listUrl.add(
                        MediaData(
                            it.id,
                            it.thumbnailUrl.toString(),
                            it.imageUrl.toString(),
                            MediaAdapter.MEDIA_IMAGE,
                            "",
                            false
                        )
                    )
                }
            }


            val mediaAdapter = ImageAdapter(items = listUrl,
                isIconClose = false, onItemClick = {
                    val imageDialog = ImageDialog(
                        title = "",
                        imageUrl = it.uri
                    )
                    imageDialog.show(childFragmentManager, imageDialog.tag)
                }, removeClickListener = {

                }, context = requireContext()
            )
            rv_task.setLayoutManager(GridLayoutManager(requireContext(), 2))
            rv_task.setHasFixedSize(true)
            rv_task.setAdapter(mediaAdapter)
        }

    }

//    private fun toProjectDetail(id: String) {
//        val bundel = bundleOf("projectId" to id, "agencyId" to agencyId)
//        findNavController().navigate(R.id.to_detail_project, bundel)
//    }

}