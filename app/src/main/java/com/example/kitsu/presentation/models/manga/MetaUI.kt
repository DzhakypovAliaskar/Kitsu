package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.MetaModel

data class MetaUI(
    val dimensionsModel: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(dimensionsModel.toUI())