package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.LinksXXModel


data class LinksXXUI(
    val self: String,
    val related: String
)

fun LinksXXModel.toUI() = LinksXXUI(self, related)