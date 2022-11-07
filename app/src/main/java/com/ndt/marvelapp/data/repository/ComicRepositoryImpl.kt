package com.ndt.marvelapp.data.repository

import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.source.ComicDataSource

class ComicRepositoryImpl(
    private val local: ComicDataSource.Local
) : ComicRepository {

    override suspend fun getFavorites() = local.getFavorites()

    override suspend fun insertFavorite(comic: Comic) = local.insertFavorite(comic)

    override suspend fun deleteFavorite(comic: Comic) = local.deleteFavorite(comic)
}
