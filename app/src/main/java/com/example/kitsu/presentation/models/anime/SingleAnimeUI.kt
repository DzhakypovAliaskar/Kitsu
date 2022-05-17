package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.SingleAnimeModel


data class SingleAnimeUI(
    val data: AnimeDataUI
)

fun SingleAnimeModel.toUI() = SingleAnimeUI(data.toUI())
