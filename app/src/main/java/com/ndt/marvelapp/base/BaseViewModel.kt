package com.ndt.marvelapp.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    protected fun <T> launchAsync(
        request: suspend CoroutineScope.() -> UpdateDataAdapter<T>,
        onSuccess: (T) -> Unit,
        onError: (Exception) -> Unit = {}
    ) {
        viewModelScope.launch {
            when (val response = request(this)) {
                is UpdateDataAdapter.Success -> onSuccess(response.data)
                is UpdateDataAdapter.Error -> onError(response.exception)
            }
        }
    }
}
