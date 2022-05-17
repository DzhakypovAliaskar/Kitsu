package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.MappingsModel


data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())