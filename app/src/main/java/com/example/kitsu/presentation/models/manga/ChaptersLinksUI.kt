package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.LinksXXXXXXXXModel


data class LinksXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXModel.toUI() = LinksXXXXXXXXUI(self, related)
