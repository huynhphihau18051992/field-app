package com.crayon.fieldapp.ui.screen.detailTask.updateStatus

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
import com.crayon.fieldapp.databinding.FragmentReportUpdateStatusBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.dialog.TimeKeepingDialog
import com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment
import com.crayon.fieldapp.ui.screen.detailAttachment.image.ImageAdapter
import com.crayon.fieldapp.ui.screen.detailTask.DetailTaskFragment
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel
import com.crayon.fieldapp.ui.screen.imageDialog.EditNoteDialog
import com.crayon.fieldapp.ui.screen.imageDialog.ImageDialog
import com.crayon.fieldapp.ui.screen.videoDialog.VideoDialog
import com.crayon.fieldapp.utils.*
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_report_update_status.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import studio.phillip.yolo.utils.TaskUtils
import java.io.File

class ReportUpdateStatusFragment :
    BaseFragment<FragmentReportUpdateStatusBinding, DetailTaskViewModel>(),
    GetPhotoDialogFragment.GetPhotoDialogListener {

    override val layoutId: Int = R.layout.fragment_report_update_status
    override val viewModel: DetailTaskViewModel by viewModel()
    private lateinit var taskId: String
    private var taskResponse: TaskResponse? = null
    private lateinit var newImageAdapter: MediaAdapter
    private lateinit var updateImageAdapter: ImageAdapter
    private var imageId: String? = null
    private lateinit var typeRecord: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
        newImageAdapter = MediaAdapter(arrayListOf(), requireContext())
        newImageAdapter.setMediaListener(object : MediaAdapter.MediaListener {
            override fun onItemRemoveClicked(item: MediaData, index: Int) {
                newImageAdapter.removeImage(index)
            }

            override fun onItemClicked(item: MediaData, index: Int) {
                val editNote = EditNoteDialog(
                    index = index,
                    note = item.note,
                    imageUrl = item.uri
                )
                editNote.setEditNoteListener(object : EditNoteDialog.EditNoteListener {
                    override fun onEditNote(note: String, index: Int) {
                        newImageAdapter.updateNote(note, index)
                    }
                })
                editNote.show(childFragmentManager, editNote.tag)
            }

        })
        updateImageAdapter = ImageAdapter(items = arrayListOf(), isIconClose = true, onItemClick = {
            if (it.type == ImageAdapter.MEDIA_IMAGE) {
                val imageDialog = ImageDialog(
                    title = it.note ?: "",
                    imageUrl = it.uri
                )
                imageDialog.show(childFragmentManager, imageDialog.tag)
            } else {
                val videoDialog = VideoDialog(
                    title = it.note ?: "",
                    imageUrl = it.uri
                )
                videoDialog.show(childFragmentManager, videoDialog.tag)
            }
        }, removeClickListener = {
            context.showConfirmDialog(
                title = "Bạn có muốn xoá ảnh này không?",
                textPositive = "Có",
                textNegative = "Không",
                positiveListener = {
                    taskResponse?.let {
                        viewModel.removeImage(it.id.toString(), arrayListOf(imageId.toString()))
                    }
                }
            )
        }, context = requireContext())

        viewModel.getDetailTask(taskId)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("url")
            ?.observe(viewLifecycleOwner, Observer { result ->
                if (!newImageAdapter.contains(result)) {
                    showImage(result)
                }
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
                        taskResponse?.let {
                            val listUrl = it.attachments?.filter {
                                it.type!!.contains("image")
                            }?.map {
                                MediaData(
                                    it.id,
                                    it.thumbnailUrl.toString(),
                                    it.imageUrl.toString(),
                                    MediaAdapter.MEDIA_IMAGE,
                                    it.note,
                                    false
                                )
                            } as ArrayList<MediaData>
                            updateImageAdapter.addImages(listUrl)
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
                        newImageAdapter.clearData()
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

            isRemoveTask.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        updateImageAdapter.showProgress(false)
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        updateImageAdapter.deleteImage(imageId.toString())
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
        rv_new_image.setLayoutManager(GridLayoutManager(requireContext(), 2))
        rv_new_image.setHasFixedSize(true)
        rv_new_image.setAdapter(newImageAdapter)

        rv_upload_image.setLayoutManager(GridLayoutManager(requireContext(), 2))
        rv_upload_image.setHasFixedSize(true)
        rv_upload_image.setAdapter(updateImageAdapter)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        imb_attachment?.setSingleClick {
            val taskString = Gson().toJson(taskResponse).toString()
            val bundle = bundleOf("task" to taskString)
            findNavController().navigate(
                R.id.action_reportUpdateStatusFragment_to_detailAttachmentFragment,
                bundle
            )
        }

        imb_ic_filter?.setSingleClick {
            if (newImageAdapter.itemCount > 4) {
                context?.showMessageDialog("Bạn chỉ được chụp tối đa 3 tấm")
            } else {
                if (newImageAdapter.itemCount != 0) {
                    newImageAdapter.showProgress(true)
                    taskResponse?.let { mTaskResponse ->
                        var listNote = newImageAdapter.getNotes()
                        viewModel.upLoadTask(mTaskResponse, newImageAdapter.getData(), listNote)
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
                        bundle.putDouble("store_lat", taskResponse!!.store!!.lat)
                        bundle.putDouble("store_long", taskResponse!!.store!!.lng)
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
                        bundle.putDouble("store_lat", taskResponse!!.store!!.lat)
                        bundle.putDouble("store_long", taskResponse!!.store!!.lng)
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
                newImageAdapter.addImages(
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
                        newImageAdapter.updateImage(
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

    private fun openCamera() {
        if (newImageAdapter.itemCount >= 3) {
            context?.showMessageDialog("Bạn chỉ được chụp tối đa 3 tấm")
        } else {
            val bundle = bundleOf("isTakeImage" to true)
            findNavController().navigate(R.id.action_global_CameraFragment, bundle)
        }
    }

    private fun openGallery() {
        if (newImageAdapter.itemCount >= 3) {
            context?.showMessageDialog("Bạn chỉ được chụp tối đa 3 tấm")
        } else {
            val intent = Intent()
            intent.type = "image/*"
            intent.action = Intent.ACTION_GET_CONTENT
            startActivityForResult(
                Intent.createChooser(intent, "Select Picture"),
                DetailTaskFragment.CODE_REQUEST_GALLERY
            )
        }
    }

    private fun openVideoCamera() {
        if (newImageAdapter.itemCount >= 3) {
            context?.showMessageDialog("Bạn chỉ được chụp tối đa 3 tấm")
        } else {
            val bundle = bundleOf("isTakeVideo" to false)
            findNavController().navigate(R.id.action_global_CameraFragment, bundle)
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

    override fun selectFromGallery() {
        openGallery()
    }

    override fun selectFromCamera() {
        openCamera()
    }
}