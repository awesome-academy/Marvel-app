package com.ndt.marvelapp.di

import androidx.room.Room
import com.ndt.marvelapp.data.repository.ComicRepository
import com.ndt.marvelapp.data.repository.ComicRepositoryImpl
import com.ndt.marvelapp.data.repository.EventRepository
import com.ndt.marvelapp.data.repository.EventRepositoryImpl
import com.ndt.marvelapp.data.source.ComicDataSource
import com.ndt.marvelapp.data.source.EventDataSource
import com.ndt.marvelapp.data.source.local.ComicLocalDataSource
import com.ndt.marvelapp.data.source.local.database.AppDatabase
import com.ndt.marvelapp.data.source.local.database.AppDatabase.Companion.DATABASE_NAME
import com.ndt.marvelapp.data.source.remote.ComicRemoteDataSource
import com.ndt.marvelapp.data.source.remote.EventRemoteDataSource
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dbModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            DATABASE_NAME
        ).build()
    }
    single { get<AppDatabase>().comicDao() }
}

val repoComicModule = module {
    single<ComicDataSource.Local> { ComicLocalDataSource(get()) }
    single<ComicDataSource.Remote> { ComicRemoteDataSource(get()) }
    single<ComicRepository> { ComicRepositoryImpl(get()) }
}

val repoEventModule = module {
    single<EventDataSource> { EventRemoteDataSource(get()) }
    single<EventRepository> { EventRepositoryImpl(get()) }
}
