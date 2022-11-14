package com.ndt.marvelapp.data.repository

import com.ndt.marvelapp.base.BaseRepository
import com.ndt.marvelapp.data.model.Event
import com.ndt.marvelapp.data.source.EventDataSource
import com.ndt.marvelapp.utils.DataResult

class EventRepositoryImpl(
    private val remote: EventDataSource
) : EventRepository, BaseRepository() {

    override suspend fun getEvents() = getResult {
        remote.getEvents()
    }
}
