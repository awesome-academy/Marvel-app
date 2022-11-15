package com.ndt.marvelapp.data.repository

import com.ndt.marvelapp.base.BaseRepository
import com.ndt.marvelapp.data.model.Creator
import com.ndt.marvelapp.data.source.CreatorDataSource
import com.ndt.marvelapp.utils.DataResult

class CreatorRepositoryImpl(
    private val remote: CreatorDataSource
) : CreatorRepository, BaseRepository() {
    override suspend fun getCreators(): DataResult<List<Creator>> = getResult {
        remote.getCreators().data?.results!!
    }
}
