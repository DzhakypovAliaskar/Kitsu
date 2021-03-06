package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.LargeModel

data class LargeUI(
    val width: Int?,
    val height: Int?
)

fun LargeModel.toUI() = LargeUI(width, height)
