package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.SingleMangaModel

data class SingleMangaUI(
    val data: MangaDataUI
)

fun SingleMangaModel.toUI() = SingleMangaUI(data.toUI())
