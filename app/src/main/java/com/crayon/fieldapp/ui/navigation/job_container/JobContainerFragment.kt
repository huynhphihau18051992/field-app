package com.crayon.fieldapp.ui.navigation.job_container

import androidx.fragment.app.Fragment
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentHomeContainerBinding
import com.crayon.fieldapp.databinding.FragmentJobContainerBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class JobContainerFragment : BaseFragment<FragmentJobContainerBinding, JobContainerViewModel>() {

    override val layoutId: Int = R.layout.fragment_job_container

    override val viewModel: JobContainerViewModel by viewModel()


}
