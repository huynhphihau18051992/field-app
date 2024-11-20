package com.crayon.fieldapp.ui.screen.profile

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.BuildConfig
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentProfileBindingImpl
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.dialog.LoginQrCodeDialog
import com.crayon.fieldapp.utils.*
import kotlinx.android.synthetic.main.fragment_profile.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ProfileFragment : BaseFragment<FragmentProfileBindingImpl, ProfileViewModel>() {

    override val layoutId: Int = R.layout.fragment_profile

    override val viewModel: ProfileViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getUserInfo()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.apply {
            isLogoutSuccess.observe(viewLifecycleOwner, Observer {
                findNavController().navigate(R.id.action_main_to_login)
            })

            loginByQrCode.observe(viewLifecycleOwner, Observer {
                it.getContentIfNotHandled()?.let {
                    when (it.status) {
                        Status.LOADING -> {
                        }
                        Status.SUCCESS -> {
                            it.data?.let {
                                context?.showMessageDialog(it.message)
                            }
                        }
                        Status.ERROR -> {
                        }
                    }
                }
            })

            user.observe(viewLifecycleOwner, Observer { userInfo ->
                tv_username.text = userInfo.lastName + " " + userInfo.firstName

                img_avatar.loadImage(
                    imageUrl = userInfo.avatarUrl,
                    centerCrop = true,
                    circleCrop = true,
                    signatureKey = userInfo.updatedAt,
                    fitCenter = true
                )

                img_ic_avatar.loadImage(
                    imageUrl = userInfo.avatarUrl,
                    centerCrop = true,
                    circleCrop = true,
                    signatureKey = userInfo.updatedAt,
                    fitCenter = true
                )
            })

        }

        rl_avatar.setSingleClick {
            findNavController().navigate(R.id.action_profile_to_avatar)
        }

        rl_contact_info.setSingleClick {
            findNavController().navigate(R.id.action_profile_to_infoFragment)
        }

        rl_bank.setSingleClick {
            findNavController().navigate(R.id.action_profile_to_bankFragment)
        }

        rl_application.setSingleClick {
            findNavController().navigate(R.id.action_profile_to_applicationFragment)
        }

        rl_about_terms.setSingleClick {
            findNavController().navigate(R.id.action_profile_to_termFragment)
        }

        rl_about_privacy.setSingleClick {
            findNavController().navigate(R.id.action_profile_to_privacyFragment)
        }

        rl_contact.setSingleClick {
            findNavController().navigate(R.id.action_profile_to_contactFragment)
        }

        rl_login_qrcod.setSingleClick {
            val qrCodeDialog = LoginQrCodeDialog({
                viewModel.loginByQrCode(it.replace("\"", ""))
            })
            qrCodeDialog.show(childFragmentManager, qrCodeDialog.tag)
        }

        tv_version.text = BuildConfig.VERSION_NAME

        tv_logout.setOnClickListener {
            requireContext().showConfirmDialog(
                title = "Bạn có muốn đăng xuất không?",
                textPositive = "Có",
                textNegative = "Không",
                positiveListener = {
                    viewModel.logout()
                }
            )

        }

    }
}