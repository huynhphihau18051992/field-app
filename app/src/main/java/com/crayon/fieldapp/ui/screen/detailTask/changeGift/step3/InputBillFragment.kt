package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentInputBillBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailAttachment.image.ImageAdapter
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaAdapter
import com.crayon.fieldapp.ui.screen.detailTask.adapter.MediaData
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3.adapter.UploadMediaAdapter
import com.crayon.fieldapp.ui.screen.imageDialog.ImageDialog
import com.crayon.fieldapp.ui.screen.videoDialog.VideoDialog
import com.crayon.fieldapp.utils.*
import kotlinx.android.synthetic.main.fragment_input_bill.*
import kotlinx.android.synthetic.main.fragment_input_bill.btn_next
import kotlinx.android.synthetic.main.fragment_input_bill.pb_loading
import kotlinx.android.synthetic.main.fragment_verify_otp_step2.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.File

class InputBillFragment(val onNextClick: (String) -> Unit = {}) :
    BaseFragment<FragmentInputBillBinding, InputBillViewModel>() {

    override val layoutId: Int = R.layout.fragment_input_bill
    override val viewModel: InputBillViewModel by viewModel()
    private val shareViewModel: ChangeGiftViewModel by activityViewModels()
    private var taskId: String? = null
    private var customerId: String? = null
    private lateinit var updateImageAdapter: UploadMediaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
        updateImageAdapter =
            UploadMediaAdapter(
                items = arrayListOf(),
                context = requireContext(),
                onItemClick = { data: MediaData, position: Int ->
                    if (data.type == ImageAdapter.MEDIA_IMAGE) {
                        val imageDialog = ImageDialog(
                            title = data.note ?: "",
                            imageUrl = data.uri
                        )
                        imageDialog.show(childFragmentManager, imageDialog.tag)
                    } else {
                        val videoDialog = VideoDialog(
                            title = data.note ?: "",
                            imageUrl = data.uri
                        )
                        videoDialog.show(childFragmentManager, videoDialog.tag)
                    }
                },
                removeClickListener = { data: MediaData, position: Int ->
                    context.showConfirmDialog(
                        title = "Bạn có muốn xoá ảnh này không?",
                        textPositive = "Có",
                        textNegative = "Không",
                        positiveListener = {
                            updateImageAdapter.deleteImage(position)
                        }
                    )
                }
            )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("url")
            ?.observe(viewLifecycleOwner, Observer { result ->
                showImage(result)
            })

        btn_next?.setSingleClick {
            Utils.hideKeyboard(requireActivity())
            if (updateImageAdapter.itemCount > 4) {
                context?.showMessageDialog("Bạn chỉ được chụp tối đa 3 tấm")
                return@setSingleClick
            } else {
                if (updateImageAdapter.itemCount != 0) {
                    val bill = edt_bill.text.toString()
                    if (bill.isNullOrBlank()) {
                        context?.showMessageDialog("Vui lòng nhập mã hóa đơn")
                        return@setSingleClick
                    } else {
                        viewModel.createCustomerBill(
                            taskId = taskId.toString(),
                            customerId = customerId.toString(),
                            codeBill = bill.toString(),
                            listUri = updateImageAdapter.getData()
                        )
                    }

                } else {
                    context?.showMessageDialog("Bạn chưa có chụp ảnh")
                }
            }
        }

        btn_camera?.setSingleClick {
            openCamera()
        }

        btn_gallery?.setSingleClick {
            openGallery()
        }

        viewModel.createCustomerBill.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            context?.showMessageDialog(message = it.message) {
                                onNextClick.invoke("")
                            }
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })

        shareViewModel.customerId.observe(viewLifecycleOwner, Observer {
            customerId = it
        })
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

    private fun openGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(
            Intent.createChooser(intent, "Select Picture"),
            CODE_REQUEST_GALLERY
        )
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
                updateImageAdapter.addImages(
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
            val isHasTag = false
            val size = 50
            val file = viewModel.createFile(requireContext(), url, TaskResponse(), size, isHasTag)
            file?.let { myFile ->
                withContext(Dispatchers.Main) {
                    updateImageAdapter.updateImage(
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

    companion object {
        const val CODE_REQUEST_GALLERY = 1
    }
}