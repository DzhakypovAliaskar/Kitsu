package com.example.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.manga.DimensionsXModel

data class DimensionsX(
    @SerializedName("tiny")
    val tiny: TinyX,
    @SerializedName("small")
    val small: SmallX,
    @SerializedName("large")
    val large: LargeX
)

fun DimensionsX.toDomain() = DimensionsXModel(
    tiny.toDomain(), small.toDomain(), large.toDomain()
)