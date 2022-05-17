package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.CastingsModel


data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(
    links.toUI()
)
