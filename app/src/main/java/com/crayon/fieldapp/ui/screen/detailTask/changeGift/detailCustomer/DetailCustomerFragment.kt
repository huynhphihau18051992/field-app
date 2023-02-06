package com.crayon.fieldapp.ui.screen.detailTask.changeGift.detailCustomer

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.CustomerResponse
import com.crayon.fieldapp.data.remote.response.GiftResponse
import com.crayon.fieldapp.data.remote.response.ProductResponse
import com.crayon.fieldapp.data.remote.response.PromotionResponse
import com.crayon.fieldapp.databinding.FragmentDetailCustomerBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.adapter.DetailCustomerRVAdapter
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.selectProduct.SelectProductBottomSheetFragment
import com.crayon.fieldapp.utils.Status
import com.crayon.fieldapp.utils.setSingleClick
import com.crayon.fieldapp.utils.showMessageDialog
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_detail_customer.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailCustomerFragment :
    BaseFragment<FragmentDetailCustomerBinding, DetailCustomerViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_customer
    override val viewModel: DetailCustomerViewModel by viewModel()
    private lateinit var mDetailRVAdapter: DetailCustomerRVAdapter
    private var isEdit: Boolean? = true
    private var _projectId: String? = null
    private var _taskId: String? = null
    private var _customerInfo: CustomerResponse? = null
    private var _products: ArrayList<ProductResponse> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isEdit = requireArguments()?.getBoolean("isEdit")
        _projectId = requireArguments()?.getString("projectId")
        _taskId = requireArguments()?.getString("taskId")
        _projectId = requireArguments()?.getString("projectId")

        val _customerJson = requireArguments()?.getString("customerInfo")
        _customerJson?.let {
            _customerInfo = Gson().fromJson(_customerJson, CustomerResponse::class.java)
        }

        mDetailRVAdapter = DetailCustomerRVAdapter(
            promotions = arrayListOf(),
            gifts = arrayListOf(),
            images = arrayListOf(),
            context = requireContext(),
            customerName = _customerInfo?.name.toString(),
            customerPhone = _customerInfo?.mobileNumber.toString(),
            codeBill = _customerInfo?.customerBill.toString(),
            onItemPromotionSelectClick = { mPromotion, isChecked ->
                if (isChecked) {
                    mDetailRVAdapter.selectPromotionItem(mPromotion)
                    val items = ArrayList<ProductResponse>()
                    _products.forEach {
                        items.add(it.copy())
                    }
                    if (_products.size != 0) {
                        val dialog = SelectProductBottomSheetFragment(
                            items,
                            onSelectProductListener = { mProducts ->
                                mDetailRVAdapter.addAllProduct(mPromotion, mProducts)
                            })
                        dialog.show(requireActivity().supportFragmentManager, dialog.tag)
                    }
                } else {
                    mDetailRVAdapter.unSelectPromotionItem(mPromotion)
                }
            },
            onItemPromotionAddClick = { mPromotion ->
                var newQuantity = mPromotion.quantity + 1
                mDetailRVAdapter.updatePromotionQuantity(mPromotion, newQuantity)
            },
            onItemPromotionMinusClick = { mPromotion ->
                var newQuantity = mPromotion.quantity - 1
                if (newQuantity <= 0) {
                    newQuantity = 1
                }
                mDetailRVAdapter.updatePromotionQuantity(mPromotion, newQuantity)
            },
            onItemPromotionEditClick = { mPromotion ->
                val items = ArrayList<ProductResponse>()
                _products.forEach {
                    items.add(it.copy())
                }
                items.forEach { item ->
                    if (mPromotion.products.map { it.id.toString() }.contains(item.id)) {
                        val selectProduct = mPromotion.products.firstOrNull { mProducts ->
                            mProducts.id.equals(item.id)
                        }
                        item.isSelect = true
                        item.quantity = 1
                        selectProduct?.let {
                            item.quantity = it.quantity
                        }
                    }
                }
                if (items.size != 0) {
                    val dialog = SelectProductBottomSheetFragment(
                        items,
                        onSelectProductListener = { mProducts ->
                            mDetailRVAdapter.addAllProduct(mPromotion, mProducts)
                        })
                    dialog.show(requireActivity().supportFragmentManager, dialog.tag)
                }
            }
        )

        _taskId?.let {
            if (_customerInfo != null) {
                viewModel.getCustomerBill(
                    taskId = it,
                    billId = _customerInfo!!.customerBill.toString(),
                    projectId = _projectId!!.toString()
                )
                viewModel.getProducts(projectId = _projectId!!.toString())
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        imb_ic_filter?.setSingleClick {
            _taskId?.let {
                if (_customerInfo != null) {
                    val request = mDetailRVAdapter.getSelectPromotions()
                    viewModel.addProductToBill(
                        taskId = _taskId.toString(),
                        billId = _customerInfo!!.customerBill.toString(),
                        request = request
                    )
                }
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        rv_page.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mDetailRVAdapter
        }

        viewModel.customerBill.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            mDetailRVAdapter.addData(
                                mImages = it.first.attachments?.map { it.thumbnailUrl.toString() } as ArrayList<String>,
                                mPromotions = it.second.data as ArrayList<PromotionResponse>,
                                mGift = it.third.data as ArrayList<GiftResponse>,
                                mCodeBill = it.first.code_bill.toString()
                            )
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })

        viewModel.addProductToBill.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            requireContext().showMessageDialog(message = it.message)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })

        viewModel.products.observe(viewLifecycleOwner, Observer {
            it.getContentIfNotHandled()?.let {
                when (it.status) {
                    Status.LOADING -> {
                        pb_loading.visibility = View.VISIBLE
                    }
                    Status.SUCCESS -> {
                        pb_loading.visibility = View.GONE
                        it.data?.let {
                            _products.clear()
                            _products.addAll(it)
                        }
                    }
                    Status.ERROR -> {
                        pb_loading.visibility = View.GONE
                    }
                }
            }
        })
    }
}