package com.crayon.fieldapp.ui.screen.detailProject

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.StoreOfProjectResponse
import com.crayon.fieldapp.databinding.FragmentDetailProjectBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.adapter.ManageStoreAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_detail_project.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailProjectFragment : BaseFragment<FragmentDetailProjectBinding, DetailProjectViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_project

    override val viewModel: DetailProjectViewModel by viewModel()

    private lateinit var projectId: String
    private lateinit var agencyId: String
    private var adapterStore: ManageStoreAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        projectId = requireArguments().getString("projectId").toString()
        agencyId = requireArguments().getString("agencyId").toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        fab_add_employee?.setSingleClick {
            val bundel = bundleOf("agencyId" to agencyId, "projectId" to projectId)
            findNavController().navigate(R.id.to_addMember_project, bundel)
        }

        fab_add_store?.setSingleClick {
            val bundel = bundleOf("agencyId" to agencyId, "projectId" to projectId)
            findNavController().navigate(R.id.to_store_project, bundel)
        }

        rl_member?.setSingleClick {
            val bundel = bundleOf("projectId" to projectId, "agencyId" to agencyId)
            findNavController().navigate(R.id.to_member_project, bundel)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        adapterStore = ManageStoreAdapter(
            arrayListOf(),
            context = requireContext(),
            removeItemClickListener = {
                viewModel.removeStoreToProject(agencyId, projectId, arrayListOf(it.id.toString()))
            },
            itemClickListener = { toManageJobDetail(it) }
        )

        rv_store.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapterStore
        }

        viewModel.apply {
            getProject(agencyId, projectId)
            getMemberProject(agencyId, projectId)
            getStoreProject(agencyId, projectId)

            stores.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            adapterStore?.addStore(it as ArrayList<StoreOfProjectResponse>)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }

            })

            members.observe(viewLifecycleOwner, Observer {
                it.data?.let {
                    txt_member.text = it.size.toString()
                }
            })

            isRemoveStoreSuccess.observe(viewLifecycleOwner, Observer { ids ->
                adapterStore?.apply {
                    removeStores(ids)
                }
            })

        }

    }

    private fun toManageJobDetail(store: StoreOfProjectResponse) {
        val bundel = bundleOf(
            "storeId" to store.id,
            "storeName" to store.name,
            "agencyId" to agencyId,
            "projectId" to projectId
        )
        findNavController().navigate(R.id.to_manageJob_project, bundel)
    }
}