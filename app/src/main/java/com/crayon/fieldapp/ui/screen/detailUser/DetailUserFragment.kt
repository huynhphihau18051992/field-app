package com.crayon.fieldapp.ui.screen.detailUser

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentDetailUserBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_detail_store.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailUserFragment : BaseFragment<FragmentDetailUserBinding, DetailUserViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_user

    override val viewModel: DetailUserViewModel by viewModel()

    private lateinit var agencyId: String
    private lateinit var userId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        agencyId = requireArguments().get("agencyId").toString()
        userId = requireArguments().get("userId").toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.apply {
            fetchDetailUser(agencyId, userId)
        }


    }
}