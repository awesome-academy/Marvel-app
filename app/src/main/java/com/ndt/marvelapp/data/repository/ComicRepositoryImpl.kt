package com.ndt.marvelapp.data.repository

import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.source.ComicDataSource
import com.ndt.marvelapp.utils.BUNDLE
import com.ndt.marvelapp.utils.DataResult

class ComicRepositoryImpl(
    private val local: ComicDataSource.Local,
    private val remote: ComicDataSource.Remote
) : ComicRepository {

    override suspend fun getFavorites() = local.getFavorites()

    override suspend fun insertFavorite(comic: Comic) = local.insertFavorite(comic)

    override suspend fun deleteFavorite(comic: Comic) = local.deleteFavorite(comic)

    override suspend fun getComics(): DataResult<List<Comic>> =
        remote.getComics().data.results

    override suspend fun getComicByYear(format: String, year: Int): DataResult<List<Comic>> =
        remote.getComicsByYear(format, year).data.results

    override suspend fun getComicsByType(type: String, id: Int): DataResult<List<Comic>> =
        when (type) {
            BUNDLE.BUNDLE_CHARACTER -> remote.getComicsByCharacter(id)
            BUNDLE.BUNDLE_SERIES -> remote.getComicsBySeries(id)
            BUNDLE.BUNDLE_EVENT -> remote.getComicsByEvent(id)
            BUNDLE.BUNDLE_CREATOR -> remote.getComicsByCreator(id)
            else -> remote.getComicsByStory(id)
        }.data.results

}
