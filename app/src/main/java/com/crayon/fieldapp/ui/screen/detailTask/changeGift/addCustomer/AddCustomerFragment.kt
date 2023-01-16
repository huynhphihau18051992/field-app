package com.crayon.fieldapp.ui.screen.detailTask.changeGift.addCustomer

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentContactBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.adapter.BaseVPAdapter
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1.InputNameFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step2.VerifyOtpStep2Fragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step3.InputBillFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.step4.SelectPromotionFragment
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_add_customer.*
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import org.koin.androidx.viewmodel.ext.android.viewModel

class AddCustomerFragment : BaseFragment<FragmentContactBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_add_customer
    override val viewModel: ChangeGiftViewModel by viewModel()
    lateinit var mViewPagerAdapter: BaseVPAdapter
    private var taskId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
        stepper_indicator?.setViewPager(pagger, 4)
        setupTablayout()

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    private fun setupViewPager() {
        mViewPagerAdapter = BaseVPAdapter(childFragmentManager)
        val inputFragment = InputNameFragment({ isVefiyOtp ->
            if (isVefiyOtp) {
                pagger.setCurrentItem(1, true)
                stepper_indicator?.currentStep = 1
            } else {
                pagger.setCurrentItem(3, true)
                stepper_indicator?.currentStep = 3
            }
        })
        inputFragment.arguments = bundleOf("taskId" to taskId)

        val verifyOtpFragment = VerifyOtpStep2Fragment({ mPhone ->
            pagger.setCurrentItem(2, true)
            stepper_indicator?.currentStep = 2
        })
        verifyOtpFragment.arguments = bundleOf("taskId" to taskId)


        val inputBillFragment = InputBillFragment({
            pagger.setCurrentItem(3, true)
            stepper_indicator?.currentStep = 3
        })
        inputBillFragment.arguments = bundleOf("taskId" to taskId)

        val selectPromotionFragment = SelectPromotionFragment({
            findNavController().navigateUp()
        })
        selectPromotionFragment.arguments = bundleOf("taskId" to taskId)


        mViewPagerAdapter.addFragment(inputFragment, "")
        mViewPagerAdapter.addFragment(verifyOtpFragment, "")
        mViewPagerAdapter.addFragment(inputBillFragment, "")
        mViewPagerAdapter.addFragment(selectPromotionFragment, "")

        pagger.apply {
            offscreenPageLimit = 1
            adapter = mViewPagerAdapter
        }
    }

    private fun setupTablayout() {
        stepper_indicator?.addOnStepClickListener {
            pagger.setCurrentItem(it, true);
        }
    }
}