package com.ndt.marvelapp.data.source

import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.model.ComicResponse
import com.ndt.marvelapp.utils.DataResult

interface ComicDataSource {
    interface Local {
        suspend fun getFavorites(): List<Comic>
        suspend fun insertFavorite(comic: Comic)
        suspend fun deleteFavorite(comic: Comic)
    }

    interface Remote {
        suspend fun getComics(): ComicResponse
        suspend fun getComicsByYear(format: String, year: Int): ComicResponse
        suspend fun getComicsByCharacter(characterId: Int): ComicResponse
        suspend fun getComicsByEvent(eventId: Int): ComicResponse
        suspend fun getComicsBySeries(seriesId: Int): ComicResponse
        suspend fun getComicsByStory(storyId: Int): ComicResponse
        suspend fun getComicsByCreator(creatorId: Int): ComicResponse
    }
}
