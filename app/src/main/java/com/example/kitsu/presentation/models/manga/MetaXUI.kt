package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.MetaXModel

data class MetaXUI(
    val dimensionsXUI: DimensionsXUI
)

fun MetaXModel.toUI() = MetaXUI(dimensionsXModel.toUI())
