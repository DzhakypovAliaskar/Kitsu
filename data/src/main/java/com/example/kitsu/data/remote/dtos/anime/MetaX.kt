package com.example.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.anime.MetaXModel

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: DimensionsX
)

fun MetaX.toDomain() = MetaXModel(
    dimensions.toDomain()
)