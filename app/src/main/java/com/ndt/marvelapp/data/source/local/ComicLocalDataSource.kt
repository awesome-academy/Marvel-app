package com.ndt.marvelapp.data.source.local

import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.source.ComicDataSource
import com.ndt.marvelapp.data.source.local.database.dao.ComicDao

class ComicLocalDataSource(
    private val comicDao: ComicDao
) : ComicDataSource.Local {

    override suspend fun getFavorites() = comicDao.getFavorites()

    override suspend fun insertFavorite(comic: Comic) = comicDao.insertFavorite(comic)

    override suspend fun deleteFavorite(comic: Comic) = comicDao.deleteFavorite(comic)

}
