package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.TitlesModel


data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)
