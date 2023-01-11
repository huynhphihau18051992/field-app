package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentInputBillBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.utils.Utils
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.fragment_input_name.*

class InputNameFragment(val onNextClick: (String) -> Unit = {}) :
    BaseFragment<FragmentInputBillBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_input_name

    override val viewModel: ChangeGiftViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
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
            viewModel.setName(name)
            viewModel.setPhone(phone)
            Utils.hideKeyboard(requireActivity())
            onNextClick.invoke("")
        }
    }
}