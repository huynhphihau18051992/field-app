package com.crayon.fieldapp.ui.screen.requireLogin

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentRequireLoginBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_require_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class RequireLoginFragment : BaseFragment<FragmentRequireLoginBinding, RequireLoginViewModel>() {

    override val layoutId: Int = R.layout.fragment_require_login

    override val viewModel: RequireLoginViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bn_register.setOnClickListener {
            findNavController().navigate(R.id.to_register)
        }

        bn_login.setOnClickListener {
            findNavController().navigate(R.id.to_login)
        }
    }
}