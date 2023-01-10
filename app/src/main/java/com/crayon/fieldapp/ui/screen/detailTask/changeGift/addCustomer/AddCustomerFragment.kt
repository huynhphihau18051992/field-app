package com.crayon.fieldapp.ui.screen.detailTask.changeGift.addCustomer

import android.os.Bundle
import android.view.View
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
        mViewPagerAdapter.addFragment(InputNameFragment({
            // Click next button
            pagger.setCurrentItem(1, true)
            stepper_indicator?.currentStep = 1
        }), "")
        mViewPagerAdapter.addFragment(VerifyOtpStep2Fragment({
            // Click next button
            pagger.setCurrentItem(2, true)
            stepper_indicator?.currentStep = 2
        }), "")
        mViewPagerAdapter.addFragment(InputBillFragment({
            pagger.setCurrentItem(3, true)
            stepper_indicator?.currentStep = 3
        }), "")
        mViewPagerAdapter.addFragment(SelectPromotionFragment({
            findNavController().navigateUp()
        }), "")

        pagger.apply {
            offscreenPageLimit = 4
            adapter = mViewPagerAdapter
        }
    }

    private fun setupTablayout() {
        stepper_indicator?.addOnStepClickListener {
            pagger.setCurrentItem(it, true);
        }
    }
}