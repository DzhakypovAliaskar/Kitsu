package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.LinksXModel

data class LinksXUI(
    val self: String,
    val related: String
)

fun LinksXModel.toUI() = LinksXUI(self, related)
