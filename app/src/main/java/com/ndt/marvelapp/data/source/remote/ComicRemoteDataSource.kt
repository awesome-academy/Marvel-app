package com.ndt.marvelapp.data.source.remote

import com.ndt.marvelapp.data.model.ComicResponse
import com.ndt.marvelapp.data.source.ComicDataSource
import com.ndt.marvelapp.utils.APIService

class ComicRemoteDataSource(
    private val apiService: APIService
) : ComicDataSource.Remote {

    override suspend fun getComics() = apiService.getComics()
    override suspend fun getComicsByYear(format: String, year: Int) =
        apiService.getComicsByYear(format, year)

    override suspend fun getComicsByCharacter(characterId: Int) =
        apiService.getComicsByCharacter(characterId)

    override suspend fun getComicsByEvent(eventId: Int) =
        apiService.getComicsByEvent(eventId)

    override suspend fun getComicsBySeries(seriesId: Int) =
        apiService.getComicsBySeries(seriesId)

    override suspend fun getComicsByStory(storyId: Int) =
        apiService.getComicsByCreators(storyId)

    override suspend fun getComicsByCreator(creatorId: Int): ComicResponse =
        apiService.getComicsByCreators(creatorId)
}
