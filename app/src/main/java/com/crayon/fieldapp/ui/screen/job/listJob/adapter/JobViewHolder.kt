/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.crayon.fieldapp.ui.screen.job.listJob.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.JobResponse
import com.crayon.fieldapp.utils.formatDate
import com.crayon.fieldapp.utils.formatHour

class JobViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val projectName: TextView = view.findViewById(R.id.txt_project_name)
    private val storeName: TextView = view.findViewById(R.id.txt_store_name)
    private val shift: TextView = view.findViewById(R.id.txt_shift)

    private var job: JobResponse? = null

    fun bind(job: JobResponse) {
        showJobData(job)
    }

    private fun showJobData(mData: JobResponse) {
        this.job = mData
        projectName.text = mData.project!!.name.toString()
        storeName.text = mData.store!!.name.toString()
        val startDate = formatHour(mData.startTime.toString())
        val endDate = formatHour(mData.endTime.toString())
        shift.text = formatDate(mData.startTime.toString()) + " ca " + startDate + "-" + endDate
    }

    companion object {
        fun create(parent: ViewGroup): JobViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_job, parent, false)
            return JobViewHolder(view)
        }
    }
}
