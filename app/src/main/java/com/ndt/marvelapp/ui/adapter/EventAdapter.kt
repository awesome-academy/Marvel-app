package com.ndt.marvelapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ndt.marvelapp.base.BaseAdapter
import com.ndt.marvelapp.base.BaseViewHolder
import com.ndt.marvelapp.data.model.Event
import com.ndt.marvelapp.databinding.ItemEventBinding
import com.ndt.marvelapp.utils.loadImage

class EventAdapter :
    BaseAdapter<Event, ItemEventBinding, EventAdapter.EventViewHolder>(Event.diffUtil) {

    private var listener: OnClickListener<Event>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return EventViewHolder(ItemEventBinding.inflate(layoutInflater, parent, false))
    }

    inner class EventViewHolder(
        binding: ItemEventBinding,
    ) : BaseViewHolder<Event, ItemEventBinding>(binding), View.OnClickListener {

        private var data: Event? = null

        init {
            binding.root.setOnClickListener(this)
        }

        override fun onBindData(data: Event) {
            binding.textEvent.text = data.title
            binding.imageEvents.loadImage(data.thumbnail)
            this.data = data
        }

        override fun onClick(v: View?) {
            data?.let {
                listener?.onClick(it)
            }
        }
    }
}
