package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.DimensionsXModel


data class DimensionsXUI(
    val tiny: TinyXUI,
    val small: SmallXUI,
    val large: LargeXUI
)

fun DimensionsXModel.toUI() = DimensionsXUI(tiny.toUI(), small.toUI(), large.toUI())
