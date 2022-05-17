package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.LinksXXXXXModel

data class LinksXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXModel.toUI() = LinksXXXXXUI(self, related)
