package com.example.kitsu.presentation.models.manga

import com.example.kitsu.domain.models.manga.ReviewsModel

data class ReviewsUI(
    val links:
    LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())