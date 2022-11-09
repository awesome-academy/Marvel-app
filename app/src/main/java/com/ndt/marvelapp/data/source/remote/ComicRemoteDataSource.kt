package com.ndt.marvelapp.data.source.remote

import com.ndt.marvelapp.data.source.ComicDataSource
import com.ndt.marvelapp.utils.APIService

class ComicRemoteDataSource(
    private val apiService: APIService
) : ComicDataSource.Remote {

    override suspend fun getComics() = apiService.getComics()
}
