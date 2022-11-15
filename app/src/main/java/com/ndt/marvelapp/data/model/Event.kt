package com.ndt.marvelapp.data.model

import android.media.Image
import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import androidx.versionedparcelable.ParcelField
import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("path")
    val path: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("thumbnail")
    val thumbnail: String?
) {

    companion object {

        val diffUtil = object : DiffUtil.ItemCallback<Event>() {
            override fun areItemsTheSame(oldItem: Event, newItem: Event) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Event, newItem: Event) =
                oldItem == newItem
        }
    }
}
