package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.GenresModel

data class GenresUI(
    val links: LinksXUI
)

fun GenresModel.toUI() = GenresUI(links.toUI())