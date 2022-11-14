package com.ndt.marvelapp.ui.adapter

import android.view.View

interface OnClickListener<T> {
    fun onClick(data: T) {}

    fun onLongClick(data: T) {}

    fun onItemClick(view: View, data: T) {}

}
