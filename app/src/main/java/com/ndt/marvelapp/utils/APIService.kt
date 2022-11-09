package com.ndt.marvelapp.utils

import com.ndt.marvelapp.data.model.ComicResponse
import retrofit2.http.GET

interface APIService {
    @GET("comics")
    suspend fun getComics(): ComicResponse
}
