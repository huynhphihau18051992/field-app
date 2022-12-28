package com.crayon.fieldapp.ui.screen.detailTask.attendance

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentDetailTaskAttendanceBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.dialog.TimeKeepingDialog
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel
import com.crayon.fieldapp.ui.screen.imageDialog.ImageDialog
import com.crayon.fieldapp.utils.FileManager
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showMessageDialog
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_detail_task_attendance.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import studio.phillip.yolo.utils.TaskUtils
import java.io.File

class AttendanceFragment :
    BaseFragment<FragmentDetailTaskAttendanceBinding, DetailTaskViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_task_attendance
    override val viewModel: DetailTaskViewModel by viewModel()
    private lateinit var taskId: String
    private lateinit var typeRecord: String
    private var taskResponse: TaskResponse? = null
    private lateinit var mediaAdapter: MediaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
        mediaAdapter = MediaAdapter(arrayListOf(), requireContext())
        mediaAdapter.setMediaListener(object : MediaAdapter.MediaListener {
            override fun onItemRemoveClicked(item: MediaData, index: Int) {
                mediaAdapter.removeImage(index)
            }

            override fun onItemClicked(item: MediaData, index: Int) {
                val imageDialog =
                    ImageDialog(imageUrl = item.uri, title = "")
                imageDialog.show(childFragmentManager, imageDialog.tag)
            }

        })
        viewModel.getDetailTask(taskId)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("url")
            ?.observe(viewLifecycleOwner, Observer { result ->
                showImage(result)
            })

        viewModel.task.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        tv_title.text = it.data!!.type.name
                        taskResponse = it.data!!
                        tv_sub_title.visibility = View.VISIBLE
                        tv_sub_title.text = "Check In"
                        taskResponse?.let {
                            it.attendances?.let { attendances ->
                                if (attendances.size == 0) {
                                    tv_sub_title.text = "Check In"
                                    showButtonCheckIn(true)
                                    showButtonCheckOut(false)
                                } else if (attendances.size == 1 && attendances.get(0).checkOutTime == null) {
                                    tv_sub_title.text = "Check Out"
                                    showButtonCheckOut(true)
                                    showButtonCheckIn(false)
                                } else {
                                    tv_sub_title.text = "Đã chấm công"
                                    showButtonCheckIn(false)
                                    showButtonCheckOut(false)
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

        viewModel.apply {
            updateCheckInOutTask.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        mediaAdapter.clearData()
                        taskResponse?.let { mTaskResponse ->
                            context.showMessageDialog("Cập nhật " + mTaskResponse.type!!.name + " thành công",
                                positiveListener = {
                                    findNavController().navigateUp()
                                })
                        }
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_images.setLayoutManager(GridLayoutManager(requireContext(), 2))
        rv_images.setHasFixedSize(true)
        rv_images.setAdapter(mediaAdapter)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        imb_attachment?.setSingleClick {
            taskResponse?.let { mTaskResponse ->
                val taskString = Gson().toJson(mTaskResponse).toString()
                val bundle = bundleOf("task" to taskString)
                findNavController().navigate(
                    R.id.action_reportAttendanceFragment_to_detailAttachmentFragment,
                    bundle
                )
            }
        }

        imb_ic_filter?.setSingleClick {
            if (mediaAdapter.itemCount > 1) {
                context?.showMessageDialog("Bạn chỉ được chụp tối đa 1 tấm")
            } else {
                if (mediaAdapter.itemCount != 0) {
                    mediaAdapter.showProgress(true)
                    taskResponse?.let { mTaskResponse ->
                        viewModel.checkInOut(mTaskResponse, mediaAdapter.getData())
                    }
                } else {
                    context?.showMessageDialog("Bạn chưa có chụp ảnh")
                }
            }
        }

        rl_check_in?.setSingleClick {
            typeRecord = "image"
            taskResponse?.let { mTaskResponse ->
                if (viewModel.verifyLocation(mTaskResponse)) {
                    openCamera()
                } else {
                    val dialog = TimeKeepingDialog()
                    val bundle = Bundle()
                    viewModel.currentLocation?.let {
                        bundle.putDouble("current_lat", it.latitude)
                        bundle.putDouble("current_long", it.longitude)

                    }
                    bundle.putDouble("store_lat", mTaskResponse!!.store!!.lat)
                    bundle.putDouble("store_long", mTaskResponse!!.store!!.lng)
                    bundle.putString("distant", viewModel.strDistant)
                    dialog.arguments = bundle
                    dialog.show(childFragmentManager, dialog.tag)
                }
            }
        }

        rl_check_out?.setSingleClick {
            typeRecord = "image"
            taskResponse?.let { mTaskResponse ->
                if (viewModel.verifyLocation(mTaskResponse)) {
                    openCamera()
                } else {
                    val dialog = TimeKeepingDialog()
                    val bundle = Bundle()
                    viewModel.currentLocation?.let {
                        bundle.putDouble("current_lat", it.latitude)
                        bundle.putDouble("current_long", it.longitude)

                    }
                    bundle.putDouble("store_lat", mTaskResponse!!.store!!.lat)
                    bundle.putDouble("store_long", mTaskResponse!!.store!!.lng)
                    bundle.putString("distant", viewModel.strDistant)
                    dialog.arguments = bundle
                    dialog.show(childFragmentManager, dialog.tag)
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                CODE_REQUEST_GALLERY -> {
                    var selectedImageUri = data!!.data
                    val path = FileManager.getPath(requireContext(), selectedImageUri)
                    showImage(path)
                }
            }
        }
    }


    private fun openCamera() {
        val bundle = bundleOf("isTakeImage" to true)
        findNavController().navigate(R.id.action_global_CameraFragment, bundle)
    }

    companion object {
        const val CODE_REQUEST_GALLERY = 1
    }

    private fun showImage(url: String) {
        var type = 0
        if (url.contains("mp4")) {
            type = MediaAdapter.MEDIA_VIDEO
        } else {
            type = MediaAdapter.MEDIA_IMAGE
        }
        GlobalScope.launch(Dispatchers.IO) {
            withContext(Dispatchers.Main) {
                mediaAdapter.addImages(
                    arrayListOf(
                        MediaData(
                            url,
                            File(url).absolutePath,
                            File(url).absolutePath,
                            type,
                            "",
                            false
                        )
                    )
                )
            }
            taskResponse?.let { mTaskResponse ->
                val isHasTag = TaskUtils.isHasTag(mTaskResponse.type!!.id!!.toInt())
                val size = TaskUtils.getQualityOfImage(mTaskResponse.type!!.id!!.toInt())
                val file = viewModel.createFile(url, mTaskResponse, size, isHasTag)
                file?.let { myFile ->
                    withContext(Dispatchers.Main) {
                        mediaAdapter.updateImage(
                            MediaData(
                                url,
                                myFile.absolutePath,
                                myFile.absolutePath,
                                type,
                                "",
                                true
                            )
                        )
                    }
                }
            }
        }
    }

    private fun showButtonCheckIn(isShow: Boolean) {
        if (isShow) {
            rl_check_in.isEnabled = true
            img_check_in.setColorFilter(
                resources.getColor(
                    R.color.colorRed,
                    null
                )
            )
            txt_check_in.setTextColor(
                resources.getColor(
                    R.color.colorBlack,
                    null
                )
            )
        } else {
            rl_check_in.isEnabled = false
            img_check_in.setColorFilter(
                resources.getColor(
                    R.color.colorGray,
                    null
                )
            )
            txt_check_in.setTextColor(
                resources.getColor(
                    R.color.colorGray,
                    null
                )
            )
        }
    }

    private fun showButtonCheckOut(isShow: Boolean) {
        if (isShow) {
            rl_check_out.isEnabled = true
            img_check_out.setColorFilter(
                resources.getColor(
                    R.color.colorRed,
                    null
                )
            )
            txt_check_out.setTextColor(
                resources.getColor(
                    R.color.colorBlack,
                    null
                )
            )
        } else {
            rl_check_out.isEnabled = false
            img_check_out.setColorFilter(
                resources.getColor(
                    R.color.colorGray,
                    null
                )
            )
            txt_check_out.setTextColor(
                resources.getColor(
                    R.color.colorGray,
                    null
                )
            )
        }
    }
}