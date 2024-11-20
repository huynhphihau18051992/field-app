package com.crayon.fieldapp.ui.screen.application

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentApplicationBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.adapter.BaseVPAdapter
import com.crayon.fieldapp.ui.screen.application.list.ListPicApplicationFragment
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_application.*
import kotlinx.android.synthetic.main.fragment_manage_application.imb_ic_back
import org.koin.androidx.viewmodel.ext.android.viewModel

class ApplicationFragment :
    BaseFragment<FragmentApplicationBinding, ApplicationViewModel>() {

    override val layoutId: Int = R.layout.fragment_application

    override val viewModel: ApplicationViewModel by viewModel()


    private lateinit var mAdapter: BaseVPAdapter
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout = view.findViewById(R.id.tab_my_application)
        viewPager = view.findViewById(R.id.vp_my_application)

        setupViewPager()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        fab_create?.setSingleClick {
            findNavController().navigate(R.id.action_applicationFragment_to_createApplicationFragment)
        }
    }

    private fun setupViewPager() {
        mAdapter = BaseVPAdapter(childFragmentManager)
        val waiting = ListPicApplicationFragment()
        val approved = ListPicApplicationFragment()
        waiting.arguments = bundleOf("status" to "wait")
        approved.arguments = bundleOf("status" to "approved")
        mAdapter.addFragment(waiting, "Chờ duyệt")
        mAdapter.addFragment(approved, "Đã duyệt")

        viewPager.apply {
            offscreenPageLimit = 2
            adapter = mAdapter
        }
        tabLayout!!.setupWithViewPager(viewPager)
    }
}