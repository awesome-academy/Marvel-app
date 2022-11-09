package com.ndt.marvelapp.data.model

import com.google.gson.annotations.SerializedName

class ComicResult(
    @SerializedName("results")
    val results: List<Comic>? = null
)
