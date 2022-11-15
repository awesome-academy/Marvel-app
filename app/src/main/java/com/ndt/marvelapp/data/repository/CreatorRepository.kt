package com.ndt.marvelapp.data.repository

import com.ndt.marvelapp.data.model.Creator
import com.ndt.marvelapp.utils.DataResult

interface CreatorRepository {
    suspend fun getCreators(): DataResult<List<Creator>>
}
