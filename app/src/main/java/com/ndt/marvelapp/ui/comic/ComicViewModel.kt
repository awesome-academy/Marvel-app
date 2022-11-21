package com.ndt.marvelapp.ui.comic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ndt.marvelapp.base.BaseViewModel
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.repository.ComicRepository

class ComicViewModel(private val comicRepository: ComicRepository) : BaseViewModel() {

    private val _comic = MutableLiveData<List<Comic>>()
    private val _error = MutableLiveData<String>()

    val comic: LiveData<List<Comic>>
        get() = _comic

    init {
        getComics()
    }

    private fun getComics() {
        launchAsync(request = {
            comicRepository.getComics()
        }, onSuccess = {
            _comic.value = it
        }, {
            _error.value = it.message.toString()
        })
    }

    fun getComicByYear(format: String, year: Int) {
        launchAsync(
            request = {
                comicRepository.getComicByYear(format, year)
            }, onSuccess = {
                _comic.value = it
            }, {
                _error.value = it.message.toString()
            })
    }
}
