package com.crayon.fieldapp.ui.screen.detailGroupUser

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentDetailUserBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.adapter.MemberAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_detail_group_user.*
import kotlinx.android.synthetic.main.fragment_detail_store.imb_ic_back
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailGroupUserFragment :
    BaseFragment<FragmentDetailUserBinding, DetailGroupUserViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_group_user

    override val viewModel: DetailGroupUserViewModel by viewModel()

    private lateinit var agencyId: String
    private lateinit var groupId: String
    private lateinit var groupName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        agencyId = requireArguments().get("agencyId").toString()
        groupId = requireArguments().get("groupId").toString()
        groupName = requireArguments().get("groupName").toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        tv_title.text = groupName

        val adapter = MemberAdapter(
            itemClickListener = { toUserDetail(it.id.toString()) }
        )

        rv_user.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapter
        }

        viewModel.apply {
            getMemberOfGroupUser(agencyId, groupId)

            members.observe(viewLifecycleOwner, Observer {
                adapter.submitList(it)
            })
        }
    }

    private fun toUserDetail(id: String) {
        val bundel = bundleOf("userId" to id)
        findNavController().navigate(
            R.id.action_detailGroupUserFragment_to_detailUserFragment,
            bundel
        )
    }
}