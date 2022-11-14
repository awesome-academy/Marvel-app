package com.ndt.marvelapp.base

import com.ndt.marvelapp.utils.DataResult
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

open class BaseRepository {
    suspend fun <T> getResult(request: suspend CoroutineScope.() -> T): DataResult<T> {
        return withContext(Dispatchers.IO) {
            try {
                DataResult.Success(request())
            } catch (e: IOException) {
                DataResult.Error(e)
            }
        }
    }
}
