package com.crayon.fieldapp.ui.screen.detailManagementJob

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentDetailManagementJobBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.adapter.ManagementTaskAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showConfirmDialog
import kotlinx.android.synthetic.main.fragment_detail_management_job.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailManagementJobFragment :
    BaseFragment<FragmentDetailManagementJobBinding, DetailManagementJobViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_management_job

    override val viewModel: DetailManagementJobViewModel by viewModel()

    private lateinit var jobId: String
    private lateinit var agencyId: String
    private lateinit var projectId: String
    private lateinit var storeId: String
    private lateinit var picId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jobId = requireArguments().getString("jobId").toString()
        agencyId = requireArguments().getString("agencyId").toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapterTask = ManagementTaskAdapter(
            itemClickListener = { toTaskDetail(it.toString()) },
            itemRemoveClickListener = {
                requireContext().showConfirmDialog(
                    title = "Bạn có muốn xoá nhiệm vụ này không?",
                    textPositive = "Có",
                    textNegative = "Không",
                    positiveListener = {
                        viewModel.removeTask(agencyId, it.id.toString())
                    }
                )
            }
        )

        rv_task.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapterTask
        }

        viewModel.apply {
            getDetailJob(agencyId, jobId)
            getListTask(agencyId, jobId)

            job.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
//                        showLoading()
                    }
                    Status.SUCCESS -> {
//                        hideLoading()
                        it.data?.let { job ->
                            job.project?.let { project ->
                                projectId = project.id.toString()
                            }
                            job.store?.let { store ->
                                storeId = store.id.toString()
                            }
                            job.pic?.let { pic ->
                                picId = pic.id.toString()
                            }
                        }
                    }
                    Status.ERROR -> {
//                        hideLoading()
                    }
                }
            })

            tasks.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            adapterTask.submitList(it)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }

            })

            isRemoveTask.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        getListTask(agencyId, jobId)
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }

            })
        }

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        fab_create?.setSingleClick {
            val bundel = bundleOf(
                "projectId" to projectId,
                "agencyId" to agencyId,
                "storeId" to storeId,
                "jobId" to jobId,
                "picId" to picId
            )
            findNavController().navigate(R.id.to_addTask, bundel)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    private fun toTaskDetail(id: String) {
//        val bundel = bundleOf("taskId" to id)
//        findNavController().navigate(R.id.to_detail_task, bundel)
    }
}