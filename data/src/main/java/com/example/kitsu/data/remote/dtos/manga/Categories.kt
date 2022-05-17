package com.example.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.example.kitsu.domain.models.manga.CategoriesModel

data class Categories(
    @SerializedName("links")
    val links: LinksXX
)

fun Categories.toDomain() = CategoriesModel(
    links.toDomain()
)