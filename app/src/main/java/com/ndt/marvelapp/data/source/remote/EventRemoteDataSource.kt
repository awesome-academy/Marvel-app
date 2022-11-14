package com.ndt.marvelapp.data.source.remote

import com.ndt.marvelapp.data.source.EventDataSource
import com.ndt.marvelapp.utils.APIService

class EventRemoteDataSource(
    private val apiService: APIService
) : EventDataSource {

    override fun getEvents() = apiService.getEvents()
}
