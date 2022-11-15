package com.ndt.marvelapp.data.model

import com.google.gson.annotations.SerializedName

class CreatorResponse(
    @SerializedName("data")
    val data: CreatorResult? = null
)
