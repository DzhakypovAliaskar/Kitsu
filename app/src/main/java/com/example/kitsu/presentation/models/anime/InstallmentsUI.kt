package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.InstallmentsModel


data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
