package com.crayon.fieldapp.ui.screen.monitor.changeGift.listGift

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentListCustomerBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.monitor.changeGift.listGift.adapter.GiftRVAdapter
import kotlinx.android.synthetic.main.fragment_list_customer.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListGiftFragment() :
    BaseFragment<FragmentListCustomerBinding, ListGiftViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_list_gift

    private var mAdapter: GiftRVAdapter? = null

    override val viewModel: ListGiftViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mAdapter = GiftRVAdapter(
            arrayListOf(),
            requireContext(),
            itemClickListener = {
            }
        )
//
//        viewModel.getTaskByProject(
//            agencyId = agencyId.toString(),
//            projectId = projectId.toString(),
//            taskType = TaskType.CHANGE_GIFT.value,
//            date = calendar,
//            skip = 0,
//            take = 20
//        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_members.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mAdapter
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel.apply {
//            listTask.observe(viewLifecycleOwner, Observer {
//                it.getContentIfNotHandled()?.let {
//                    when (it.status) {
//                        Status.LOADING -> {
//                            mIsLoading = true
//                            pb_loading.visibility = View.VISIBLE
//                        }
//                        Status.SUCCESS -> {
//                            mIsLoading = false
//
//                            pb_loading.visibility = View.GONE
//                            rv_members.visibility = View.VISIBLE
//                            it.data?.let { mListTasks ->
//                                if (mListTasks.size != 0) {
//                                    mIsEndList = false
//                                    mTasks?.addAll(mListTasks)
//                                    mAdapter?.addAll(mListTasks)
//                                } else {
//                                    mIsEndList = true
//                                }
//                            }
//                        }
//                        Status.ERROR -> {
//                            mIsLoading = false
//                            pb_loading.visibility = View.GONE
//                        }
//                    }
//                }
//            })
//        }
    }
}