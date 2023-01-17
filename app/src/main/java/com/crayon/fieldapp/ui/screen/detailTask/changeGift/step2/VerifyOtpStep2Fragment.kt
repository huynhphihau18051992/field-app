package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentVerifyOtpStep2Binding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.Utils
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showMessageDialog
import kotlinx.android.synthetic.main.fragment_verify_otp_step2.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.concurrent.TimeUnit

class VerifyOtpStep2Fragment(val onNextClick: (String) -> Unit = {}) :
    BaseFragment<FragmentVerifyOtpStep2Binding, VerifyOtpStep2ViewModel>() {
    override val layoutId: Int = R.layout.fragment_verify_otp_step2
    override val viewModel: VerifyOtpStep2ViewModel by viewModel()
    private val shareViewModel: ChangeGiftViewModel by activityViewModels()
    private var taskId: String? = null
    private var phone: String? = null
    private var timer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_resend?.visibility = View.VISIBLE

        timer = startLoginTimer(txt_time, {
            btn_resend?.isEnabled = true
            txt_time?.visibility = View.GONE
        }, {})

        btn_resend?.setSingleClick {
            btn_resend?.isEnabled = false
            txt_time?.visibility = View.VISIBLE
            if (taskId != null && phone != null) {
                timer?.start()
                viewModel.resendOtpCustomer(taskId = taskId.toString(), phone = phone.toString())
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_next?.setSingleClick {
            val otp = edt_otp.text.toString()
            if (otp.isNullOrBlank() || otp.length < 6) {
                edt_otp.setError("Vui lòng nhập mã OTP")
                return@setSingleClick
            }
            Utils.hideKeyboard(requireActivity())
            if (taskId != null && phone != null) {
                viewModel.verifyCustomerOtp(taskId.toString(), phone.toString(), otp)
            }
        }

        viewModel.verifyCustomerOtp.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        timer?.cancel()
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

        shareViewModel.phone.observe(viewLifecycleOwner, Observer {
            txt_hint_otp?.text = "Mã OTP được gửi đến số +84" + it
            phone = it
        })
    }

    fun startLoginTimer(
        timeView: TextView,
        onFinish: () -> Unit,
        timeDown: (time: String) -> Unit
    ): CountDownTimer {
        return object : CountDownTimer(120000, 1000L) {
            override fun onFinish() {
                timeView?.text = "00 : 00"
                onFinish.invoke()
            }

            override fun onTick(millisUntilFinished: Long) {
                timeView?.visibility = View.VISIBLE
                timeView?.text = String.format(
                    "%02d : %02d",
                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                    TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                            TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(
                                    millisUntilFinished
                                )
                            )
                )

                timeDown.invoke(
                    String.format(
                        " %02d : %02d ",
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) -
                                TimeUnit.MINUTES.toSeconds(
                                    TimeUnit.MILLISECONDS.toMinutes(
                                        millisUntilFinished
                                    )
                                )
                    )
                )
            }
        }.start()
    }
}