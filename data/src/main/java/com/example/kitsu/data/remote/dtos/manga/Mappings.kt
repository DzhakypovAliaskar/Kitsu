package com.example.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.manga.MappingsModel

data class Mappings(
    @SerializedName("links")
    val links: LinksXXXXX
)

fun Mappings.toDomain() = MappingsModel(links.toDomain())