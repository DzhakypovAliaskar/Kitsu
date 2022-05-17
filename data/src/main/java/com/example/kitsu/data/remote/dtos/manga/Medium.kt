package com.example.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.manga.MediumModel

data class Medium(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun Medium.toDomain() = MediumModel(width, height)