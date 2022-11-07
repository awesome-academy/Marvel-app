package com.ndt.marvelapp.data.source

import com.ndt.marvelapp.data.model.Comic

interface ComicDataSource {
    interface Local {
        suspend fun getFavorites(): List<Comic>
        suspend fun insertFavorite(comic: Comic)
        suspend fun deleteFavorite(comic: Comic)
    }
}
