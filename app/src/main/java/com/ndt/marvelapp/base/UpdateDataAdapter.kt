package com.ndt.marvelapp.base

sealed class UpdateDataAdapter<out T> {

    data class Success<T>(val data: T) : UpdateDataAdapter<T>()
    data class Error(val exception: Exception) : UpdateDataAdapter<Nothing>()
}
