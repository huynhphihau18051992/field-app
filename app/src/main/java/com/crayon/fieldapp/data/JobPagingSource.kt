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

package com.crayon.fieldapp.data

import androidx.paging.PagingSource
import com.crayon.fieldapp.data.remote.ApiService
import com.crayon.fieldapp.data.remote.ApiService.Companion.NETWORK_PAGE_SIZE
import com.crayon.fieldapp.data.remote.response.JobResponse
import retrofit2.HttpException
import java.io.IOException

private const val GITHUB_STARTING_PAGE_INDEX = 0

class JobPagingSource(
    private val service: ApiService,
    private val status: String
) : PagingSource<Int, JobResponse>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, JobResponse> {
        val skip = params.key ?: GITHUB_STARTING_PAGE_INDEX
        val apiQuery = status
        return try {
            val response = service.getPicJobs(
                status = apiQuery,
                skip = skip,
                take = NETWORK_PAGE_SIZE
            )
            val repos = response.data
            LoadResult.Page(
                data = repos!!,
                prevKey = if (skip == GITHUB_STARTING_PAGE_INDEX) null else skip -NETWORK_PAGE_SIZE,
                nextKey = if (repos.isEmpty()) null else skip + NETWORK_PAGE_SIZE
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}
