package com.crayon.fieldapp.ui.screen.detailProject.manageJob

import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.databinding.FragmentJobProjectBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailProject.addStore.adapter.ManageJobRVAdapter
import com.crayon.fieldapp.utils.*
import kotlinx.android.synthetic.main.fragment_job_project.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.*

class ManageJobProjectFragment :
    BaseFragment<FragmentJobProjectBinding, ManageJobProjectViewModel>(),
    CalendarView.OnDateChangeListener {

    override val layoutId: Int = R.layout.fragment_job_project

    override val viewModel: ManageJobProjectViewModel by viewModel()

    private lateinit var projectId: String
    private lateinit var storeId: String
    private lateinit var storeName: String
    private lateinit var agencyId: String
    private var jobAdapter: ManageJobRVAdapter? = null
    private var jobId: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        projectId = requireArguments().get("projectId").toString()
        storeId = requireArguments().get("storeId").toString()
        storeName = requireArguments().get("storeName").toString()
        agencyId = requireArguments().get("agencyId").toString()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calendar.setOnDateChangeListener(this)
        tv_title.text = storeName
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        txt_date.text = "Ngày " + Calendar.getInstance().timeInMillis.toTimeString("dd/MM/yyyy")

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        fab_create?.setSingleClick {
            toCreateJob()
        }

        jobAdapter = ManageJobRVAdapter(
            arrayListOf(),
            context = requireContext(),
            itemClickListener = { toJobDetail(it.id.toString()) },
            removeClickListener = {
                requireContext().showConfirmDialog(
                    title = "Bạn có muốn xoá công việc này không?",
                    textPositive = "Có",
                    textNegative = "Không",
                    positiveListener = {
                        jobId = it.id.toString()
                        viewModel.removeJob(agencyId, it.id.toString())
                    }
                )
            }
        )

        rv_job.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = jobAdapter
        }

        viewModel.apply {
            jobs.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            jobAdapter?.addAll(it as ArrayList<JobResponse>)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            })
            // 2020-08-27T00:00:00.000Z
            val startDate = getCurrentDateTime().toTimeString("yyyy-MM-dd") + "T00:00:00.000Z"
            val endDate = getCurrentDateTime().toTimeString("yyyy-MM-dd") + "T23:59:00.000Z"
            getJobAtStore(
                agencyId = agencyId,
                projectId = projectId,
                storeId = storeId,
                statusTime = startDate,
                endTime = endDate
            )

            removeJob.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        jobId?.let {
                            jobAdapter?.removeJob(it)
                        }
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })
        }
    }

    private fun toJobDetail(id: String) {
        val bundel = bundleOf("agencyId" to agencyId, "jobId" to id)
        findNavController().navigate(R.id.action_JobProject_to_detailJob, bundel)
    }

    private fun toCreateJob() {
        val bundel = bundleOf(
            "projectId" to projectId,
            "agencyId" to agencyId,
            "storeId" to storeId
        )
        findNavController().navigate(R.id.to_createJob, bundel)
    }

    override fun onSelectedDayChange(p0: CalendarView, year: Int, month: Int, dayOfMonth: Int) {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month)
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        calendar.set(Calendar.HOUR, 0)
        calendar.set(Calendar.MINUTE, 0)

        txt_date.text = "Ngày " + calendar.timeInMillis.toTimeString("dd/MM/yyyy")
        val startDate = calendar.timeInMillis.toTimeString("yyyy-MM-dd") + "T00:00:00.000Z"
        val endDate = calendar.timeInMillis.toTimeString("yyyy-MM-dd") + "T23:59:00.000Z"
        viewModel.getJobAtStore(
            agencyId = agencyId,
            projectId = projectId,
            storeId = storeId,
            statusTime = startDate,
            endTime = endDate
        )
    }

}