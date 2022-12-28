package com.crayon.fieldapp.ui.screen.privacy

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentPrivacyBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_privacy.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class PrivacyFragment : BaseFragment<FragmentPrivacyBinding, PrivacyViewModel>() {

    override val layoutId: Int = R.layout.fragment_privacy

    override val viewModel: PrivacyViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        wb_content.loadUrl("file:///android_asset/privacy.html")

    }
}