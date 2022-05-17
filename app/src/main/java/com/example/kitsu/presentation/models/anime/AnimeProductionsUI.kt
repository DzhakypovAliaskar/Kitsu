package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.AnimeProductionsModel


data class AnimeProductionsUI(
    val links: LinksXXXXXXXXXXUI
)

fun AnimeProductionsModel.toUI() = AnimeProductionsUI(links.toUI())
