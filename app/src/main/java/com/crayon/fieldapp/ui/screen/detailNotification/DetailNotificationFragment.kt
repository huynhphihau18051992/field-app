package com.crayon.fieldapp.ui.screen.detailNotification

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentDetailNotificationBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_detail_notification.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailNotificationFragment :
    BaseFragment<FragmentDetailNotificationBinding, DetailNotificationViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_notification

    override val viewModel: DetailNotificationViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.apply {
            fetchDetailUser("1")
        }

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.apply {

        }
    }

}