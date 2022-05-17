package com.example.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.anime.AnimeProductionsModel

data class AnimeProductions(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX
)

fun AnimeProductions.toDomain() = AnimeProductionsModel(

    links.toDomain()
)