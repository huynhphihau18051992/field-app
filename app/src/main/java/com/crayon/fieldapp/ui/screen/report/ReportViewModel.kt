package com.crayon.fieldapp.ui.screen.report

import com.crayon.fieldapp.AppDispatchers
import com.crayon.fieldapp.data.repository.TaskRepository
import com.crayon.fieldapp.ui.base.BaseViewModel

class ReportViewModel(
    private val taskRepository: TaskRepository,
    private val dispatchers: AppDispatchers
) : BaseViewModel() {

}