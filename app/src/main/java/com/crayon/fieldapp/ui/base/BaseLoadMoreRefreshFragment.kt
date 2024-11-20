package com.crayon.fieldapp.ui.base

import androidx.databinding.ViewDataBinding
import com.crayon.fieldapp.R

abstract class BaseLoadMoreRefreshFragment<ViewBinding : ViewDataBinding, ViewModel : BaseLoadMoreRefreshViewModel<Item>, Item> :
    BaseFragment<ViewBinding, ViewModel>() {

    override val layoutId: Int = R.layout.fragment_loadmore_refresh

    override fun handleLoading(isLoading: Boolean) {
        // use progress bar
    }
}