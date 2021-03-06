package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.AnimeStaffModel


data class AnimeStaffUI(
    val links: LinksXXXXXXXXXXXXUI
)

fun AnimeStaffModel.toUI() = AnimeStaffUI(links.toUI())
