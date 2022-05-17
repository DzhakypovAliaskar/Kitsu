package com.example.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.anime.MediaRelationshipsModel

data class MediaRelationships(
    @SerializedName("links")
    val links: LinksXXXXXXX
)

fun MediaRelationships.toDomain() =
    MediaRelationshipsModel(
        links.toDomain()
    )