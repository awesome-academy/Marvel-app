package com.ndt.marvelapp.data.model

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("path")
    val path: String? = null
)
