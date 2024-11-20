package com.crayon.fieldapp.ui.screen.detailAttachment.product

import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel


class ListProductViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

}