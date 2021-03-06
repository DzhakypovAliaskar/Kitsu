package com.example.kitsu.data.remote.dtos.manga


import com.example.kitsu.domain.models.manga.LinksXModel
import com.google.gson.annotations.SerializedName

data class LinksX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksX.toDomain() = LinksXModel(
    self, related
)