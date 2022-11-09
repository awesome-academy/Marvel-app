package com.ndt.marvelapp.data.source.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.source.local.database.AppDatabase.Companion.DATABASE_VERSION
import com.ndt.marvelapp.data.source.local.database.AppDatabase.Companion.EXPORT_SCHEME
import com.ndt.marvelapp.data.source.local.database.dao.ComicDao

@Database(
    entities = [Comic::class],
    version = DATABASE_VERSION,
    exportSchema = EXPORT_SCHEME
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun comicDao(): ComicDao

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "comicFavorite"
        const val EXPORT_SCHEME = false
    }
}
