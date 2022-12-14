package com.ndt.marvelapp.data.repository

import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.utils.DataResult

interface ComicRepository {
    suspend fun getFavorites(): List<Comic>
    suspend fun insertFavorite(comic: Comic)
    suspend fun deleteFavorite(comic: Comic)
    suspend fun getComics(): DataResult<List<Comic>>
}
