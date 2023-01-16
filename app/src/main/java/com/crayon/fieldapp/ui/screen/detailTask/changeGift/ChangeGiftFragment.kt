package com.crayon.fieldapp.ui.screen.detailTask.changeGift

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentChangeGiftBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.CustomerRVAdapter
import com.crayon.fieldapp.utils.PopupMenu
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_change_gift.*
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import kotlinx.android.synthetic.main.fragment_input_bill.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ChangeGiftFragment : BaseFragment<FragmentChangeGiftBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_change_gift
    override val viewModel: ChangeGiftViewModel by viewModel()
    private lateinit var mCustomerAdapter: CustomerRVAdapter
    private var taskId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().getString("taskId").toString()
        taskId?.let {
            viewModel.getDetailTask(it)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rl_empty.visibility = View.GONE
        rv_customer.visibility = View.VISIBLE

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_add_customer?.setSingleClick {
            findNavController().navigate(
                R.id.action_changeGiftFragment_to_addCustomerFragment,
                bundleOf("taskId" to taskId)
            )
        }

        imb_ic_filter?.setSingleClick {
            PopupMenu.showPopupMenuDashboard(requireView(), object : MenuCallback {
                override fun onImport() {
                    findNavController().navigate(
                        R.id.action_changeGiftFragment_to_importGiftFragment
                    )
                }

                override fun onExport() {
                    findNavController().navigate(
                        R.id.action_changeGiftFragment_to_exportGiftFragment
                    )
                }

            })
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mCustomerAdapter = CustomerRVAdapter(
            arrayListOf("1", "2", "3"), requireContext(),
            true, {

            }, {
                // Item
                val bundle = bundleOf("isEdit" to true)
                findNavController().navigate(
                    R.id.action_changeGiftFragment_to_detailCustomerFragment,
                    bundle
                )
            })

        rv_customer.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mCustomerAdapter
        }

        viewModel.task.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
//                        it.data?.let {
//                            context?.showMessageDialog(message = it.message) {
//                                onNextClick.invoke("")
//                            }
//                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })
    }
}