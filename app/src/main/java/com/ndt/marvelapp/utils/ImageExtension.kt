package com.ndt.marvelapp.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.ndt.marvelapp.R
import com.ndt.marvelapp.utils.BaseUrlImage.urlImage

fun ImageView.loadImage(image: String?) {
    Glide.with(context).load(image?.let { urlImage(it) })
        .error(R.drawable.ic_error)
        .placeholder(R.drawable.ic_place_holder)
        .into(this)
}

fun ImageView.loadImageCircle(image: String?) {
    Glide.with(context).load(image?.let { urlImage(it) })
        .error(R.drawable.ic_error)
        .placeholder(R.drawable.ic_place_holder)
        .circleCrop()
        .into(this)
}
