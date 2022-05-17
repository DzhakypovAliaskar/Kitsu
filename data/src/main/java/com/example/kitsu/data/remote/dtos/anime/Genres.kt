package com.example.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.anime.GenresModel

data class Genres(
    @SerializedName("links")
    val links: LinksX
)

fun Genres.toDomain() = GenresModel(
    links.toDomain()
)
