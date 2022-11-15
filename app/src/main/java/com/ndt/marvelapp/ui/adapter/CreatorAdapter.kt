package com.ndt.marvelapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ndt.marvelapp.base.BaseAdapter
import com.ndt.marvelapp.base.BaseViewHolder
import com.ndt.marvelapp.data.model.Creator
import com.ndt.marvelapp.databinding.ItemCreatorBinding
import com.ndt.marvelapp.utils.loadImage

class CreatorAdapter(private val onClickItem: (Creator) -> Unit) :
    BaseAdapter<Creator, ItemCreatorBinding, CreatorAdapter.CreatorViewHolder>(Creator.diffUtil) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CreatorAdapter.CreatorViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CreatorViewHolder(
            ItemCreatorBinding.inflate(layoutInflater, parent, false),
            onClickItem
        )
    }

    inner class CreatorViewHolder(
        binding: ItemCreatorBinding,
        onClickItem: (Creator) -> Unit
    ) : BaseViewHolder<Creator, ItemCreatorBinding>(binding, onClickItem) {
        override fun onBindData(data: Creator) {
            binding.textCreator.text = data.fullName.toString()
            binding.imageCreator.loadImage(data.thumbnail)
        }
    }
}
