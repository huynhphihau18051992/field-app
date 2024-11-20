package com.crayon.fieldapp.ui.screen.resetPassword

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentResetPasswordBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_reset_password.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ResetPasswordFragment : BaseFragment<FragmentResetPasswordBinding, ResetPasswordViewModel>() {

    override val layoutId: Int = R.layout.fragment_reset_password

    override val viewModel: ResetPasswordViewModel by viewModel()

    lateinit var phone: String
    lateinit var password: String
    lateinit var device_id: String
    lateinit var otp: String
    lateinit var fcm_token: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        phone = requireArguments().get("phone").toString()
        device_id = requireArguments().getString("device_id").toString()
        fcm_token = requireArguments().getString("fcm_token").toString()
        otp = requireArguments().getString("otp").toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_update.setOnClickListener {
            viewModel.apply {
                val password = edt_password.text.toString().trim()
                val confirmPassword = edt_confirm_password.text.toString().trim()
                if (password.isNullOrBlank()) {
                    edt_password.setError("Vui lòng nhập mật khẩu mới")
                    return@setOnClickListener
                }
                if(password.length < 8){
                    edt_confirm_password.setError("Mật khẩu phải có ít nhất 8 kí tự")
                    return@setOnClickListener
                }
                if (confirmPassword.isNullOrBlank()) {
                    edt_confirm_password.setError("Vui lòng nhập xác nhận mật khẩu mới")
                    return@setOnClickListener
                }
                if (!confirmPassword.equals(password)) {
                    edt_confirm_password.setError("Mật khẩu không trùng khớp")
                    return@setOnClickListener
                }
                resetPassword(
                    password = password,
                    otp = otp,
                    device_id = device_id,
                    fcm_token = fcm_token,
                    phone = phone
                )

            }
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.apply {
            isVerifySuccess.observe(viewLifecycleOwner, Observer {
                if (it) {
                    findNavController().navigate(R.id.action_resetPasswordFragment_to_main)
                }
            })
        }
    }
}