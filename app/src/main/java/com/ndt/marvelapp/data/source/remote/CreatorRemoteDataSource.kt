package com.ndt.marvelapp.data.source.remote

import com.ndt.marvelapp.data.model.CreatorResponse
import com.ndt.marvelapp.data.source.CreatorDataSource
import com.ndt.marvelapp.utils.APIService
import com.ndt.marvelapp.utils.DataResult

class CreatorRemoteDataSource(
    private val apiService: APIService
) : CreatorDataSource {

    override suspend fun getCreators(): CreatorResponse =
        apiService.getCreators()
}
