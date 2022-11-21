package com.ndt.marvelapp.di

import com.ndt.marvelapp.ui.comic.ComicViewModel
import com.ndt.marvelapp.ui.home.HomeViewModel
import com.ndt.marvelapp.ui.listcomic.ListComicViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(get(), get()) }
    viewModel { ComicViewModel(get()) }
    viewModel { ListComicViewModel(get()) }
}
