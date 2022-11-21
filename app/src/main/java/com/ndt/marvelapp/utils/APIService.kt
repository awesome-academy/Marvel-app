package com.ndt.marvelapp.utils

import com.ndt.marvelapp.data.model.ComicResponse
import com.ndt.marvelapp.data.model.CreatorResponse
import com.ndt.marvelapp.data.model.EventResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {
    @GET("comics")
    suspend fun getComics(): ComicResponse

    @GET("events")
    suspend fun getEvents(): EventResponse

    @GET("creators")
    suspend fun getCreators(): CreatorResponse

    @GET("comics")
    fun getComicsByYear(
        @Query("format") format: String,
        @Query("startYear") year: Int
    ): ComicResponse

    @GET("characters/{character_id}/comics")
    fun getComicsByCharacter(@Path("character_id") characterId: Int): ComicResponse

    @GET("events/{event_id}/comics")
    fun getComicsByEvent(@Path("event_id") eventId: Int): ComicResponse

    @GET("series/{series_id}/comics")
    fun getComicsBySeries(@Path("series_id") seriesId: Int): ComicResponse

    @GET("creators/{creator_id}/comics")
    fun getComicsByCreators(@Path("creator_id") creatorId: Int): ComicResponse

    @GET("stories/{story_id}/comics")
    fun getComicsByStory(@Path("story_id") storyId: Int): ComicResponse
}
