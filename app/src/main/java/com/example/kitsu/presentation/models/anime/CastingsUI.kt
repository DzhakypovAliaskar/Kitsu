package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.CastingsModel


data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(links.toUI())
