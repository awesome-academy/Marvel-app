package com.ndt.marvelapp.data.source

import com.ndt.marvelapp.data.model.CreatorResponse
import com.ndt.marvelapp.utils.DataResult

interface CreatorDataSource {
    suspend fun getCreators(): CreatorResponse
}
