package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.CategoriesModel


data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())