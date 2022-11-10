package com.ndt.marvelapp

import android.app.Application
import com.ndt.marvelapp.di.apiModule
import com.ndt.marvelapp.di.dbModule
import com.ndt.marvelapp.di.networkModule
import com.ndt.marvelapp.di.repoComicModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(
                listOf(
                    dbModule,
                    repoComicModule,
                    networkModule,
                    apiModule
                )
            )
        }
    }
}
