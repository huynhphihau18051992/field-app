package com.crayon.fieldapp.ui.screen.attendance

import android.os.Bundle
import android.view.View
import android.widget.ExpandableListView
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.SimpleItem
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.databinding.FragmentAttendanceBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.dialog.TimeKeepingDialog
import com.crayon.fieldapp.ui.screen.attendance.adapter.AttendanceELVAdapter
import com.crayon.fieldapp.utils.BitmapUtils
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showMessageDialog
import kotlinx.android.synthetic.main.fragment_attendance.*
import kotlinx.android.synthetic.main.fragment_attendance.imb_ic_back
import kotlinx.android.synthetic.main.fragment_attendance.pb_loading
import kotlinx.android.synthetic.main.fragment_detail_task.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class AttendanceFragment :
    BaseFragment<FragmentAttendanceBinding, AttendanceViewModel>(),
    ExpandableListView.OnChildClickListener,
    ExpandableListView.OnGroupClickListener,
    ExpandableListView.OnGroupCollapseListener,
    ExpandableListView.OnGroupExpandListener,
    AttendanceELVAdapter.OnTaskResponseItemClickListener {

    override val layoutId: Int = R.layout.fragment_attendance

    override val viewModel: AttendanceViewModel by viewModel()
    private lateinit var listDataHeader: ArrayList<SimpleItem>
    private lateinit var listDataChild: HashMap<String, List<TaskResponse>>
    private lateinit var listAdapter: AttendanceELVAdapter
    private var taskResponse: TaskResponse? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("url")
            ?.observe(viewLifecycleOwner, Observer { result ->
                taskResponse?.let {
                    val file = BitmapUtils.createImageFileToUpload(
                        requireContext(),
                        result,
                        it,
                        50,
                        true
                    )
                    file?.absolutePath.let { path ->
                        viewModel.upLoadTask(it, path.toString())
                    }
                }

            })

        viewModel.apply {
            fetchCurrentLocation()
            listTask.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        val timeKeeping = it.data!!
                        if (timeKeeping.size == 0) {
                            txt_empty.visibility = View.VISIBLE
                            rv_timekeeping.visibility = View.GONE
                            txt_check_in_status.visibility = View.GONE
                        } else {
                            txt_empty.visibility = View.GONE
                            rv_timekeeping.visibility = View.VISIBLE
                            txt_check_in_status.visibility = View.GONE

                            listDataHeader = ArrayList()
                            listDataChild = HashMap()

                            var lastTitle = ""
                            timeKeeping.forEach {
                                if (!it.store!!.name.equals(lastTitle)) {
                                    lastTitle = it.store.name!!
                                    listDataHeader.add(
                                        SimpleItem(
                                            lastTitle,
                                            R.drawable.ic_white_add
                                        )
                                    )
                                }
                            }
                            listDataHeader.forEach { data ->
                                listDataChild[data.title] =
                                    timeKeeping.filter { it.store!!.name.equals(data.title) }
                            }

                            listAdapter = AttendanceELVAdapter(
                                requireContext(),
                                this@AttendanceFragment,
                                listDataHeader,
                                listDataChild,
                                rv_timekeeping
                            )
                            rv_timekeeping.setAdapter(listAdapter)
                            rv_timekeeping.setOnGroupClickListener(this@AttendanceFragment)
                            rv_timekeeping.setOnGroupExpandListener(this@AttendanceFragment)
                            rv_timekeeping.setOnGroupCollapseListener(this@AttendanceFragment)
                            rv_timekeeping.setOnChildClickListener(this@AttendanceFragment)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }

            })
            updateTask.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        getTodayPicAttendances()
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })
            getTodayPicAttendances()
        }
    }


    override fun onCheckInClicked(task: TaskResponse) {
        taskResponse = task
        if (viewModel.verifyLocation(task)) {
            val bundle = bundleOf("isTakeImage" to true)
            findNavController().navigate(R.id.action_global_CameraFragment, bundle)
        } else {
            showInvalidDistantDialog(task)
        }
    }

    override fun onCheckOutClicked(task: TaskResponse) {
        taskResponse = task
        if (viewModel.verifyLocation(task)) {
            val bundle = bundleOf("isTakeImage" to true)
            findNavController().navigate(R.id.action_global_CameraFragment, bundle)
        } else {
            showInvalidDistantDialog(task)
        }
    }

    override fun onGroupClick(
        parent: ExpandableListView?,
        v: View?,
        groupPosition: Int,
        id: Long
    ): Boolean {
        return false
    }

    override fun onGroupCollapse(groupPosition: Int) {
        listAdapter.changeGroupIcon(false, groupPosition)
    }

    override fun onGroupExpand(groupPosition: Int) {
        listAdapter.changeGroupIcon(true, groupPosition)

    }

    override fun onChildClick(
        parent: ExpandableListView?,
        v: View?,
        groupPosition: Int,
        childPosition: Int,
        id: Long
    ): Boolean {
        return false
    }

    private fun showInvalidDistantDialog(taskResponse: TaskResponse) {
        val dialog = TimeKeepingDialog()
        val bundle = Bundle()
        viewModel.currentLocation?.let {
            bundle.putDouble("current_lat", it.latitude)
            bundle.putDouble("current_long", it.longitude)

        }
        bundle.putDouble("store_lat", taskResponse!!.store!!.lat)
        bundle.putDouble("store_long", taskResponse!!.store!!.lng)
        bundle.putString("distant", viewModel.strDistant)
        dialog.arguments = bundle
        dialog.show(childFragmentManager, dialog.tag)
    }
}