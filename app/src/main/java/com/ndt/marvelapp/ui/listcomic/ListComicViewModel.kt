package com.ndt.marvelapp.ui.listcomic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ndt.marvelapp.base.BaseViewModel
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.repository.ComicRepository

class ListComicViewModel(
    private val comicRepository: ComicRepository
) : BaseViewModel() {

    private val _comic = MutableLiveData<List<Comic>>()
    private val _error = MutableLiveData<String>()

    val comic: LiveData<List<Comic>> get() = _comic

    fun getComicsByType(type: String, id: Int) {
        launchAsync(request = {
            comicRepository.getComicsByType(type, id)
        }, onSuccess = {
            _comic.value = it
        }, {
            _error.value = it.message.toString()
        })
    }
}
