package com.crayon.fieldapp.ui.screen.avatar

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentAvatarBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment
import com.crayon.fieldapp.utils.*
import kotlinx.android.synthetic.main.fragment_avatar.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.File

class AvatarFragment : BaseFragment<FragmentAvatarBinding, AvatarViewModel>(),
    GetPhotoDialogFragment.GetPhotoDialogListener {

    override val layoutId: Int = R.layout.fragment_avatar

    override val viewModel: AvatarViewModel by viewModel()

    private var tyeImage: String = ""
    private var avatarRef: Uri? = null
    private var bodyRef: Uri? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        rl_avatar?.setSingleClick {
            tyeImage = "avatar"
            val dialog = GetPhotoDialogFragment()
            dialog.setListener(this)
            dialog.show(childFragmentManager, dialog.tag)
        }

        rl_body?.setSingleClick {
            tyeImage = "body"
            val dialog = GetPhotoDialogFragment()
            dialog.setListener(this)
            dialog.show(childFragmentManager, dialog.tag)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("url")
            ?.observe(viewLifecycleOwner, Observer { result ->
                val file =
                    viewModel.createImageFileToUpload(requireContext(), result, tyeImage)
                when (tyeImage) {
                    "avatar" -> {
                        img_ic_avatar.loadImage(
                            imageUrl = Uri.fromFile(file).path,
                            centerCrop = true,
                            circleCrop = true,
                            fitCenter = true
                        )

                        avatarRef = Uri.fromFile(file)
                        avatarRef?.let { avatar ->
                            viewModel.updateAvatar(avatar)
                        }
                    }
                    "body" -> {
                        img_ic_body.loadImage(
                            imageUrl = Uri.fromFile(file).path,
                            centerCrop = true,
                            fitCenter = true
                        )
                        bodyRef = Uri.fromFile(file)
                        bodyRef?.let { body ->
                            viewModel.updateFullBody(body)
                        }
                    }
                }
            })


        viewModel.apply {
            getUserInfo()
            avatar.observe(viewLifecycleOwner, Observer {
                Log.d("AAA-avatar", it.data.toString())
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        if (tyeImage.equals("avatar")) {
                            context?.showMessageDialog("Cập nhật hình đại diện thành công")
                        } else {
                            context?.showMessageDialog("Cập nhật hình toàn thân thành công")
                        }

                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })

            user.observe(viewLifecycleOwner, Observer { userInfo ->
                img_ic_avatar.loadImage(
                    imageUrl = userInfo.avatarUrl,
                    centerCrop = true,
                    circleCrop = true,
                    signatureKey = userInfo.updatedAt,
                    fitCenter = true
                )

                img_ic_body.loadImage(
                    imageUrl = userInfo.profile!!.fullBodyImageUrl,
                    centerCrop = true,
                    signatureKey = userInfo.updatedAt,
                    fitCenter = true
                )
            })
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                CODE_REQUEST_GALLERY -> {
                    var selectedImageUri = data!!.data
                    val path = FileManager.getPath(requireContext(), selectedImageUri)
                    val file =
                        viewModel.createImageFileToUpload(requireContext(), path, tyeImage)
                    when (tyeImage) {
                        "avatar" -> {
                            img_ic_avatar.loadImage(
                                imageUrl = file!!.absolutePath,
                                centerCrop = true,
                                circleCrop = true,
                                fitCenter = true
                            )
                            avatarRef = Uri.fromFile(file)
                            avatarRef?.let { avatar ->
                                viewModel.updateAvatar(avatar)
                            }
                        }
                        "body" -> {
                            img_ic_body.loadImage(
                                imageUrl = file!!.absolutePath,
                                centerCrop = true,
                                fitCenter = true
                            )
                            bodyRef = Uri.fromFile(file)
                            bodyRef?.let { body ->
                                viewModel.updateFullBody(body)
                            }
                        }
                    }
                }
            }
        }
    }

    private fun openGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), CODE_REQUEST_GALLERY)
    }

    private fun openCamera() {
        val bundle = bundleOf("isTakeImage" to true)
        findNavController().navigate(R.id.action_global_CameraFragment, bundle)
    }

    companion object {
        const val CODE_REQUEST_GALLERY = 1
    }

    override fun selectFromGallery() {
        openGallery()
    }

    override fun selectFromCamera() {
        openCamera()
    }


}