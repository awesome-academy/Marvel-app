package com.ndt.marvelapp.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ndt.marvelapp.utils.DataResult
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {
    private val _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error
    protected fun <T> launchAsync(
        request: suspend CoroutineScope.() -> DataResult<T>,
        onSuccess: (T) -> Unit,
        onError: (Exception) -> Unit = {}
    ) {
        viewModelScope.launch {
            when (val response = request(this)) {
                is DataResult.Success -> onSuccess(response.data)
                is DataResult.Error -> onError(response.exception)
            }
        }
    }
}
