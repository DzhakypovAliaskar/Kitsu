package com.example.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.manga.GenresModel

data class Genres(
    @SerializedName("links")
    val links: LinksX
)

fun Genres.toDomain() = GenresModel(links.toDomain())