package com.crayon.fieldapp.ui.navigation.home_container

import androidx.fragment.app.Fragment
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentHomeContainerBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class HomeContainerFragment : BaseFragment<FragmentHomeContainerBinding, HomeContainerViewModel>() {

    override val layoutId: Int = R.layout.fragment_home_container

    override val viewModel: HomeContainerViewModel by viewModel()


}
