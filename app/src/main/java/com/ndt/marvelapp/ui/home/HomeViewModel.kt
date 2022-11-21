package com.ndt.marvelapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ndt.marvelapp.base.BaseViewModel
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.model.Creator
import com.ndt.marvelapp.data.model.Event
import com.ndt.marvelapp.data.repository.CreatorRepository
import com.ndt.marvelapp.data.repository.EventRepository
import com.ndt.marvelapp.utils.AppContanst.COUNT_CREATOR
import com.ndt.marvelapp.utils.AppContanst.COUNT_EVENT

class HomeViewModel(
    private val eventRepository: EventRepository,
    private val creatorRepository: CreatorRepository
) : BaseViewModel() {

    private val _event = MutableLiveData<List<Event>>()
    val event: LiveData<List<Event>> get() = _event

    private val _creator = MutableLiveData<List<Creator>>()
    val creator: LiveData<List<Creator>> get() = _creator

    private val _comic = MutableLiveData<List<Comic>>()
    val comic: LiveData<List<Comic>> get() = _comic

    init {
        getEvents()
        getCreators()
        getBanner()
    }

    private fun getBanner() {
        TODO("Not yet implemented")
    }

    private fun getEvents() {
        launchAsync(
            request = {
                eventRepository.getEvents()
            },
            onSuccess = {
                _event.value = it.take(COUNT_EVENT)
            }, {
                it.message.toString()
            }
        )
    }


    private fun getCreators() {
        launchAsync(
            request = {
                creatorRepository.getCreators()
            }, onSuccess = {
                _creator.value = it.take(COUNT_CREATOR)
            }, onError = {
                it.message.toString()
            }
        )
    }
}
