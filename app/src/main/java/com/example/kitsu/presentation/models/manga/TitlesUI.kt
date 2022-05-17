package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.TitlesModel

data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)
