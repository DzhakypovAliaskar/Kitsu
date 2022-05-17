package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.CategoriesModel


data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())