package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.EpisodesModel



data class EpisodesUI(
    val links: LinksXXXXXXXXUI
)

fun EpisodesModel.toUI() = EpisodesUI(links.toUI())
