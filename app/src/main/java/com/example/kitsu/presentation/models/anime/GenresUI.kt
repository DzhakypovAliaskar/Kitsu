package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.GenresModel


data class GenresUI(
    val linksXUI: LinksXUI
)

fun GenresModel.toUI() = GenresUI(linksXModel.toUI())
