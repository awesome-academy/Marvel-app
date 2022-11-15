package com.ndt.marvelapp.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<T, VB : ViewBinding>(
    val binding: VB,
    click: (T) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    private var itemData: T? = null

    init {
        binding.root.setOnClickListener {
            itemData?.let {
                click(it)
            }
        }
    }

    open fun onBindData(data: T) {
        itemData = data
    }
}
