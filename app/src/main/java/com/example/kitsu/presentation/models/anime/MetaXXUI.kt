package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.MetaXXModel


data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
