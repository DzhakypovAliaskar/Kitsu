package com.example.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.manga.LinksXXXXXXXModel

data class LinksXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXX.toDomain() = LinksXXXXXXXModel(
    self, related
)