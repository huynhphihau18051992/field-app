package com.crayon.fieldapp.ui.base

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.crayon.fieldapp.R
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.fragment_loadmore_refresh_toolbar.*

abstract class BaseLoadMoreRefreshToolbarFragment<ViewBinding : ViewDataBinding, ViewModel : BaseLoadMoreRefreshToolbarViewModel<Item>, Item> :
    BaseFragment<ViewBinding, ViewModel>() {

    override val layoutId: Int = R.layout.fragment_loadmore_refresh_toolbar

    override fun handleLoading(isLoading: Boolean) {
        // use progress bar
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        imb_ic_back?.setSingleClick {
            navigateUp()
        }
    }
}