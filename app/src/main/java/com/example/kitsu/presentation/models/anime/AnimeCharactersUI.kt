package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.AnimeCharactersModel



data class AnimeCharactersUI(
    val links: LinksXXXXXXXXXXXUI
)

fun AnimeCharactersModel.toUI() = AnimeCharactersUI(links.toUI())
