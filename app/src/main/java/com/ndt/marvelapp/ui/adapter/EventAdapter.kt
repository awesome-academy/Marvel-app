package com.ndt.marvelapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ndt.marvelapp.base.BaseAdapter
import com.ndt.marvelapp.base.BaseViewHolder
import com.ndt.marvelapp.data.model.Event
import com.ndt.marvelapp.databinding.ItemEventBinding
import com.ndt.marvelapp.utils.loadImage

class EventAdapter(private val onClickItem: (Event) -> Unit) :
    BaseAdapter<Event, ItemEventBinding, EventAdapter.EventViewHolder>(Event.diffUtil) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EventAdapter.EventViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return EventViewHolder(
            ItemEventBinding.inflate(layoutInflater, parent, false),
            onClickItem
        )
    }

    inner class EventViewHolder(
        binding: ItemEventBinding,
        onClickItem: (Event) -> Unit
    ) : BaseViewHolder<Event, ItemEventBinding>(binding, onClickItem) {
        override fun onBindData(data: Event) {
            binding.textEvent.text = data.title
            binding.imageEvents.loadImage(data.thumbnail)
        }
    }
}
