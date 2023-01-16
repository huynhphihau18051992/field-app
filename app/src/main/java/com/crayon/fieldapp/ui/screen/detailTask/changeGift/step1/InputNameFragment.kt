package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentInputBillBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.Utils
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showMessageDialog
import kotlinx.android.synthetic.main.fragment_input_name.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class InputNameFragment(val onNextClick: (isVerifyOtp: Boolean) -> Unit = {}) :
    BaseFragment<FragmentInputBillBinding, InputNameViewModel>() {

    override val layoutId: Int = R.layout.fragment_input_name
    override val viewModel: InputNameViewModel by viewModel()
    private val shareViewModel: ChangeGiftViewModel by activityViewModels()
    private var isVerifyOtp: Boolean = true
    private var taskId: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_next?.setSingleClick {
            var name = edt_name.text.toString()
            var phone = edt_phone.text.toString()
            if (name.isNullOrBlank()) {
                edt_name.setError("Họ và tên không được để trống")
                return@setSingleClick
            }

            if (phone.isNullOrBlank()) {
                edt_phone.setError("Số điện thoại không được để trống")
                return@setSingleClick
            }

            if (phone.length < 10) {
                edt_phone.setError("Số điện thoại không đúng")
                return@setSingleClick
            }
            Utils.hideKeyboard(requireActivity())
            taskId?.let {
                if (isVerifyOtp) {
                    viewModel.resendOtpCustomer(it, phone = phone)
                } else {
                    shareViewModel.setPhone(phone)
                    viewModel.registerCustomer(it, name = name, phone = phone)
                }
            }
        }

        viewModel.createCustomer.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            context?.showMessageDialog(message = it.message) {
                                onNextClick.invoke(isVerifyOtp)
                            }
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })

        viewModel.resendOtpCustomer.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            context?.showMessageDialog(message = it.message) {
                                onNextClick.invoke(isVerifyOtp)
                            }
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })
    }
}