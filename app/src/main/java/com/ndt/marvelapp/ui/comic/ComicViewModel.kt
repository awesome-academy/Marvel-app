package com.ndt.marvelapp.ui.comic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ndt.marvelapp.base.BaseViewModel
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.repository.ComicRepository

class ComicViewModel(private val comicRepository: ComicRepository) : BaseViewModel() {
    private val _comic = MutableLiveData<List<Comic>>()
    val comic: LiveData<List<Comic>>
        get() = _comic
    private val _isEmpty = MutableLiveData<Boolean>()
    val isEmpty: LiveData<Boolean>
        get() = _isEmpty

    init {
        getComics()
    }

    private fun getComics() {
        comicRepository
    }
}
