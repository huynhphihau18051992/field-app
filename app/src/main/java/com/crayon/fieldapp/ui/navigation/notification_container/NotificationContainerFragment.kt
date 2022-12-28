package com.crayon.fieldapp.ui.navigation.notification_container

import androidx.fragment.app.Fragment
import com.crayon.fieldapp.R
import com.crayon.fieldapp.databinding.FragmentJobContainerBinding
import com.crayon.fieldapp.databinding.FragmentNotificationContainerBinding
import com.crayon.fieldapp.databinding.FragmentProfileContainerBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class NotificationContainerFragment  :
    BaseFragment<FragmentNotificationContainerBinding, NotificationContainerViewModel>() {

    override val layoutId: Int = R.layout.fragment_notification_container

    override val viewModel: NotificationContainerViewModel by viewModel()
}
