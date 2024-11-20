package com.crayon.fieldapp.ui.screen.detailAttachment.product

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentListGroupBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailAttachment.product.adapter.ProductAdapter
import com.crayon.fieldapp.ui.screen.detailTask.base.DetailTaskViewModel
import com.crayon.fieldapp.utils.Status
import kotlinx.android.synthetic.main.fragment_list_product.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListProductFragment : BaseFragment<FragmentListGroupBinding, DetailTaskViewModel>() {

    override val layoutId: Int = R.layout.fragment_list_product
    override val viewModel: DetailTaskViewModel by viewModel()

    private lateinit var productAdapter: ProductAdapter
    private var taskId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        taskId = requireArguments().get("task").toString()
        productAdapter = ProductAdapter(arrayListOf(), requireContext())
        viewModel.getDetailTask(taskId.toString())
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.task.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            val items = ArrayList<Any>()
                            items.addAll(it.products)
                            items.addAll(it.feedbacks)
                            productAdapter?.addProducts(items)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }

        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_proudct.setLayoutManager(LinearLayoutManager(requireContext()))
        rv_proudct.setHasFixedSize(true)
        rv_proudct.setAdapter(productAdapter)
    }

}