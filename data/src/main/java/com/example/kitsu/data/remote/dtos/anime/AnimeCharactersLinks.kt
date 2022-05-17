package com.example.kitsu.data.remote.dtos.anime


import com.example.kitsu.domain.models.anime.LinksXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXModel(
    self, related
)