package com.example.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.manga.LinksModel

data class Links(
    @SerializedName("self")
    val self: String
)

fun Links.toDomain() = LinksModel(
    self
)