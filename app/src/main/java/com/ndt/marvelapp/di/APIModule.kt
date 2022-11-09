package com.ndt.marvelapp.di

import com.ndt.marvelapp.utils.APIService
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single { get<Retrofit>().create(APIService::class.java) }
}
