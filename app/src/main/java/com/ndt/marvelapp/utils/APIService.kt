package com.ndt.marvelapp.utils

import com.ndt.marvelapp.data.model.ComicResponse
import com.ndt.marvelapp.data.model.CreatorResponse
import com.ndt.marvelapp.data.model.EventResponse
import retrofit2.http.GET

interface APIService {
    @GET("comics")
    suspend fun getComics(): ComicResponse

    @GET("events")
    suspend fun getEvents(): EventResponse

    @GET("creators")
    suspend fun getCreators(): CreatorResponse
}
