package com.crayon.fieldapp.ui.screen.term

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentTermBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_term.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TermFragment : BaseFragment<FragmentTermBinding, TermViewModel>() {

    override val layoutId: Int = R.layout.fragment_term

    override val viewModel: TermViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        wb_content.loadUrl("file:///android_asset/terms.html")

    }
}