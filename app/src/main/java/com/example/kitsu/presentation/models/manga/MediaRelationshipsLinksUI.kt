package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.LinksXXXXXXXModel

data class LinksXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXModel.toUI() = LinksXXXXXXXUI(self, related)
