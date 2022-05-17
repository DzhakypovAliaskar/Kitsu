package com.example.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.anime.MetaXXModel

data class MetaXX(
    @SerializedName("count")
    val count: Int
)

fun MetaXX.toDomain() = MetaXXModel(
    count
)