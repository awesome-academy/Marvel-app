package com.ndt.marvelapp.data.source.local.database.dao


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Delete
import com.ndt.marvelapp.data.model.Comic
import com.ndt.marvelapp.data.source.local.database.AppDatabase

@Dao
interface ComicDao {
    @Query("SELECT * FROM comic")
    suspend fun getFavorites(): List<Comic>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertFavorite(comic: Comic)

    @Delete
    suspend fun deleteFavorite(comic: Comic)
    
}
