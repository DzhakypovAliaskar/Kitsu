package com.example.kitsu.presentation.models.anime

import com.example.kitsu.domain.models.anime.ReviewsModel


data class ReviewsUI(
    val links: LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())
