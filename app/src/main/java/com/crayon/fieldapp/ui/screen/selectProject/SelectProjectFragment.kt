package com.crayon.fieldapp.ui.screen.selectProject

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.PicProjectResponse
import com.crayon.fieldapp.data.remote.response.ProjectResponse
import com.crayon.fieldapp.databinding.FragmentSelectProjectBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter.AddMemberRVAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showConfirmDialog
import com.crayon.fieldapp.utils.showDialog
import kotlinx.android.synthetic.main.fragment_member_project.*
import kotlinx.android.synthetic.main.fragment_member_project.btn_choose
import kotlinx.android.synthetic.main.fragment_member_project.cb_select_all
import kotlinx.android.synthetic.main.fragment_member_project.pb_loading
import kotlinx.android.synthetic.main.fragment_report.*
import kotlinx.android.synthetic.main.fragment_report.imb_ic_back
import kotlinx.android.synthetic.main.fragment_select_project.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import studio.phillip.yolo.presentation.add.selectProject.adapter.SelectProjectRVAdapter

class SelectProjectFragment : BaseFragment<FragmentSelectProjectBinding, SelectProjectViewModel>() {

    override val layoutId: Int = R.layout.fragment_select_project

    override val viewModel: SelectProjectViewModel by viewModel()

    private var adapterMembers: SelectProjectRVAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_choose?.setSingleClick {
            pb_loading.visibility = View.VISIBLE
            val ids = adapterMembers?.getSelectProject()
            val strIds = Gson().toJson(ids)
            findNavController().previousBackStackEntry?.savedStateHandle?.set(
                "ids",
                strIds
            )
            findNavController().navigateUp()
        }

        cb_select_all?.setOnCheckedChangeListener { compoundButton, isChecked ->
            adapterMembers?.selectAllItems(isChecked)
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        adapterMembers = SelectProjectRVAdapter(
            arrayListOf(),
            context = requireContext(),
            itemClickListener = {

            }
        )

        rv_project.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapterMembers
        }

        viewModel.apply {
            getProject()

            projects.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            adapterMembers?.addUser(it as ArrayList<PicProjectResponse>)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            })
        }

    }
}