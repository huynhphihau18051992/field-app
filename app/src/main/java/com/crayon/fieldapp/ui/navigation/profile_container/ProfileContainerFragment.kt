package com.crayon.fieldapp.ui.navigation.profile_container

import androidx.fragment.app.Fragment
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentProfileContainerBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class ProfileContainerFragment :
    BaseFragment<FragmentProfileContainerBinding, ProfileContainerViewModel>() {

    override val layoutId: Int = R.layout.fragment_profile_container

    override val viewModel: ProfileContainerViewModel by viewModel()
}
