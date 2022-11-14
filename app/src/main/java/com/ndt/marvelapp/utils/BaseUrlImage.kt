package com.ndt.marvelapp.utils

import com.ndt.marvelapp.utils.AppContanst.IMAGE
import java.lang.StringBuilder

object BaseUrlImage {
    fun urlImage(string: String) = StringBuilder(string).append(IMAGE).toString()

}
