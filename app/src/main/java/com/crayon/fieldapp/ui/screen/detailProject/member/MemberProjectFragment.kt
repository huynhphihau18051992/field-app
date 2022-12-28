package com.crayon.fieldapp.ui.screen.detailProject.member

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentMemberProjectBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter.AddMemberRVAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showConfirmDialog
import com.crayon.fieldapp.utils.showDialog
import kotlinx.android.synthetic.main.fragment_member_project.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MemberProjectFragment : BaseFragment<FragmentMemberProjectBinding, MemberProjectViewModel>() {

    override val layoutId: Int = R.layout.fragment_member_project

    override val viewModel: MemberProjectViewModel by viewModel()


    private lateinit var agencyId: String
    private lateinit var projectId: String
    private var adapterMembers: AddMemberRVAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        agencyId = requireArguments().getString("agencyId").toString()
        projectId = requireArguments().getString("projectId").toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_choose?.setSingleClick {
            context.showConfirmDialog(
                title = "Bạn có muốn xoá nhân viên không?",
                textPositive = "Có",
                textNegative = "Không",
                positiveListener = {
                    adapterMembers?.let {
                        viewModel.removeMembersToProject(
                            agencyId,
                            projectId,
                            it.getSelectedItem() as ArrayList<String>
                        )
                    }
                }
            )
        }

        cb_select_all?.setOnCheckedChangeListener { compoundButton, isChecked ->
            adapterMembers?.selectAllItems(isChecked)
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        adapterMembers = AddMemberRVAdapter(
            arrayListOf(),
            context = requireContext(),
            itemClickListener = { toUserDetail(it.id) }
        )

        rv_members.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapterMembers
        }

        viewModel.apply {
            getMemberProject(agencyId, projectId)

            members.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            adapterMembers?.addMember(it)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            })

            isRemoveUserSuccess.observe(viewLifecycleOwner, Observer {
                if (it) {
                    requireContext().showDialog(
                        message = "Đã xoá thành viên khỏi dự án",
                        title = "Thông báo",
                        positiveListener = {
                            findNavController().navigateUp()
                        }
                    )
                }
            })
        }

    }

    private fun toUserDetail(id: String) {
        val bundel = bundleOf("userId" to id)
        findNavController().navigate(R.id.action_memberProject_to_detailUser, bundel)
    }
}