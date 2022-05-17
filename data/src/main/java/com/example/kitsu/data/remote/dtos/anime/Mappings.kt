package com.example.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.anime.MappingsModel

data class Mappings(
    @SerializedName("links")
    val links: LinksXXXXX
)

fun Mappings.toDomain() = MappingsModel(links.toDomain())