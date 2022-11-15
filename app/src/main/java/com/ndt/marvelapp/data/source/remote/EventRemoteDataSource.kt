package com.ndt.marvelapp.data.source.remote

import com.ndt.marvelapp.data.model.EventResponse
import com.ndt.marvelapp.data.source.EventDataSource
import com.ndt.marvelapp.utils.APIService

class EventRemoteDataSource(
    private val apiService: APIService
) : EventDataSource {

    override suspend fun getEvents(): EventResponse =
        apiService.getEvents()
}
