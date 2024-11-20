package com.crayon.fieldapp.ui.screen.detailTask

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
import com.crayon.fieldapp.data.remote.response.TaskType
import com.crayon.fieldapp.databinding.FragmentDetailTaskBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.dialog.TimeKeepingDialog
import com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel
import com.crayon.fieldapp.ui.screen.imageDialog.EditNoteDialog
import com.crayon.fieldapp.utils.FileManager
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showMessageDialog
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_detail_task.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import studio.phillip.yolo.utils.TaskUtils
import java.io.File

class DetailTaskFragment :
    BaseFragment<FragmentDetailTaskBinding, DetailTaskViewModel>(),
    GetPhotoDialogFragment.GetPhotoDialogListener {

    override val layoutId: Int = R.layout.fragment_detail_task
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
                val editNote = EditNoteDialog(
                    index = index,
                    note = "",
                    imageUrl = item.uri
                )
                editNote.setEditNoteListener(object : EditNoteDialog.EditNoteListener {
                    override fun onEditNote(note: String, index: Int) {
                        mediaAdapter.updateNote(note, index)
                    }
                })
                editNote.show(childFragmentManager, editNote.tag)
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
                        taskResponse?.let { mTaskResponse ->
                            showRecordMediaType(mTaskResponse.type!!.id!!.toInt())
                            showSubTitle(mTaskResponse.type!!.id!!.toInt())
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })

        viewModel.apply {
            updateTask.observe(viewLifecycleOwner, Observer {
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
                    R.id.action_detailTaskFragment_to_detailAttachmentFragment,
                    bundle
                )
            }

        }

        imb_ic_filter?.setSingleClick {
            if (mediaAdapter.itemCount > 1) {
                context?.showMessageDialog("Mỗi lần chỉ được upload 1 ảnh/Video")
            } else {
                if (mediaAdapter.itemCount != 0) {
                    mediaAdapter.showProgress(true)
                    var listNote = mediaAdapter.getNotes()
                    taskResponse?.let { mTaskResponse ->
                        viewModel.upLoadTask(mTaskResponse, mediaAdapter.getData(), listNote)
                    }
                } else {
                    context?.showMessageDialog("Bạn chưa có chụp ảnh")
                }
            }
        }

        img_picture?.setSingleClick {
            typeRecord = "image"
            taskResponse?.let { mTaskResponse ->
                val taskType = mTaskResponse.type!!.id!!.toInt()
                if (isVerifyLocation(taskType)) {
                    if (viewModel.verifyLocation(mTaskResponse)) {
                        if (isTakeImageOnlyFromCamera(taskType)) {
                            openCamera()
                        } else {
                            val getPhotoDialogFragment = GetPhotoDialogFragment()
                            getPhotoDialogFragment.setListener(this)
                            getPhotoDialogFragment.show(
                                childFragmentManager,
                                getPhotoDialogFragment.tag
                            )
                        }
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

                } else {
                    if (isTakeImageOnlyFromCamera(taskType)) {
                        openCamera()
                    } else {
                        val getPhotoDialogFragment = GetPhotoDialogFragment()
                        getPhotoDialogFragment.setListener(this)
                        getPhotoDialogFragment.show(
                            childFragmentManager,
                            getPhotoDialogFragment.tag
                        )
                    }
                }
            }

        }

        img_video?.setSingleClick {
            typeRecord = "video"
            taskResponse?.let { mTaskResponse ->
                val taskType = mTaskResponse.type!!.id!!.toInt()
                if (isVerifyLocation(taskType)) {
                    if (viewModel.verifyLocation(mTaskResponse)) {
                        openVideoCamera()
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
                } else {
                    openVideoCamera()
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

    private fun showRecordMediaType(taskType: Int) {
        when (taskType) {
            TaskType.CHECK_LIST.value,
            TaskType.VISIT_STORE.value,
            TaskType.REPORT_CUSTOMER.value,
            TaskType.TIME_KEEPING.value -> {
                img_picture.visibility = View.VISIBLE
                img_video.visibility = View.GONE
            }
            TaskType.SET_UP.value,
            TaskType.UPDATE_STATUS.value,
            TaskType.REPORT_COMPITETOR.value,
            TaskType.REPORT_DAMAGED.value,
            TaskType.CLEAN_UP.value,
            TaskType.REPORT_VIOLATION.value,
            TaskType.REPORT_END_SHIFT.value,
            TaskType.COUNT.value,
            TaskType.UPDATE_PRICE.value,
            TaskType.COMPLETE_FIX.value -> {
                img_picture.visibility = View.VISIBLE
                img_video.visibility = View.VISIBLE
            }
        }
    }


    private fun isTakeImageOnlyFromCamera(taskType: Int): Boolean {
        when (taskType) {
            TaskType.REPORT_CUSTOMER.value,
            TaskType.REPORT_END_SHIFT.value,
            TaskType.COUNT.value -> {
                return false
            }
            TaskType.UPDATE_STATUS.value,
            TaskType.CHECK_LIST.value,
            TaskType.VISIT_STORE.value,
            TaskType.SET_UP.value,
            TaskType.REPORT_COMPITETOR.value,
            TaskType.REPORT_DAMAGED.value,
            TaskType.CLEAN_UP.value,
            TaskType.REPORT_VIOLATION.value,
            TaskType.UPDATE_PRICE.value,
            TaskType.COMPLETE_FIX.value,
            TaskType.TIME_KEEPING.value -> {
                return true
            }
            else -> {
                return false
            }
        }
    }

    private fun isVerifyLocation(taskType: Int): Boolean {
        when (taskType) {
            TaskType.REPORT_CUSTOMER.value,
            TaskType.CHECK_LIST.value -> {
                return false
            }
            TaskType.REPORT_END_SHIFT.value,
            TaskType.COUNT.value,
            TaskType.UPDATE_STATUS.value,
            TaskType.VISIT_STORE.value,
            TaskType.SET_UP.value,
            TaskType.REPORT_COMPITETOR.value,
            TaskType.REPORT_DAMAGED.value,
            TaskType.CLEAN_UP.value,
            TaskType.REPORT_VIOLATION.value,
            TaskType.UPDATE_PRICE.value,
            TaskType.COMPLETE_FIX.value,
            TaskType.TIME_KEEPING.value -> {
                return true
            }
        }
        return false
    }

    private fun showSubTitle(taskType: Int) {
        when (taskType) {
            TaskType.CHECK_LIST.value,
            TaskType.VISIT_STORE.value,
            TaskType.REPORT_CUSTOMER.value,
            TaskType.SET_UP.value,
            TaskType.UPDATE_STATUS.value,
            TaskType.REPORT_COMPITETOR.value,
            TaskType.REPORT_DAMAGED.value,
            TaskType.CLEAN_UP.value,
            TaskType.REPORT_VIOLATION.value,
            TaskType.REPORT_END_SHIFT.value,
            TaskType.COUNT.value,
            TaskType.UPDATE_PRICE.value,
            TaskType.COMPLETE_FIX.value -> {
                tv_sub_title.visibility = View.GONE
            }
            TaskType.TIME_KEEPING.value -> {
                tv_sub_title.visibility = View.VISIBLE
                tv_sub_title.text = "Check In"
                taskResponse?.let {
                    it.attendances?.let { attendances ->
                        if (attendances.size == 0) {
                            tv_sub_title.text = "Check In"
                        } else if (attendances.size == 1) {
                            tv_sub_title.text = "Check Out"
                        } else {
                            tv_sub_title.text = "Đã chấm công"
                        }
                    }
                }
            }
        }
    }


    override fun selectFromGallery() {
        openGallery()
    }

    override fun selectFromCamera() {
        openCamera()
    }

    private fun openCamera() {
        val bundle = bundleOf("isTakeImage" to true)
        findNavController().navigate(R.id.action_global_CameraFragment, bundle)
    }

    private fun openVideoCamera() {
        val bundle = bundleOf("isTakeVideo" to false)
        findNavController().navigate(R.id.action_global_CameraFragment, bundle)
    }

    private fun openGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(
            Intent.createChooser(intent, "Select Picture"),
            CODE_REQUEST_GALLERY
        )
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

}