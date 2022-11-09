package com.ndt.marvelapp.data.model

import com.google.gson.annotations.SerializedName

class ComicResponse(
    @SerializedName("data")
    val data: ComicResult
)
