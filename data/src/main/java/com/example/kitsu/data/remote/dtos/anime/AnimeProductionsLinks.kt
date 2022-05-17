package com.example.kitsu.data.remote.dtos.anime


import com.example.kitsu.domain.models.anime.LinksXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXModel(
    self, related
)