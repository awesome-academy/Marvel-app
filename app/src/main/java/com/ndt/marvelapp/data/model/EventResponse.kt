package com.ndt.marvelapp.data.model

import com.google.gson.annotations.SerializedName

class EventResponse(
    @SerializedName("data")
    val data: EventResult? = null
)
