package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.MetaModel



data class MetaUI(
    val dimensions: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(
    dimensionsModel.toUI()
)