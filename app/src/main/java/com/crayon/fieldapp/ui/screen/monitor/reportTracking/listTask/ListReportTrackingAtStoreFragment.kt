package com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.data.remote.response.TaskType
import com.crayon.fieldapp.databinding.FragmentListReportTrackingAtStoreBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.dialog.filterStore.FilterStoreDialog
import com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore
import com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask.adapter.ManageReportTrackingRVAdapter
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_list_update_status_at_store.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import studio.phillip.yolo.utils.TimeFormatUtils
import java.io.Serializable
import java.text.SimpleDateFormat
import java.util.*
import java.util.stream.Collectors

class ListReportTrackingAtStoreFragment() :
    BaseFragment<FragmentListReportTrackingAtStoreBinding, ListReportTrackingAtStoreViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_list_report_tracking_at_store

    var agencyId: String? = null
    var projectId: String? = null
    var projectName: String? = null
    private var calendar = Calendar.getInstance()
    var filterStoreIds: ArrayList<String> = arrayListOf()
    var mTasks: ArrayList<TaskResponse> = arrayListOf()
    private var mAdapter: ManageReportTrackingRVAdapter? = null
    private var mIsLoading = false
    private var pastVisiblesItems = 0
    private var visibleItemCount: Int = 0
    private var totalItemCount: Int = 0
    private var skip: Int = 0

    override val viewModel: ListReportTrackingAtStoreViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        agencyId = requireArguments().get("agencyId").toString()
        projectId = requireArguments().get("projectId").toString()
        projectName = requireArguments().get("projectName").toString()

        mAdapter = ManageReportTrackingRVAdapter(
            arrayListOf("Vinmart Vũng Tàu", "Coop Bình Phước", "Big C Quận 9"),
            requireContext(),
            itemClickListener = {
                findNavController().navigate(R.id.action_list_reportTracking_to_history)
            }
        )

        viewModel.getTaskByProject(
            agencyId = agencyId.toString(),
            projectId = projectId.toString(),
            taskType = TaskType.UPDATE_STATUS.value,
            date = calendar,
            skip = 0,
            take = 20
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ic_select_date.setSingleClick {
            DatePickerDialog(
                requireContext(),
                R.style.DatePickerTheme,
                dateSetListener,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        btn_filter_store?.setSingleClick {
            mTasks?.let {
                val storeDialog = FilterStoreDialog({ listRoleIds ->
                    filterStoreIds.clear()
                    filterStoreIds.addAll(listRoleIds)
                    if (listRoleIds.isNotEmpty()) {
                        mTasks?.let { listTasks ->
                            val filter = listTasks.filter { task ->
                                listRoleIds.contains(task.store!!.id.toString())
                            }
                            // TODO
//                            mAdapter?.clearAll()
//                            mAdapter?.addAll(filter)
                            txt_filter_role_status?.visibility = View.VISIBLE
                        }
                    } else {
                        mTasks?.let {
                            // TODO
//                            mAdapter?.clearAll()
//                            mAdapter?.addAll(it)
                            txt_filter_role_status?.visibility = View.GONE
                        }
                    }
                }, {
                    // Clear all
                    filterStoreIds.clear()
                    mAdapter?.clearAll()
                    mTasks?.let {
                        // TODO
//                        mAdapter?.addAll(it)
                        txt_filter_role_status?.visibility = View.GONE
                    }
                })
                val bundle = Bundle()
                val listRole = ArrayList<ItemStore>()
                it.forEach {
                    // TODO
//                    listRole.add(
//                        ItemStore(
//                            id = it.store!!.id.toString(),
//                            name = it.store!!.name.toString(),
//                            isSelect = filterStoreIds.contains(it.store!!.id.toString()) ?: false
//                        )
//                    )
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    bundle.putSerializable(
                        "store",
                        listRole.stream().distinct().collect(Collectors.toList()) as Serializable?
                    )
                } else {
                    bundle.putSerializable("store", listRole)
                }
                storeDialog.arguments = bundle
                storeDialog.show(childFragmentManager, storeDialog.tag)
            }
        }

        tv_title.text = projectName
        txt_start_date.text = TimeFormatUtils.formatDate(calendar.time)
        imb_ic_back.setSingleClick {
            findNavController().popBackStack()
        }
        rv_members.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mAdapter
            addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    if (dy > 0) { //check for scroll down
                        visibleItemCount = (layoutManager as LinearLayoutManager).getChildCount()
                        totalItemCount = (layoutManager as LinearLayoutManager).getItemCount()
                        pastVisiblesItems =
                            (layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()
                        if (!mIsLoading) {
                            if ((visibleItemCount + pastVisiblesItems) >= totalItemCount) {
                                mIsLoading = true
                                skip = skip + 20
                                loadMoreItem(skip)
                            }
                        }
                    }
                }
            })
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.apply {
            listTask.observe(viewLifecycleOwner, Observer {
                it.getContentIfNotHandled()?.let {
                    when (it.status) {
                        Status.LOADING -> {
                            mIsLoading = true
                            pb_loading.visibility = View.VISIBLE
                        }
                        Status.SUCCESS -> {
                            mIsLoading = false
                            pb_loading.visibility = View.GONE
                            rv_members.visibility = View.VISIBLE
                            it.data?.let { mListTasks ->
                                // TODO
//                                mTasks?.addAll(mListTasks)
//                                mAdapter?.addAll(mListTasks)
                            }
                        }
                        Status.ERROR -> {
                            mIsLoading = false
                            pb_loading.visibility = View.GONE
                        }
                    }
                }
            })
        }
    }

    private fun toTaskDetail(task: String) {
        val bundel = bundleOf("task" to task)
        findNavController().navigate(
            R.id.action_list_reportTracking_to_detail_reportTracking,
            bundel
        )
    }

    private fun formatTime() {
        val myFormat = "dd/MM/yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
        txt_start_date.text = sdf.format(calendar.time).toString()
        mTasks.clear()
        mAdapter?.clearAll()
        skip = 0
        viewModel.getTaskByProject(
            agencyId = agencyId.toString(),
            projectId = projectId.toString(),
            taskType = TaskType.UPDATE_STATUS.value,
            date = calendar,
            skip = skip,
            take = 20
        )
    }

    private val dateSetListener =
        DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.MONTH, monthOfYear)
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            formatTime()
        }

    private fun loadMoreItem(skip: Int) {
        viewModel.getTaskByProject(
            agencyId = agencyId.toString(),
            projectId = projectId.toString(),
            taskType = TaskType.UPDATE_STATUS.value,
            date = calendar,
            skip = skip,
            take = 20
        )
    }
}