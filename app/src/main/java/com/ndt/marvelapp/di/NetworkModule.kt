package com.ndt.marvelapp.di

import com.ndt.marvelapp.BuildConfig
import com.ndt.marvelapp.utils.AppContanst.API_KEY
import com.ndt.marvelapp.utils.AppContanst.BASE_URL
import com.ndt.marvelapp.utils.AppContanst.HASH
import com.ndt.marvelapp.utils.AppContanst.TS
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single { provideOkHttpClient() }

    single { provideRetrofit(get()) }
}

private fun provideOkHttpClient(): OkHttpClient {
    val builder = OkHttpClient.Builder()
    builder.addInterceptor { chain ->
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val original = chain.request()
        val url = original.url().newBuilder()
            .addQueryParameter(TS, BuildConfig.TS)
            .addQueryParameter(API_KEY, BuildConfig.API_KEY)
            .addQueryParameter(HASH, BuildConfig.HASH)
            .build()
        val request = original.newBuilder().url(url).build()
        chain.proceed(request)
    }
    return builder.build()
}

private fun provideRetrofit(client: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
}
