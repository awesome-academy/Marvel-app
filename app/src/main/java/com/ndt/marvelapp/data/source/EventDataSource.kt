package com.ndt.marvelapp.data.source

import com.ndt.marvelapp.data.model.EventResponse

interface EventDataSource {
    suspend fun getEvents(): EventResponse
}
