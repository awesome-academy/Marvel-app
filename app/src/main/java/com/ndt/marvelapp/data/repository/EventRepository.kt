package com.ndt.marvelapp.data.repository

import com.ndt.marvelapp.data.model.Event
import com.ndt.marvelapp.utils.DataResult

interface EventRepository {
    suspend fun  getEvents(): DataResult<List<Event>>
}
