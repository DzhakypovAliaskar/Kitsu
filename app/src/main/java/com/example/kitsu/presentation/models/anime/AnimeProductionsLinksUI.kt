package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LinksXXXXXXXXXXModel


data class LinksXXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXXModel.toUI() = LinksXXXXXXXXXXUI(self, related)
