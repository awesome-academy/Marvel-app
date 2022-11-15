package com.ndt.marvelapp.data.model

import androidx.recyclerview.widget.DiffUtil
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comic")
data class Comic(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int?,
    @ColumnInfo(name = "title")
    val title: String?,
    @ColumnInfo(name = "description")
    val description: String?
) {
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Comic>() {
            override fun areItemsTheSame(oldItem: Comic, newItem: Comic) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Comic, newItem: Comic) =
                oldItem == newItem
        }
    }
}
