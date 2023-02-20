package com.crayon.fieldapp.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.BR
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.local.pref.PrefHelper
import com.crayon.fieldapp.utils.DialogHandler
import com.crayon.fieldapp.utils.Utils
import com.crayon.fieldapp.utils.showLoadingDialog
import org.koin.android.ext.android.inject


abstract class BaseFragment<ViewBinding : ViewDataBinding, ViewModel : BaseViewModel> : Fragment() {

    protected lateinit var viewBinding: ViewBinding

    protected abstract val viewModel: ViewModel

    val appPrefs: PrefHelper by inject()


    @get:LayoutRes
    protected abstract val layoutId: Int

    private var loadingDialog: AlertDialog? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (::viewBinding.isInitialized.not()) {
            viewBinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
            viewBinding.apply {
                setVariable(BR.viewModel, viewModel)
                root.isClickable = true
                lifecycleOwner = viewLifecycleOwner
                executePendingBindings()
            }
        }
        return viewBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.apply {
            isLoading.observe(viewLifecycleOwner, Observer {
                handleLoading(it == true)
            })
            errorMessage.observe(viewLifecycleOwner, Observer {
                handleErrorMessage(it)
            })
            noInternetConnectionEvent.observe(viewLifecycleOwner, Observer {
                handleErrorMessage(getString(R.string.no_internet_connection))
            })
            tokenExpiredEvent.observe(viewLifecycleOwner, Observer {
                appPrefs.clear()
                findNavController().navigate(R.id.action_global_loginFragment)
            })
            connectTimeoutEvent.observe(viewLifecycleOwner, Observer {
                handleErrorMessage(getString(R.string.connect_timeout))
            })
            forceUpdateAppEvent.observe(viewLifecycleOwner, Observer {
                handleErrorMessage(getString(R.string.force_update_app))
            })
            serverMaintainEvent.observe(viewLifecycleOwner, Observer {
                handleErrorMessage(getString(R.string.server_maintain_message))
            })
        }
    }

    /**
     * override this if not use loading dialog (example progress bar)
     */
    open fun handleLoading(isLoading: Boolean) {
        if (isLoading) showLoadingDialog() else dismissLLoadingDialog()
    }

    fun showLoadingDialog() {
        if (loadingDialog == null) {
            loadingDialog = context?.showLoadingDialog()
        } else {
            loadingDialog?.show()
        }
    }

    fun dismissLLoadingDialog() {
        if (loadingDialog?.isShowing == true) {
            loadingDialog?.dismiss()
        }
    }

    fun handleErrorMessage(message: String?) {
        dismissLLoadingDialog()
        DialogHandler.showMessageDialog(requireContext(), message = message.toString(), callback = {

        })
    }


    override fun onDestroy() {
        loadingDialog?.dismiss()
        DialogHandler.dismissMessageDialog()
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
        Utils.hideKeyboard(requireActivity())
    }

    fun navigateUp() {
        findNavController().navigateUp()
    }
}