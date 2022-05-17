package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.LinksXXXXXXXXXXModel

data class LinksXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXUI(self, related)
