package com.crayon.fieldapp.ui.screen.detailTask.reportSales.detailOrder

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentContactBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel
import com.crayon.fieldapp.ui.screen.detailTask.reportSales.detailOrder.adapter.DetailOrderRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_contact.imb_ic_back
import kotlinx.android.synthetic.main.fragment_detail_order.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailOrderFragment : BaseFragment<FragmentContactBinding, ChangeGiftViewModel>() {

    override val layoutId: Int = R.layout.fragment_detail_order
    override val viewModel: ChangeGiftViewModel by viewModel()
    private lateinit var mProductAdapter: DetailOrderRVAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mProductAdapter =
            DetailOrderRVAdapter(
                arrayListOf(
                    "Dầu gội Clear 350ml",
                    "Lăn khử mùi",
                    "Bình giữ nhiệt kháng khuẩn",
                    "Khăn tắm cao cấp",
                    "Lốc sữa tiệt trùng",
                    "Bánh gạo",
                    "Dầu ăn Tường An",
                    "Sữa chua Vinamilk",
                    "Dầu xả Sunsilk"
                ), requireContext(), {
                    // Item
                })

        rv_product.apply {
            layoutManager = LinearLayoutManager(context)
            this.adapter = mProductAdapter
        }
    }

}