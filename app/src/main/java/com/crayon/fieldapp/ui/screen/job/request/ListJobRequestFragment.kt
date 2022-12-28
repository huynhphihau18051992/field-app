package com.crayon.fieldapp.ui.screen.job.request

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.JobRequestStatus
import com.crayon.fieldapp.databinding.FragmentListJobRequestBinding
import com.crayon.fieldapp.fcm.MyFirebaseMessagingService
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.job.request.adapter.JobRequest
import com.crayon.fieldapp.ui.screen.job.request.adapter.JobsRequestRVAdapter
import com.crayon.fieldapp.utils.Status
import kotlinx.android.synthetic.main.fragment_list_job_request.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListJobRequestFragment :
    BaseFragment<FragmentListJobRequestBinding, ListJobRequestViewModel>() {

    override val layoutId: Int = R.layout.fragment_list_job_request
    override val viewModel: ListJobRequestViewModel by viewModel()
    private var adapterJobReqeust: JobsRequestRVAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        adapterJobReqeust = JobsRequestRVAdapter(requireContext(), arrayListOf())

        rv_job_request.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapterJobReqeust
        }

        cb_select_all.setOnCheckedChangeListener { buttonView, isChecked ->
            adapterJobReqeust?.selectAllItems(isChecked)
        }

        refresh.setOnRefreshListener {
            refresh.isRefreshing = false
            refreshData()
        }



        btn_accept.setOnClickListener {
            var ids = adapterJobReqeust?.getSelectedItem() as ArrayList
            viewModel.acceptMemberRequest(ids)
        }

        btn_reject.setOnClickListener {
            var ids = adapterJobReqeust?.getSelectedItem() as ArrayList
            viewModel.rejectMemberRequest(ids)
        }

        viewModel.apply {
            jobs.observe(viewLifecycleOwner, Observer {
                it.getContentIfNotHandled()?.let {
                    when (it.status) {
                        Status.LOADING -> {
                            pb_loading.visibility = View.VISIBLE
                        }
                        Status.SUCCESS -> {
                            pb_loading.visibility = View.GONE
                            it.data?.let { projects ->
                                if (projects.size == 0) {
                                    txt_empty.visibility = View.VISIBLE
                                    rv_job_request.visibility = View.GONE
                                    cb_select_all.visibility = View.GONE
                                    btn_accept.visibility = View.GONE
                                    btn_reject.visibility = View.GONE
                                } else {
                                    txt_empty.visibility = View.GONE
                                    rv_job_request.visibility = View.VISIBLE
                                    cb_select_all.visibility = View.VISIBLE
                                    btn_accept.visibility = View.VISIBLE
                                    btn_reject.visibility = View.VISIBLE
                                }

                                var sortList = ArrayList<JobRequest>()
                                var storeIds =
                                    projects.distinctBy { it.store!!.id }.map { it.store!!.id }

                                storeIds.forEach { storeId ->
                                    var job = JobRequest("", storeId)
                                    val sameStore = ArrayList<JobRequest>()
                                    projects.forEach {
                                        if (it.store!!.id.equals(storeId)) {
                                            sameStore.add(
                                                JobRequest(
                                                    id = it.id!!,
                                                    project = it.project!!.name,
                                                    storeName = it.store!!.name,
                                                    storeId = it.store!!.id,
                                                    startShift = it.startTime,
                                                    endShift = it.endTime,
                                                    agency = it.agency!!.name
                                                )
                                            )
                                        }
                                    }
                                    sortList.add(job)
                                    sortList.addAll(sameStore)
                                }
                                adapterJobReqeust?.addAll(sortList)
                            }
                        }
                        Status.ERROR -> {
                            pb_loading.visibility = View.GONE
                        }
                    }
                }
            })

            isAcceptSuccess.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        refreshData()
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })

            isRejectSuccess.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        refreshData()
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })
            getJobRequest("Pending")
        }
    }

    private fun refreshData() {
        cb_select_all.isChecked = false
        adapterJobReqeust?.clear()
        viewModel.getJobRequest(JobRequestStatus.Pending.value)
    }

    private val mPushFilter = IntentFilter(MyFirebaseMessagingService.PUSH_ANNOUNCE)

    override fun onResume() {
        LocalBroadcastManager.getInstance(requireContext())
            .registerReceiver(mPushReceiver, mPushFilter)
        super.onResume()
    }

    override fun onPause() {
        LocalBroadcastManager.getInstance(requireContext()).unregisterReceiver(mPushReceiver)
        super.onPause()
    }


    private val mPushReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            Log.d("AAA", "onReceive")
            refreshData()
        }
    }

}