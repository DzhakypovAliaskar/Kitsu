package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.LinksModel


data class LinksUI(
    val self: String
)

fun LinksModel.toUI() = LinksUI(self)
