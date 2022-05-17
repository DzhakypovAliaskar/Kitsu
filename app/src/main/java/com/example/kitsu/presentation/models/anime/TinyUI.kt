package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.TinyModel


data class TinyUI(
    val width: Int?,
    val height: Int?
)

fun TinyModel.toUI() = TinyUI(
    width, height
)