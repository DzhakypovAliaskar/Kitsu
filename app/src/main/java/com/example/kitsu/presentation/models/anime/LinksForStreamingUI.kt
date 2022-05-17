package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LinksXXXXXXXXXModel


data class LinksXXXXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXXXXModel.toUI() = LinksXXXXXXXXXUI(self, related)
