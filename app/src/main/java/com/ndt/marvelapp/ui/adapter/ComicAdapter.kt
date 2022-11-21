package com.ndt.marvelapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ndt.marvelapp.base.BaseAdapter
import com.ndt.marvelapp.base.BaseViewHolder
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.databinding.ItemComicBinding

class ComicAdapter(private val onClickItem: (Comic) -> Unit) :
    BaseAdapter<Comic, ItemComicBinding, ComicAdapter.ComicViewHolder>(Comic.diffUtil) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComicAdapter.ComicViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ComicViewHolder(
            ItemComicBinding.inflate(layoutInflater, parent, false),
            onClickItem
        )
    }

    inner class ComicViewHolder(
        binding: ItemComicBinding,
        onClickItem: (Comic) -> Unit
    ) : BaseViewHolder<Comic, ItemComicBinding>(binding, onClickItem) {
        override fun onBindData(data: Comic) {
            binding.textTitle.text = data.title
            binding.textDescription.text = data.description
        }
    }
}
