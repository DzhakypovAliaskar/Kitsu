package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LargeModel


data class LargeUI(
    val width: Int?,
    val height: Int?
)

fun LargeModel.toUI() = LargeUI(width, height)
