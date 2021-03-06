package com.example.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.anime.LargeXModel

data class LargeX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun LargeX.toDomain() = LargeXModel(width, height)