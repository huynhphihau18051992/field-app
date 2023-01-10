package com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentInputBillBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.fragment_input_name.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class InputNameFragment(val onNextClick: (String) -> Unit = {}) :
    BaseFragment<FragmentInputBillBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_input_name

    override val viewModel: ChangeGiftViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        btn_next?.setSingleClick {
            onNextClick.invoke("")
        }
    }
}